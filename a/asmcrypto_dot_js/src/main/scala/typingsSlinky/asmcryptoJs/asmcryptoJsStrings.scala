package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.aesAsmMod.AESMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asmcryptoJsStrings {
  
  @scala.inline
  def CBC: CBC = "CBC".asInstanceOf[CBC]
  
  @scala.inline
  def CCM: CCM = "CCM".asInstanceOf[CCM]
  
  @scala.inline
  def CFB: CFB = "CFB".asInstanceOf[CFB]
  
  @scala.inline
  def CTR: CTR = "CTR".asInstanceOf[CTR]
  
  @scala.inline
  def ECB: ECB = "ECB".asInstanceOf[ECB]
  
  @scala.inline
  def OFB: OFB = "OFB".asInstanceOf[OFB]
  
  @js.native
  sealed trait CBC extends AESMode
  
  @js.native
  sealed trait CCM extends AESMode
  
  @js.native
  sealed trait CFB extends AESMode
  
  @js.native
  sealed trait CTR extends AESMode
  
  @js.native
  sealed trait ECB extends AESMode
  
  @js.native
  sealed trait OFB extends AESMode
}
