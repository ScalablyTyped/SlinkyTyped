package typingsSlinky.playcanvas.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.playcanvas.anon.UseMouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new pc.ElementInput instance.
  * @param domElement - The DOM element.
  * @param [options] - Optional arguments.
  * @param [options.useMouse] - Whether to allow mouse input. Defaults to true.
  * @param [options.useTouch] - Whether to allow touch input. Defaults to true.
  * @param [options.useXr] - Whether to allow XR input sources. Defaults to true.
  */
@JSImport("playcanvas", "ElementInput")
@js.native
class ElementInput protected ()
  extends typingsSlinky.playcanvas.pc.ElementInput {
  def this(domElement: Element) = this()
  def this(domElement: Element, options: UseMouse) = this()
}
