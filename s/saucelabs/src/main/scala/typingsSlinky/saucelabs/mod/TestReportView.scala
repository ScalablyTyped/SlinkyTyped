package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saucelabs.saucelabsStrings.ABORTED
import typingsSlinky.saucelabs.saucelabsStrings.CANCELED
import typingsSlinky.saucelabs.saucelabsStrings.FAILURE
import typingsSlinky.saucelabs.saucelabsStrings.SKIPPED
import typingsSlinky.saucelabs.saucelabsStrings.SUCCESS
import typingsSlinky.saucelabs.saucelabsStrings.UNKNOWN
import typingsSlinky.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
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
  implicit class TestReportViewMutableBuilder[Self <: TestReportView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportId(value: Id): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
