package typingsSlinky.bnJs

import typingsSlinky.bnJs.mod.Endianness
import typingsSlinky.bnJs.mod.IPrimeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bnJsStrings {
  
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def k256: k256 = "k256".asInstanceOf[k256]
  
  @scala.inline
  def le: le = "le".asInstanceOf[le]
  
  @scala.inline
  def p192: p192 = "p192".asInstanceOf[p192]
  
  @scala.inline
  def p224: p224 = "p224".asInstanceOf[p224]
  
  @scala.inline
  def p25519: p25519 = "p25519".asInstanceOf[p25519]
  
  @js.native
  sealed trait be extends Endianness
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait k256 extends IPrimeName
  
  @js.native
  sealed trait le extends Endianness
  
  @js.native
  sealed trait p192 extends IPrimeName
  
  @js.native
  sealed trait p224 extends IPrimeName
  
  @js.native
  sealed trait p25519 extends IPrimeName
}
