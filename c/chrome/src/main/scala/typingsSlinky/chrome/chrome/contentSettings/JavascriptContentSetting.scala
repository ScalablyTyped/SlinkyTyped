package typingsSlinky.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JavascriptContentSetting extends ContentSetting {
  
  def set(details: JavascriptSetDetails): Unit = js.native
  def set(details: JavascriptSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
