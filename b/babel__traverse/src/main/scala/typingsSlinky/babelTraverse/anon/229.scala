package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSTypeAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `229` extends StObject {
  
  var `type`: TSTypeAssertion = js.native
}
object `229` {
  
  @scala.inline
  def apply(`type`: TSTypeAssertion): `229` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`229`]
  }
  
  @scala.inline
  implicit class `229MutableBuilder`[Self <: `229`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
