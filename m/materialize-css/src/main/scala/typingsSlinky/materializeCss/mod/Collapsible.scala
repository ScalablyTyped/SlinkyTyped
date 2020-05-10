package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialCollapsibleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typingsSlinky.materializeCss.M.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typingsSlinky.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: PartialCollapsibleOptions): typingsSlinky.materializeCss.M.Collapsible = js.native
}

