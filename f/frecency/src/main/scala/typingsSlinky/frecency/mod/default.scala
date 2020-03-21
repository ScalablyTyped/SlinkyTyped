package typingsSlinky.frecency.mod

import typingsSlinky.frecency.AnonExactQueryMatchWeight
import typingsSlinky.frecency.AnonFrecencyScore
import typingsSlinky.frecency.AnonKeepScores
import typingsSlinky.frecency.AnonSearchQuery
import typingsSlinky.frecency.AnonSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: AnonExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: AnonSearchQuery[T]): Unit = js.native
}

