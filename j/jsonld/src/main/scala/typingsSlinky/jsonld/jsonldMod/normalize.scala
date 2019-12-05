package typingsSlinky.jsonld.jsonldMod

import typingsSlinky.jsonld.jsonldDashSpecMod.Document
import typingsSlinky.jsonld.jsonldDashSpecMod.JsonLd
import typingsSlinky.jsonld.jsonldMod.Options.Normalize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "normalize")
@js.native
object normalize extends js.Object {
  def apply(input: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, callback: DocCallback): Unit = js.native
  def apply(input: Document, options: Normalize): js.Promise[JsonLd] = js.native
  def apply(input: Document, options: Normalize, callback: DocCallback): Unit = js.native
}

