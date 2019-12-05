package typingsSlinky.rcDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIDrawerPropTypesMod {
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type ILevelMove = Double | (js.Tuple2[Double, Double])
  type IStringOrHtmlElement = String | HTMLElement
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
