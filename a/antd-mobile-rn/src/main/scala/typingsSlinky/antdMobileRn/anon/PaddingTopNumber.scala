package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingTopNumber extends StObject {
  
  var paddingTop: Double = js.native
}
object PaddingTopNumber {
  
  @scala.inline
  def apply(paddingTop: Double): PaddingTopNumber = {
    val __obj = js.Dynamic.literal(paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTopNumber]
  }
  
  @scala.inline
  implicit class PaddingTopNumberMutableBuilder[Self <: PaddingTopNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
