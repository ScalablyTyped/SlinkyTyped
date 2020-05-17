package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.objection.mod.Raw_
  - typingsSlinky.objection.mod.Reference
  - typingsSlinky.objection.mod.QueryBuilder[
js.Any, 
js.Array[js.Any], 
/ * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / js.Any]
*/
trait ColumnRef extends js.Object

object ColumnRef {
  @scala.inline
  implicit def apply(
    value: QueryBuilder[
      js.Any, 
      js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ): ColumnRef = value.asInstanceOf[ColumnRef]
  @scala.inline
  implicit def apply(value: Raw_): ColumnRef = value.asInstanceOf[ColumnRef]
  @scala.inline
  implicit def apply(value: Reference): ColumnRef = value.asInstanceOf[ColumnRef]
  @scala.inline
  implicit def apply(value: String): ColumnRef = value.asInstanceOf[ColumnRef]
}

