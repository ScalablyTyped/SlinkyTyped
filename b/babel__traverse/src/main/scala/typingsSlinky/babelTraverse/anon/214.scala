package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.UnionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `214` extends StObject {
  
  var `type`: UnionTypeAnnotation = js.native
}
object `214` {
  
  @scala.inline
  def apply(`type`: UnionTypeAnnotation): `214` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`214`]
  }
  
  @scala.inline
  implicit class `214MutableBuilder`[Self <: `214`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UnionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
