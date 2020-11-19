package typingsSlinky.extjs.global.Ext.dom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.dom.Query")
@js.native
class Query ()
  extends typingsSlinky.extjs.Ext.dom.Query
/* static members */
@JSGlobal("Ext.dom.Query")
@js.native
object Query extends js.Object {
  
  /** [Method] Compiles a selector xpath query into a reusable function
    * @param selector String The selector/xpath query
    * @param type String Either "select" or "simple" for a simple selector match
    * @returns Function
    */
  def compile(): js.Any = js.native
  def compile(selector: js.UndefOr[scala.Nothing], `type`: String): js.Any = js.native
  def compile(selector: String): js.Any = js.native
  def compile(selector: String, `type`: String): js.Any = js.native
  
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
    * @param el HTMLElement[] An array of elements to filter
    * @param selector String The simple selector to test
    * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  def filter(): Array = js.native
  def filter(el: js.UndefOr[scala.Nothing], selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): Array = js.native
  def filter(el: js.UndefOr[scala.Nothing], selector: String): Array = js.native
  def filter(el: js.UndefOr[scala.Nothing], selector: String, nonMatches: Boolean): Array = js.native
  def filter(el: Array): Array = js.native
  def filter(el: Array, selector: js.UndefOr[scala.Nothing], nonMatches: Boolean): Array = js.native
  def filter(el: Array, selector: String): Array = js.native
  def filter(el: Array, selector: String, nonMatches: Boolean): Array = js.native
  
  /** [Method] Returns true if the passed element s match the passed simple selector e g
    * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
    * @param selector String The simple selector to test
    * @returns Boolean
    */
  def is(): Boolean = js.native
  def is(el: js.UndefOr[scala.Nothing], selector: String): Boolean = js.native
  def is(el: js.Any): Boolean = js.native
  def is(el: js.Any, selector: String): Boolean = js.native
  
  /** [Method] Selects an array of DOM nodes using JavaScript only implementation
    * @param selector String The selector/xpath query (can be a comma separated list of selectors)
    * @param root HTMLElement/String The start of the query.
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  def jsSelect(): Array = js.native
  def jsSelect(selector: js.UndefOr[scala.Nothing], root: js.Any): Array = js.native
  def jsSelect(selector: String): Array = js.native
  def jsSelect(selector: String, root: js.Any): Array = js.native
  
  /** [Property] (Object) */
  var matchers: js.Any = js.native
  
  /** [Property] (Object) */
  var operators: js.Any = js.native
  
  /** [Property] (Object) */
  var pseudos: js.Any = js.native
  
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
    * @param path String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
    * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
    * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
    */
  def select(): Array = js.native
  def select(
    path: js.UndefOr[scala.Nothing],
    root: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    single: Boolean
  ): Array = js.native
  def select(path: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], `type`: String): Array = js.native
  def select(path: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], `type`: String, single: Boolean): Array = js.native
  def select(path: js.UndefOr[scala.Nothing], root: HTMLElement): Array = js.native
  def select(
    path: js.UndefOr[scala.Nothing],
    root: HTMLElement,
    `type`: js.UndefOr[scala.Nothing],
    single: Boolean
  ): Array = js.native
  def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: String): Array = js.native
  def select(path: js.UndefOr[scala.Nothing], root: HTMLElement, `type`: String, single: Boolean): Array = js.native
  def select(path: String): Array = js.native
  def select(path: String, root: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], single: Boolean): Array = js.native
  def select(path: String, root: js.UndefOr[scala.Nothing], `type`: String): Array = js.native
  def select(path: String, root: js.UndefOr[scala.Nothing], `type`: String, single: Boolean): Array = js.native
  def select(path: String, root: HTMLElement): Array = js.native
  def select(path: String, root: HTMLElement, `type`: js.UndefOr[scala.Nothing], single: Boolean): Array = js.native
  def select(path: String, root: HTMLElement, `type`: String): Array = js.native
  def select(path: String, root: HTMLElement, `type`: String, single: Boolean): Array = js.native
  
  /** [Method] Selects a single element
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @returns HTMLElement The DOM element which matched the selector.
    */
  def selectNode(): HTMLElement = js.native
  def selectNode(selector: js.UndefOr[scala.Nothing], root: HTMLElement): HTMLElement = js.native
  def selectNode(selector: String): HTMLElement = js.native
  def selectNode(selector: String, root: HTMLElement): HTMLElement = js.native
  
  /** [Method] Selects the value of a node parsing integers and floats
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param defaultValue Number When specified, this is return as empty value.
    * @returns Number
    */
  def selectNumber(): Double = js.native
  def selectNumber(selector: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
  def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement): Double = js.native
  def selectNumber(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: Double): Double = js.native
  def selectNumber(selector: String): Double = js.native
  def selectNumber(selector: String, root: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
  def selectNumber(selector: String, root: HTMLElement): Double = js.native
  def selectNumber(selector: String, root: HTMLElement, defaultValue: Double): Double = js.native
  
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param defaultValue String When specified, this is return as empty value.
    * @returns String
    */
  def selectValue(): String = js.native
  def selectValue(selector: js.UndefOr[scala.Nothing], root: js.UndefOr[scala.Nothing], defaultValue: String): String = js.native
  def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement): String = js.native
  def selectValue(selector: js.UndefOr[scala.Nothing], root: HTMLElement, defaultValue: String): String = js.native
  def selectValue(selector: String): String = js.native
  def selectValue(selector: String, root: js.UndefOr[scala.Nothing], defaultValue: String): String = js.native
  def selectValue(selector: String, root: HTMLElement): String = js.native
  def selectValue(selector: String, root: HTMLElement, defaultValue: String): String = js.native
}
