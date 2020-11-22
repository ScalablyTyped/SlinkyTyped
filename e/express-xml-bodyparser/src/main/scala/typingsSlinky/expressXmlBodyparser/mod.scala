package typingsSlinky.expressXmlBodyparser

import typingsSlinky.express.mod.Handler
import typingsSlinky.xml2js.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-xml-bodyparser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Handler = js.native
  def apply(options: ParserOptions): Handler = js.native
  
  // @deprecated Will be removed in future versions
  var regexp: js.RegExp = js.native
}
