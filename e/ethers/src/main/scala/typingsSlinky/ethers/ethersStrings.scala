package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.SupportedAlgorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ethersStrings {
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait call extends js.Object
  
  @js.native
  sealed trait sha256 extends SupportedAlgorithms
  
  @js.native
  sealed trait sha512 extends SupportedAlgorithms
  
  @js.native
  sealed trait transaction extends js.Object
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
}

