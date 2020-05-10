package typingsSlinky.materialUi.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.AppBarProps
import typingsSlinky.materialUi.appBarMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppBar {
  @JSImport("material-ui/AppBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def iconClassNameLeft(value: String): this.type = set("iconClassNameLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def iconClassNameRight(value: String): this.type = set("iconClassNameRight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconElementLeft(value: ReactElement): this.type = set("iconElementLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def iconElementRight(value: ReactElement): this.type = set("iconElementRight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyleLeft(value: CSSProperties): this.type = set("iconStyleLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyleRight(value: CSSProperties): this.type = set("iconStyleRight", value.asInstanceOf[js.Any])
    @scala.inline
    def onLeftIconButtonClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onLeftIconButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRightIconButtonClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onRightIconButtonClick", js.Any.fromFunction1(value))
    @scala.inline
    def onTitleClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onTitleClick", js.Any.fromFunction1(value))
    @scala.inline
    def showMenuIconButton(value: Boolean): this.type = set("showMenuIconButton", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AppBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

