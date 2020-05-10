package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.AnonBools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.Tput")
@js.native
class Tput protected () extends IHasOptions[TputsOptions] {
  def this(opts: TputsOptions) = this()
  var debug: Boolean = js.native
  var error: js.Error = js.native
  var extended: Boolean = js.native
  var padding: Boolean = js.native
  var printf: Boolean = js.native
  var termcap: String = js.native
  var termcapFile: String = js.native
  var terminal: String = js.native
  var terminfoFile: String = js.native
  var terminfoPrefix: String = js.native
  def parseTerminfo(data: js.Any, file: String): AnonBools = js.native
  def readTerminfo(term: String): String = js.native
  def setup(): Unit = js.native
  def term(is: js.Any): Boolean = js.native
}

