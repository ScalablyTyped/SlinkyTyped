package typingsSlinky.nivoGeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChoroplethEventHandler = js.Function2[
    /* feature */ typingsSlinky.nivoGeo.mod.ChoroplethBoundFeature, 
    /* event */ slinky.web.SyntheticMouseEvent[js.Any], 
    scala.Unit
  ]
  type ChoroplethProps = typingsSlinky.nivoGeo.mod.ChoroplethCommonProps
  type ChoroplethTooltip = slinky.core.ReactComponentClass[typingsSlinky.nivoGeo.anon.FeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[/* feature */ js.Any, /* event */ slinky.web.SyntheticMouseEvent[js.Any], scala.Unit]
  type GeoMapProps = typingsSlinky.nivoGeo.mod.GeoMapCommonProps
  type GeoMapTooltip = slinky.core.ReactComponentClass[typingsSlinky.nivoGeo.anon.Feature]
}
