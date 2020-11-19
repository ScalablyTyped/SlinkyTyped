package typingsSlinky.camundaExternalTaskClientJs

import typingsSlinky.camundaExternalTaskClientJs.mod.ErrorEvent
import typingsSlinky.camundaExternalTaskClientJs.mod.ErrorWithTaskEvent
import typingsSlinky.camundaExternalTaskClientJs.mod.PollEvent
import typingsSlinky.camundaExternalTaskClientJs.mod.SuccessWithTaskEvent
import typingsSlinky.camundaExternalTaskClientJs.mod.TopicEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camundaExternalTaskClientJsStrings {
  
  @scala.inline
  def completeColonerror: completeColonerror = "complete:error".asInstanceOf[completeColonerror]
  
  @scala.inline
  def completeColonsuccess: completeColonsuccess = "complete:success".asInstanceOf[completeColonsuccess]
  
  @scala.inline
  def extendLockColonerror: extendLockColonerror = "extendLock:error".asInstanceOf[extendLockColonerror]
  
  @scala.inline
  def extendLockColonsuccess: extendLockColonsuccess = "extendLock:success".asInstanceOf[extendLockColonsuccess]
  
  @scala.inline
  def handleBpmnErrorColonerror: handleBpmnErrorColonerror = "handleBpmnError:error".asInstanceOf[handleBpmnErrorColonerror]
  
  @scala.inline
  def handleBpmnErrorColonsuccess: handleBpmnErrorColonsuccess = "handleBpmnError:success".asInstanceOf[handleBpmnErrorColonsuccess]
  
  @scala.inline
  def handleFailureColonerror: handleFailureColonerror = "handleFailure:error".asInstanceOf[handleFailureColonerror]
  
  @scala.inline
  def handleFailureColonsuccess: handleFailureColonsuccess = "handleFailure:success".asInstanceOf[handleFailureColonsuccess]
  
  @scala.inline
  def pollColonerror: pollColonerror = "poll:error".asInstanceOf[pollColonerror]
  
  @scala.inline
  def pollColonstart: pollColonstart = "poll:start".asInstanceOf[pollColonstart]
  
  @scala.inline
  def pollColonstop: pollColonstop = "poll:stop".asInstanceOf[pollColonstop]
  
  @scala.inline
  def pollColonsuccess: pollColonsuccess = "poll:success".asInstanceOf[pollColonsuccess]
  
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @scala.inline
  def unlockColonerror: unlockColonerror = "unlock:error".asInstanceOf[unlockColonerror]
  
  @scala.inline
  def unlockColonsuccess: unlockColonsuccess = "unlock:success".asInstanceOf[unlockColonsuccess]
  
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  
  @js.native
  sealed trait completeColonerror extends ErrorEvent
  
  @js.native
  sealed trait completeColonsuccess extends SuccessWithTaskEvent
  
  @js.native
  sealed trait extendLockColonerror extends ErrorWithTaskEvent
  
  @js.native
  sealed trait extendLockColonsuccess extends SuccessWithTaskEvent
  
  @js.native
  sealed trait handleBpmnErrorColonerror extends ErrorWithTaskEvent
  
  @js.native
  sealed trait handleBpmnErrorColonsuccess extends SuccessWithTaskEvent
  
  @js.native
  sealed trait handleFailureColonerror extends ErrorWithTaskEvent
  
  @js.native
  sealed trait handleFailureColonsuccess extends SuccessWithTaskEvent
  
  @js.native
  sealed trait pollColonerror extends ErrorEvent
  
  @js.native
  sealed trait pollColonstart extends PollEvent
  
  @js.native
  sealed trait pollColonstop extends PollEvent
  
  @js.native
  sealed trait pollColonsuccess extends js.Object
  
  @js.native
  sealed trait subscribe extends TopicEvent
  
  @js.native
  sealed trait unlockColonerror extends ErrorWithTaskEvent
  
  @js.native
  sealed trait unlockColonsuccess extends SuccessWithTaskEvent
  
  @js.native
  sealed trait unsubscribe extends TopicEvent
}
