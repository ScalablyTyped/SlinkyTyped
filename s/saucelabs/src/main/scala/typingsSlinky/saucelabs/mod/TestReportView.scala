package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saucelabs.saucelabsStrings.ABORTED
import typingsSlinky.saucelabs.saucelabsStrings.CANCELED
import typingsSlinky.saucelabs.saucelabsStrings.FAILURE
import typingsSlinky.saucelabs.saucelabsStrings.SKIPPED
import typingsSlinky.saucelabs.saucelabsStrings.SUCCESS
import typingsSlinky.saucelabs.saucelabsStrings.UNKNOWN
import typingsSlinky.saucelabs.saucelabsStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestReportView
  extends /* key */ StringDictionary[js.Any] {
  
  var reportId: js.UndefOr[Id] = js.native
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.native
}
object TestReportView {
  
  @scala.inline
  def apply(): TestReportView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportView]
  }
  
  @scala.inline
  implicit class TestReportViewOps[Self <: TestReportView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReportId(value: Id): Self = this.set("reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportId: Self = this.set("reportId", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
