package typingsSlinky.aframe.anon

import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentProperty extends StObject {
  
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String): js.Any = js.native
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, delimiter: String): js.Any = js.native
  
  def setComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, value: js.Any): Unit = js.native
  def setComponentProperty(
    entity: Entity[ObjectMap[Component[_, System[_]]]],
    componentName: String,
    value: js.Any,
    delimiter: String
  ): Unit = js.native
}
