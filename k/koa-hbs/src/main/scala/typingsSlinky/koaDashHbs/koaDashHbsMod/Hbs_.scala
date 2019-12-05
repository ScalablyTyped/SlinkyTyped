package typingsSlinky.koaDashHbs.koaDashHbsMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.handlebars.Handlebars.HelperDeclareSpec
import typingsSlinky.handlebars.Handlebars.HelperDelegate
import typingsSlinky.koaDashHbs.Fn_Fn
import typingsSlinky.koaDashHbs.TypeofUtils
import typingsSlinky.koaDashHbs.koaDashHbsMod.Hbs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Hbs")
@js.native
trait Hbs_ extends js.Object {
  var SafeString: Instantiable1[/* str */ String, typingsSlinky.handlebars.handlebarsMod.SafeString] = js.native
  var Utils: TypeofUtils = js.native
  @JSName("registerHelper")
  var registerHelper_Original: Fn_Fn = js.native
  def middleware(opts: Middleware): js.Any = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
}

