package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127` extends StObject {
  
  var `type`: VariableDeclarator = js.native
}
object `127` {
  
  @scala.inline
  def apply(`type`: VariableDeclarator): `127` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
