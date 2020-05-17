package typingsSlinky.eslint.mod.SourceCode

import typingsSlinky.eslint.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.eslint.mod.SourceCode.FilterPredicate
  - typingsSlinky.eslint.anon.Count
*/
trait CursorWithCountOptions extends js.Object

object CursorWithCountOptions {
  @scala.inline
  implicit def apply(value: Count): CursorWithCountOptions = value.asInstanceOf[CursorWithCountOptions]
  @scala.inline
  implicit def apply(value: Double): CursorWithCountOptions = value.asInstanceOf[CursorWithCountOptions]
  @scala.inline
  implicit def apply(value: FilterPredicate): CursorWithCountOptions = value.asInstanceOf[CursorWithCountOptions]
}

