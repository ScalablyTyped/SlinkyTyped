package typingsSlinky.safariExtension

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionSettings
  extends SafariEventTarget
     with /* index */ NumberDictionary[js.Any]
     with /* index */ StringDictionary[js.Any] {
  
  def clear(): Unit = js.native
  
  def getItem(key: String): js.Any = js.native
  
  def removeItem(key: String): Unit = js.native
  
  def setItem(key: String, value: js.Any): Unit = js.native
}
