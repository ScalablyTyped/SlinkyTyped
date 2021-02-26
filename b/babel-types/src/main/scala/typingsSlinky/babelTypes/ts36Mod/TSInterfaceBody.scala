package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInterfaceBody extends Node {
  
  var body: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSInterfaceBody: typingsSlinky.babelTypes.babelTypesStrings.TSInterfaceBody = js.native
}
object TSInterfaceBody {
  
  @JSImport("babel-types/ts3.6", "TSInterfaceBody")
  @js.native
  def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
  
  @scala.inline
  implicit class TSInterfaceBodyMutableBuilder[Self <: TSInterfaceBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
