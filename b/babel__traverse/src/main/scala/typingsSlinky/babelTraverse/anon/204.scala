package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.TupleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `204` extends StObject {
  
  var `type`: TupleExpression = js.native
}
object `204` {
  
  @scala.inline
  def apply(`type`: TupleExpression): `204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204`]
  }
  
  @scala.inline
  implicit class `204MutableBuilder`[Self <: `204`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
