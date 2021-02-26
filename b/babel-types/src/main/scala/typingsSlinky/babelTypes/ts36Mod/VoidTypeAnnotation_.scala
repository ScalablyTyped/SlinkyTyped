package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidTypeAnnotation_
  extends Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_VoidTypeAnnotation_ : VoidTypeAnnotation = js.native
}
object VoidTypeAnnotation_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: VoidTypeAnnotation): VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidTypeAnnotation_]
  }
  
  @scala.inline
  implicit class VoidTypeAnnotation_MutableBuilder[Self <: VoidTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
