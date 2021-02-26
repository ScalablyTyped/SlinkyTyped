package typingsSlinky.puppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomError = js.Error
  
  type EvaluateFn[T] = java.lang.String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  
  type EvaluateFnReturnType[T /* <: typingsSlinky.puppeteer.mod.EvaluateFn[_] */] = js.Any
  
  type EventType = java.lang.String | js.Symbol
  
  type Handler[T] = js.Function1[/* event */ js.UndefOr[T], scala.Unit]
  
  type Headers = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  type LayoutDimension = java.lang.String | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typingsSlinky.puppeteer.mod.JSONArray
    - typingsSlinky.puppeteer.mod.JSONObject
  */
  type Serializable = typingsSlinky.puppeteer.mod._Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  
  type SerializableOrJSHandle = typingsSlinky.puppeteer.mod.Serializable | typingsSlinky.puppeteer.mod.JSHandle[js.Any]
  
  /**
    * TimeoutError is emitted whenever certain operations are terminated due to timeout.
    *
    * Example operations are {@link Page.waitForSelector | page.waitForSelector}
    * or {@link PuppeteerNode.launch | puppeteer.launch}.
    */
  type TimeoutError = js.Error
  
  type UnwrapElementHandle[X] = X
  
  type WrapElementHandle[X] = X | typingsSlinky.puppeteer.mod.ElementHandle[X]
  
  @scala.inline
  def clearCustomQueryHandlers(): scala.Unit = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def connect(): js.Promise[typingsSlinky.puppeteer.mod.Browser] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[typingsSlinky.puppeteer.mod.Browser]]
  @scala.inline
  def connect(options: typingsSlinky.puppeteer.mod.ConnectOptions): js.Promise[typingsSlinky.puppeteer.mod.Browser] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.puppeteer.mod.Browser]]
  
  @scala.inline
  def createBrowserFetcher(): typingsSlinky.puppeteer.mod.BrowserFetcher = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")().asInstanceOf[typingsSlinky.puppeteer.mod.BrowserFetcher]
  @scala.inline
  def createBrowserFetcher(options: typingsSlinky.puppeteer.mod.FetcherOptions): typingsSlinky.puppeteer.mod.BrowserFetcher = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.puppeteer.mod.BrowserFetcher]
  
  @scala.inline
  def customQueryHandlerNames(): js.Array[java.lang.String] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def defaultArgs(): js.Array[java.lang.String] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")().asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def defaultArgs(options: typingsSlinky.puppeteer.mod.ChromeArgOptions): js.Array[java.lang.String] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def executablePath(): java.lang.String = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def launch(): js.Promise[typingsSlinky.puppeteer.mod.Browser] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[typingsSlinky.puppeteer.mod.Browser]]
  @scala.inline
  def launch(options: typingsSlinky.puppeteer.mod.LaunchOptions): js.Promise[typingsSlinky.puppeteer.mod.Browser] = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.puppeteer.mod.Browser]]
  
  @scala.inline
  def product: typingsSlinky.puppeteer.mod.Product_ = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].selectDynamic("product").asInstanceOf[typingsSlinky.puppeteer.mod.Product_]
  
  @scala.inline
  def registerCustomQueryHandler(name: java.lang.String, queryHandler: typingsSlinky.puppeteer.mod.CustomQueryHandler): scala.Unit = (typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], queryHandler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unregisterCustomQueryHandler(name: java.lang.String): scala.Unit = typingsSlinky.puppeteer.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
