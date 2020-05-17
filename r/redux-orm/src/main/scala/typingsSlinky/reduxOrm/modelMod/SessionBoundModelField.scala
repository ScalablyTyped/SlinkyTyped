package typingsSlinky.reduxOrm.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] * / js.Any
  - typingsSlinky.reduxOrm.modelMod.SessionBoundModel[
/ * import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] * / js.Any, 
js.Object]
*/
trait SessionBoundModelField[M /* <: AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ String */] extends js.Object

object SessionBoundModelField {
  @scala.inline
  implicit def apply[M, K](
    value: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any
  ): SessionBoundModelField[M, K] = value.asInstanceOf[SessionBoundModelField[M, K]]
  @scala.inline
  implicit def apply[M, K](
    value: SessionBoundModel[
      /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any, 
      js.Object
    ]
  ): SessionBoundModelField[M, K] = value.asInstanceOf[SessionBoundModelField[M, K]]
}

