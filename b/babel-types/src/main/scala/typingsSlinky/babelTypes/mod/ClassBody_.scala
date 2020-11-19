package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassBody
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
  implicit class ClassBody_Ops[Self <: ClassBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBodyVarargs(value: (ClassMethod_ | ClassProperty_)*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[ClassMethod_ | ClassProperty_]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassBody): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
