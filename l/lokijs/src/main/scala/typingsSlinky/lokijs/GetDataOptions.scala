package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.`jquery-extend-deep`
import typingsSlinky.lokijs.lokijsStrings.`parse-stringify`
import typingsSlinky.lokijs.lokijsStrings.`shallow-assign`
import typingsSlinky.lokijs.lokijsStrings.`shallow-recurse-objects`
import typingsSlinky.lokijs.lokijsStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataOptions extends StObject {
  
  var forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null = js.native
  
  var forceClones: Boolean = js.native
  
  var removeMeta: Boolean = js.native
}
object GetDataOptions {
  
  @scala.inline
  def apply(forceClones: Boolean, removeMeta: Boolean): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones.asInstanceOf[js.Any], removeMeta = removeMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
  
  @scala.inline
  implicit class GetDataOptionsMutableBuilder[Self <: GetDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = StObject.set(x, "forceCloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceCloneMethodNull: Self = StObject.set(x, "forceCloneMethod", null)
    
    @scala.inline
    def setForceClones(value: Boolean): Self = StObject.set(x, "forceClones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMeta(value: Boolean): Self = StObject.set(x, "removeMeta", value.asInstanceOf[js.Any])
  }
}
