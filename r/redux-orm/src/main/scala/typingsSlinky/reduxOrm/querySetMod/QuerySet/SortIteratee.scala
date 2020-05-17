package typingsSlinky.reduxOrm.querySetMod.QuerySet

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.Ref
import typingsSlinky.reduxOrm.modelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ordering clause.
  *
  * Either a key of SessionBoundModel or a evaluator function accepting plain object Model representation stored in the database.
  *
  * {@see QuerySet.orderBy}
  */
/* Rewritten from type alias, can be one of: 
  - / * keyof redux-orm.redux-orm/Model.Ref<M> * / java.lang.String
  - js.Function1[/ * row * / typingsSlinky.reduxOrm.modelMod.Ref[M], js.Any]
*/
trait SortIteratee[M /* <: default[Instantiable0[AnyModel], _] */] extends js.Object

object SortIteratee {
  @scala.inline
  implicit def apply[M](value: js.Function1[/* row */ Ref[M], js.Any]): SortIteratee[M] = value.asInstanceOf[SortIteratee[M]]
  @scala.inline
  implicit def apply[M](value: /* keyof redux-orm.redux-orm/Model.Ref<M> */ String): SortIteratee[M] = value.asInstanceOf[SortIteratee[M]]
}

