package typingsSlinky.polymerTs.polymer

import typingsSlinky.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerTSElement extends js.Object {
  @JSName("$custom_cons")
  var $custom_cons: js.UndefOr[FunctionConstructor] = js.native
  @JSName("$custom_cons_args")
  var $custom_cons_args: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
}

object PolymerTSElement {
  @scala.inline
  def apply(): PolymerTSElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolymerTSElement]
  }
  @scala.inline
  implicit class PolymerTSElementOps[Self <: PolymerTSElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$custom_cons(value: FunctionConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$custom_cons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$custom_cons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$custom_cons")(js.undefined)
        ret
    }
    @scala.inline
    def with$custom_cons_args(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$custom_cons_args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$custom_cons_args: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$custom_cons_args")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

