package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialog
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogStyleProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogStyles
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  @JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] {
    @scala.inline
    def ariaDescribedById(value: String): this.type = set("ariaDescribedById", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabelledById(value: String): this.type = set("ariaLabelledById", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDialog | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDialog]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDialog]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogContentProps(value: IDialogContentProps): this.type = set("dialogContentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def firstFocusableSelectorFunction0(value: () => String): this.type = set("firstFocusableSelector", js.Any.fromFunction0(value))
    @scala.inline
    def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    @scala.inline
    def isBlocking(value: Boolean): this.type = set("isBlocking", value.asInstanceOf[js.Any])
    @scala.inline
    def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
    @scala.inline
    def isDarkOverlay(value: Boolean): this.type = set("isDarkOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: ICSSRule | ICSSPixelUnitRule): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: ICSSRule | ICSSPixelUnitRule): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def modalProps(value: IModalProps): this.type = set("modalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): this.type = set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def onDismissed(value: () => _): this.type = set("onDismissed", js.Any.fromFunction0(value))
    @scala.inline
    def onLayerDidMount(value: () => Unit): this.type = set("onLayerDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def onLayerMounted(value: () => Unit): this.type = set("onLayerMounted", js.Any.fromFunction0(value))
    @scala.inline
    def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDialogStyleProps => DeepPartial[IDialogStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def subText(value: String): this.type = set("subText", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def topButtonsProps(value: js.Array[IButtonProps]): this.type = set("topButtonsProps", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: DialogType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

