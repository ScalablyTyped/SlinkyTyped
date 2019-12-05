package typingsSlinky.atNivoVoronoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoVoronoiMod {
  import slinky.core.TagMod

  type VoronoiCustomLayer = js.Function1[/* repeated */ js.Any, TagMod[Any]]
  type VoronoiDomain = js.Tuple2[Double, Double]
}
