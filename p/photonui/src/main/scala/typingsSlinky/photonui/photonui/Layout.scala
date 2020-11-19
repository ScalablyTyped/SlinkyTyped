package typingsSlinky.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends Container {
  
  def addChild(widget: Widget): Unit = js.native
  def addChild(widget: Widget, layoutOptions: StringDictionary[js.Any]): Unit = js.native
  
  var children: js.Array[Widget] = js.native
  
  var childrenNames: js.Array[String] = js.native
  
  def empty(): Unit = js.native
}
