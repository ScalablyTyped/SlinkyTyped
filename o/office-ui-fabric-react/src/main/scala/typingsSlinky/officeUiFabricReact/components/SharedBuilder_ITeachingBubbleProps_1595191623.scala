package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.Target
import typingsSlinky.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyleProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ITeachingBubbleProps_1595191623[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
  @scala.inline
  def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
  @scala.inline
  def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
  @scala.inline
  def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRefFunction1(value: /* ref */ ITeachingBubble | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
  @scala.inline
  def componentRefRefObject(value: ReactRef[ITeachingBubble]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRef(value: IRefObject[ITeachingBubble]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
  @scala.inline
  def firstFocusableSelectorFunction0(value: () => String): this.type = set("firstFocusableSelector", js.Any.fromFunction0(value))
  @scala.inline
  def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
  @scala.inline
  def focusTrapZoneProps(value: IFocusTrapZoneProps): this.type = set("focusTrapZoneProps", value.asInstanceOf[js.Any])
  @scala.inline
  def footerContentReactElement(value: ReactElement): this.type = set("footerContent", value.asInstanceOf[js.Any])
  @scala.inline
  def footerContent(value: String | ReactElement): this.type = set("footerContent", value.asInstanceOf[js.Any])
  @scala.inline
  def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
  @scala.inline
  def hasCloseButton(value: Boolean): this.type = set("hasCloseButton", value.asInstanceOf[js.Any])
  @scala.inline
  def hasCloseIcon(value: Boolean): this.type = set("hasCloseIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def hasCondensedHeadline(value: Boolean): this.type = set("hasCondensedHeadline", value.asInstanceOf[js.Any])
  @scala.inline
  def hasSmallHeadline(value: Boolean): this.type = set("hasSmallHeadline", value.asInstanceOf[js.Any])
  @scala.inline
  def headline(value: String): this.type = set("headline", value.asInstanceOf[js.Any])
  @scala.inline
  def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
  @scala.inline
  def illustrationImage(value: IImageProps): this.type = set("illustrationImage", value.asInstanceOf[js.Any])
  @scala.inline
  def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
  @scala.inline
  def isWide(value: Boolean): this.type = set("isWide", value.asInstanceOf[js.Any])
  @scala.inline
  def onDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): this.type = set("onDismiss", js.Any.fromFunction1(value))
  @scala.inline
  def primaryButtonProps(value: IButtonProps): this.type = set("primaryButtonProps", value.asInstanceOf[js.Any])
  @scala.inline
  def secondaryButtonProps(value: IButtonProps): this.type = set("secondaryButtonProps", value.asInstanceOf[js.Any])
  @scala.inline
  def stylesFunction1(value: ITeachingBubbleStyleProps => DeepPartial[ITeachingBubbleStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  @scala.inline
  def styles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def targetRefObject(value: ReactRef[Element]): this.type = set("target", value.asInstanceOf[js.Any])
  @scala.inline
  def targetElement(value: Element): this.type = set("target", value.asInstanceOf[js.Any])
  @scala.inline
  def targetMouseEvent(value: MouseEvent): this.type = set("target", value.asInstanceOf[js.Any])
  @scala.inline
  def target(value: Target): this.type = set("target", value.asInstanceOf[js.Any])
  @scala.inline
  def targetNull: this.type = set("target", null)
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
}

