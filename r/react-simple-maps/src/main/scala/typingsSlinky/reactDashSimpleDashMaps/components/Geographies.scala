package typingsSlinky.reactDashSimpleDashMaps.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.GeographiesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geographies
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Geographies
    ] {
  @JSImport("react-simple-maps", "Geographies")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    disableOptimization: js.UndefOr[Boolean] = js.undefined,
    geography: String | StringDictionary[js.Any] | js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod.Geographies
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization.asInstanceOf[js.Any])
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GeographiesProps
}

