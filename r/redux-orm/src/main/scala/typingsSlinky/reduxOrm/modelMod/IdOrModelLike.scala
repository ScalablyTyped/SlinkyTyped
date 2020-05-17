package typingsSlinky.reduxOrm.modelMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.anon.GetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.modelMod.IdType[M]
  - typingsSlinky.reduxOrm.anon.GetId[M]
*/
trait IdOrModelLike[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object

object IdOrModelLike {
  @scala.inline
  implicit def apply[M](value: GetId[M]): IdOrModelLike[M] = value.asInstanceOf[IdOrModelLike[M]]
  @scala.inline
  implicit def apply[M](value: IdType[M]): IdOrModelLike[M] = value.asInstanceOf[IdOrModelLike[M]]
}

