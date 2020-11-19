package typingsSlinky.reactCreditCards

import typingsSlinky.reactCreditCards.mod.Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactCreditCardsStrings {
  
  @scala.inline
  def cvc: cvc = "cvc".asInstanceOf[cvc]
  
  @scala.inline
  def expiry: expiry = "expiry".asInstanceOf[expiry]
  
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait cvc extends Focused
  
  @js.native
  sealed trait expiry extends Focused
  
  @js.native
  sealed trait name extends Focused
  
  @js.native
  sealed trait number extends Focused
}
