package typingsSlinky.rax.mod

import typingsSlinky.propTypes.mod.InferProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - P
  - typingsSlinky.rax.mod.Defaultize[
(typingsSlinky.rax.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]]) | P, 
js.Any]
  - typingsSlinky.rax.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]]
*/
trait RaxManagedAttributes[C, P] extends js.Object

object RaxManagedAttributes {
  @scala.inline
  implicit def apply[C, P](value: Defaultize[(MergePropTypes[P, InferProps[js.Any]]) | P, js.Any]): RaxManagedAttributes[C, P] = value.asInstanceOf[RaxManagedAttributes[C, P]]
  @scala.inline
  implicit def apply[C, P](value: MergePropTypes[P, InferProps[js.Any]]): RaxManagedAttributes[C, P] = value.asInstanceOf[RaxManagedAttributes[C, P]]
  @scala.inline
  implicit def apply[C, P](value: P): RaxManagedAttributes[C, P] = value.asInstanceOf[RaxManagedAttributes[C, P]]
}

