package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages multiple rectangles which make up a region. */
@js.native
trait XRegion extends XInterface {
  /** returns the bounding box of the shape. */
  val Bounds: Rectangle = js.native
  /** returns all rectangles which are making up this region. */
  val Rectangles: SafeArray[Rectangle] = js.native
  /** makes this region an empty region. */
  def clear(): Unit = js.native
  /** removes the area of the specified rectangle from this region. */
  def excludeRectangle(Rect: Rectangle): Unit = js.native
  /** removes the area of the specified region from this region. */
  def excludeRegion(Region: XRegion): Unit = js.native
  /** returns the bounding box of the shape. */
  def getBounds(): Rectangle = js.native
  /** returns all rectangles which are making up this region. */
  def getRectangles(): SafeArray[Rectangle] = js.native
  /** intersects the specified rectangle with the current region. */
  def intersectRectangle(Region: Rectangle): Unit = js.native
  /** intersects the specified region with the current region. */
  def intersectRegion(Region: XRegion): Unit = js.native
  /** moves this region by the specified horizontal and vertical delta. */
  def move(nHorzMove: Double, nVertMove: Double): Unit = js.native
  /** adds the specified rectangle to this region. */
  def unionRectangle(Rect: Rectangle): Unit = js.native
  /** adds the specified region to this region. */
  def unionRegion(Region: XRegion): Unit = js.native
  /** applies an exclusive-or operation with the specified rectangle to this region. */
  def xOrRectangle(Rect: Rectangle): Unit = js.native
  /** applies an exclusive-or operation with the specified region to this region. */
  def xOrRegion(Region: XRegion): Unit = js.native
}

object XRegion {
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Rectangles: SafeArray[Rectangle],
    acquire: () => Unit,
    clear: () => Unit,
    excludeRectangle: Rectangle => Unit,
    excludeRegion: XRegion => Unit,
    getBounds: () => Rectangle,
    getRectangles: () => SafeArray[Rectangle],
    intersectRectangle: Rectangle => Unit,
    intersectRegion: XRegion => Unit,
    move: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unionRectangle: Rectangle => Unit,
    unionRegion: XRegion => Unit,
    xOrRectangle: Rectangle => Unit,
    xOrRegion: XRegion => Unit
  ): XRegion = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), excludeRectangle = js.Any.fromFunction1(excludeRectangle), excludeRegion = js.Any.fromFunction1(excludeRegion), getBounds = js.Any.fromFunction0(getBounds), getRectangles = js.Any.fromFunction0(getRectangles), intersectRectangle = js.Any.fromFunction1(intersectRectangle), intersectRegion = js.Any.fromFunction1(intersectRegion), move = js.Any.fromFunction2(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unionRectangle = js.Any.fromFunction1(unionRectangle), unionRegion = js.Any.fromFunction1(unionRegion), xOrRectangle = js.Any.fromFunction1(xOrRectangle), xOrRegion = js.Any.fromFunction1(xOrRegion))
    __obj.asInstanceOf[XRegion]
  }
  @scala.inline
  implicit class XRegionOps[Self <: XRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangles(value: SafeArray[Rectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludeRectangle(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegion(value: XRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBounds(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRectangles(value: () => SafeArray[Rectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRectangles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIntersectRectangle(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIntersectRegion(value: XRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnionRectangle(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnionRegion(value: XRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXOrRectangle(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOrRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXOrRegion(value: XRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOrRegion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

