package typingsSlinky.pickadate.Pickadate

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.pickadate.JQuery
import typingsSlinky.pickadate.pickadateStrings.$node
import typingsSlinky.pickadate.pickadateStrings.$root
import typingsSlinky.pickadate.pickadateStrings._hidden
import typingsSlinky.pickadate.pickadateStrings.picker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pickadate extends js.Object {
  var defaults: DateOptions = js.native
  /**
    * Initialize a date picker.
    */
  def apply(): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  def apply(keyword: picker): DatePicker = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def apply(methodName: String, arguments: js.Any*): js.Any = js.native
  def apply(objectName: $node): JQuery = js.native
  def apply(objectName: $root): JQuery = js.native
  def apply(objectName: _hidden): HTMLInputElement = js.native
  def apply(options: DateOptions): JQuery = js.native
}

