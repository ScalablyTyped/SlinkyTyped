package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `45` extends StObject {
  
  var `type`: Property = js.native
}
object `45` {
  
  @scala.inline
  def apply(`type`: Property): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit class `45MutableBuilder`[Self <: `45`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
