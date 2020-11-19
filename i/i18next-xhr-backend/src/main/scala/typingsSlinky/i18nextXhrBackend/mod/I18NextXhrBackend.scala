package typingsSlinky.i18nextXhrBackend.mod

import typingsSlinky.i18next.mod.BackendModule
import typingsSlinky.i18next.mod.ReadCallback
import typingsSlinky.i18nextXhrBackend.i18nextXhrBackendStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18NextXhrBackend extends BackendModule[BackendOptions] {
  
  def create(languages: String, namespace: String, key: String, fallbackValue: String): Unit = js.native
  
  def init(): Unit = js.native
  def init(services: js.UndefOr[scala.Nothing], options: BackendOptions): Unit = js.native
  def init(services: js.Any): Unit = js.native
  def init(services: js.Any, options: BackendOptions): Unit = js.native
  
  def loadUrl(url: String, callback: ReadCallback): Unit = js.native
  
  var options: BackendOptions = js.native
  
  @JSName("readMulti")
  def readMulti_MI18NextXhrBackend(languages: js.Array[String], namespaces: js.Array[String], callback: ReadCallback): Unit = js.native
  
  var services: js.Any = js.native
  
  @JSName("type")
  var type_I18NextXhrBackend: backend = js.native
}
