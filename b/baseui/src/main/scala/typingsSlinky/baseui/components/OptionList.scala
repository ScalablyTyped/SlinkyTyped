package typingsSlinky.baseui.components

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ChildMenuPopover
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.menuMod.OptionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList {
  @JSImport("baseui/menu", "OptionList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def $isFocused(value: Boolean): this.type = set("$isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def getChildMenu(value: /* item */ js.Any => TagMod[Any]): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* event */ MouseEvent => _): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: ChildMenuPopover): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def renderHrefAsAnchor(value: Boolean): this.type = set("renderHrefAsAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def resetMenu(value: () => Unit): this.type = set("resetMenu", js.Any.fromFunction0(value))
    @scala.inline
    def size(value: default_ | compact): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OptionListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(getItemLabel: js.Any => TagMod[Any], item: js.Any): Builder = {
    val __props = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionListProps]))
  }
}

