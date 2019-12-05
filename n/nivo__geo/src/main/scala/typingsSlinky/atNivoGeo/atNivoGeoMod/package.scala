package typingsSlinky.atNivoGeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoGeoMod {
  import slinky.core.ReactComponentClass
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.atNivoGeo.Anon_Feature
  import typingsSlinky.atNivoGeo.Anon_FeatureChoroplethBoundFeature

  type ChoroplethEventHandler = js.Function2[/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type ChoroplethProps = ChoroplethCommonProps
  type ChoroplethTooltip = ReactComponentClass[Anon_FeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any], Unit]
  type GeoMapProps = GeoMapCommonProps
  type GeoMapTooltip = ReactComponentClass[Anon_Feature]
}
