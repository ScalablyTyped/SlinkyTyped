package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.DropdownOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typingsSlinky.materializeDashCss.M.Dropdown

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Dropdown] = js.native
  def init(els: MElements, options: Partial[DropdownOptions]): js.Array[typingsSlinky.materializeDashCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Dropdown = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[DropdownOptions]): typingsSlinky.materializeDashCss.M.Dropdown = js.native
}

