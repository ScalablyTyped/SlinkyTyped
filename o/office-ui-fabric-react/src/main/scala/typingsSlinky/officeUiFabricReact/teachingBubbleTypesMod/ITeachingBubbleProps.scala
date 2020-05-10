package typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.Target
import typingsSlinky.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typingsSlinky.officeUiFabricReact.imageTypesMod.IImageProps
import typingsSlinky.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase
import typingsSlinky.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleProps
  extends ClassAttributes[TeachingBubbleBase | TeachingBubbleContentBase]
     with IAccessiblePopupProps {
  /**
    * Defines the element id referencing the element containing the description for the TeachingBubble.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for TeachingBubble.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * Properties to pass through for Callout, reference detail properties in ICalloutProps
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Optional callback to access the ITeachingBubble interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITeachingBubble]] = js.native
  /**
    * Text that will be rendered in the footer of the TeachingBubble.
    * May be rendered alongside primary and secondary buttons.
    */
  var footerContent: js.UndefOr[String | ReactElement] = js.native
  /**
    * Whether the TeachingBubble renders close button in the top right corner.
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use `hasCloseButton`.
    */
  var hasCloseIcon: js.UndefOr[Boolean] = js.native
  /**
    * A variation with smaller bold headline and no margins.
    */
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.native
  /**
    * A variation with smaller bold headline and margins to the body.
    * (`hasCondensedHeadline` takes precedence if it is also set to true.)
    */
  var hasSmallHeadline: js.UndefOr[Boolean] = js.native
  /**
    * A headline for the Teaching Bubble.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An Image for the TeachingBubble.
    */
  var illustrationImage: js.UndefOr[IImageProps] = js.native
  /**
    * Whether or not the TeachingBubble is wide, with image on the left side.
    */
  var isWide: js.UndefOr[Boolean] = js.native
  /**
    * Callback when the TeachingBubble tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * The Primary interaction button
    */
  var primaryButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * The Secondary interaction button
    */
  var secondaryButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]] = js.native
  /**
    * Element, MouseEvent, Point, or querySelector string that the TeachingBubble
    * should anchor to.
    */
  var target: js.UndefOr[Target] = js.native
  /**
    * @deprecated use target instead
    * Element to anchor the TeachingBubble to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ITeachingBubbleProps {
  @scala.inline
  def apply(): ITeachingBubbleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleProps]
  }
  @scala.inline
  implicit class ITeachingBubblePropsOps[Self <: ITeachingBubbleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ITeachingBubble | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ITeachingBubble]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ITeachingBubble]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterContent(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCloseIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCondensedHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCondensedHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCondensedHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCondensedHeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSmallHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSmallHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSmallHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSmallHeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
        ret
    }
    @scala.inline
    def withIllustrationImage(value: IImageProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("illustrationImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIllustrationImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("illustrationImage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ITeachingBubbleStyleProps => Partial[ITeachingBubbleStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRefObject(value: ReactRef[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withoutTargetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

