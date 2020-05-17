package typingsSlinky.reactCreditCards.mod

import typingsSlinky.reactCreditCards.anon.Name
import typingsSlinky.reactCreditCards.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCreditCardProps extends js.Object {
  var acceptedCards: js.UndefOr[js.Array[String]] = js.native
  var callback: js.UndefOr[js.Function2[/* type */ CallbackArgument, /* isValid */ Boolean, Unit]] = js.native
  var cvc: String | Double = js.native
  var expiry: String | Double = js.native
  var focused: js.UndefOr[Focused] = js.native
  var issuer: js.UndefOr[String] = js.native
  var locale: js.UndefOr[Valid] = js.native
  var name: String = js.native
  var number: String | Double = js.native
  var placeholders: js.UndefOr[Name] = js.native
  var preview: js.UndefOr[Boolean] = js.native
}

object ReactCreditCardProps {
  @scala.inline
  def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): ReactCreditCardProps = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCreditCardProps]
  }
  @scala.inline
  implicit class ReactCreditCardPropsOps[Self <: ReactCreditCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCvc(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiry(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptedCards(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedCards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedCards")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: Focused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Valid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholders(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholders")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
  }
  
}

