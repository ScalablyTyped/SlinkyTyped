package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `221` extends StObject {
  
  var `type`: FunctionTypeParam = js.native
}
object `221` {
  
  @scala.inline
  def apply(`type`: FunctionTypeParam): `221` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`221`]
  }
  
  @scala.inline
  implicit class `221MutableBuilder`[Self <: `221`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
