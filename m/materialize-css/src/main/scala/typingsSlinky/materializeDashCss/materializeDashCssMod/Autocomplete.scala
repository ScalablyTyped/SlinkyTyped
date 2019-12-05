package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.AutocompleteOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typingsSlinky.materializeDashCss.M.Autocomplete

/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Autocomplete] = js.native
  def init(els: MElements, options: Partial[AutocompleteOptions]): js.Array[typingsSlinky.materializeDashCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Autocomplete = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[AutocompleteOptions]): typingsSlinky.materializeDashCss.M.Autocomplete = js.native
}

