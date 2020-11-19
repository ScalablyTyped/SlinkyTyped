package typingsSlinky.koaHbs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.handlebars.Handlebars.HelperDeclareSpec
import typingsSlinky.handlebars.Handlebars.HelperDelegate
import typingsSlinky.koaHbs.anon.FnCall
import typingsSlinky.koaHbs.anon.TypeofUtils
import typingsSlinky.koaHbs.mod.Hbs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hbs_ extends js.Object {
  
  var SafeString: Instantiable1[/* str */ String, typingsSlinky.handlebars.mod.SafeString] = js.native
  
  var Utils: TypeofUtils = js.native
  
  def middleware(opts: Middleware): js.Any = js.native
  
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  @JSName("registerHelper")
  var registerHelper_Original: FnCall = js.native
}
