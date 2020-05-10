package typingsSlinky.jsforce.bulkMod

import typingsSlinky.jsforce.jsforceStrings.Parallel
import typingsSlinky.jsforce.jsforceStrings.Serial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkOptions extends js.Object {
  var concurrencyMode: js.UndefOr[Serial | Parallel] = js.native
  var extIdField: String = js.native
}

object BulkOptions {
  @scala.inline
  def apply(extIdField: String): BulkOptions = {
    val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkOptions]
  }
  @scala.inline
  implicit class BulkOptionsOps[Self <: BulkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extIdField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrencyMode(value: Serial | Parallel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyMode")(js.undefined)
        ret
    }
  }
  
}

