package typingsSlinky.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsAzureStatic extends js.Object {
  var MobileServiceClient: typingsSlinky.azureMobileServicesClient.Microsoft.WindowsAzure.MobileServiceClient = js.native
}

object WindowsAzureStatic {
  @scala.inline
  def apply(MobileServiceClient: MobileServiceClient): WindowsAzureStatic = {
    val __obj = js.Dynamic.literal(MobileServiceClient = MobileServiceClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsAzureStatic]
  }
  @scala.inline
  implicit class WindowsAzureStaticOps[Self <: WindowsAzureStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileServiceClient(value: MobileServiceClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MobileServiceClient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

