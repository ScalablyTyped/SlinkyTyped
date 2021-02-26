package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.anon.Closeable
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsInstance extends StObject {
  
  def activateTab(link: String): Unit = js.native
  def activateTab(link: JQuery[HTMLElement]): Unit = js.native
  
  def addTab(tab: Closeable, targetIndex: Double): Unit = js.native
  
  def contains(id: String): Boolean = js.native
  
  def count(): Double = js.native
  
  def nextTab(): Unit = js.native
  
  def order(order: js.Array[String]): Unit = js.native
  
  def previousTab(): Unit = js.native
  
  def removeTab(id: String): Unit = js.native
  
  def renameTab(id: String, label: String): Unit = js.native
  
  def resize(): Unit = js.native
  
  def selection(): js.Array[String] = js.native
}
