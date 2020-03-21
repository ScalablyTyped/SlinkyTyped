package typingsSlinky.d3.mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.d3Fetch.PartialHTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "image")
@js.native
object image extends js.Object {
  def apply(url: String): js.Promise[HTMLImageElement] = js.native
  def apply(url: String, init: PartialHTMLImageElement): js.Promise[HTMLImageElement] = js.native
}

