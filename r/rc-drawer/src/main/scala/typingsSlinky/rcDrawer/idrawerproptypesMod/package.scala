package typingsSlinky.rcDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idrawerproptypesMod {
  type ILevelMove = scala.Double | (js.Tuple2[scala.Double, scala.Double])
  type IStringOrHtmlElement = java.lang.String | org.scalajs.dom.raw.HTMLElement
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
}
