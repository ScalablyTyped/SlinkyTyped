package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the environment in which the add-in is running.
  */
@js.native
trait ContextInformation extends js.Object {
  /**
    * Gets the Office application host in which the add-in is running.
    */
  var host: HostType = js.native
  /**
    * Gets the platform on which the add-in is running.
    */
  var platform: PlatformType = js.native
  /**
    * Gets the version of Office on which the add-in is running.
    */
  var version: String = js.native
}

object ContextInformation {
  @scala.inline
  def apply(host: HostType, platform: PlatformType, version: String): ContextInformation = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInformation]
  }
  @scala.inline
  implicit class ContextInformationOps[Self <: ContextInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: HostType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

