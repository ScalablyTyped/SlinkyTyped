package typingsSlinky.base32Encode

import typingsSlinky.base32Encode.mod.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base32EncodeStrings {
  
  @scala.inline
  def Crockford: Crockford = "Crockford".asInstanceOf[Crockford]
  
  @scala.inline
  def RFC3548: RFC3548 = "RFC3548".asInstanceOf[RFC3548]
  
  @scala.inline
  def RFC4648: RFC4648 = "RFC4648".asInstanceOf[RFC4648]
  
  @scala.inline
  def `RFC4648-HEX`: `RFC4648-HEX` = "RFC4648-HEX".asInstanceOf[`RFC4648-HEX`]
  
  @js.native
  sealed trait Crockford extends Variant
  
  @js.native
  sealed trait RFC3548 extends Variant
  
  @js.native
  sealed trait RFC4648 extends Variant
  
  @js.native
  sealed trait `RFC4648-HEX` extends Variant
}
