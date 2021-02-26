package typingsSlinky.axel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axel extends StObject {
  
  def bg(r: Double, g: Double, b: Double): Unit = js.native
  
  def box(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
  
  var brush: String = js.native
  
  def circ(x: Double, y: Double, m: Double): Double = js.native
  
  def clear(): Unit = js.native
  
  var cols: Double = js.native
  
  var cursor: cursorInterface = js.native
  
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  def draw(cb: js.Function): Unit = js.native
  
  def fg(r: Double, g: Double, b: Double): Unit = js.native
  
  def goto(x: Double, y: Double): Unit = js.native
  
  def lerp(p1: Double, p2: Double, m: Double): Double = js.native
  
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  
  def point(x: Double, y: Double, char: String): Unit = js.native
  
  var rows: Double = js.native
  
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
  implicit class AxelMutableBuilder[Self <: Axel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "bg", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBox(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "box", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCirc(value: (Double, Double, Double) => Double): Self = StObject.set(x, "circ", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: cursorInterface): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDist(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "dist", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDraw(value: js.Function => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFg(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "fg", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGoto(value: (Double, Double) => Unit): Self = StObject.set(x, "goto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLerp(value: (Double, Double, Double) => Double): Self = StObject.set(x, "lerp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLine(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "line", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPoint(value: (Double, Double, String) => Unit): Self = StObject.set(x, "point", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrub(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "scrub", js.Any.fromFunction4(value))
    
    @scala.inline
    def setText(value: (Double, Double, String) => Unit): Self = StObject.set(x, "text", js.Any.fromFunction3(value))
  }
}
