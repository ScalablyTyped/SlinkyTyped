package typingsSlinky.annyang

import typingsSlinky.annyang.mod.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annyangStrings {
  
  @js.native
  sealed trait end extends Events
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends Events
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errorNetwork extends Events
  @scala.inline
  def errorNetwork: errorNetwork = "errorNetwork".asInstanceOf[errorNetwork]
  
  @js.native
  sealed trait errorPermissionBlocked extends Events
  @scala.inline
  def errorPermissionBlocked: errorPermissionBlocked = "errorPermissionBlocked".asInstanceOf[errorPermissionBlocked]
  
  @js.native
  sealed trait errorPermissionDenied extends Events
  @scala.inline
  def errorPermissionDenied: errorPermissionDenied = "errorPermissionDenied".asInstanceOf[errorPermissionDenied]
  
  @js.native
  sealed trait result extends Events
  @scala.inline
  def result: result = "result".asInstanceOf[result]
  
  @js.native
  sealed trait resultMatch extends Events
  @scala.inline
  def resultMatch: resultMatch = "resultMatch".asInstanceOf[resultMatch]
  
  @js.native
  sealed trait resultNoMatch extends Events
  @scala.inline
  def resultNoMatch: resultNoMatch = "resultNoMatch".asInstanceOf[resultNoMatch]
  
  @js.native
  sealed trait soundstart extends Events
  @scala.inline
  def soundstart: soundstart = "soundstart".asInstanceOf[soundstart]
  
  @js.native
  sealed trait start extends Events
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}
