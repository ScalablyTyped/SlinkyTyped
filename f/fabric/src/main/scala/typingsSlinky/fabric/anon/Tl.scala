package typingsSlinky.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tl extends StObject {
  
  var bl: X = js.native
  
  var br: X = js.native
  
  var tl: X = js.native
  
  var tr: X = js.native
}
object Tl {
  
  @scala.inline
  def apply(bl: X, br: X, tl: X, tr: X): Tl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tl]
  }
  
  @scala.inline
  implicit class TlMutableBuilder[Self <: Tl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBl(value: X): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr(value: X): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: X): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: X): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
