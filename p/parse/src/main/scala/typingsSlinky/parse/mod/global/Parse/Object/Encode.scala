package typingsSlinky.parse.mod.global.Parse.Object

import typingsSlinky.parse.anon.Iso
import typingsSlinky.parse.mod.global.Parse.Pointer
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.parse.mod.global.Parse.Object.ToJSON[T]
  - js.Array[js.Any]
  - java.lang.String
  - typingsSlinky.parse.anon.Iso
  - typingsSlinky.std.ReturnType[
/ * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
  - typingsSlinky.parse.mod.global.Parse.Pointer
*/
trait Encode[T] extends js.Object

object Encode {
  @scala.inline
  implicit def apply[T](value: js.Array[js.Any]): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](value: Iso): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](value: Pointer): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](
    value: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
    ]
  ): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](value: String): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](value: T): Encode[T] = value.asInstanceOf[Encode[T]]
  @scala.inline
  implicit def apply[T](value: ToJSON[T]): Encode[T] = value.asInstanceOf[Encode[T]]
}

