package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `94` extends StObject {
  
  var `type`: WithStatement = js.native
}
object `94` {
  
  @scala.inline
  def apply(`type`: WithStatement): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit class `94MutableBuilder`[Self <: `94`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
