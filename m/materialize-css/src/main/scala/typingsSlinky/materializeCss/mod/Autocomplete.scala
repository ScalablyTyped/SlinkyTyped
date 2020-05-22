package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.AutocompleteData
import typingsSlinky.materializeCss.M.AutocompleteOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialAutocompleteOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typingsSlinky.materializeCss.M.Autocomplete {
  /**
    * Index of the current selected option.
    */
  /* CompleteClass */
  override var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: AutocompleteOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  /* CompleteClass */
  override def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  /* CompleteClass */
  override def updateData(data: AutocompleteData): Unit = js.native
}

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

