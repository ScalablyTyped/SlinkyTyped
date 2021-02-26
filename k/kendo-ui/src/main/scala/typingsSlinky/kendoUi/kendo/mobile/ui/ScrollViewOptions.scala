package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollViewOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var bounceVelocityThreshold: js.UndefOr[Double] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ ScrollViewChangeEvent, Unit]] = js.native
  
  var changing: js.UndefOr[js.Function1[/* e */ ScrollViewChangingEvent, Unit]] = js.native
  
  var contentHeight: js.UndefOr[Double | String] = js.native
  
  var dataSource: js.UndefOr[DataSource | js.Any] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var emptyTemplate: js.UndefOr[String] = js.native
  
  var enablePager: js.UndefOr[Boolean] = js.native
  
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var refresh: js.UndefOr[js.Function1[/* e */ ScrollViewRefreshEvent, Unit]] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var velocityThreshold: js.UndefOr[Double] = js.native
}
object ScrollViewOptions {
  
  @scala.inline
  def apply(): ScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewOptions]
  }
  
  @scala.inline
  implicit class ScrollViewOptionsMutableBuilder[Self <: ScrollViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setBounceVelocityThreshold(value: Double): Self = StObject.set(x, "bounceVelocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceVelocityThresholdUndefined: Self = StObject.set(x, "bounceVelocityThreshold", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ScrollViewChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChanging(value: /* e */ ScrollViewChangingEvent => Unit): Self = StObject.set(x, "changing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangingUndefined: Self = StObject.set(x, "changing", js.undefined)
    
    @scala.inline
    def setContentHeight(value: Double | String): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEmptyTemplate(value: String): Self = StObject.set(x, "emptyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTemplateUndefined: Self = StObject.set(x, "emptyTemplate", js.undefined)
    
    @scala.inline
    def setEnablePager(value: Boolean): Self = StObject.set(x, "enablePager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePagerUndefined: Self = StObject.set(x, "enablePager", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setRefresh(value: /* e */ ScrollViewRefreshEvent => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVelocityThreshold(value: Double): Self = StObject.set(x, "velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityThresholdUndefined: Self = StObject.set(x, "velocityThreshold", js.undefined)
  }
}
