package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[TElement] extends _SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(`this`: TElement): Unit
}

object Anon_Complete {
  @scala.inline
  def apply[TElement](complete: TElement => Unit): Anon_Complete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
  
    __obj.asInstanceOf[Anon_Complete[TElement]]
  }
}

