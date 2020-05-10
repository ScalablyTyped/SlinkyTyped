package typingsSlinky.prosemirrorTables.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellAttributes extends js.Object {
  var default: js.Any = js.native
  var getFromDOM: js.UndefOr[typingsSlinky.prosemirrorTables.mod.getFromDOM] = js.native
  var setDOMAttr: js.UndefOr[typingsSlinky.prosemirrorTables.mod.setDOMAttr] = js.native
}

object CellAttributes {
  @scala.inline
  def apply(default: js.Any): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAttributes]
  }
  @scala.inline
  implicit class CellAttributesOps[Self <: CellAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFromDOM(value: /* dom */ Element => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromDOM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFromDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDOMAttr(value: (/* value */ js.Any, /* attrs */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDOMAttr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetDOMAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDOMAttr")(js.undefined)
        ret
    }
  }
  
}

