package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXText_
  extends Node
     with JSX {
  
  @JSName("type")
  var type_JSXText_ : JSXText = js.native
  
  var value: String = js.native
}
object JSXText_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: JSXText, value: String): JSXText_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText_]
  }
  
  @scala.inline
  implicit class JSXText_MutableBuilder[Self <: JSXText_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
