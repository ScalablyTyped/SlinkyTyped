package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `233` extends StObject {
  
  var `type`: EnumNumberBody = js.native
}
object `233` {
  
  @scala.inline
  def apply(`type`: EnumNumberBody): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit class `233MutableBuilder`[Self <: `233`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
