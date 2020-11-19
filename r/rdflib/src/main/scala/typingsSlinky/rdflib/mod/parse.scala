package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.formulaMod.default
import typingsSlinky.rdflib.parseMod.CallbackFunc
import typingsSlinky.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "parse")
@js.native
object parse extends js.Object {
  
  def apply(str: String, kb: default, base: String): Unit = js.native
  def apply(
    str: String,
    kb: default,
    base: String,
    contentType: js.UndefOr[scala.Nothing],
    callback: CallbackFunc
  ): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: String): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: String, callback: CallbackFunc): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: ContentType): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: ContentType, callback: CallbackFunc): Unit = js.native
}
