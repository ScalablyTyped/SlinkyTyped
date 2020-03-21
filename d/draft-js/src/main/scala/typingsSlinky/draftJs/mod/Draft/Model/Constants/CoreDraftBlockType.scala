package typingsSlinky.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of default valid block types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.unstyled
  - typingsSlinky.draftJs.draftJsStrings.paragraph
  - typingsSlinky.draftJs.draftJsStrings.`header-one`
  - typingsSlinky.draftJs.draftJsStrings.`header-two`
  - typingsSlinky.draftJs.draftJsStrings.`header-three`
  - typingsSlinky.draftJs.draftJsStrings.`header-four`
  - typingsSlinky.draftJs.draftJsStrings.`header-five`
  - typingsSlinky.draftJs.draftJsStrings.`header-six`
  - typingsSlinky.draftJs.draftJsStrings.`unordered-list-item`
  - typingsSlinky.draftJs.draftJsStrings.`ordered-list-item`
  - typingsSlinky.draftJs.draftJsStrings.blockquote
  - typingsSlinky.draftJs.draftJsStrings.`code-block`
  - typingsSlinky.draftJs.draftJsStrings.atomic
*/
trait CoreDraftBlockType extends js.Object

object CoreDraftBlockType {
  @scala.inline
  def atomic: typingsSlinky.draftJs.draftJsStrings.atomic = this.cast("atomic")
  @scala.inline
  def blockquote: typingsSlinky.draftJs.draftJsStrings.blockquote = this.cast("blockquote")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `code-block`: typingsSlinky.draftJs.draftJsStrings.`code-block` = this.cast("code-block")
  @scala.inline
  def `header-five`: typingsSlinky.draftJs.draftJsStrings.`header-five` = this.cast("header-five")
  @scala.inline
  def `header-four`: typingsSlinky.draftJs.draftJsStrings.`header-four` = this.cast("header-four")
  @scala.inline
  def `header-one`: typingsSlinky.draftJs.draftJsStrings.`header-one` = this.cast("header-one")
  @scala.inline
  def `header-six`: typingsSlinky.draftJs.draftJsStrings.`header-six` = this.cast("header-six")
  @scala.inline
  def `header-three`: typingsSlinky.draftJs.draftJsStrings.`header-three` = this.cast("header-three")
  @scala.inline
  def `header-two`: typingsSlinky.draftJs.draftJsStrings.`header-two` = this.cast("header-two")
  @scala.inline
  def `ordered-list-item`: typingsSlinky.draftJs.draftJsStrings.`ordered-list-item` = this.cast("ordered-list-item")
  @scala.inline
  def paragraph: typingsSlinky.draftJs.draftJsStrings.paragraph = this.cast("paragraph")
  @scala.inline
  def `unordered-list-item`: typingsSlinky.draftJs.draftJsStrings.`unordered-list-item` = this.cast("unordered-list-item")
  @scala.inline
  def unstyled: typingsSlinky.draftJs.draftJsStrings.unstyled = this.cast("unstyled")
}

