package typingsSlinky.officeUiFabricReact.positioningContainerTypesMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPositionedData
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsSlinky.uifabricUtilities.ipointMod.IPoint
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositioningContainerProps extends IBaseProps[IPositioningContainer] {
  /**
    * Defines the element id referencing the element containing the description for the positioningContainer.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Accessible label text for positioningContainer.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for positioningContainer.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * The background color of the positioningContainer in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The bounding rectangle for which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.native
  /**
    * CSS class to apply to the positioningContainer.
    * @defaultvalue null
    */
  var className: js.UndefOr[String] = js.native
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  /**
    * If true the position will not change sides in an attempt to fit the positioningContainer within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that positioningContainer can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.native
  /**
    * The minimum distance the positioningContainer will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.native
  /**
    * The gap between the positioningContainer and the target
    * @defaultvalue 0
    */
  var offsetFromTarget: js.UndefOr[Double] = js.native
  /**
    * Callback when the positioningContainer tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional callback that is called once the positioningContainer has been correctly positioned.
    * @param positions - gives the user information about how the container is positioned such
    * as the element position, the target edge, and the alignment edge of the container.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[IPositionedData], Unit]] = js.native
  /**
    * Set max height of positioningContainer
    * When not set the positioningContainer will expand with contents up to the bottom of the screen
    */
  var positioningContainerMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Custom width for positioningContainer including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var positioningContainerWidth: js.UndefOr[Double] = js.native
  /**
    * If true then the onClose will not not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * Aria role assigned to the positioningContainer (Eg. dialog, alertdialog).
    */
  var role: js.UndefOr[String] = js.native
  /**
    * If true then the positioningContainer will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  /**
    * The target that the positioningContainer should try to position itself based on.
    * It can be either an HTMLElement a querySelector string of a valid HTMLElement
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[HTMLElement | String | MouseEvent | IPoint | Null] = js.native
  /**
    * Point used to position the positioningContainer.
    * Deprecated, use `target` instead.
    * @deprecated Use `target` instead.
    */
  var targetPoint: js.UndefOr[IPoint] = js.native
  /**
    * If true use a point rather than rectangle to position the positioningContainer.
    * For example it can be used to position based on a click.
    * @deprecated Do not use.
    */
  var useTargetPoint: js.UndefOr[Boolean] = js.native
}

object IPositioningContainerProps {
  @scala.inline
  def apply(): IPositioningContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositioningContainerProps]
  }
  @scala.inline
  implicit class IPositioningContainerPropsOps[Self <: IPositioningContainerProps] (val x: Self) extends AnyVal {
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
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: IRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHint(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintForRTL(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintForRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withDoNotLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPagePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPagePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetFromTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetFromTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetFromTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetFromTarget")(js.undefined)
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
    def withOnLayerMounted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLayerMounted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayerMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPositioned(value: /* positions */ js.UndefOr[IPositionedData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositioned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPositioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositioned")(js.undefined)
        ret
    }
    @scala.inline
    def withPositioningContainerMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioningContainerMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPositioningContainerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioningContainerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningContainerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDismissOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDismissOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInitialFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement | String | MouseEvent | IPoint): Self = {
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
    def withTargetPoint(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTargetPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTargetPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTargetPoint")(js.undefined)
        ret
    }
  }
  
}

