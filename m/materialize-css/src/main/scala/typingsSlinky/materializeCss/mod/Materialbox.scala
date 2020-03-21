package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialMaterialboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typingsSlinky.materializeCss.M.Materialbox

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Materialbox] = js.native
  def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typingsSlinky.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Materialbox = js.native
  def init(els: typingsSlinky.std.Element, options: PartialMaterialboxOptions): typingsSlinky.materializeCss.M.Materialbox = js.native
}

