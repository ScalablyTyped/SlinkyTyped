package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `54` extends StObject {
  
  var `type`: CatchClause = js.native
}
object `54` {
  
  @scala.inline
  def apply(`type`: CatchClause): `54` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit class `54MutableBuilder`[Self <: `54`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
