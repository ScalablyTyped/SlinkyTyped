package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.ParallaxOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Parallax")
@js.native
class Parallax ()
  extends typingsSlinky.materializeDashCss.M.Parallax

/* static members */
@JSImport("materialize-css", "Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Parallax] = js.native
  def init(els: MElements, options: Partial[ParallaxOptions]): js.Array[typingsSlinky.materializeDashCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Parallax = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[ParallaxOptions]): typingsSlinky.materializeDashCss.M.Parallax = js.native
}

