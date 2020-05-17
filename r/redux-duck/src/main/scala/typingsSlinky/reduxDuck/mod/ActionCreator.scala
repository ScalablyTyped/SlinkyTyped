package typingsSlinky.reduxDuck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[A]
  - js.Function1[
/ * import warning: importer.ImportType#apply Failed type conversion: A['payload'] * / / * a * / js.Any, 
A]
*/
trait ActionCreator[A /* <: FSAHack */] extends js.Object

object ActionCreator {
  @scala.inline
  implicit def apply[A](value: js.Function0[A]): ActionCreator[A] = value.asInstanceOf[ActionCreator[A]]
  @scala.inline
  implicit def apply[A](
    value: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: A['payload'] */ /* a */ js.Any, 
      A
    ]
  ): ActionCreator[A] = value.asInstanceOf[ActionCreator[A]]
}

