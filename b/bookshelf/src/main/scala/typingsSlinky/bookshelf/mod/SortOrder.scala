package typingsSlinky.bookshelf.mod

import typingsSlinky.bookshelf.bookshelfStrings.asc_
import typingsSlinky.bookshelf.bookshelfStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bookshelf.bookshelfStrings.ASC
  - typingsSlinky.bookshelf.bookshelfStrings.asc_
  - typingsSlinky.bookshelf.bookshelfStrings.DESC
  - typingsSlinky.bookshelf.bookshelfStrings.desc_
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def ASC: typingsSlinky.bookshelf.bookshelfStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typingsSlinky.bookshelf.bookshelfStrings.DESC = this.cast("DESC")
  @scala.inline
  def asc: asc_ = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: desc_ = this.cast("desc")
}

