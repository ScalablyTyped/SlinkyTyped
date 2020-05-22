package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.materializeCss.M.FormSelectOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialFormSelectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FormSelect")
@js.native
class FormSelect ()
  extends typingsSlinky.materializeCss.M.FormSelect {
  /**
    * Instance of the dropdown plugin for this select
    */
  /* CompleteClass */
  override var dropdown: typingsSlinky.materializeCss.M.Dropdown = js.native
  /**
    * Dropdown UL element
    */
  /* CompleteClass */
  override var dropdownOptions: HTMLUListElement = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * Text input that shows current selected option
    */
  /* CompleteClass */
  override var input: HTMLInputElement = js.native
  /**
    * If this is a multiple select
    */
  /* CompleteClass */
  override var isMultiple: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: FormSelectOptions = js.native
  /**
    * The select wrapper element
    */
  /* CompleteClass */
  override var wrapper: Element = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Get selected values in an array
    */
  /* CompleteClass */
  override def getSelectedValues(): js.Array[String] = js.native
}

/* static members */
@JSImport("materialize-css", "FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.FormSelect] = js.native
  def init(els: MElements, options: PartialFormSelectOptions): js.Array[typingsSlinky.materializeCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): typingsSlinky.materializeCss.M.FormSelect = js.native
  def init(els: Element, options: PartialFormSelectOptions): typingsSlinky.materializeCss.M.FormSelect = js.native
}

