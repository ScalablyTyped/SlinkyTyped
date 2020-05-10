package typingsSlinky.antdMobile.listPropsTypeMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPropsType extends js.Object {
  var renderFooter: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.native
  var renderHeader: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.native
}

object ListPropsType {
  @scala.inline
  def apply(): ListPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropsType]
  }
  @scala.inline
  implicit class ListPropsTypeOps[Self <: ListPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderFooterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderFooterFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderFooter(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHeaderFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderHeader(value: js.Function0[TagMod[Any]] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
        ret
    }
  }
  
}

