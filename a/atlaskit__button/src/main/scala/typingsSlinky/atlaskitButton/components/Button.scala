package typingsSlinky.atlaskitButton.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitButton.mod.ButtonAppearances
import typingsSlinky.atlaskitButton.mod.ButtonProps
import typingsSlinky.atlaskitButton.mod.ButtonSpacing
import typingsSlinky.atlaskitButton.mod.ButtonType
import typingsSlinky.atlaskitButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@atlaskit/button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def appearance(value: ButtonAppearances): this.type = set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaControls(value: String): this.type = set("ariaControls", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaExpanded(value: Boolean): this.type = set("ariaExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaHaspopup(value: Boolean): this.type = set("ariaHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def iconAfter(value: ReactElement): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def iconBefore(value: ReactElement): this.type = set("iconBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRef(value: /* instance */ js.Any => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def shouldFitContainer(value: Boolean): this.type = set("shouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def spacing(value: ButtonSpacing): this.type = set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: ButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Button.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

