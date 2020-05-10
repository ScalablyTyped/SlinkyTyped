package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo extends js.Object {
  /**
  		 * The version of Azure that the instance is running on, if applicable.
  		 */
  var azureVersion: Double = js.native
  /**
  		 * The ID of the engine edition of the instance.
  		 */
  var engineEditionId: Double = js.native
  /**
  		 * Whether the instance is running in the cloud (Azure) or not.
  		 */
  var isCloud: Boolean = js.native
  /**
  		 * options for all new server properties.
  		 */
  var options: StringDictionary[js.Any] = js.native
  /**
  		 * The Operating System version string of the machine running the instance.
  		 */
  var osVersion: String = js.native
  /**
  		 * The edition of the instance.
  		 */
  var serverEdition: String = js.native
  /**
  		 * String describing the product level of the server.
  		 */
  var serverLevel: String = js.native
  /**
  		 * The major version of the instance.
  		 */
  var serverMajorVersion: Double = js.native
  /**
  		 * The minor version of the instance.
  		 */
  var serverMinorVersion: Double = js.native
  /**
  		 * The build of the instance.
  		 */
  var serverReleaseVersion: Double = js.native
  /**
  		 * String containing the full server version text.
  		 */
  var serverVersion: String = js.native
}

object ServerInfo {
  @scala.inline
  def apply(
    azureVersion: Double,
    engineEditionId: Double,
    isCloud: Boolean,
    options: StringDictionary[js.Any],
    osVersion: String,
    serverEdition: String,
    serverLevel: String,
    serverMajorVersion: Double,
    serverMinorVersion: Double,
    serverReleaseVersion: Double,
    serverVersion: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(azureVersion = azureVersion.asInstanceOf[js.Any], engineEditionId = engineEditionId.asInstanceOf[js.Any], isCloud = isCloud.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], serverEdition = serverEdition.asInstanceOf[js.Any], serverLevel = serverLevel.asInstanceOf[js.Any], serverMajorVersion = serverMajorVersion.asInstanceOf[js.Any], serverMinorVersion = serverMinorVersion.asInstanceOf[js.Any], serverReleaseVersion = serverReleaseVersion.asInstanceOf[js.Any], serverVersion = serverVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzureVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineEditionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineEditionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCloud(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerEdition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverEdition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerMajorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMajorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerMinorVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMinorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerReleaseVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReleaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

