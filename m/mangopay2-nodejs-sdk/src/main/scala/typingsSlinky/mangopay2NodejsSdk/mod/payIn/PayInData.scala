package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mod.payIn.CardDirectPayInData
  - typingsSlinky.mangopay2NodejsSdk.mod.payIn.CardPreAuthorizedPayInData
  - typingsSlinky.mangopay2NodejsSdk.mod.payIn.CardWebPayInData
  - typingsSlinky.mangopay2NodejsSdk.mod.payIn.BankWireDirectPayInData
*/
trait PayInData extends js.Object

object PayInData {
  @scala.inline
  implicit def apply(value: BankWireDirectPayInData): PayInData = value.asInstanceOf[PayInData]
  @scala.inline
  implicit def apply(value: CardDirectPayInData): PayInData = value.asInstanceOf[PayInData]
  @scala.inline
  implicit def apply(value: CardPreAuthorizedPayInData): PayInData = value.asInstanceOf[PayInData]
  @scala.inline
  implicit def apply(value: CardWebPayInData): PayInData = value.asInstanceOf[PayInData]
}

