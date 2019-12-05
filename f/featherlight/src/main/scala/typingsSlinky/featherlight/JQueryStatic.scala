package typingsSlinky.featherlight

import typingsSlinky.featherlight.Featherlight.Config
import typingsSlinky.featherlight.Featherlight.FeatherlightStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("featherlight")
  var featherlight_Original: FeatherlightStatic = js.native
  def featherlight(): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: String, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def featherlight($content: JQuery, config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
  def featherlight(config: Config): typingsSlinky.featherlight.Featherlight.Featherlight = js.native
}

