package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `140` extends StObject {
  
  var `type`: DirectiveLiteral = js.native
}
object `140` {
  
  @scala.inline
  def apply(`type`: DirectiveLiteral): `140` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140MutableBuilder`[Self <: `140`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
