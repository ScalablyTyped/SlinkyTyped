package typingsSlinky.jsonld.mod

import typingsSlinky.jsonld.jsonldSpecMod.Document
import typingsSlinky.jsonld.jsonldSpecMod.JsonLdArray
import typingsSlinky.jsonld.mod.Options.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonld", "expand")
@js.native
object expand extends js.Object {
  
  def apply(input: Document): js.Promise[JsonLdArray] = js.native
  def apply(input: Document, callback: Callback[JsonLdArray]): Unit = js.native
  def apply(input: Document, options: Expand): js.Promise[JsonLdArray] = js.native
  def apply(input: Document, options: Expand, callback: Callback[JsonLdArray]): Unit = js.native
}
