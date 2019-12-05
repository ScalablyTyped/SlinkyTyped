package typingsSlinky.prompts.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.prompts.promptsStrings.text
  - typings.prompts.promptsStrings.password
  - typings.prompts.promptsStrings.invisible
  - typings.prompts.promptsStrings.number
  - typings.prompts.promptsStrings.confirm
  - typings.prompts.promptsStrings.list
  - typings.prompts.promptsStrings.toggle
  - typings.prompts.promptsStrings.select
  - typings.prompts.promptsStrings.multiselect
  - typings.prompts.promptsStrings.autocomplete
  - typings.prompts.promptsStrings.date
  - typings.prompts.promptsStrings.autocompleteMultiselect
*/
trait PromptType extends js.Object

object PromptType {
  @scala.inline
  def autocomplete: typingsSlinky.prompts.promptsStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  def autocompleteMultiselect: typingsSlinky.prompts.promptsStrings.autocompleteMultiselect = this.cast("autocompleteMultiselect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typingsSlinky.prompts.promptsStrings.confirm = this.cast("confirm")
  @scala.inline
  def date: typingsSlinky.prompts.promptsStrings.date = this.cast("date")
  @scala.inline
  def invisible: typingsSlinky.prompts.promptsStrings.invisible = this.cast("invisible")
  @scala.inline
  def list: typingsSlinky.prompts.promptsStrings.list = this.cast("list")
  @scala.inline
  def multiselect: typingsSlinky.prompts.promptsStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def number: typingsSlinky.prompts.promptsStrings.number = this.cast("number")
  @scala.inline
  def password: typingsSlinky.prompts.promptsStrings.password = this.cast("password")
  @scala.inline
  def select: typingsSlinky.prompts.promptsStrings.select = this.cast("select")
  @scala.inline
  def text: typingsSlinky.prompts.promptsStrings.text = this.cast("text")
  @scala.inline
  def toggle: typingsSlinky.prompts.promptsStrings.toggle = this.cast("toggle")
}

