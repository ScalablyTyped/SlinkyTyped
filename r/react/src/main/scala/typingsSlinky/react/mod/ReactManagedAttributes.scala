package typingsSlinky.react.mod

import typingsSlinky.propTypes.mod.InferProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - P
  - typingsSlinky.react.mod.Defaultize[
(typingsSlinky.react.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]]) | P, 
js.Any]
  - typingsSlinky.react.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]]
*/
trait ReactManagedAttributes[C, P] extends js.Object

object ReactManagedAttributes {
  @scala.inline
  implicit def apply[C, P](value: Defaultize[(MergePropTypes[P, InferProps[js.Any]]) | P, js.Any]): ReactManagedAttributes[C, P] = value.asInstanceOf[ReactManagedAttributes[C, P]]
  @scala.inline
  implicit def apply[C, P](value: MergePropTypes[P, InferProps[js.Any]]): ReactManagedAttributes[C, P] = value.asInstanceOf[ReactManagedAttributes[C, P]]
  @scala.inline
  implicit def apply[C, P](value: P): ReactManagedAttributes[C, P] = value.asInstanceOf[ReactManagedAttributes[C, P]]
}

