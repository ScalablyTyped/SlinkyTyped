package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var `type`: LogicalExpression = js.native
}
object `23` {
  
  @scala.inline
  def apply(`type`: LogicalExpression): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
