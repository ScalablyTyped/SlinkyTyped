package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/style_url_resolver", JSImport.Namespace)
@js.native
object styleUrlResolverMod extends js.Object {
  
  def extractStyleUrls(resolver: UrlResolver, baseUrl: String, cssText: String): StyleWithImports = js.native
  
  def isStyleUrlResolvable(url: String): Boolean = js.native
  
  @js.native
  class StyleWithImports protected () extends js.Object {
    def this(style: String, styleUrls: js.Array[String]) = this()
    
    var style: String = js.native
    
    var styleUrls: js.Array[String] = js.native
  }
}
