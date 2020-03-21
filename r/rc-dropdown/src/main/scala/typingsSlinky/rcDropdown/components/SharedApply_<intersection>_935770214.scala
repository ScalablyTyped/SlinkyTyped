package typingsSlinky.rcDropdown.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.rcDropdown.dropdownMod.DropdownProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class `SharedApply_<intersection>_935770214` (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, Ref[js.Any] with js.Object] {
  def apply(
    getPopupContainer: js.Any,
    align: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    alignPoint: js.UndefOr[Boolean] = js.undefined,
    animation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any = null,
    hideAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: /* e */ Event_ => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlay: js.Function0[ReactElement] | ReactElement = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: String = null,
    placements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    prefixCls: String = null,
    showAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    transitionName: String = null,
    trigger: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Ref[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignPoint)) __obj.updateDynamic("alignPoint")(alignPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (hideAction != null) __obj.updateDynamic("hideAction")(hideAction.asInstanceOf[js.Any])
    if (!js.isUndefined(minOverlayWidthMatchTrigger)) __obj.updateDynamic("minOverlayWidthMatchTrigger")(minOverlayWidthMatchTrigger.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1(onOverlayClick))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (placements != null) __obj.updateDynamic("placements")(placements.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropdownProps with RefAttributes[js.Any]
}

