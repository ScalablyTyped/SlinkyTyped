package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `240` extends StObject {
  
  var `type`: TSTypeReference = js.native
}
object `240` {
  
  @scala.inline
  def apply(`type`: TSTypeReference): `240` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`240`]
  }
  
  @scala.inline
  implicit class `240MutableBuilder`[Self <: `240`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
