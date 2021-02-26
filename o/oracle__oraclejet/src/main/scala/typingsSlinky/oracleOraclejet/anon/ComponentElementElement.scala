package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElementElement extends StObject {
  
  var componentElement: org.scalajs.dom.raw.Element = js.native
}
object ComponentElementElement {
  
  @scala.inline
  def apply(componentElement: org.scalajs.dom.raw.Element): ComponentElementElement = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementElement]
  }
  
  @scala.inline
  implicit class ComponentElementElementMutableBuilder[Self <: ComponentElementElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
  }
}
