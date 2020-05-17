package typingsSlinky.poi.mod.Config

import typingsSlinky.webpack.mod.EntryFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.webpack.mod.Entry
  - typingsSlinky.webpack.mod.EntryFunc
  - js.UndefOr[scala.Nothing]
*/
trait Entry extends js.Object

object Entry {
  @scala.inline
  implicit def apply(value: js.Array[String]): Entry = value.asInstanceOf[Entry]
  @scala.inline
  implicit def apply(value: typingsSlinky.webpack.mod.Entry): Entry = value.asInstanceOf[Entry]
  @scala.inline
  implicit def apply(value: EntryFunc): Entry = value.asInstanceOf[Entry]
  @scala.inline
  implicit def apply(value: String): Entry = value.asInstanceOf[Entry]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Entry): Entry = value.asInstanceOf[Entry]
}

