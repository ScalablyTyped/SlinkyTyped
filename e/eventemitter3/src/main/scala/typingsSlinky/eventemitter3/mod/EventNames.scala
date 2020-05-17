package typingsSlinky.eventemitter3.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * keyof T * / java.lang.String
  - T
*/
trait EventNames[T /* <: String | js.Symbol | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in string | symbol ]: std.Array<any>}
  */ typingsSlinky.eventemitter3.eventemitter3Strings.EventNames with TopLevel[js.Any]) */] extends js.Object

object EventNames {
  @scala.inline
  implicit def apply[T](value: /* keyof T */ String): EventNames[T] = value.asInstanceOf[EventNames[T]]
  @scala.inline
  implicit def apply[T](value: T): EventNames[T] = value.asInstanceOf[EventNames[T]]
}

