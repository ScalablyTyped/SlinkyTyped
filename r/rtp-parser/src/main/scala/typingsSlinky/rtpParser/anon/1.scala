package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var name: unassigned = js.native
}
object `1` {
  
  @scala.inline
  def apply(name: unassigned): `1` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: unassigned): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
