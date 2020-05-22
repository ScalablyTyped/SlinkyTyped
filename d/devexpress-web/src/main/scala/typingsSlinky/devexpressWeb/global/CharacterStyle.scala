package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains characteristics of a character style in a document.
  */
@JSGlobal("CharacterStyle")
@js.native
class CharacterStyle ()
  extends typingsSlinky.devexpressWeb.CharacterStyle {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  /**
    * Gets or sets the linked style for the current style.
    */
  /* CompleteClass */
  override val linkedStyle: typingsSlinky.devexpressWeb.ParagraphStyle = js.native
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * Gets the style form which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typingsSlinky.devexpressWeb.CharacterStyle = js.native
}

