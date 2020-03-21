package typingsSlinky.reactLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // React Element Props
  type DivProps = typingsSlinky.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement]
  // Helper types
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type PreProps = typingsSlinky.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLPreElement]
}
