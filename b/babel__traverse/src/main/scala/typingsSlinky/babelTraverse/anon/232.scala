package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.ArgumentPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `232` extends StObject {
  
  var `type`: ArgumentPlaceholder = js.native
}
object `232` {
  
  @scala.inline
  def apply(`type`: ArgumentPlaceholder): `232` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`232`]
  }
  
  @scala.inline
  implicit class `232MutableBuilder`[Self <: `232`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArgumentPlaceholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
