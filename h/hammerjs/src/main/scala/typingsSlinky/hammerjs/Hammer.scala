package typingsSlinky.hammerjs

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Hammer")
@js.native
class Hammer protected () extends HammerManager {
  def this(element: HTMLElement) = this()
  def this(element: SVGElement) = this()
  def this(element: HTMLElement, options: HammerOptions) = this()
  def this(element: SVGElement, options: HammerOptions) = this()
}

@JSGlobal("Hammer")
@js.native
object Hammer extends TopLevel[HammerStatic]

