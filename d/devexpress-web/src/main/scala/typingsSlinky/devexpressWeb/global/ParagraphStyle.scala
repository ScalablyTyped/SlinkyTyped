package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the paragraph style settings.
  */
@JSGlobal("ParagraphStyle")
@js.native
class ParagraphStyle ()
  extends typingsSlinky.devexpressWeb.ParagraphStyle {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  /**
    * Gets or sets the linked style for the current style.
    */
  /* CompleteClass */
  override val linkedStyle: typingsSlinky.devexpressWeb.CharacterStyle = js.native
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  /* CompleteClass */
  override val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  /* CompleteClass */
  override val listLevelIndex: Double = js.native
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  /* CompleteClass */
  override val nextStyle: typingsSlinky.devexpressWeb.ParagraphStyle = js.native
  /**
    * Gets or sets the style from which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typingsSlinky.devexpressWeb.ParagraphStyle = js.native
}

