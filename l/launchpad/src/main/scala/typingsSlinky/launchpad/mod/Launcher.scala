package typingsSlinky.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Launcher extends js.Object {
  
  def apply(
    url: String,
    options: LaunchOptions,
    callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]
  ): Unit = js.native
  
  def aurora(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("aurora")
  var aurora_Original: BrowserFunction = js.native
  
  def browsers(cb: js.Function2[/* error */ js.Any, /* browsers */ js.UndefOr[js.Array[Browser]], Unit]): Unit = js.native
  
  def canary(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("canary")
  var canary_Original: BrowserFunction = js.native
  
  def chrome(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("chrome")
  var chrome_Original: BrowserFunction = js.native
  
  def chromium(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("chromium")
  var chromium_Original: BrowserFunction = js.native
  
  def edge(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("edge")
  var edge_Original: BrowserFunction = js.native
  
  def firefox(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("firefox")
  var firefox_Original: BrowserFunction = js.native
  
  def ie(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("ie")
  var ie_Original: BrowserFunction = js.native
  
  def nodeWebkit(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("nodeWebkit")
  var nodeWebkit_Original: BrowserFunction = js.native
  
  def opera(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("opera")
  var opera_Original: BrowserFunction = js.native
  
  def phantom(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("phantom")
  var phantom_Original: BrowserFunction = js.native
  
  def safari(url: String, callback: js.Function2[/* err */ js.Any, /* instance */ Instance, Unit]): Unit = js.native
  @JSName("safari")
  var safari_Original: BrowserFunction = js.native
}
