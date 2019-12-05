package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.MaterialboxOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typingsSlinky.materializeDashCss.M.Materialbox

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Materialbox] = js.native
  def init(els: MElements, options: Partial[MaterialboxOptions]): js.Array[typingsSlinky.materializeDashCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Materialbox = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[MaterialboxOptions]): typingsSlinky.materializeDashCss.M.Materialbox = js.native
}

