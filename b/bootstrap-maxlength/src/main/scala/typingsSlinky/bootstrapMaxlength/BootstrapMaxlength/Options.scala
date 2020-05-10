package typingsSlinky.bootstrapMaxlength.BootstrapMaxlength

import typingsSlinky.bootstrapMaxlength.JQuery
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Will allow the input to be over the customMaxLength. Useful in soft max situations.
    * @default false
    */
  var allowOverMax: js.UndefOr[Boolean] = js.native
  /**
    * If true the threshold will be ignored and the remaining length indication will be always showing up while typing or on focus on the input
    * @default false
    */
  var alwaysShow: js.UndefOr[Boolean] = js.native
  /**
    * Appends the maxlength indicator badge to the parent of the input rather than to the body.
    * @default false
    */
  var appendToParent: js.UndefOr[Boolean] = js.native
  /**
    * Allows a custom attribute to display indicator without triggering native maxlength behaviour.
    * Ignored if value greater than a native maxlength attribute.
    * 'overmax' class gets added when exceeded to allow user to implement form validation.
    * @default null (use the maxlength attribute and browser functionality)
    */
  var customMaxAttribute: js.UndefOr[String] = js.native
  /**
    * It's the class the element gets when the limit is reached. Default is "label label-important label-danger" (to support Bootstrap 2 and 3).
    * @default 'label label-important label-danger'
    */
  var limitReachedClass: js.UndefOr[String] = js.native
  /**
    * An alternative way to provide the message text.
    * String example: 'You have typed %charsTyped% chars, %charsRemaining% of %charsTotal% remaining'.
    * %charsTyped%, %charsRemaining% and %charsTotal% will be replaced by the actual values. This overrides the options separator, preText, postText and showMaxLength.
    * Alternatively you may supply a function that the current text and max length and returns the string to be displayed.
    * Function example: function(currentText, maxLength) { return '' + Math.ceil(currentText.length / 160) + ' SMS Message(s)'; }
    * @default null
    */
  var message: js.UndefOr[
    String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])
  ] = js.native
  /**
    * Is a string, define where to output the counter.
    * Options:  bottom, left, top, right, bottom-right, top-right, top-left, bottom-left and centered-right
    * @default 'bottom'
    */
  var placement: js.UndefOr[
    String | PlacementOptions | (js.Function3[
      /* currentInput */ JQuery, 
      /* maxLengthIndicator */ JQuery, 
      /* currentInputPosition */ PositionParam, 
      Unit
    ])
  ] = js.native
  /**
    * Is a string outputted after the indicator.
    * @default ''
    */
  var postText: js.UndefOr[String] = js.native
  /**
    * Is a string of text that can be outputted in front of the indicator.
    * @default ''
    */
  var preText: js.UndefOr[String] = js.native
  /**
    * Represents the separator between the number of typed chars and total number of available chars.
    * @default ' / '
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * If false, will display just the remaining length, e.g. will display remaining lenght instead of number of typed characters.
    * @default true
    */
  var showCharsTyped: js.UndefOr[Boolean] = js.native
  /**
    * If false, will display just the number of typed characters, e.g. will not display the max length.
    * @default true
    */
  var showMaxLength: js.UndefOr[Boolean] = js.native
  /**
    * Shows the badge as soon as it is added to the page, similar to alwaysShow
    * @default false
    */
  var showOnReady: js.UndefOr[Boolean] = js.native
  /**
    * This is a number indicating how many chars are left to start displaying the indications
    * @default 10
    */
  var threshold: js.UndefOr[Number] = js.native
  /**
    * Count linebreak as 2 characters to match IE/Chrome textarea validation. As well as DB storage.
    * @default true
    */
  var twoCharLinebreak: js.UndefOr[Boolean] = js.native
  /**
    * If true the input will count using utf8 bytesize/encoding. For example: the '¢' character is counted as two characters.
    * @default false
    */
  var utf8: js.UndefOr[Boolean] = js.native
  /**
    * If the browser doesn't support the maxlength attribute, attempt to type more than
    * the indicated chars, will be prevented.
    * @default false
    */
  var validate: js.UndefOr[Boolean] = js.native
  /**
    * It's the class of the element with the indicator. By default is the bootstrap "label label-success" but can be changed to anything you'd like.
    * @default 'label label-success'
    */
  var warningClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverMax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverMax")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendToParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendToParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToParent")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMaxAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMaxAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMaxAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMaxAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitReachedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitReachedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitReachedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitReachedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFunction2(value: (/* currentText */ String, /* maxLength */ Number) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMessage(value: String | (js.Function2[/* currentText */ String, /* maxLength */ Number, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementFunction3(
      value: (/* currentInput */ JQuery, /* maxLengthIndicator */ JQuery, /* currentInputPosition */ PositionParam) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPlacement(
      value: String | PlacementOptions | (js.Function3[
          /* currentInput */ JQuery, 
          /* maxLengthIndicator */ JQuery, 
          /* currentInputPosition */ PositionParam, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPostText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postText")(js.undefined)
        ret
    }
    @scala.inline
    def withPreText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preText")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCharsTyped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCharsTyped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCharsTyped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCharsTyped")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaxLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnReady")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTwoCharLinebreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoCharLinebreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwoCharLinebreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoCharLinebreak")(js.undefined)
        ret
    }
    @scala.inline
    def withUtf8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtf8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningClass")(js.undefined)
        ret
    }
  }
  
}

