package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `144` extends StObject {
  
  var `type`: TSExpressionWithTypeArguments = js.native
}
object `144` {
  
  @scala.inline
  def apply(`type`: TSExpressionWithTypeArguments): `144` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit class `144MutableBuilder`[Self <: `144`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
