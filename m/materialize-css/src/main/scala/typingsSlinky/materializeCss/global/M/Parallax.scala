package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.ParallaxOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialParallaxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Parallax")
@js.native
class Parallax ()
  extends typingsSlinky.materializeCss.M.Component[ParallaxOptions]

/* static members */
@JSGlobal("M.Parallax")
@js.native
object Parallax extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Parallax = js.native
  /**
    * Init Parallaxs
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Parallax] = js.native
  def init(els: MElements, options: PartialParallaxOptions): js.Array[typingsSlinky.materializeCss.M.Parallax] = js.native
  /**
    * Init Parallax
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Parallax = js.native
  def init(els: Element, options: PartialParallaxOptions): typingsSlinky.materializeCss.M.Parallax = js.native
}

