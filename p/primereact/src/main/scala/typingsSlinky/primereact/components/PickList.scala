package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_OriginalEventValue
import typingsSlinky.primereact.componentsPicklistPickListMod.PickListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.picklistMod.PickList] {
  @JSImport("primereact/picklist", "PickList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onChange */
  def apply(
    itemTemplate: /* item */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onMoveAllToSource: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveAllToTarget: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveToSource: /* e */ Anon_OriginalEventValue => Unit = null,
    onMoveToTarget: /* e */ Anon_OriginalEventValue => Unit = null,
    onSourceSelect: /* e */ Anon_OriginalEventValue => Unit = null,
    onTargetSelect: /* e */ Anon_OriginalEventValue => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    showSourceControls: js.UndefOr[Boolean] = js.undefined,
    showTargetControls: js.UndefOr[Boolean] = js.undefined,
    source: js.Array[_] = null,
    sourceHeader: js.Any = null,
    sourceStyle: js.Object = null,
    style: js.Object = null,
    tabIndex: String = null,
    target: js.Array[_] = null,
    targetHeader: js.Any = null,
    targetStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.picklistMod.PickList] = {
    val __obj = js.Dynamic.literal()
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1(onMoveAllToSource))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1(onMoveAllToTarget))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1(onMoveToSource))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1(onMoveToTarget))
    if (onSourceSelect != null) __obj.updateDynamic("onSourceSelect")(js.Any.fromFunction1(onSourceSelect))
    if (onTargetSelect != null) __obj.updateDynamic("onTargetSelect")(js.Any.fromFunction1(onTargetSelect))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader.asInstanceOf[js.Any])
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader.asInstanceOf[js.Any])
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.picklistMod.PickList] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.picklistMod.PickList](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PickListProps
}

