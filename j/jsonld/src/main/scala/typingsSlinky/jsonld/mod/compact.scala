package typingsSlinky.jsonld.mod

import typingsSlinky.jsonld.jsonldSpecMod.Context
import typingsSlinky.jsonld.jsonldSpecMod.Document
import typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj
import typingsSlinky.jsonld.mod.Options.Compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "compact")
@js.native
object compact extends js.Object {
  def apply(input: Document): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: js.UndefOr[Context], options: Compact): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Context, options: Compact, callback: Callback[JsonLdObj]): Unit = js.native
}

