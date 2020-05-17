package typingsSlinky.eventemitter3.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: T[K] * / js.Any
  - js.Array[js.Any]
*/
trait EventArgs[T /* <: String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in string | symbol ]: std.Array<any>}
  */ typingsSlinky.eventemitter3.eventemitter3Strings.EventArgs with TopLevel[js.Any]) */, K /* <: EventNames[T] */] extends js.Object

object EventArgs {
  @scala.inline
  implicit def apply[T, K](value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): EventArgs[T, K] = value.asInstanceOf[EventArgs[T, K]]
  @scala.inline
  implicit def apply[T, K](value: js.Array[js.Any]): EventArgs[T, K] = value.asInstanceOf[EventArgs[T, K]]
}

