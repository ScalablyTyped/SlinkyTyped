package typingsSlinky.jupyterlabApputils.mod

import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.HTMLCollectionOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "DOMUtils")
@js.native
object DOMUtils extends js.Object {
  /**
    * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
    */
  def createDomID(): String = js.native
  /**
    * Find the first element matching a class name.
    */
  def findElement(parent: HTMLElement, className: String): HTMLElement = js.native
  /**
    * Find the first element matching a class name.
    */
  def findElements(parent: HTMLElement, className: String): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Get the index of the node at a client position, or `-1`.
    */
  def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = js.native
  def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = js.native
}

