package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `118` extends StObject {
  
  var `type`: TSExternalModuleReference = js.native
}
object `118` {
  
  @scala.inline
  def apply(`type`: TSExternalModuleReference): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit class `118MutableBuilder`[Self <: `118`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
