package typingsSlinky.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default entity types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.LINK
  - typingsSlinky.draftJs.draftJsStrings.TOKEN
  - typingsSlinky.draftJs.draftJsStrings.PHOTO
  - typingsSlinky.draftJs.draftJsStrings.IMAGE
*/
trait ComposedEntityType extends js.Object

object ComposedEntityType {
  @scala.inline
  def IMAGE: typingsSlinky.draftJs.draftJsStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LINK: typingsSlinky.draftJs.draftJsStrings.LINK = this.cast("LINK")
  @scala.inline
  def PHOTO: typingsSlinky.draftJs.draftJsStrings.PHOTO = this.cast("PHOTO")
  @scala.inline
  def TOKEN: typingsSlinky.draftJs.draftJsStrings.TOKEN = this.cast("TOKEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

