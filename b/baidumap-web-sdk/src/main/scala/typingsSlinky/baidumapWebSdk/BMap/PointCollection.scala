package typingsSlinky.baidumapWebSdk.BMap

import typingsSlinky.baidumapWebSdk.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCollection extends Overlay {
  def clear(): Unit = js.native
  def onclick(event: Type): Unit = js.native
  def onmouseout(event: Type): Unit = js.native
  def onmouseover(event: Type): Unit = js.native
  def setPoints(points: js.Array[Point]): Unit = js.native
  def setStyles(styles: PointCollectionOption): Unit = js.native
}

object PointCollection {
  @scala.inline
  def apply(
    clear: () => Unit,
    onclick: Type => Unit,
    onmouseout: Type => Unit,
    onmouseover: Type => Unit,
    setPoints: js.Array[Point] => Unit,
    setStyles: PointCollectionOption => Unit
  ): PointCollection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), setPoints = js.Any.fromFunction1(setPoints), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[PointCollection]
  }
  @scala.inline
  implicit class PointCollectionOps[Self <: PointCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnclick(value: Type => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseout(value: Type => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnmouseover(value: Type => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPoints(value: js.Array[Point] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyles(value: PointCollectionOption => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyles")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

