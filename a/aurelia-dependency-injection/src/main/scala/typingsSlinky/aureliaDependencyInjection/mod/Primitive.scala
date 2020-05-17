package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - js.Symbol
  - js.Object
  - js.Function1[/ * repeated * / js.Any, js.Any]
  - js.Array[js.Any]
*/
trait Primitive
  extends PrimitiveOrDependencyCtor[js.Any, js.Any, js.Any]
     with PrimitiveOrDependencyCtorOrFunctor[js.Any, js.Any, js.Any]

object Primitive {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Boolean): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: Double): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, js.Any]): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Object): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: String): Primitive = value.asInstanceOf[Primitive]
  @scala.inline
  implicit def apply(value: js.Symbol): Primitive = value.asInstanceOf[Primitive]
}

