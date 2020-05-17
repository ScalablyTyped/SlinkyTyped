package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cypress.lodashMod.ObjectIterator[TObject, TResult]
  - typingsSlinky.cypress.lodashMod.IterateeShorthand[
/ * import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] * / js.Any]
*/
trait ObjectIterateeCustom[TObject, TResult] extends js.Object

object ObjectIterateeCustom {
  @scala.inline
  implicit def apply[TObject, TResult](
    value: IterateeShorthand[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ): ObjectIterateeCustom[TObject, TResult] = value.asInstanceOf[ObjectIterateeCustom[TObject, TResult]]
  @scala.inline
  implicit def apply[TObject, TResult](value: ObjectIterator[TObject, TResult]): ObjectIterateeCustom[TObject, TResult] = value.asInstanceOf[ObjectIterateeCustom[TObject, TResult]]
}

