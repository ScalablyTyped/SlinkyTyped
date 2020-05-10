package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkParagraph extends SkObject[SkParagraph] {
  def getGlyphPositionAtCoordinate(x: Double, y: Double): SkGlyphPosition = js.native
  def getHeight(): Double = js.native
  def getWordBoundary(index: Double): SkWordBoundary = js.native
  def layout(maxWidth: Double): Unit = js.native
}

object SkParagraph {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getGlyphPositionAtCoordinate: (Double, Double) => SkGlyphPosition,
    getHeight: () => Double,
    getWordBoundary: Double => SkWordBoundary,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    layout: Double => Unit
  ): SkParagraph = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getGlyphPositionAtCoordinate = js.Any.fromFunction2(getGlyphPositionAtCoordinate), getHeight = js.Any.fromFunction0(getHeight), getWordBoundary = js.Any.fromFunction1(getWordBoundary), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), layout = js.Any.fromFunction1(layout))
    __obj.asInstanceOf[SkParagraph]
  }
  @scala.inline
  implicit class SkParagraphOps[Self <: SkParagraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGlyphPositionAtCoordinate(value: (Double, Double) => SkGlyphPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlyphPositionAtCoordinate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWordBoundary(value: Double => SkWordBoundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWordBoundary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayout(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

