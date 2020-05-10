package typingsSlinky.reactToolbox.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsTheme
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentTheme
import typingsSlinky.reactToolbox.listListItemLayoutMod.ListItemLayoutProps
import typingsSlinky.reactToolbox.listListItemLayoutMod.ListItemLayoutTheme
import typingsSlinky.reactToolbox.listListItemMod.ListItemProps
import typingsSlinky.reactToolbox.listListItemMod.ListItemTheme
import typingsSlinky.reactToolbox.listListItemTextMod.ListItemTextTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("react-toolbox", "ListItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.mod.ListItem] {
    @scala.inline
    def avatarReactElement(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def avatar(value: String | ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def caption(value: String): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def itemContentReactElement(value: ReactElement): this.type = set("itemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def itemContent(value: ReactChild): this.type = set("itemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def leftActions(value: js.Array[TagMod[Any]]): this.type = set("leftActions", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIconReactElement(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIcon(value: String | ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def legend(value: String): this.type = set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def rightActions(value: js.Array[TagMod[Any]]): this.type = set("rightActions", value.asInstanceOf[js.Any])
    @scala.inline
    def rightIconReactElement(value: ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def rightIcon(value: String | ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def ripple(value: Boolean): this.type = set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(
      value: ListItemTheme with ListItemActionsTheme with ListItemContentTheme with ListItemLayoutTheme with ListItemTextTheme
    ): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def to(value: String): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps with ListItemLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

