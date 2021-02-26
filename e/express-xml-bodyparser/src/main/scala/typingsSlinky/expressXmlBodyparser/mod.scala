package typingsSlinky.expressXmlBodyparser

import typingsSlinky.express.mod.Handler
import typingsSlinky.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-xml-bodyparser", JSImport.Namespace)
  @js.native
  def apply(): Handler = js.native
  @JSImport("express-xml-bodyparser", JSImport.Namespace)
  @js.native
  def apply(options: ParserOptions): Handler = js.native
  
  @JSImport("express-xml-bodyparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // @deprecated Will be removed in future versions
  @JSImport("express-xml-bodyparser", "regexp")
  @js.native
  def regexp: js.RegExp = js.native
  @scala.inline
  def regexp_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
}
