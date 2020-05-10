package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVBoxLayout extends IBox {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[Boolean] = js.native
}

object IVBoxLayout {
  @scala.inline
  def apply(): IVBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVBoxLayout]
  }
  @scala.inline
  implicit class IVBoxLayoutOps[Self <: IVBoxLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignRoundingMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignRoundingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignRoundingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignRoundingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainAlign")(js.undefined)
        ret
    }
  }
  
}

