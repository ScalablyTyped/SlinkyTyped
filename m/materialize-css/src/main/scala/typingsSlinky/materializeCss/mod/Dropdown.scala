package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialDropdownOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typingsSlinky.materializeCss.M.Dropdown

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Dropdown] = js.native
  def init(els: MElements, options: PartialDropdownOptions): js.Array[typingsSlinky.materializeCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Dropdown = js.native
  def init(els: typingsSlinky.std.Element, options: PartialDropdownOptions): typingsSlinky.materializeCss.M.Dropdown = js.native
}

