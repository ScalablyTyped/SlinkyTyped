package typingsSlinky.reduxOrm.modelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.modelMod.Primitive
  - js.Array[typingsSlinky.reduxOrm.modelMod.Primitive]
  - js.UndefOr[scala.Nothing]
  - org.scalablytyped.runtime.StringDictionary[
(/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable * / js.Object) | (js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable * / js.Object
])]
*/
trait Serializable
  extends ModelField
     with RefPropOrSimple[js.Any, js.Any]

object Serializable {
  @scala.inline
  implicit def apply(value: js.Array[Primitive]): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(value: Primitive): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def apply(
    value: StringDictionary[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object
      ])
    ]
  ): Serializable = value.asInstanceOf[Serializable]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Serializable): Serializable = value.asInstanceOf[Serializable]
}

