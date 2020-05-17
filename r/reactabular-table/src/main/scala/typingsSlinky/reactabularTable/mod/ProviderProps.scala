package typingsSlinky.reactabularTable.mod

import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var columns: js.Array[Column] = js.native
  var renderers: js.UndefOr[Renderers] = js.native
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object ProviderProps {
  @scala.inline
  def apply(columns: js.Array[Column]): ProviderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
  @scala.inline
  implicit class ProviderPropsOps[Self <: ProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
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
    def withRenderers(value: Renderers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: PartialCSSStyleDeclaratio): Self = {
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

