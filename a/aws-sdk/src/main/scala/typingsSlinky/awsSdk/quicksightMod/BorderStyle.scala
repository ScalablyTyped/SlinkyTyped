package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderStyle extends StObject {
  
  /**
    * The option to enable display of borders for visuals.
    */
  var Show: js.UndefOr[scala.Boolean] = js.native
}
object BorderStyle {
  
  @scala.inline
  def apply(): BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyle]
  }
  
  @scala.inline
  implicit class BorderStyleMutableBuilder[Self <: BorderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: scala.Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
  }
}
