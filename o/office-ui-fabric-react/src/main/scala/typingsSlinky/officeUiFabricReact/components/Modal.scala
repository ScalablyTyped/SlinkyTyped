package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsSlinky.officeUiFabricReact.modalTypesMod.IDragOptions
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModal
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalProps
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalStyleProps
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalStyles
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("office-ui-fabric-react", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.modalBaseMod.ModalBase] {
    @scala.inline
    def allowTouchBodyScroll(value: Boolean): this.type = set("allowTouchBodyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IModal | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IModal]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IModal]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def dragOptions(value: IDragOptions): this.type = set("dragOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def enableAriaHiddenSiblings(value: Boolean): this.type = set("enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
    @scala.inline
    def firstFocusableSelectorFunction0(value: () => String): this.type = set("firstFocusableSelector", js.Any.fromFunction0(value))
    @scala.inline
    def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    @scala.inline
    def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    @scala.inline
    def isBlocking(value: Boolean): this.type = set("isBlocking", value.asInstanceOf[js.Any])
    @scala.inline
    def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
    @scala.inline
    def isDarkOverlay(value: Boolean): this.type = set("isDarkOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def isModeless(value: Boolean): this.type = set("isModeless", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def layerProps(value: ILayerProps): this.type = set("layerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): this.type = set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def onDismissed(value: () => _): this.type = set("onDismissed", js.Any.fromFunction0(value))
    @scala.inline
    def onLayerDidMount(value: () => Unit): this.type = set("onLayerDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def overlay(value: IOverlayProps): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollableContentClassName(value: String): this.type = set("scrollableContentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IModalStyleProps => DeepPartial[IModalStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IModalStyleProps, IModalStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleAriaId(value: String): this.type = set("subtitleAriaId", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def titleAriaId(value: String): this.type = set("titleAriaId", value.asInstanceOf[js.Any])
    @scala.inline
    def topOffsetFixed(value: Boolean): this.type = set("topOffsetFixed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

