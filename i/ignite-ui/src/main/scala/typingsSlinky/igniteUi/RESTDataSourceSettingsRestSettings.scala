package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTDataSourceSettingsRestSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies a custom function to serialize content sent to the server. It should accept a single object or an array of objects and return a string. If not specified, JSON.stringify() will be used.
  	 */
  var contentSerializer: js.UndefOr[js.Function] = js.native
  /**
  	 * Specifies the content type of the request
  	 */
  var contentType: js.UndefOr[String] = js.native
  /**
  	 * Settings for create requests
  	 */
  var create: js.UndefOr[RESTDataSourceSettingsRestSettingsCreate] = js.native
  /**
  	 * Specifies whether the ids of the removed resources are send through the request URI
  	 */
  var encodeRemoveInRequestUri: js.UndefOr[Boolean] = js.native
  /**
  	 * Settings for remove requests
  	 */
  var remove: js.UndefOr[RESTDataSourceSettingsRestSettingsRemove] = js.native
  /**
  	 * Settings for update requests
  	 */
  var update: js.UndefOr[RESTDataSourceSettingsRestSettingsUpdate] = js.native
}

object RESTDataSourceSettingsRestSettings {
  @scala.inline
  def apply(): RESTDataSourceSettingsRestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettingsRestSettings]
  }
  @scala.inline
  implicit class RESTDataSourceSettingsRestSettingsOps[Self <: RESTDataSourceSettingsRestSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSerializer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSerializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSerializer")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: RESTDataSourceSettingsRestSettingsCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeRemoveInRequestUri(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRemoveInRequestUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeRemoveInRequestUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRemoveInRequestUri")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: RESTDataSourceSettingsRestSettingsRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: RESTDataSourceSettingsRestSettingsUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

