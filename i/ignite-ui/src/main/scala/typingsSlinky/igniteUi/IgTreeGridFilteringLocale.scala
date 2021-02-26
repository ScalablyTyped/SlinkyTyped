package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridFilteringLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Template that is used when filtering is applied and paging is enabled and user goes to another page. It takes precedence over the pagerRecordsLabelTemplate(option from igTreeGridPaging). If it is set to null then it is taken option from igTreeGridPaging.
    * Supported options:
    * ${currentPageMatches} (filtering)
    * ${totalMatches} (filtering)
    * ${startRecord} (paging)
    * ${endRecord} (paging)
    * ${recordCount} (paging)
    *
    */
  var filterSummaryInPagerTemplate: js.UndefOr[String] = js.native
}
object IgTreeGridFilteringLocale {
  
  @scala.inline
  def apply(): IgTreeGridFilteringLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridFilteringLocale]
  }
  
  @scala.inline
  implicit class IgTreeGridFilteringLocaleMutableBuilder[Self <: IgTreeGridFilteringLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterSummaryInPagerTemplate(value: String): Self = StObject.set(x, "filterSummaryInPagerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSummaryInPagerTemplateUndefined: Self = StObject.set(x, "filterSummaryInPagerTemplate", js.undefined)
  }
}
