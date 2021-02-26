package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.SelectionChanged event.
  */
@js.native
trait ASPxClientVerticalGridSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean = js.native
  
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
  
  /**
    * Gets whether the record has been selected.
    */
  var isSelected: Boolean = js.native
  
  /**
    * Gets the visible index of the record whose selected state has been changed.
    */
  var visibleIndex: Double = js.native
}
object ASPxClientVerticalGridSelectionEventArgs {
  
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientVerticalGridSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage.asInstanceOf[js.Any], isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridSelectionEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridSelectionEventArgsMutableBuilder[Self <: ASPxClientVerticalGridSelectionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAllRecordsOnPage(value: Boolean): Self = StObject.set(x, "isAllRecordsOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
