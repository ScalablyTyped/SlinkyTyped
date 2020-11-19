package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airbnb-prop-types", "or")
@js.native
object or extends js.Object {
  
  def apply[A](propTypes: js.Array[Validator[A]]): Requireable[A] = js.native
  def apply[A](propTypes: js.Array[Validator[A]], name: String): Requireable[A] = js.native
  def apply[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]]): Requireable[A | B] = js.native
  def apply[A, B](propTypes: js.Tuple2[Validator[A], Validator[B]], name: String): Requireable[A | B] = js.native
  def apply[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]]): Requireable[A | B | C] = js.native
  def apply[A, B, C](propTypes: js.Tuple3[Validator[A], Validator[B], Validator[C]], name: String): Requireable[A | B | C] = js.native
}
