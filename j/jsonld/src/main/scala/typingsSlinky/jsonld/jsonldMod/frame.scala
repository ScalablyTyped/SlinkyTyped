package typingsSlinky.jsonld.jsonldMod

import typingsSlinky.jsonld.jsonldDashSpecMod.Document
import typingsSlinky.jsonld.jsonldDashSpecMod.JsonLd
import typingsSlinky.jsonld.jsonldMod.Options.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "frame")
@js.native
object frame extends js.Object {
  def apply(input: Document, frame: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, frame: Document, callback: DocCallback): Unit = js.native
  def apply(input: Document, frame: Document, options: Frame): js.Promise[JsonLd] = js.native
  def apply(input: Document, frame: Document, options: Frame, callback: DocCallback): Unit = js.native
}

