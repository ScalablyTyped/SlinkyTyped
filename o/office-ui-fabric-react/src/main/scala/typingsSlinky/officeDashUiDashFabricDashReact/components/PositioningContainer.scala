package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libIPointMod.IPoint
import typingsSlinky.atUifabricUtilities.libIRectangleMod.IRectangle
import typingsSlinky.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainer
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerDotTypesMod.IPositioningContainerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PositioningContainer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerMod.PositioningContainer
    ] {
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    backgroundColor: String = null,
    bounds: IRectangle = null,
    componentRef: IRefObject[IPositioningContainer] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    finalHeight: Int | Double = null,
    minPagePadding: Int | Double = null,
    offsetFromTarget: Int | Double = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onLayerMounted: () => Unit = null,
    onPositioned: /* positions */ js.UndefOr[IPositionedData] => Unit = null,
    positioningContainerMaxHeight: Int | Double = null,
    positioningContainerWidth: Int | Double = null,
    preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement | String | MouseEvent | IPoint = null,
    targetPoint: IPoint = null,
    useTargetPoint: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerMod.PositioningContainer
  ] = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (finalHeight != null) __obj.updateDynamic("finalHeight")(finalHeight.asInstanceOf[js.Any])
    if (minPagePadding != null) __obj.updateDynamic("minPagePadding")(minPagePadding.asInstanceOf[js.Any])
    if (offsetFromTarget != null) __obj.updateDynamic("offsetFromTarget")(offsetFromTarget.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (onPositioned != null) __obj.updateDynamic("onPositioned")(js.Any.fromFunction1(onPositioned))
    if (positioningContainerMaxHeight != null) __obj.updateDynamic("positioningContainerMaxHeight")(positioningContainerMaxHeight.asInstanceOf[js.Any])
    if (positioningContainerWidth != null) __obj.updateDynamic("positioningContainerWidth")(positioningContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnScroll)) __obj.updateDynamic("preventDismissOnScroll")(preventDismissOnScroll.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetPoint != null) __obj.updateDynamic("targetPoint")(targetPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetPoint)) __obj.updateDynamic("useTargetPoint")(useTargetPoint.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerMod.PositioningContainer
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCoachmarkPositioningContainerPositioningContainerMod.PositioningContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IPositioningContainerProps
}

