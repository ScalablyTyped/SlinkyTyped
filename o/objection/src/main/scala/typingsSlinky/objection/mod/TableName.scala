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
trait TableName extends js.Object

object TableName {
  @scala.inline
  implicit def apply(
    value: QueryBuilder[
      js.Any, 
      js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ): TableName = value.asInstanceOf[TableName]
  @scala.inline
  implicit def apply(value: Raw_): TableName = value.asInstanceOf[TableName]
  @scala.inline
  implicit def apply(value: Reference): TableName = value.asInstanceOf[TableName]
  @scala.inline
  implicit def apply(value: String): TableName = value.asInstanceOf[TableName]
}

