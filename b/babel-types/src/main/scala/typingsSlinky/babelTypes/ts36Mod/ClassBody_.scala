package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBody_ extends Node {
  
  var body: js.Array[ClassMethod_ | ClassProperty_] = js.native
  
  @JSName("type")
  var type_ClassBody_ : ClassBody = js.native
}
object ClassBody_ {
  
  @scala.inline
  def apply(
    body: js.Array[ClassMethod_ | ClassProperty_],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ClassBody
  ): ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBody_]
  }
  
  @scala.inline
  implicit class ClassBody_MutableBuilder[Self <: ClassBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[ClassMethod_ | ClassProperty_]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: (ClassMethod_ | ClassProperty_)*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
