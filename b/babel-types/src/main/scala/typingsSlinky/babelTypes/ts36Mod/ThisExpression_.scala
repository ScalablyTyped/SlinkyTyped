package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThisExpression_
  extends Node
     with Expression {
  
  @JSName("type")
  var type_ThisExpression_ : ThisExpression = js.native
}
object ThisExpression_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: ThisExpression): ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisExpression_]
  }
  
  @scala.inline
  implicit class ThisExpression_MutableBuilder[Self <: ThisExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
