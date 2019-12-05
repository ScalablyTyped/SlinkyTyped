package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.inputMod.InputOverrides
import typingsSlinky.baseui.inputMod.InputProps
import typingsSlinky.baseui.inputMod.StatefulContainerProps
import typingsSlinky.baseui.paymentDashCardMod.PaymentCardProps
import typingsSlinky.baseui.paymentDashCardMod.StatefulPaymentCardProps
import typingsSlinky.cardDashValidator.Anon_MinLength
import typingsSlinky.cardDashValidator.Anon_Month
import typingsSlinky.cardDashValidator.cardDashValidatorMod.validExpirationDate
import typingsSlinky.cardDashValidator.cardDashValidatorMod.validExpirationMonth
import typingsSlinky.cardDashValidator.cardDashValidatorMod.validExpirationYear
import typingsSlinky.cardDashValidator.cardDashValidatorMod.validNumber
import typingsSlinky.react.reactMod.Component
import typingsSlinky.styletronDashReact.styletronDashReactMod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", JSImport.Namespace)
@js.native
object paymentDashCardMod extends js.Object {
  @js.native
  class PaymentCard ()
    extends Component[PaymentCardProps, js.Object, js.Any]
  
  val SIZE: typingsSlinky.baseui.inputMod.SIZE = js.native
  val StatefulContainer: ReactComponentClass[StatefulContainerProps] = js.native
  val StatefulPaymentCard: ReactComponentClass[StatefulPaymentCardProps] = js.native
  val StyledIconWrapper: StyletronComponent[js.Any] = js.native
  @js.native
  object valid extends js.Object {
    def cvv(value: String): typingsSlinky.cardDashValidator.cardDashValidatorMod.valid = js.native
    def cvv(value: String, maxLength: Double): typingsSlinky.cardDashValidator.cardDashValidatorMod.valid = js.native
    def expirationDate(value: String): validExpirationDate = js.native
    def expirationDate(value: Anon_Month): validExpirationDate = js.native
    def expirationMonth(value: String): validExpirationMonth = js.native
    def expirationYear(value: String): validExpirationYear = js.native
    def number(value: String): validNumber = js.native
    def postalCode(value: String): typingsSlinky.cardDashValidator.cardDashValidatorMod.valid = js.native
    def postalCode(value: String, options: Anon_MinLength): typingsSlinky.cardDashValidator.cardDashValidatorMod.valid = js.native
  }
  
  type PaymentCardOverrides = InputOverrides with Anon_IconWrapper
  type PaymentCardProps = InputProps with Anon_Overrides
  type StatefulPaymentCardProps = InputProps with StatefulContainerProps with Anon_Overrides
}

