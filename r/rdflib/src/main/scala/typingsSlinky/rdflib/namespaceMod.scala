package typingsSlinky.rdflib

import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.tfTypesMod.RdfJsDataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib/lib/namespace", JSImport.Namespace)
@js.native
object namespaceMod extends js.Object {
  
  def default(nsuri: String): js.Function1[/* ln */ String, NamedNode] = js.native
  def default(nsuri: String, factory: RdfJsDataFactory): js.Function1[/* ln */ String, NamedNode] = js.native
}
