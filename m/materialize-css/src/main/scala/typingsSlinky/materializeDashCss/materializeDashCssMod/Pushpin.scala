package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.PushpinOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Pushpin")
@js.native
class Pushpin ()
  extends typingsSlinky.materializeDashCss.M.Pushpin

/* static members */
@JSImport("materialize-css", "Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Pushpin] = js.native
  def init(els: MElements, options: Partial[PushpinOptions]): js.Array[typingsSlinky.materializeDashCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Pushpin = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[PushpinOptions]): typingsSlinky.materializeDashCss.M.Pushpin = js.native
}

