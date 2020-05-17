package typingsSlinky.grommet.textInputMod

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.EnterSelect
import typingsSlinky.grommet.anon.LabelValue
import typingsSlinky.grommet.anon.Left
import typingsSlinky.grommet.anon.Suggestion
import typingsSlinky.grommet.dropMod.DropProps
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[Left] = js.native
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
  var dropProps: js.UndefOr[DropProps] = js.native
  var dropTarget: js.UndefOr[js.Object] = js.native
  var focusIndicator: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactElement] = js.native
  var id: js.UndefOr[String] = js.native
  var messages: js.UndefOr[EnterSelect] = js.native
  var name: js.UndefOr[String] = js.native
  var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.native
  var onSuggestionsClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onSuggestionsOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var placeholder: js.UndefOr[PlaceHolderType] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object TextInputProps {
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  @scala.inline
  implicit class TextInputPropsOps[Self <: TextInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropAlign(value: Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDropProps(value: DropProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDropTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: EnterSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* x */ Suggestion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestionsClose(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestionsClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuggestionsOpen(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuggestionsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuggestionsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: PlaceHolderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large | xlarge | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[LabelValue | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
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
  }
  
}

