package typingsSlinky.antd

import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAffix extends js.Object {
  var affix: Boolean = js.native
  var getContainer: js.Function0[
    Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)
  ] = js.native
  var showInkInFixed: Boolean = js.native
}

object AnonAffix {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: () => Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any),
    showInkInFixed: Boolean
  ): AnonAffix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffix]
  }
  @scala.inline
  implicit class AnonAffixOps[Self <: AnonAffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContainer(
      value: () => Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowInkInFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInkInFixed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

