package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashCompiledClipInstance extends js.Object {
  var accName: String = js.native
  var actionScript: String = js.native
  var description: String = js.native
  var forceSimple: Boolean = js.native
  var shortcut: String = js.native
  var silent: Boolean = js.native
  var tabIndex: Double = js.native
}

object FlashCompiledClipInstance {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    description: String,
    forceSimple: Boolean,
    shortcut: String,
    silent: Boolean,
    tabIndex: Double
  ): FlashCompiledClipInstance = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCompiledClipInstance]
  }
  @scala.inline
  implicit class FlashCompiledClipInstanceOps[Self <: FlashCompiledClipInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

