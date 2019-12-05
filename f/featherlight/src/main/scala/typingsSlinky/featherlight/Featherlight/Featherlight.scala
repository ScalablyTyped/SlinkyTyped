package typingsSlinky.featherlight.Featherlight

import typingsSlinky.featherlight.JQuery
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featherlight extends Config {
  @JSName("$content")
  var $content: JQuery = js.native
  @JSName("$instance")
  var $instance: JQuery = js.native
  var target: JQuery | String = js.native
  def close(): JQueryPromise[JQuery] = js.native
  def close(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def getContent(): JQuery | JQueryPromise[JQuery] = js.native
  def open(): JQueryPromise[JQuery] = js.native
  def open(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
  def setContent($content: JQuery): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setContent($content: JQueryPromise[JQuery]): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(target: String, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def setup(target: JQuery, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
}

