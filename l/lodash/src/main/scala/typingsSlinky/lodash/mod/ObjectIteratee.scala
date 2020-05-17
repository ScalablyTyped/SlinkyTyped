package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lodash.mod.ObjectIterator[TObject, typingsSlinky.lodash.mod.NotVoid]
  - typingsSlinky.lodash.mod.IterateeShorthand[
/ * import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] * / js.Any]
*/
trait ObjectIteratee[TObject] extends js.Object

object ObjectIteratee {
  @scala.inline
  implicit def apply[TObject](
    value: IterateeShorthand[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ): ObjectIteratee[TObject] = value.asInstanceOf[ObjectIteratee[TObject]]
  @scala.inline
  implicit def apply[TObject](value: ObjectIterator[TObject, NotVoid]): ObjectIteratee[TObject] = value.asInstanceOf[ObjectIteratee[TObject]]
}

