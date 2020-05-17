package typingsSlinky.cypress.JQuery

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cypress.anon.Complete
import typingsSlinky.cypress.anon.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Speed
// #region Speed
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.anon.Duration
  - typingsSlinky.cypress.anon.Easing
  - typingsSlinky.cypress.anon.Complete[TElement]
  - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
*/
trait SpeedSettings[TElement] extends js.Object

object SpeedSettings {
  @scala.inline
  implicit def apply[TElement](value: Complete[TElement]): SpeedSettings[TElement] = value.asInstanceOf[SpeedSettings[TElement]]
  @scala.inline
  implicit def apply[TElement](value: typingsSlinky.cypress.anon.Duration): SpeedSettings[TElement] = value.asInstanceOf[SpeedSettings[TElement]]
  @scala.inline
  implicit def apply[TElement](value: Easing): SpeedSettings[TElement] = value.asInstanceOf[SpeedSettings[TElement]]
  @scala.inline
  implicit def apply[TElement](value: StringDictionary[scala.Nothing]): SpeedSettings[TElement] = value.asInstanceOf[SpeedSettings[TElement]]
}

