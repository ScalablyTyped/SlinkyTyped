package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a paragraph in the document.
  */
@js.native
trait Paragraph extends js.Object {
  /**
    * Gets the paragraph's index.
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    */
  val interval: Interval = js.native
  /**
    * Gets the paragraph's character length.
    */
  val length: Double = js.native
  /**
    * Gets the index of a list applied to the paragraph.
    */
  val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    */
  val listLevelIndex: Double = js.native
  /**
    * Gets the paragraph's start position in the document.
    */
  val start: Double = js.native
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see StyleBase.name).
    */
  val styleName: String = js.native
}

object Paragraph {
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    listIndex: Double,
    listLevelIndex: Double,
    start: Double,
    styleName: String
  ): Paragraph = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
  @scala.inline
  implicit class ParagraphOps[Self <: Paragraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
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
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

