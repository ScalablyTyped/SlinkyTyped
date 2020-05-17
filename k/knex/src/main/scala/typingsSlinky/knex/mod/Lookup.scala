package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TDefault
  - / * import warning: importer.ImportType#apply Failed type conversion: TRegistry[TKey] * / js.Any
*/
trait Lookup[TRegistry /* <: js.Object */, TKey /* <: String */, TDefault] extends js.Object

object Lookup {
  @scala.inline
  implicit def apply[TRegistry, TKey, TDefault](
    value: /* import warning: importer.ImportType#apply Failed type conversion: TRegistry[TKey] */ js.Any
  ): Lookup[TRegistry, TKey, TDefault] = value.asInstanceOf[Lookup[TRegistry, TKey, TDefault]]
  @scala.inline
  implicit def apply[TRegistry, TKey, TDefault](value: TDefault): Lookup[TRegistry, TKey, TDefault] = value.asInstanceOf[Lookup[TRegistry, TKey, TDefault]]
}

