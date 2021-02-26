package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXIdentifier_
  extends Node
     with Expression
     with JSX {
  
  var name: String = js.native
  
  @JSName("type")
  var type_JSXIdentifier_ : JSXIdentifier = js.native
}
object JSXIdentifier_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, name: String, start: Double, `type`: JSXIdentifier): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier_]
  }
  
  @scala.inline
  implicit class JSXIdentifier_MutableBuilder[Self <: JSXIdentifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
