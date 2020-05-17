package typingsSlinky.baconjs.whenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.whenMod.AnyObservable
  - typingsSlinky.baconjs.whenMod.AnySource
*/
trait AnyObservableOrSource extends js.Object

object AnyObservableOrSource {
  @scala.inline
  implicit def apply(value: AnyObservable): AnyObservableOrSource = value.asInstanceOf[AnyObservableOrSource]
  @scala.inline
  implicit def apply(value: AnySource): AnyObservableOrSource = value.asInstanceOf[AnyObservableOrSource]
}

