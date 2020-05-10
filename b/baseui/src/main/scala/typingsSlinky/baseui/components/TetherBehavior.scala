package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.baseui.layerMod.NormalizedOffsets
import typingsSlinky.baseui.layerMod.PopperDataObject
import typingsSlinky.baseui.layerMod.TetherProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TetherBehavior {
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.layerMod.TetherBehavior] {
    @scala.inline
    def anchorRefRefObject(value: ReactRef[HTMLElement]): this.type = set("anchorRef", value.asInstanceOf[js.Any])
    @scala.inline
    def anchorRefFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("anchorRef", js.Any.fromFunction1(value))
    @scala.inline
    def anchorRef(value: Ref[HTMLElement]): this.type = set("anchorRef", value.asInstanceOf[js.Any])
    @scala.inline
    def anchorRefNull: this.type = set("anchorRef", null)
    @scala.inline
    def arrowRefRefObject(value: ReactRef[HTMLElement]): this.type = set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowRefFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("arrowRef", js.Any.fromFunction1(value))
    @scala.inline
    def arrowRef(value: Ref[HTMLElement]): this.type = set("arrowRef", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowRefNull: this.type = set("arrowRef", null)
    @scala.inline
    def onPopperUpdate(value: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _): this.type = set("onPopperUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def popperOptions(value: js.Any): this.type = set("popperOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def popperRefRefObject(value: ReactRef[HTMLElement]): this.type = set("popperRef", value.asInstanceOf[js.Any])
    @scala.inline
    def popperRefFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("popperRef", js.Any.fromFunction1(value))
    @scala.inline
    def popperRef(value: Ref[HTMLElement]): this.type = set("popperRef", value.asInstanceOf[js.Any])
    @scala.inline
    def popperRefNull: this.type = set("popperRef", null)
  }
  
  def withProps(p: TetherProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TetherBehavior.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

