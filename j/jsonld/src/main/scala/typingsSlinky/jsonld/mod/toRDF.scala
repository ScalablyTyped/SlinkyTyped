package typingsSlinky.jsonld.mod

import typingsSlinky.jsonld.jsonldSpecMod.Document
import typingsSlinky.jsonld.mod.Options.ToRdf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonld", "toRDF")
@js.native
object toRDF extends js.Object {
  
  def apply(input: Document): js.Promise[RdfDataSet] = js.native
  def apply(input: Document, callback: Callback[RdfDataSet]): Unit = js.native
  def apply(input: Document, options: ToRdf): js.Promise[RdfDataSet] = js.native
  def apply(input: Document, options: ToRdf, callback: Callback[RdfDataSet]): Unit = js.native
}
