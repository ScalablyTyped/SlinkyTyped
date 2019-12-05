package typingsSlinky.aframe.aframeMod._Global_

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.aframe.aframeMod.Component
import typingsSlinky.aframe.aframeMod.Entity
import typingsSlinky.aframe.aframeMod.ObjectMap
import typingsSlinky.aframe.aframeMod.Scene
import typingsSlinky.aframe.aframeMod.System
import typingsSlinky.aframe.aframeStrings.`a-scene`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Custom elements augment document methods to return custom HTML
	 */
@js.native
trait Document extends js.Object {
  def createElement(tagName: String): Entity[ObjectMap[Component[_, System[_]]]] = js.native
  def querySelector(selectors: String): Entity[_] = js.native
  def querySelectorAll(selectors: String): NodeListOf[(Entity[_] | Element) with Node] = js.native
  @JSName("querySelector")
  def querySelector_ascene(selectors: `a-scene`): Scene = js.native
}

