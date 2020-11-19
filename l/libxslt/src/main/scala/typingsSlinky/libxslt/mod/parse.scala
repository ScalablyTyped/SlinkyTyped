package typingsSlinky.libxslt.mod

import typingsSlinky.libxmljs.mod.Document
import typingsSlinky.libxslt.internalTypesMod.ParseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libxslt", "parse")
@js.native
object parse extends js.Object {
  
  def apply(source: String): Stylesheet = js.native
  def apply(source: String, callback: ParseCallback): Unit = js.native
  def apply(source: Document): Stylesheet = js.native
  def apply(source: Document, callback: ParseCallback): Unit = js.native
}
