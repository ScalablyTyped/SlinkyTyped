package typingsSlinky.rcDashPagination.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashPagination.rcDashPaginationMod.PaginationProps
import typingsSlinky.rcDashPagination.rcDashPaginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcDashPagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    itemRender: (/* page */ Double, /* type */ String, /* element */ TagMod[Any]) => TagMod[Any] = null,
    onChange: (/* page */ Double, /* pageSize */ Double) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.rcDashPagination.rcDashPaginationMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaginationProps
}

