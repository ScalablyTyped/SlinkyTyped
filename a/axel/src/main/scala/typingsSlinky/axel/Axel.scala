package typingsSlinky.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axel extends js.Object {
  var brush: String = js.native
  var cols: Double = js.native
  var cursor: cursorInterface = js.native
  var rows: Double = js.native
  def bg(r: Double, g: Double, b: Double): Unit = js.native
  def box(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
  def circ(x: Double, y: Double, m: Double): Double = js.native
  def clear(): Unit = js.native
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def draw(cb: js.Function): Unit = js.native
  def fg(r: Double, g: Double, b: Double): Unit = js.native
  def goto(x: Double, y: Double): Unit = js.native
  def lerp(p1: Double, p2: Double, m: Double): Double = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  def point(x: Double, y: Double, char: String): Unit = js.native
  def scrub(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
  def text(x: Double, y: Double, text: String): Unit = js.native
}

object Axel {
  @scala.inline
  def apply(
    bg: (Double, Double, Double) => Unit,
    box: (Double, Double, Double, Double) => Unit,
    brush: String,
    circ: (Double, Double, Double) => Double,
    clear: () => Unit,
    cols: Double,
    cursor: cursorInterface,
    dist: (Double, Double, Double, Double) => Double,
    draw: js.Function => Unit,
    fg: (Double, Double, Double) => Unit,
    goto: (Double, Double) => Unit,
    lerp: (Double, Double, Double) => Double,
    line: (Double, Double, Double, Double) => Unit,
    point: (Double, Double, String) => Unit,
    rows: Double,
    scrub: (Double, Double, Double, Double) => Unit,
    text: (Double, Double, String) => Unit
  ): Axel = {
    val __obj = js.Dynamic.literal(bg = js.Any.fromFunction3(bg), box = js.Any.fromFunction4(box), brush = brush.asInstanceOf[js.Any], circ = js.Any.fromFunction3(circ), clear = js.Any.fromFunction0(clear), cols = cols.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], dist = js.Any.fromFunction4(dist), draw = js.Any.fromFunction1(draw), fg = js.Any.fromFunction3(fg), goto = js.Any.fromFunction2(goto), lerp = js.Any.fromFunction3(lerp), line = js.Any.fromFunction4(line), point = js.Any.fromFunction3(point), rows = rows.asInstanceOf[js.Any], scrub = js.Any.fromFunction4(scrub), text = js.Any.fromFunction3(text))
    __obj.asInstanceOf[Axel]
  }
  @scala.inline
  implicit class AxelOps[Self <: Axel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBox(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCirc(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circ")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: cursorInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDist(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDraw(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFg(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGoto(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goto")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLerp(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lerp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLine(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPoint(value: (Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrub(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrub")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withText(value: (Double, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

