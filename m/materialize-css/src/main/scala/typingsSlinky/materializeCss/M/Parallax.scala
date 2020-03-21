package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialParallaxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Parallax")
@js.native
class Parallax () extends Component[ParallaxOptions]

/* static members */
@JSGlobal("M.Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[Parallax] = js.native
  def init(els: MElements, options: PartialParallaxOptions): js.Array[Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: typingsSlinky.std.Element): Parallax = js.native
  def init(els: typingsSlinky.std.Element, options: PartialParallaxOptions): Parallax = js.native
}

