package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedRefinement[Tag /* <: String */, A, O]
  extends RefinementType[Tagged[Tag, js.Any, js.Any], A, O, js.Any]
     with Tagged[Tag, A, O]

