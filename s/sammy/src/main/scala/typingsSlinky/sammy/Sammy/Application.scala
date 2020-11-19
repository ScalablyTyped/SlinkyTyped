package typingsSlinky.sammy.Sammy

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends Object {
  
  @JSName("$element")
  def $element(): JQuery[HTMLElement] = js.native
  @JSName("$element")
  def $element(selector: String): JQuery[HTMLElement] = js.native
  
  def apply(appFn: js.Function): js.Any = js.native
  
  var APP_EVENTS: js.Array[String] = js.native
  
  var ROUTE_VERBS: js.Array[String] = js.native
  
  def after(callback: js.Function): Application = js.native
  
  def any(verb: String, path: String, callback: js.Function): Unit = js.native
  
  def around(callback: js.Function): Application = js.native
  
  def before(callback: js.Function): Application = js.native
  def before(options: js.Any, callback: js.Function): Application = js.native
  
  def bind(name: String, callback: js.Function): Application = js.native
  def bind(name: String, data: js.Any, callback: js.Function): Application = js.native
  
  def bindToAllEvents(callback: js.Function): Application = js.native
  
  def clearTemplateCache(): js.Any = js.native
  
  def contextMatchesOptions(context: js.Any, match_options: js.Any): Boolean = js.native
  def contextMatchesOptions(context: js.Any, match_options: js.Any, positive: Boolean): Boolean = js.native
  
  def del(path: String, callback: js.Function): Application = js.native
  def del(path: js.RegExp, callback: js.Function): Application = js.native
  
  def destroy(): Application = js.native
  
  def error(message: String, original_error: js.Error): Unit = js.native
  
  def eventNamespace(): String = js.native
  
  def get(path: String, callback: js.Function): Application = js.native
  def get(path: js.RegExp, callback: js.Function): Application = js.native
  
  def getLocation(): String = js.native
  
  def helper(name: String, method: js.Function): js.Any = js.native
  
   // Behaviour similar to _.extend
  def helpers(extensions: js.Any): js.Any = js.native
  
   // Behaviour similar to _.extend
  def isRunning(): Boolean = js.native
  
  var last_location: js.Array[String] = js.native
  
  def lookupRoute(verb: String, path: String): js.Any = js.native
  
  def mapRoutes(route_array: js.Array[_]): Application = js.native
  
  def notFound(verb: String, path: String): js.Any = js.native
  
  // Features provided by oauth2 plugin
  var oauthorize: String = js.native
  
  def post(path: String, callback: js.Function): Application = js.native
  def post(path: js.RegExp, callback: js.Function): Application = js.native
  
  def put(path: String, callback: js.Function): Application = js.native
  def put(path: js.RegExp, callback: js.Function): Application = js.native
  
  def refresh(): Application = js.native
  
  def requireOAuth(): js.Any = js.native
  def requireOAuth(callback: js.Function): js.Any = js.native
  def requireOAuth(path: String): js.Any = js.native
  
  def routablePath(path: String): String = js.native
  
  def route(verb: String, path: String, callback: js.Function): Application = js.native
  def route(verb: String, path: js.RegExp, callback: js.Function): Application = js.native
  
  def run(): Application = js.native
  def run(start_url: String): Application = js.native
  
  def runRoute(verb: String): js.Any = js.native
  def runRoute(verb: String, path: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def runRoute(verb: String, path: js.UndefOr[scala.Nothing], params: js.Any): js.Any = js.native
  def runRoute(verb: String, path: js.UndefOr[scala.Nothing], params: js.Any, target: js.Any): js.Any = js.native
  def runRoute(verb: String, path: String): js.Any = js.native
  def runRoute(verb: String, path: String, params: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def runRoute(verb: String, path: String, params: js.Any): js.Any = js.native
  def runRoute(verb: String, path: String, params: js.Any, target: js.Any): js.Any = js.native
  
  def send(params: js.Any*): js.Any = js.native
  
  def setLocation(new_location: String): String = js.native
  
  def setLocationProxy(new_proxy: DataLocationProxy): Unit = js.native
  
  def swap(content: js.Any, callback: js.Function): js.Any = js.native
  
  def templateCache(key: String, value: js.Any): js.Any = js.native
  
  def trigger(name: String): Application = js.native
  def trigger(name: String, data: js.Any): Application = js.native
  
  def unload(): Application = js.native
  
  def use(params: js.Any*): Unit = js.native
}
