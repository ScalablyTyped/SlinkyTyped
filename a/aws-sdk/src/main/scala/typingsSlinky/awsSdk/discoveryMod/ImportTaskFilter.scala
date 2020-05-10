package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTaskFilter extends js.Object {
  /**
    * The name, status, or import task ID for a specific import task.
    */
  var name: js.UndefOr[ImportTaskFilterName] = js.native
  /**
    * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
    */
  var values: js.UndefOr[ImportTaskFilterValueList] = js.native
}

object ImportTaskFilter {
  @scala.inline
  def apply(): ImportTaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskFilter]
  }
  @scala.inline
  implicit class ImportTaskFilterOps[Self <: ImportTaskFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ImportTaskFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: ImportTaskFilterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

