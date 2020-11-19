package typingsSlinky.backbone.mod

import org.scalajs.dom.raw.Location
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "History")
@js.native
class History_ () extends js.Object {
  
  /* private */ def _updateHash(location: Location, fragment: String, replace: Boolean): Unit = js.native
  
  def atRoot(): Boolean = js.native
  
  def checkUrl(): Unit = js.native
  def checkUrl(e: js.Any): Unit = js.native
  
  def decodeFragment(fragment: String): String = js.native
  
  def getFragment(): String = js.native
  def getFragment(fragment: String): String = js.native
  
  def getHash(): String = js.native
  def getHash(window: Window): String = js.native
  
  def getPath(): String = js.native
  
  def getSearch(): String = js.native
  
  var handlers: js.Array[_] = js.native
  
  var interval: Double = js.native
  
  def loadUrl(): Boolean = js.native
  def loadUrl(fragmentOverride: String): Boolean = js.native
  
  def matchRoot(): Boolean = js.native
  
  def navigate(fragment: String): Boolean = js.native
  def navigate(fragment: String, options: js.Any): Boolean = js.native
  
  var options: js.Any = js.native
  
  def route(route: String, callback: js.Function): Double = js.native
  def route(route: js.RegExp, callback: js.Function): Double = js.native
  
  def start(): Boolean = js.native
  def start(options: HistoryOptions): Boolean = js.native
  
  def stop(): Unit = js.native
}
/* static members */
@JSImport("backbone", "History")
@js.native
object History_ extends js.Object {
  
  var started: Boolean = js.native
}
