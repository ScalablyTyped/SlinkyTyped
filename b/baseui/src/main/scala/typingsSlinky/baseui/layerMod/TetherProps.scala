package typingsSlinky.baseui.layerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.leftBottom
import typingsSlinky.baseui.baseuiStrings.leftTop
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.rightBottom
import typingsSlinky.baseui.baseuiStrings.rightTop
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var arrowRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var children: ReactElement = js.native
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.native
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  var popperOptions: js.UndefOr[js.Any] = js.native
  var popperRef: js.UndefOr[Ref[HTMLElement]] = js.native
}

object TetherProps {
  @scala.inline
  def apply(): TetherProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TetherProps]
  }
  @scala.inline
  implicit class TetherPropsOps[Self <: TetherProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorRefRefObject(value: ReactRef[HTMLElement]): Self = this.set("anchorRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("anchorRef", js.Any.fromFunction1(value))
    @scala.inline
    def setAnchorRef(value: Ref[HTMLElement]): Self = this.set("anchorRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorRef: Self = this.set("anchorRef", js.undefined)
    @scala.inline
    def setAnchorRefNull: Self = this.set("anchorRef", null)
    @scala.inline
    def setArrowRefRefObject(value: ReactRef[HTMLElement]): Self = this.set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("arrowRef", js.Any.fromFunction1(value))
    @scala.inline
    def setArrowRef(value: Ref[HTMLElement]): Self = this.set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRef: Self = this.set("arrowRef", js.undefined)
    @scala.inline
    def setArrowRefNull: Self = this.set("arrowRef", null)
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnPopperUpdate(value: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _): Self = this.set("onPopperUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPopperUpdate: Self = this.set("onPopperUpdate", js.undefined)
    @scala.inline
    def setPlacement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopperOptions(value: js.Any): Self = this.set("popperOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperOptions: Self = this.set("popperOptions", js.undefined)
    @scala.inline
    def setPopperRefRefObject(value: ReactRef[HTMLElement]): Self = this.set("popperRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopperRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("popperRef", js.Any.fromFunction1(value))
    @scala.inline
    def setPopperRef(value: Ref[HTMLElement]): Self = this.set("popperRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperRef: Self = this.set("popperRef", js.undefined)
    @scala.inline
    def setPopperRefNull: Self = this.set("popperRef", null)
  }
  
}

