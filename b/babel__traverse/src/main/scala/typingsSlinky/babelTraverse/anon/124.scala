package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `124` extends StObject {
  
  var `type`: TSSymbolKeyword = js.native
}
object `124` {
  
  @scala.inline
  def apply(`type`: TSSymbolKeyword): `124` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`124`]
  }
  
  @scala.inline
  implicit class `124MutableBuilder`[Self <: `124`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
