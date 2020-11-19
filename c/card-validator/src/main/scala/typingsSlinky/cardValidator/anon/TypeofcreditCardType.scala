package typingsSlinky.cardValidator.anon

import typingsSlinky.creditCardType.anon.PartialCreditCardType
import typingsSlinky.creditCardType.typesMod.CreditCardType
import typingsSlinky.creditCardType.typesMod.CreditCardTypeCardBrandId
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcreditCardType extends js.Object {
  
  def addCard(config: CreditCardType): Unit = js.native
  @JSName("addCard")
  var addCard_Original: js.Function1[/* config */ CreditCardType, Unit] = js.native
  
  def changeOrder(name: String, position: Double): Unit = js.native
  @JSName("changeOrder")
  var changeOrder_Original: js.Function2[/* name */ String, /* position */ Double, Unit] = js.native
  
  def getTypeInfo(cardType: String): CreditCardType = js.native
  @JSName("getTypeInfo")
  var getTypeInfo_Original: js.Function1[/* cardType */ String, CreditCardType] = js.native
  
  def removeCard(name: String): Unit = js.native
  @JSName("removeCard")
  var removeCard_Original: js.Function1[/* name */ String, Unit] = js.native
  
  def resetModifications(): Unit = js.native
  @JSName("resetModifications")
  var resetModifications_Original: js.Function0[Unit] = js.native
  
  var types: Record[String, CreditCardTypeCardBrandId] = js.native
  
  def updateCard(cardType: String, updates: PartialCreditCardType): Unit = js.native
  @JSName("updateCard")
  var updateCard_Original: js.Function2[/* cardType */ String, /* updates */ PartialCreditCardType, Unit] = js.native
}
