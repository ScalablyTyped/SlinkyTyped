package typingsSlinky.phosphorVirtualdom.mod.h

import typingsSlinky.phosphorVirtualdom.mod.ElementAttrs
import typingsSlinky.phosphorVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bound factory function for a specific `h()` tag.
  */
@js.native
trait IFactory extends js.Object {
  def apply(attrs: ElementAttrs, children: Child*): VirtualElement = js.native
  def apply(children: Child*): VirtualElement = js.native
}

