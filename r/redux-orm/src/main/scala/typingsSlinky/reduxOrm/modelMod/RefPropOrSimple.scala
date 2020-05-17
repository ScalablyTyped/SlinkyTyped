package typingsSlinky.reduxOrm.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.modelMod.Serializable
  - / * import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.Ref<M>[K] * / js.Any
*/
trait RefPropOrSimple[M /* <: AnyModel */, K /* <: String */] extends js.Object

object RefPropOrSimple {
  @scala.inline
  implicit def apply[M, K](
    value: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.Ref<M>[K] */ js.Any
  ): RefPropOrSimple[M, K] = value.asInstanceOf[RefPropOrSimple[M, K]]
  @scala.inline
  implicit def apply[M, K](value: Serializable): RefPropOrSimple[M, K] = value.asInstanceOf[RefPropOrSimple[M, K]]
}

