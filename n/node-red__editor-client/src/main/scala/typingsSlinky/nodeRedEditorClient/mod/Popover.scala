package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.anon.AutoClose
import typingsSlinky.nodeRedEditorClient.anon.ContainerHide
import typingsSlinky.nodeRedEditorClient.anon.DisposeOnClose
import typingsSlinky.nodeRedEditorClient.anon.Show
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover extends js.Object {
  
  def create(options: AutoClose): PopoverInstance = js.native
  
  def menu(options: DisposeOnClose): Show = js.native
  
  def panel(content: JQuery[HTMLElement]): ContainerHide = js.native
  
  def tooltip(target: JQuery[HTMLElement], content: String): PopoverInstance = js.native
  def tooltip(target: JQuery[HTMLElement], content: String, action: String): PopoverInstance = js.native
}
