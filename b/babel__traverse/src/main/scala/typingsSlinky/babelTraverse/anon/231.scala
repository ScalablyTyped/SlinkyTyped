package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TSIntersectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `231` extends StObject {
  
  var `type`: TSIntersectionType = js.native
}
object `231` {
  
  @scala.inline
  def apply(`type`: TSIntersectionType): `231` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  
  @scala.inline
  implicit class `231MutableBuilder`[Self <: `231`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
