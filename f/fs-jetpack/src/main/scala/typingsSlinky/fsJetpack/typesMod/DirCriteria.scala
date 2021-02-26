package typingsSlinky.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirCriteria extends StObject {
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
}
object DirCriteria {
  
  @scala.inline
  def apply(): DirCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirCriteria]
  }
  
  @scala.inline
  implicit class DirCriteriaMutableBuilder[Self <: DirCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
