package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `151` extends StObject {
  
  var `type`: TSTypeLiteral = js.native
}
object `151` {
  
  @scala.inline
  def apply(`type`: TSTypeLiteral): `151` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit class `151MutableBuilder`[Self <: `151`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
