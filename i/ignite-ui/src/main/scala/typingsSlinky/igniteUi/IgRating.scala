package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRating
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets custom css votes.
  	 * That object should be 2-dimentional array or object with indexes, where every item of first level represents settings for a vote at that index.
  	 * Second level of an item is settings for a vote and it should contain classes for a specific state of vote.
  	 * Item at index [0] on second level is used for css class of vote in normal state.
  	 * Item at index [1] on second level is used for css class of vote in selected state.
  	 * Item at index [2] on second level is used for css class of vote in hover state.
  	 * Examples:
  	 * { 1: { 0: "normalCss", 1: "selectedCss", 2: "hoverCss"} }
  	 * will customize only second vote with [normalCss](ui.igrating#theming:ui-igrating ui-state-default ui-widget-content) for normal state, [hoverCss](ui.igrating#theming:ui-igrating-hover ui-state-hover) for hover state and [selectedCss](ui.igrating#theming:ui-igrating-voteselected) for selected state.
  	 * [[null, 's1', 'h1'], [null, 's2', 'h2'], [null, 's3', 'h3']]
  	 * will customize selected and hover states for first 3 votes with classes h# and s#.
  	 *
  	 */
  var cssVotes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets if igRating can have focus. Change of that option is not supported after igRating was created.
  	 * Value true: can get focus and process key events.
  	 * Value false: cannot get focus.
  	 *
  	 */
  var focusable: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired before hover value is changed.
  	 * If the application returns false, then the action is canceled and the value remains unchanged.
  	 */
  var hoverChange: js.UndefOr[HoverChangeEvent] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets precision. Precision of value and valueHover.
  	 *
  	 *
  	 * Valid values:
  	 * "exact" Value corresponds location of mouse.
  	 * "half" Value is rounded to the half of vote.
  	 * "whole" Value is rounded to the number of votes.
  	 */
  var precision: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets part of vote-size, which is considered as zero value.
  	 * It has effect only when precision is set to "half" or "whole".
  	 * If user clicks between edge of the first vote and (sizeOfVote * precisionZeroVote), then value is set to 0.
  	 * Same is applied for mouseover as well.
  	 *
  	 */
  var precisionZeroVote: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets/Sets number of decimal places used to round value and value-hover.
  	 * Negative value will disable that option and value will not be rounded.
  	 * Notes:
  	 * If precision is "whole" or "half" and roundedDecimalPlaces is set in range of 0..2, then 3 is used.
  	 * If valueAsPercent is enabled and roundedDecimalPlaces is set to 0, then 1 is used.
  	 * If it is larger than 15, then 15 is used.
  	 *
  	 */
  var roundedDecimalPlaces: js.UndefOr[Double] = js.native
  /**
  	 * Gets the direction of selected and hovered votes. Change of that option is not supported after igRating was created.
  	 * Value true: from left to right or from top to bottom.
  	 * Value false: from right to left or from bottom to left.
  	 *
  	 */
  var swapDirection: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets selector for css classes.
  	 * That option allows replacing all default css styles by custom values.
  	 * Application should provide css classes for all members defined in the css options with "theme" selector.
  	 *
  	 */
  var theme: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets object which contains options supported by igValidator.
  	 * Note that for onblur validation depends on the [focusable](ui.igrating#options:focusable) option.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets value (selected votes or percent). If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the value is used as number of selected votes or as a percent of the votes.
  	 *
  	 */
  var value: js.UndefOr[Double | String] = js.native
  /**
  	 * Gets/Sets percent or vote number to measure value and value-hover.
  	 * Value true: value is measured as percent (from 0 to 1).
  	 * Value false: value is measured in number of voted (from 0 to voteCount)
  	 *
  	 */
  var valueAsPercent: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired before (selected) value is changed.
  	 * If the application returns false, then the action is canceled and the value remains unchanged.
  	 */
  var valueChange: js.UndefOr[ValueChangeEvent] = js.native
  /**
  	 * Gets/Sets value-hover (hovered votes or percent of hovered votes). The default is same as value. If the value is of type string, it should be suitable for parsing to number. According to [valueAsPercent](ui.igrating#options:valueAsPercent) options the valueHover is used as number of hovered votes or as a percent of the hovered votes.
  	 *
  	 */
  var valueHover: js.UndefOr[Double | String] = js.native
  /**
  	 * Gets a vertical or horizontal orientation for the votes.
  	 * Change of that option is not supported after igRating was created.
  	 *
  	 */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets number of votes.
  	 *
  	 */
  var voteCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets custom height of a vote in pixels. In case of 0 the run time style value is used.
  	 *
  	 */
  var voteHeight: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets custom width of a vote in pixels. In case of 0 the run time style value is used.
  	 *
  	 */
  var voteWidth: js.UndefOr[Double] = js.native
}

object IgRating {
  @scala.inline
  def apply(): IgRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRating]
  }
  @scala.inline
  implicit class IgRatingOps[Self <: IgRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssVotes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssVotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssVotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssVotes")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverChange(value: (/* event */ Event, /* ui */ HoverChangeEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHoverChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withPrecision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecisionZeroVote(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precisionZeroVote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecisionZeroVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precisionZeroVote")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundedDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedDecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundedDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedDecimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAsPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAsPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withValueChange(value: (/* event */ Event, /* ui */ ValueChangeEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValueHover(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHover")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVoteCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVoteHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoteHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVoteWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoteWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voteWidth")(js.undefined)
        ret
    }
  }
  
}

