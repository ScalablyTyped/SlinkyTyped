package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.OptionalMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  var `type`: OptionalMemberExpression = js.native
}
object `26` {
  
  @scala.inline
  def apply(`type`: OptionalMemberExpression): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OptionalMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
