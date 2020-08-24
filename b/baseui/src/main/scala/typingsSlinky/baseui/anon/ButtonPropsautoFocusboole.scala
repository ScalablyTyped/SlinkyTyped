package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
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

/* Inlined baseui.baseui/button.ButtonProps & {  autoFocus :boolean | undefined} */
@js.native
trait ButtonPropsautoFocusboole extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.native
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[ButtonProps]] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[ReactElement] = js.native
  var href: js.UndefOr[String] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], _]] = js.native
  var overrides: js.UndefOr[ButtonOverrides] = js.native
  var shape: js.UndefOr[default_ | pill | round | square] = js.native
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  var startEnhancer: js.UndefOr[ReactElement] = js.native
  var target: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

object ButtonPropsautoFocusboole {
  @scala.inline
  def apply(): ButtonPropsautoFocusboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsautoFocusboole]
  }
  @scala.inline
  implicit class ButtonPropsautoFocusbooleOps[Self <: ButtonPropsautoFocusboole] (val x: Self) extends AnyVal {
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
    def set$asFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def set$asComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def set$as(value: StyletronBase): Self = this.set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$as: Self = this.set("$as", js.undefined)
    @scala.inline
    def set$styleFunction1(value: ButtonProps => StyleObject): Self = this.set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def set$style(value: StyleProp[ButtonProps]): Self = this.set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$style: Self = this.set("$style", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEndEnhancerReactElement(value: ReactElement): Self = this.set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndEnhancer(value: ReactElement): Self = this.set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndEnhancer: Self = this.set("endEnhancer", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setKind(value: primary | secondary | tertiary | minimal): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOverrides(value: ButtonOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setShape(value: default_ | pill | round | square): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: compact | default_ | large_ | mini): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStartEnhancerReactElement(value: ReactElement): Self = this.set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartEnhancer(value: ReactElement): Self = this.set("startEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartEnhancer: Self = this.set("startEnhancer", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

