package typingsSlinky.pangu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pangu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def spacing(text: String): String = js.native
  
  def spacingElementByClassName(className: String): Unit = js.native
  
  def spacingElementById(id: String): Unit = js.native
  
  def spacingElementByTagName(tagName: String): Unit = js.native
  
  def spacingFile(path: String): js.Promise[String] = js.native
  def spacingFile(path: String, callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]): Unit = js.native
  
  def spacingFileSync(path: String): String = js.native
  
  def spacingPage(): Unit = js.native
  
  def spacingText(text: String): js.Promise[String] = js.native
  def spacingText(text: String, callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]): Unit = js.native
}
