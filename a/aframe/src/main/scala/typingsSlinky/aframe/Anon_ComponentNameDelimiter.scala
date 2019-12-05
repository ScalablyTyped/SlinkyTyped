package typingsSlinky.aframe

import typingsSlinky.aframe.aframeMod.Component
import typingsSlinky.aframe.aframeMod.Entity
import typingsSlinky.aframe.aframeMod.ObjectMap
import typingsSlinky.aframe.aframeMod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ComponentNameDelimiter extends js.Object {
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

