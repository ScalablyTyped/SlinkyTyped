package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `61` extends StObject {
  
  var `type`: ImportNamespaceSpecifier = js.native
}
object `61` {
  
  @scala.inline
  def apply(`type`: ImportNamespaceSpecifier): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit class `61MutableBuilder`[Self <: `61`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
