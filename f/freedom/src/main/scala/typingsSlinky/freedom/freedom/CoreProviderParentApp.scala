package typingsSlinky.freedom.freedom

import typingsSlinky.freedom.AnonRemoveEventListener
import typingsSlinky.freedom.AnonViews
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
@js.native
trait CoreProviderParentApp extends js.Object {
  var config: AnonViews = js.native
  var global: AnonRemoveEventListener = js.native
  var manifestId: String = js.native
}

object CoreProviderParentApp {
  @scala.inline
  def apply(config: AnonViews, global: AnonRemoveEventListener, manifestId: String): CoreProviderParentApp = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], manifestId = manifestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProviderParentApp]
  }
  @scala.inline
  implicit class CoreProviderParentAppOps[Self <: CoreProviderParentApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: AnonViews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: AnonRemoveEventListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

