package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `66` extends StObject {
  
  var `type`: EnumDeclaration = js.native
}
object `66` {
  
  @scala.inline
  def apply(`type`: EnumDeclaration): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit class `66MutableBuilder`[Self <: `66`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
