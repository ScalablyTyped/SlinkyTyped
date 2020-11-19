package typingsSlinky.chocolatechipjs

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  @JSName("$")
  def $(): js.Array[Document] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  @JSName("$")
  def $(callback: js.Function0[_]): Unit = js.native
  /**
    * Accepts the document element and returns it wrapped in an array.
    *
    * @param document The document object.
    */
  @JSName("$")
  def $(document: Document): js.Array[Document] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array of DOM elements to convert into a ChocolateChip Collection.
    */
  @JSName("$")
  def $(elementArray: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM HTMLElement to use as context
    */
  @JSName("$")
  def $(selector: String): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: String, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: String, context: HTMLElement): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: Document, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: Document, context: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  @JSName("$")
  def $(selector: HTMLElement): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  @JSName("$")
  def $(selector: HTMLElement, context: HTMLElement): ChocolateChipElementArray = js.native
  @JSName("$")
  def $_ChocolateChipElementArray(selector: Document): ChocolateChipElementArray = js.native
  @JSName("$")
  var $_Original: ChocolateChipStatic = js.native
  
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  def chocolatechipjs(): js.Array[Document] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  def chocolatechipjs(callback: js.Function0[_]): Unit = js.native
  /**
    * Accepts the document element and returns it wrapped in an array.
    *
    * @param document The document object.
    */
  def chocolatechipjs(document: Document): js.Array[Document] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array of DOM elements to convert into a ChocolateChip Collection.
    */
  def chocolatechipjs(elementArray: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM HTMLElement to use as context
    */
  def chocolatechipjs(selector: String): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: String, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: String, context: HTMLElement): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: Document, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: Document, context: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  def chocolatechipjs(selector: HTMLElement): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray = js.native
  def chocolatechipjs(selector: HTMLElement, context: HTMLElement): ChocolateChipElementArray = js.native
  @JSName("chocolatechipjs")
  def chocolatechipjs_ChocolateChipElementArray(selector: Document): ChocolateChipElementArray = js.native
  @JSName("chocolatechipjs")
  var chocolatechipjs_Original: ChocolateChipStatic = js.native
  
  var jsonp: js.Any = js.native
}
