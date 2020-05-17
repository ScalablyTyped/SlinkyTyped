package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.ObjectIterator[TObject, typingsSlinky.cypress.lodashMod.NotVoid]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[
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

