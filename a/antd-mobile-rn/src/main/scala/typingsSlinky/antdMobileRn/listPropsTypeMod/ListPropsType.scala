package typingsSlinky.antdMobileRn.listPropsTypeMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.antdMobileRnBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPropsType extends js.Object {
  var children: js.UndefOr[`false` | ReactElement | js.Array[ReactElement]] = js.native
  var renderFooter: js.UndefOr[js.Function0[ReactComponentClass[_]] | String | ReactElement] = js.native
  var renderHeader: js.UndefOr[js.Function0[ReactComponentClass[_]] | String | ReactElement] = js.native
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: `false` | ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderFooterFunction0(value: () => ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderFooter(value: js.Function0[ReactComponentClass[_]] | String | ReactElement): Self = {
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
    def withRenderHeaderFunction0(value: () => ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderHeader(value: js.Function0[ReactComponentClass[_]] | String | ReactElement): Self = {
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

