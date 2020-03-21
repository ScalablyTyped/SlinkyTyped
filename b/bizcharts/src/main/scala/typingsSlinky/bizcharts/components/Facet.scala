package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.bizcharts.AnonOffsetX
import typingsSlinky.bizcharts.AnonOffsetY
import typingsSlinky.bizcharts.mod.FacetProps
import typingsSlinky.bizcharts.mod.FacetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Facet
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.bizcharts.mod.Facet] {
  @JSImport("bizcharts", "Facet")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoSetAxis: js.UndefOr[Boolean] = js.undefined,
    colTitle: AnonOffsetY = null,
    eachView: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit = null,
    fields: String | js.Array[_] = null,
    margin: Double | js.Array[Double] = null,
    padding: Double | js.Array[Double] = null,
    rowTitle: AnonOffsetX = null,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    `type`: FacetType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Facet] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSetAxis)) __obj.updateDynamic("autoSetAxis")(autoSetAxis.asInstanceOf[js.Any])
    if (colTitle != null) __obj.updateDynamic("colTitle")(colTitle.asInstanceOf[js.Any])
    if (eachView != null) __obj.updateDynamic("eachView")(js.Any.fromFunction2(eachView))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Facet] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.bizcharts.mod.Facet](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FacetProps
}

