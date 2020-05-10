package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfiguratorMessagesFieldMenuOperators extends js.Object {
  var contains: js.UndefOr[String] = js.native
  var doesnotcontain: js.UndefOr[String] = js.native
  var endswith: js.UndefOr[String] = js.native
  @JSName("eq")
  var eq_FPivotConfiguratorMessagesFieldMenuOperators: js.UndefOr[String] = js.native
  var neq: js.UndefOr[String] = js.native
  var startswith: js.UndefOr[String] = js.native
}

object PivotConfiguratorMessagesFieldMenuOperators {
  @scala.inline
  def apply(): PivotConfiguratorMessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorMessagesFieldMenuOperators]
  }
  @scala.inline
  implicit class PivotConfiguratorMessagesFieldMenuOperatorsOps[Self <: PivotConfiguratorMessagesFieldMenuOperators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withDoesnotcontain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesnotcontain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoesnotcontain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesnotcontain")(js.undefined)
        ret
    }
    @scala.inline
    def withEndswith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endswith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndswith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endswith")(js.undefined)
        ret
    }
    @scala.inline
    def withEq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.undefined)
        ret
    }
    @scala.inline
    def withNeq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.undefined)
        ret
    }
    @scala.inline
    def withStartswith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startswith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartswith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startswith")(js.undefined)
        ret
    }
  }
  
}

