package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignSelf extends StObject {
  
  var alignSelf: String = js.native
  
  var marginRight: Double = js.native
}
object AlignSelf {
  
  @scala.inline
  def apply(alignSelf: String, marginRight: Double): AlignSelf = {
    val __obj = js.Dynamic.literal(alignSelf = alignSelf.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelf]
  }
  
  @scala.inline
  implicit class AlignSelfMutableBuilder[Self <: AlignSelf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
  }
}
