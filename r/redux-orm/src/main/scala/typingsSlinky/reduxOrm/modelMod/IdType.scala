package typingsSlinky.reduxOrm.modelMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - / * import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[any] * / js.Any
*/
trait IdType[M /* <: Model[Instantiable0[AnyModel], _] */] extends IdOrModelLike[M]

object IdType {
  @scala.inline
  implicit def apply[M](
    value: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[any] */ js.Any
  ): IdType[M] = value.asInstanceOf[IdType[M]]
  @scala.inline
  implicit def apply[M](value: Double): IdType[M] = value.asInstanceOf[IdType[M]]
}

