package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BIF extends StObject {
  
  var BIF: js.Array[String] = js.native
}
object BIF {
  
  @scala.inline
  def apply(BIF: js.Array[String]): BIF = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIF]
  }
  
  @scala.inline
  implicit class BIFMutableBuilder[Self <: BIF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBIF(value: js.Array[String]): Self = StObject.set(x, "BIF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIFVarargs(value: String*): Self = StObject.set(x, "BIF", js.Array(value :_*))
  }
}
