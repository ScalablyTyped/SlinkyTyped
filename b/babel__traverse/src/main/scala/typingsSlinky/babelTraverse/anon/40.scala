package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.FunctionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `40` extends StObject {
  
  var `type`: FunctionTypeAnnotation = js.native
}
object `40` {
  
  @scala.inline
  def apply(`type`: FunctionTypeAnnotation): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
