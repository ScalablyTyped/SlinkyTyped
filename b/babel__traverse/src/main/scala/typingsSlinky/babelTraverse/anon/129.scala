package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.BooleanLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `129` extends StObject {
  
  var `type`: BooleanLiteral = js.native
}
object `129` {
  
  @scala.inline
  def apply(`type`: BooleanLiteral): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit class `129MutableBuilder`[Self <: `129`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
