package typingsSlinky.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tip extends StObject {
  
  var tip: js.UndefOr[String] = js.native
}
object Tip {
  
  @scala.inline
  def apply(): Tip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
