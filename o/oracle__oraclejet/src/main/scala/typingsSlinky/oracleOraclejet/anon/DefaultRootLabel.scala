package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRootLabel extends js.Object {
  var defaultRootLabel: js.UndefOr[String] = js.native
  var hierMenuBtnLabel: js.UndefOr[String] = js.native
  var previousIcon: js.UndefOr[String] = js.native
}

object DefaultRootLabel {
  @scala.inline
  def apply(): DefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRootLabel]
  }
  @scala.inline
  implicit class DefaultRootLabelOps[Self <: DefaultRootLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRootLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHierMenuBtnLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierMenuBtnLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierMenuBtnLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierMenuBtnLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIcon")(js.undefined)
        ret
    }
  }
  
}

