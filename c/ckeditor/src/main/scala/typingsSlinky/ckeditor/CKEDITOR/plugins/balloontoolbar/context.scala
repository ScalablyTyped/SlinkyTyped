package typingsSlinky.ckeditor.CKEDITOR.plugins.balloontoolbar

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.ui.balloonToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait context extends js.Object {
  
  def destroy(): Unit = js.native
  
  var editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  
  def hide(): Unit = js.native
  
  var options: contextDefinition = js.native
  
  def refresh(): Unit = js.native
  
  def show(): Unit = js.native
  def show(pointedElement: element): Unit = js.native
  
  var toolbar: balloonToolbar = js.native
}
