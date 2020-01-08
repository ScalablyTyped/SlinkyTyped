package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_DefaultChecked
import typingsSlinky.antd.libTableCreateStoreMod.Store
import typingsSlinky.antd.libTableInterfaceMod.SelectionCheckboxAllProps
import typingsSlinky.antd.libTableInterfaceMod.SelectionItem
import typingsSlinky.antd.libTableInterfaceMod.TableLocale
import typingsSlinky.antd.libTableSelectionCheckboxAllMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectionCheckboxAll
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("antd/lib/table/SelectionCheckboxAll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    data: js.Array[T],
    disabled: Boolean,
    getCheckboxPropsByItem: (T, Double) => Anon_DefaultChecked,
    getRecordKey: (T, js.UndefOr[Double]) => String,
    locale: TableLocale,
    onSelect: (String, Double, js.Any) => Unit,
    store: Store,
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement = null,
    hideDefaultSelections: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    selections: js.Array[SelectionItem] | Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], getCheckboxPropsByItem = js.Any.fromFunction2(getCheckboxPropsByItem), getRecordKey = js.Any.fromFunction2(getRecordKey), locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction3(onSelect), store = store.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(hideDefaultSelections)) __obj.updateDynamic("hideDefaultSelections")(hideDefaultSelections.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selections != null) __obj.updateDynamic("selections")(selections.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antd.libTableSelectionCheckboxAllMod.default[js.Any]]]
  }
  type Props = SelectionCheckboxAllProps[js.Any]
}

