package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexNumber extends StObject {
  
  var index: Double = js.native
}
object IndexNumber {
  
  @scala.inline
  def apply(index: Double): IndexNumber = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexNumber]
  }
  
  @scala.inline
  implicit class IndexNumberMutableBuilder[Self <: IndexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
