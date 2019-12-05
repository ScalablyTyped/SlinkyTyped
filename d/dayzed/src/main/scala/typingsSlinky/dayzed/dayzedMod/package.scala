package typingsSlinky.dayzed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dayzedMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod

  type Dayzed = ReactComponentClass[Props]
  type RenderFn = js.Function1[/* renderProps */ RenderProps, TagMod[Any]]
}
