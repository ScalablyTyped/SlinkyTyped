package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.ButtonPropsautoFocusboole
import typingsSlinky.baseui.baseuiStrings.button
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.minimal
import typingsSlinky.baseui.baseuiStrings.pill
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.reset
import typingsSlinky.baseui.baseuiStrings.round
import typingsSlinky.baseui.baseuiStrings.secondary
import typingsSlinky.baseui.baseuiStrings.square
import typingsSlinky.baseui.baseuiStrings.submit
import typingsSlinky.baseui.baseuiStrings.tertiary
import typingsSlinky.baseui.buttonMod.ButtonOverrides
import typingsSlinky.baseui.buttonMod.ButtonProps
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalButton {
  @JSImport("baseui/modal", "ModalButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.modalMod.ModalButton] {
    @scala.inline
    def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $styleFunction1(value: ButtonProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def $style(value: StyleProp[ButtonProps]): this.type = set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancerReactElement(value: ReactElement): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancer(value: TagMod[Any]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def kind(value: primary | secondary | tertiary | minimal): this.type = set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: ButtonOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def shape(value: default_ | pill | round | square): this.type = set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: compact | default_ | large_ | mini): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def startEnhancerReactElement(value: ReactElement): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def startEnhancer(value: TagMod[Any]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonPropsautoFocusboole): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ModalButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

