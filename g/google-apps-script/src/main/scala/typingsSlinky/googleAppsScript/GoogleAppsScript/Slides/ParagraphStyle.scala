package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styles of text that apply to entire paragraphs.
  *
  * Read methods in this class return null if the corresponding TextRange spans
  * multiple paragraphs, and those paragraphs have different values for the read method being called.
  * To avoid this, query for paragraph styles using the TextRange returned by the Paragraph.getRange() method.
  */
@js.native
trait ParagraphStyle extends js.Object {
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getParagraphAlignment(): ParagraphAlignment = js.native
  def getSpaceAbove(): Double = js.native
  def getSpaceBelow(): Double = js.native
  def getSpacingMode(): SpacingMode = js.native
  def getTextDirection(): TextDirection = js.native
  def setIndentEnd(indent: Double): ParagraphStyle = js.native
  def setIndentFirstLine(indent: Double): ParagraphStyle = js.native
  def setIndentStart(indent: Double): ParagraphStyle = js.native
  def setLineSpacing(spacing: Double): ParagraphStyle = js.native
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle = js.native
  def setSpaceAbove(space: Double): ParagraphStyle = js.native
  def setSpaceBelow(space: Double): ParagraphStyle = js.native
  def setSpacingMode(mode: SpacingMode): ParagraphStyle = js.native
  def setTextDirection(direction: TextDirection): ParagraphStyle = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(
    getIndentEnd: () => Double,
    getIndentFirstLine: () => Double,
    getIndentStart: () => Double,
    getLineSpacing: () => Double,
    getParagraphAlignment: () => ParagraphAlignment,
    getSpaceAbove: () => Double,
    getSpaceBelow: () => Double,
    getSpacingMode: () => SpacingMode,
    getTextDirection: () => TextDirection,
    setIndentEnd: Double => ParagraphStyle,
    setIndentFirstLine: Double => ParagraphStyle,
    setIndentStart: Double => ParagraphStyle,
    setLineSpacing: Double => ParagraphStyle,
    setParagraphAlignment: ParagraphAlignment => ParagraphStyle,
    setSpaceAbove: Double => ParagraphStyle,
    setSpaceBelow: Double => ParagraphStyle,
    setSpacingMode: SpacingMode => ParagraphStyle,
    setTextDirection: TextDirection => ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(getIndentEnd = js.Any.fromFunction0(getIndentEnd), getIndentFirstLine = js.Any.fromFunction0(getIndentFirstLine), getIndentStart = js.Any.fromFunction0(getIndentStart), getLineSpacing = js.Any.fromFunction0(getLineSpacing), getParagraphAlignment = js.Any.fromFunction0(getParagraphAlignment), getSpaceAbove = js.Any.fromFunction0(getSpaceAbove), getSpaceBelow = js.Any.fromFunction0(getSpaceBelow), getSpacingMode = js.Any.fromFunction0(getSpacingMode), getTextDirection = js.Any.fromFunction0(getTextDirection), setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIndentEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndentEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndentFirstLine(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndentFirstLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndentStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndentStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineSpacing(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineSpacing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParagraphAlignment(value: () => ParagraphAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParagraphAlignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpaceAbove(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpaceAbove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpaceBelow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpaceBelow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpacingMode(value: () => SpacingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpacingMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextDirection(value: () => TextDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIndentEnd(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndentEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIndentFirstLine(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndentFirstLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIndentStart(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndentStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLineSpacing(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLineSpacing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParagraphAlignment(value: ParagraphAlignment => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParagraphAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpaceAbove(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpaceAbove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpaceBelow(value: Double => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpaceBelow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpacingMode(value: SpacingMode => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpacingMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTextDirection(value: TextDirection => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextDirection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

