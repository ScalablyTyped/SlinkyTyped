package typingsSlinky.node.anon

import typingsSlinky.node.nodeStrings.pkcs8
import typingsSlinky.node.nodeStrings.sec1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var `type`: sec1 | pkcs8 = js.native
}
object `1` {
  
  @scala.inline
  def apply(`type`: sec1 | pkcs8): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sec1 | pkcs8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
