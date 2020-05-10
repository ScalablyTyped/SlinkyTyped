package typingsSlinky.materialUi.MaterialUI

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeAfterWrapperProps extends js.Object {
  var afterElementType: js.UndefOr[String] = js.native
  var afterStyle: js.UndefOr[CSSProperties] = js.native
  var beforeElementType: js.UndefOr[String] = js.native
  var beforeStyle: js.UndefOr[CSSProperties] = js.native
  var elementType: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object BeforeAfterWrapperProps {
  @scala.inline
  def apply(): BeforeAfterWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeAfterWrapperProps]
  }
  @scala.inline
  implicit class BeforeAfterWrapperPropsOps[Self <: BeforeAfterWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterElementType")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeElementType")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
  }
  
}

