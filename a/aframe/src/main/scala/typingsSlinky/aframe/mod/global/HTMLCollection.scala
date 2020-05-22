package typingsSlinky.aframe.mod.global

import org.scalajs.dom.raw.Element
import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import typingsSlinky.std.HTMLCollectionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollection extends HTMLCollectionBase {
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: String): Element | (Entity[ObjectMap[Component[_, System[_]]]]) | Null = js.native
}

