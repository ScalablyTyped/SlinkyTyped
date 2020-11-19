package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.namedNodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "uri")
@js.native
object uri extends js.Object {
  
  def docpart(uri: String): String = js.native
  
  def document(x: String): default = js.native
  
  def hostpart(u: String): String = js.native
  
  def join(given: String, base: String): String = js.native
  
  def protocol(uri: String): String | Null = js.native
  
  def refTo(base: String, uri: String): String = js.native
}
