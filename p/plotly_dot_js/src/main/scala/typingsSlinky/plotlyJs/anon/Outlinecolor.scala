package typingsSlinky.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outlinecolor extends StObject {
  
  var outlinecolor: typingsSlinky.plotlyJs.mod.Color = js.native
}
object Outlinecolor {
  
  @scala.inline
  def apply(outlinecolor: typingsSlinky.plotlyJs.mod.Color): Outlinecolor = {
    val __obj = js.Dynamic.literal(outlinecolor = outlinecolor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outlinecolor]
  }
  
  @scala.inline
  implicit class OutlinecolorMutableBuilder[Self <: Outlinecolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutlinecolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value :_*))
  }
}
