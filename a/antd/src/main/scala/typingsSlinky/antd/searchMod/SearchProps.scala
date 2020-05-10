package typingsSlinky.antd.searchMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProps extends InputProps {
  var enterButton: js.UndefOr[TagMod[Any]] = js.native
  var inputPrefixCls: js.UndefOr[String] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onSearch: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[
        ChangeEvent[HTMLInputElement] | SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLInputElement]
      ], 
      Unit
    ]
  ] = js.native
}

object SearchProps {
  @scala.inline
  def apply(): SearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps]
  }
  @scala.inline
  implicit class SearchPropsOps[Self <: SearchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnterButton(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterButton")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(
      value: (/* value */ String, /* event */ js.UndefOr[
          ChangeEvent[HTMLInputElement] | SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLInputElement]
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
  }
  
}

