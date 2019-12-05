package typingsSlinky.aframe.aframeMod._Global_

import org.scalajs.dom.raw.Element
import typingsSlinky.aframe.aframeMod.Component
import typingsSlinky.aframe.aframeMod.Entity
import typingsSlinky.aframe.aframeMod.ObjectMap
import typingsSlinky.aframe.aframeMod.System
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

