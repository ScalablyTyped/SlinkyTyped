package typingsSlinky.cypress.Cypress

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cypress.Anon_At
import typingsSlinky.cypress.JQuery
import typingsSlinky.cypress.cypressStrings.DOLLARel
import typingsSlinky.cypress.cypressStrings.displayName
import typingsSlinky.cypress.cypressStrings.message
import typingsSlinky.cypress.cypressStrings.name
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  def end(): Log = js.native
  def finish(): Unit = js.native
  def get(): LogConfig = js.native
  @JSName("get")
  def get_displayName(attr: displayName): String = js.native
  @JSName("get")
  def get_el(attr: DOLLARel): JQuery[HTMLElement] = js.native
  @JSName("get")
  def get_message(attr: message): js.Array[_] = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  def set(options: Partial[LogConfig]): Log = js.native
  @JSName("set")
  def set_displayName(key: displayName, value: String): Log = js.native
  @JSName("set")
  def set_el(key: DOLLARel, value: JQuery[HTMLElement]): Log = js.native
  @JSName("set")
  def set_message(key: message, value: js.Array[_]): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  def snapshot(): Log = js.native
  def snapshot(name: String): Log = js.native
  def snapshot(name: String, options: Anon_At): Log = js.native
}

