package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.CollapsibleOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typingsSlinky.materializeDashCss.M.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Collapsible] = js.native
  def init(els: MElements, options: Partial[CollapsibleOptions]): js.Array[typingsSlinky.materializeDashCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Collapsible = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[CollapsibleOptions]): typingsSlinky.materializeDashCss.M.Collapsible = js.native
}

