package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `169` extends StObject {
  
  var `type`: JSXElement = js.native
}
object `169` {
  
  @scala.inline
  def apply(`type`: JSXElement): `169` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit class `169MutableBuilder`[Self <: `169`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
