package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GutterStyle extends StObject {
  
  /**
    * This Boolean value controls whether to display a gutter space between sheet tiles. 
    */
  var Show: js.UndefOr[scala.Boolean] = js.native
}
object GutterStyle {
  
  @scala.inline
  def apply(): GutterStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterStyle]
  }
  
  @scala.inline
  implicit class GutterStyleMutableBuilder[Self <: GutterStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: scala.Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
  }
}
