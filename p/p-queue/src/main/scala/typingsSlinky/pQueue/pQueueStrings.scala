package typingsSlinky.pQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pQueueStrings {
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait next extends js.Object
}
