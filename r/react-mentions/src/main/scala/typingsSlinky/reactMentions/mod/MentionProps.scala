package typingsSlinky.reactMentions.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionProps extends js.Object {
  var appendSpaceOnAdd: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.Array[SuggestionDataItem] | DataFunc = js.native
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var markup: js.UndefOr[String] = js.native
  var onAdd: js.UndefOr[js.Function2[/* id */ String | Double, /* display */ String, Unit]] = js.native
  var regex: js.UndefOr[js.RegExp] = js.native
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ String, 
      /* highlightedDisplay */ TagMod[Any], 
      /* index */ Double, 
      /* focused */ Boolean, 
      TagMod[Any]
    ]
  ] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var trigger: String | js.RegExp = js.native
}

object MentionProps {
  @scala.inline
  def apply(data: js.Array[SuggestionDataItem] | DataFunc, trigger: String | js.RegExp): MentionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionProps]
  }
  @scala.inline
  implicit class MentionPropsOps[Self <: MentionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFunction2(
      value: (/* query */ String, /* callback */ js.Function1[/* data */ js.Array[SuggestionDataItem], Unit]) => Unit | js.Array[SuggestionDataItem]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[SuggestionDataItem] | DataFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendSpaceOnAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSpaceOnAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendSpaceOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendSpaceOnAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTransform(value: (/* id */ String, /* display */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTransform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisplayTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: (/* id */ String | Double, /* display */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuggestion(
      value: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ TagMod[Any], /* index */ Double, /* focused */ Boolean) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestion")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRenderSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

