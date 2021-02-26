package typingsSlinky.kdbxweb

import typingsSlinky.kdbxweb.mod.KdbxErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxwebStrings {
  
  @js.native
  sealed trait BadSignature extends KdbxErrorCode
  @scala.inline
  def BadSignature: BadSignature = "BadSignature".asInstanceOf[BadSignature]
  
  @js.native
  sealed trait FileCorrupt extends KdbxErrorCode
  @scala.inline
  def FileCorrupt: FileCorrupt = "FileCorrupt".asInstanceOf[FileCorrupt]
  
  @js.native
  sealed trait InvalidArg extends KdbxErrorCode
  @scala.inline
  def InvalidArg: InvalidArg = "InvalidArg".asInstanceOf[InvalidArg]
  
  @js.native
  sealed trait InvalidKey extends KdbxErrorCode
  @scala.inline
  def InvalidKey: InvalidKey = "InvalidKey".asInstanceOf[InvalidKey]
  
  @js.native
  sealed trait InvalidVersion extends KdbxErrorCode
  @scala.inline
  def InvalidVersion: InvalidVersion = "InvalidVersion".asInstanceOf[InvalidVersion]
  
  @js.native
  sealed trait KdbxError extends StObject
  @scala.inline
  def KdbxError: KdbxError = "KdbxError".asInstanceOf[KdbxError]
  
  @js.native
  sealed trait MergeError extends KdbxErrorCode
  @scala.inline
  def MergeError: MergeError = "MergeError".asInstanceOf[MergeError]
  
  @js.native
  sealed trait NotImplemented extends KdbxErrorCode
  @scala.inline
  def NotImplemented: NotImplemented = "NotImplemented".asInstanceOf[NotImplemented]
  
  @js.native
  sealed trait Unsupported extends KdbxErrorCode
  @scala.inline
  def Unsupported: Unsupported = "Unsupported".asInstanceOf[Unsupported]
}
