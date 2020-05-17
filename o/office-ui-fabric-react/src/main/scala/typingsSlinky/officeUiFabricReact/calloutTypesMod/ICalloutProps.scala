package typingsSlinky.officeUiFabricReact.calloutTypesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  /**
    * Defines the element id referencing the element containing the description for the callout.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Accessible label text for callout.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for callout.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * The background color of the Callout in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  /**
    * The bounding rectangle (or callback that returns a rectangle) for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ])
  ] = js.native
  /**
    * Set max height of callout
    * When not set the callout will expand with contents up to the bottom of the screen
    */
  var calloutMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutWidth: js.UndefOr[Double] = js.native
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
    * If true the position will not change sides in an attempt to fit the callout within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of the `directionalHint` alignment edge will be used instead.
    * This means that `DirectionalHint.BottomLeft` will change to `DirectionalHint.BottomRight` but
    * `DirectionalHint.LeftAuto` will not change.
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that callout can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.native
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  /**
    * Manually set OverflowYHidden style prop to true on calloutMain element
    * A variety of callout load animations will need this to hide the scollbar that can appear
    */
  var hideOverflow: js.UndefOr[Boolean] = js.native
  /**
    * If true then the beak is visible. If false it will not be shown.
    * @defaultvalue true
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.native
  /**
    * The minimum distance the callout will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.native
  /**
    * Callback when the Callout tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional callback that is called once the callout has been correctly positioned.
    * @param positions - Gives the user information about how the callout is positioned such as the
    * final edge of the target that it positioned against, the beak position, and the beaks relationship to the
    * edges of the callout.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[ICalloutPositionedInfo], Unit]] = js.native
  /**
    * Callback when the Callout body is scrolled.
    */
  @JSName("onScroll")
  var onScroll_ICalloutProps: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true then the callout will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  /**
    * If true then the callout will not dismiss on resize
    * @defaultvalue false
    */
  var preventDismissOnResize: js.UndefOr[Boolean] = js.native
  /**
    * If true then the callout will not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * If true then the callout will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  /**
    * If specified, determines whether the underlying "Popup" component should try to restore
    * focus when it is dismissed.  When set to false, the Popup won't try to restore focus to
    * the last focused element.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
  /**
    * If true, the component will be updated even when hidden=true.
    * Note that this would consume resources to update even though
    * nothing is being shown to the user.
    * This might be helpful though if your updates are small and you want the
    * callout to be revealed fast to the user when hidden is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.native
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]] = js.native
  /**
    * The target that the Callout should try to position itself based on.
    * It can be either an Element a querySelector string of a valid Element
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.native
  /**
    * Optional theme for component
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ICalloutProps {
  @scala.inline
  def apply(): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutProps]
  }
  @scala.inline
  implicit class ICalloutPropsOps[Self <: ICalloutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignTargetEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTargetEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(js.undefined)
        ret
    }
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
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
    ): Self = {
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
    def withCalloutMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutWidth")(js.undefined)
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
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBeakVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBeakVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeakVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerProps(value: ILayerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerProps")(js.undefined)
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
    def withOnPositioned(value: /* positions */ js.UndefOr[ICalloutPositionedInfo] => Unit): Self = {
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
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDismissOnLostFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnLostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDismissOnLostFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnLostFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDismissOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDismissOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDismissOnResize")(js.undefined)
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
    def withShouldRestoreFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdateWhenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateWhenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUpdateWhenHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdateWhenHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ICalloutContentStyleProps => Partial[ICalloutContentStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]): Self = {
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

