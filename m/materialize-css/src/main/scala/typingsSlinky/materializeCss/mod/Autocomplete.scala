package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialAutocompleteOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typingsSlinky.materializeCss.M.Autocomplete

/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Autocomplete] = js.native
  def init(els: MElements, options: PartialAutocompleteOption): js.Array[typingsSlinky.materializeCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Autocomplete = js.native
  def init(els: Element, options: PartialAutocompleteOption): typingsSlinky.materializeCss.M.Autocomplete = js.native
}

