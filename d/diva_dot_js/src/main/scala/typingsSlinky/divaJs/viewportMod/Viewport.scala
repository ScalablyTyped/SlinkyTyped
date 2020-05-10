package typingsSlinky.divaJs.viewportMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.divaJs.interfacesMod.Dimensions
import typingsSlinky.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  var bottom: Double = js.native
  var height: Double = js.native
  var intersectionTolerance: Double = js.native
  var left: Double = js.native
  var outer: HTMLElement = js.native
  var right: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
  def hasHorizontalOverlap(region: Region): Boolean = js.native
  def hasVerticalOverlap(region: Region): Boolean = js.native
  def intersectsRegion(region: Region): Boolean = js.native
  def invalidate(): Unit = js.native
  def setInnerDimensions(dimensions: Dimensions): Unit = js.native
}

object Viewport {
  @scala.inline
  def apply(
    bottom: Double,
    hasHorizontalOverlap: Region => Boolean,
    hasVerticalOverlap: Region => Boolean,
    height: Double,
    intersectionTolerance: Double,
    intersectsRegion: Region => Boolean,
    invalidate: () => Unit,
    left: Double,
    outer: HTMLElement,
    right: Double,
    setInnerDimensions: Dimensions => Unit,
    top: Double,
    width: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], hasHorizontalOverlap = js.Any.fromFunction1(hasHorizontalOverlap), hasVerticalOverlap = js.Any.fromFunction1(hasVerticalOverlap), height = height.asInstanceOf[js.Any], intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any], intersectsRegion = js.Any.fromFunction1(intersectsRegion), invalidate = js.Any.fromFunction0(invalidate), left = left.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setInnerDimensions = js.Any.fromFunction1(setInnerDimensions), top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasHorizontalOverlap(value: Region => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHorizontalOverlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasVerticalOverlap(value: Region => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVerticalOverlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectsRegion(value: Region => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectsRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuter(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetInnerDimensions(value: Dimensions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerDimensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

