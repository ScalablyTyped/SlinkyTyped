package typingsSlinky.fabric.anon

import typingsSlinky.fabric.fabricImplMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tr extends StObject {
  
  var bl: Point = js.native
  
  var br: Point = js.native
  
  var tl: Point = js.native
  
  var tr: Point = js.native
}
object Tr {
  
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): Tr = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tr]
  }
  
  @scala.inline
  implicit class TrMutableBuilder[Self <: Tr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBl(value: Point): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr(value: Point): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: Point): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: Point): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
