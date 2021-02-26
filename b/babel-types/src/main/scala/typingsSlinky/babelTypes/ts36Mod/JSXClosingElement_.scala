package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXClosingElement_
  extends Node
     with Immutable
     with JSX {
  
  var name: JSXIdentifier_ | JSXMemberExpression_ = js.native
  
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement = js.native
}
object JSXClosingElement_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement
  ): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement_]
  }
  
  @scala.inline
  implicit class JSXClosingElement_MutableBuilder[Self <: JSXClosingElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier_ | JSXMemberExpression_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
