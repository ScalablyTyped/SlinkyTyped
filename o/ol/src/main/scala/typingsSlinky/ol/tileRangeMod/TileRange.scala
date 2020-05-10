package typingsSlinky.ol.tileRangeMod

import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileRange extends js.Object {
  def contains(tileCoord: TileCoord): Boolean = js.native
  def containsTileRange(tileRange: TileRange): Boolean = js.native
  def containsXY(x: Double, y: Double): Boolean = js.native
  def equals(tileRange: TileRange): Boolean = js.native
  def extend(tileRange: TileRange): Unit = js.native
  def getHeight(): Double = js.native
  def getSize(): Size = js.native
  def getWidth(): Double = js.native
  def intersects(tileRange: TileRange): Boolean = js.native
}

object TileRange {
  @scala.inline
  def apply(
    contains: TileCoord => Boolean,
    containsTileRange: TileRange => Boolean,
    containsXY: (Double, Double) => Boolean,
    equals: TileRange => Boolean,
    extend: TileRange => Unit,
    getHeight: () => Double,
    getSize: () => Size,
    getWidth: () => Double,
    intersects: TileRange => Boolean
  ): TileRange = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getHeight = js.Any.fromFunction0(getHeight), getSize = js.Any.fromFunction0(getSize), getWidth = js.Any.fromFunction0(getWidth), intersects = js.Any.fromFunction1(intersects))
    __obj.asInstanceOf[TileRange]
  }
  @scala.inline
  implicit class TileRangeOps[Self <: TileRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: TileCoord => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsTileRange(value: TileRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsTileRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsXY(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsXY")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEquals(value: TileRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: TileRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntersects(value: TileRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

