package typingsSlinky.reduxOrm.querySetMod.QuerySet

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A union of lookup clauses.
  * {@see QuerySet.exclude}
  * {@see QuerySet.filter}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupProps[M]
  - typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupPredicate[M]
*/
trait LookupSpec[M /* <: default[Instantiable0[AnyModel], _] */] extends js.Object

object LookupSpec {
  @scala.inline
  implicit def apply[M](value: LookupPredicate[M]): LookupSpec[M] = value.asInstanceOf[LookupSpec[M]]
  @scala.inline
  implicit def apply[M](value: LookupProps[M]): LookupSpec[M] = value.asInstanceOf[LookupSpec[M]]
}

