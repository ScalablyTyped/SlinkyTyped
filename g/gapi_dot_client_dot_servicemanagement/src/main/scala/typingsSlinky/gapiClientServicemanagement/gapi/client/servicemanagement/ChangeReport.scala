package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeReport extends js.Object {
  /**
    * List of changes between two service configurations.
    * The changes will be alphabetically sorted based on the identifier
    * of each change.
    * A ConfigChange identifier is a dot separated path to the configuration.
    * Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
    */
  var configChanges: js.UndefOr[js.Array[ConfigChange]] = js.native
}

object ChangeReport {
  @scala.inline
  def apply(): ChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeReport]
  }
  @scala.inline
  implicit class ChangeReportOps[Self <: ChangeReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigChanges(value: js.Array[ConfigChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configChanges")(js.undefined)
        ret
    }
  }
  
}

