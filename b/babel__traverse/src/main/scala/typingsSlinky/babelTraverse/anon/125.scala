package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `125` extends StObject {
  
  var `type`: TSMappedType = js.native
}
object `125` {
  
  @scala.inline
  def apply(`type`: TSMappedType): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit class `125MutableBuilder`[Self <: `125`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
