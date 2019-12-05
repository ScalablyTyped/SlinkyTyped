package typingsSlinky.reactDashCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsLinkMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Link = ReactComponentClass[LinkProps]
  // tslint:disable-next-line strict-export-declare-modifiers
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
