package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.chrome_update_
import typingsSlinky.chromeApps.chromeAppsStrings.install_
import typingsSlinky.chromeApps.chromeAppsStrings.shared_module_update_
import typingsSlinky.chromeApps.chromeAppsStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCHROMEUPDATE extends js.Object {
  var CHROME_UPDATE: chrome_update_ = js.native
  var INSTALL: install_ = js.native
  var SHARED_MODULE_UPDATE: shared_module_update_ = js.native
  var UPDATE: update_ = js.native
}

object AnonCHROMEUPDATE {
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update_,
    INSTALL: install_,
    SHARED_MODULE_UPDATE: shared_module_update_,
    UPDATE: update_
  ): AnonCHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE.asInstanceOf[js.Any], INSTALL = INSTALL.asInstanceOf[js.Any], SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCHROMEUPDATE]
  }
  @scala.inline
  implicit class AnonCHROMEUPDATEOps[Self <: AnonCHROMEUPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHROME_UPDATE(value: chrome_update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHROME_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINSTALL(value: install_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INSTALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHARED_MODULE_UPDATE(value: shared_module_update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHARED_MODULE_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE(value: update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

