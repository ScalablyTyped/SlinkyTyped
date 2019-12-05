package typingsSlinky.jsonld.jsonldMod

import typingsSlinky.jsonld.jsonldDashSpecMod.Document
import typingsSlinky.jsonld.jsonldDashSpecMod.JsonLd
import typingsSlinky.jsonld.jsonldMod.Options.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "expand")
@js.native
object expand extends js.Object {
  def apply(input: Document): js.Promise[JsonLd] = js.native
  def apply(input: Document, callback: DocCallback): Unit = js.native
  def apply(input: Document, options: Expand): js.Promise[JsonLd] = js.native
  def apply(input: Document, options: Expand, callback: DocCallback): Unit = js.native
}

