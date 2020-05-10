package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroupValueMetadata extends js.Object {
  /** True if the data corresponding to the value is collapsed. */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The calculated value the metadata corresponds to.
    * (Note that formulaValue is not valid,
    * because the values will be calculated.)
    */
  var value: js.UndefOr[ExtendedValue] = js.native
}

object PivotGroupValueMetadata {
  @scala.inline
  def apply(): PivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupValueMetadata]
  }
  @scala.inline
  implicit class PivotGroupValueMetadataOps[Self <: PivotGroupValueMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ExtendedValue): Self = {
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

