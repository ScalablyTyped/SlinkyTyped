package typingsSlinky.aframe.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait El extends StObject {
  
  var el: Element | (Entity[ObjectMap[Component[_, System[_]]]]) = js.native
}
object El {
  
  @scala.inline
  def apply(el: Element | (Entity[ObjectMap[Component[_, System[_]]]])): El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[El]
  }
  
  @scala.inline
  implicit class ElMutableBuilder[Self <: El] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: Element | (Entity[ObjectMap[Component[_, System[_]]]])): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElElement(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
