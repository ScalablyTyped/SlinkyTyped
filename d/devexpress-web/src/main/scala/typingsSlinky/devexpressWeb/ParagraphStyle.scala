package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the paragraph style settings.
  */
@js.native
trait ParagraphStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: CharacterStyle = js.native
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  val listLevelIndex: Double = js.native
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  val nextStyle: ParagraphStyle = js.native
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: ParagraphStyle = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(
    isDeleted: Boolean,
    linkedStyle: CharacterStyle,
    listIndex: Double,
    listLevelIndex: Double,
    name: String,
    nextStyle: ParagraphStyle,
    parent: ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextStyle = nextStyle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkedStyle(value: CharacterStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLevelIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLevelIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextStyle(value: ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

