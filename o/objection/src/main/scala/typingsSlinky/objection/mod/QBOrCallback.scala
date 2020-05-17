package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objection.mod.QueryBuilder[
QM, 
js.Array[QM], 
/ * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / js.Any]
  - js.ThisFunction1[
/ * this * / typingsSlinky.objection.mod.QueryBuilder[
  QM, 
  js.Array[QM], 
  / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / js.Any
], 
/ * queryBuilder * / typingsSlinky.objection.mod.QueryBuilder[
  QM, 
  js.Array[QM], 
  / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / js.Any
], 
scala.Unit]
*/
trait QBOrCallback[QM /* <: Model */] extends js.Object

object QBOrCallback {
  @scala.inline
  implicit def apply[QM](
    value: QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ): QBOrCallback[QM] = value.asInstanceOf[QBOrCallback[QM]]
  @scala.inline
  implicit def apply[QM](
    value: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      Unit
    ]
  ): QBOrCallback[QM] = value.asInstanceOf[QBOrCallback[QM]]
}

