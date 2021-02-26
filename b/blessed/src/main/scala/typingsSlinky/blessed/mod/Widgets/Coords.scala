package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.anon.X
import typingsSlinky.blessed.mod.Widgets.Types.TPosition
import typingsSlinky.blessed.mod.Widgets.Types.TTopLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coords extends StObject {
  
  var _contentEnd: X = js.native
  
  var base: Double = js.native
  
  var nobot: TPosition = js.native
  
  var noleft: TTopLeft = js.native
  
  var noright: TPosition = js.native
  
  var notop: TTopLeft = js.native
  
  var xi: Double = js.native
  
  var xl: Double = js.native
  
  var yi: Double = js.native
  
  var yl: Double = js.native
}
object Coords {
  
  @scala.inline
  def apply(
    _contentEnd: X,
    base: Double,
    nobot: TPosition,
    noleft: TTopLeft,
    noright: TPosition,
    notop: TTopLeft,
    xi: Double,
    xl: Double,
    yi: Double,
    yl: Double
  ): Coords = {
    val __obj = js.Dynamic.literal(_contentEnd = _contentEnd.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], nobot = nobot.asInstanceOf[js.Any], noleft = noleft.asInstanceOf[js.Any], noright = noright.asInstanceOf[js.Any], notop = notop.asInstanceOf[js.Any], xi = xi.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], yi = yi.asInstanceOf[js.Any], yl = yl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  @scala.inline
  implicit class CoordsMutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNobot(value: TPosition): Self = StObject.set(x, "nobot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoleft(value: TTopLeft): Self = StObject.set(x, "noleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoright(value: TPosition): Self = StObject.set(x, "noright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotop(value: TTopLeft): Self = StObject.set(x, "notop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXi(value: Double): Self = StObject.set(x, "xi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYi(value: Double): Self = StObject.set(x, "yi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYl(value: Double): Self = StObject.set(x, "yl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contentEnd(value: X): Self = StObject.set(x, "_contentEnd", value.asInstanceOf[js.Any])
  }
}
