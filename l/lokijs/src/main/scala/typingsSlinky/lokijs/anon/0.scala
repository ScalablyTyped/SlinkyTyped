package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.lokijsStrings.destructured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var serializationMethod: destructured = js.native
}
object `0` {
  
  @scala.inline
  def apply(serializationMethod: destructured): `0` = {
    val __obj = js.Dynamic.literal(serializationMethod = serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializationMethod(value: destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
  }
}
