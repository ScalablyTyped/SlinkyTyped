package typingsSlinky.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowHintOptions extends js.Object {
  var alignWithWord: js.UndefOr[Boolean] = js.native
  var closeCharacters: js.UndefOr[js.RegExp] = js.native
  var closeOnUnfocus: js.UndefOr[Boolean] = js.native
  var completeOnSingleClick: js.UndefOr[Boolean] = js.native
  var completeSingle: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[HTMLElement | Null] = js.native
  var customKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.native
  var extraKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.native
  var hint: HintFunction | AsyncHintFunction = js.native
}

object ShowHintOptions {
  @scala.inline
  def apply(hint: HintFunction | AsyncHintFunction): ShowHintOptions = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHintOptions]
  }
  @scala.inline
  implicit class ShowHintOptionsOps[Self <: ShowHintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHintFunction1(value: /* cm */ Editor => Hints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHint(value: HintFunction | AsyncHintFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignWithWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignWithWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignWithWord")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseCharacters(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnUnfocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnUnfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnUnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnUnfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteOnSingleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeOnSingleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteOnSingleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeOnSingleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withCustomKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomKeysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeys")(null)
        ret
    }
    @scala.inline
    def withExtraKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraKeysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraKeys")(null)
        ret
    }
  }
  
}

