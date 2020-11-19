package typingsSlinky.reactOverlays.modalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalManager extends js.Object {
  
  def add(modal: typingsSlinky.reactOverlays.modalMod.^, container: js.Any): Double = js.native
  def add(modal: typingsSlinky.reactOverlays.modalMod.^, container: js.Any, className: String): Double = js.native
  
  def containerIndexFromModal(modal: typingsSlinky.reactOverlays.modalMod.^): Double = js.native
  
  def isContainerOverflowing(modal: typingsSlinky.reactOverlays.modalMod.^): Boolean = js.native
  
  def isTopModal(modal: typingsSlinky.reactOverlays.modalMod.^): Boolean = js.native
  
  def remove(modal: typingsSlinky.reactOverlays.modalMod.^): Unit = js.native
  
  def removeContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
  
  def setContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
}
