package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialAutocompleteOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Autocomplete")
@js.native
class Autocomplete ()
  extends Component[AutocompleteOptions]
     with Openable {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  var count: Double = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit = js.native
}

/* static members */
@JSGlobal("M.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[Autocomplete] = js.native
  def init(els: MElements, options: PartialAutocompleteOption): js.Array[Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: typingsSlinky.std.Element): Autocomplete = js.native
  def init(els: typingsSlinky.std.Element, options: PartialAutocompleteOption): Autocomplete = js.native
}

