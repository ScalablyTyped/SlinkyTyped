package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `150` extends StObject {
  
  var `type`: Program = js.native
}
object `150` {
  
  @scala.inline
  def apply(`type`: Program): `150` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`150`]
  }
  
  @scala.inline
  implicit class `150MutableBuilder`[Self <: `150`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
