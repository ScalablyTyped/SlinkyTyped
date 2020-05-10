package typingsSlinky.flexmonster

import typingsSlinky.flexmonster.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValuesOnly extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  var slice: js.UndefOr[Slice] = js.native
  var `type`: js.UndefOr[String] = js.native
  var valuesOnly: js.UndefOr[Boolean] = js.native
  var withDrilldown: js.UndefOr[Boolean] = js.native
  var xAxisType: js.UndefOr[String] = js.native
}

object AnonValuesOnly {
  @scala.inline
  def apply(): AnonValuesOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonValuesOnly]
  }
  @scala.inline
  implicit class AnonValuesOnlyOps[Self <: AnonValuesOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrepareDataFunction(value: /* rawData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareDataFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepareDataFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareDataFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: Slice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withWithDrilldown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDrilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDrilldown")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisType")(js.undefined)
        ret
    }
  }
  
}

