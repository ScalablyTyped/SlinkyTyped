package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TableViewCtlSaveInfo...
  */
@js.native
trait ITableViewCtlSaveInfo extends StObject {
  
  /**
    * Internal view mode.
    */
  var qInternalView: ITableViewSaveInfo = js.native
  
  /**
    * Source view mode.
    */
  var qSourceView: ITableViewSaveInfo = js.native
}
object ITableViewCtlSaveInfo {
  
  @scala.inline
  def apply(qInternalView: ITableViewSaveInfo, qSourceView: ITableViewSaveInfo): ITableViewCtlSaveInfo = {
    val __obj = js.Dynamic.literal(qInternalView = qInternalView.asInstanceOf[js.Any], qSourceView = qSourceView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewCtlSaveInfo]
  }
  
  @scala.inline
  implicit class ITableViewCtlSaveInfoMutableBuilder[Self <: ITableViewCtlSaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInternalView(value: ITableViewSaveInfo): Self = StObject.set(x, "qInternalView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSourceView(value: ITableViewSaveInfo): Self = StObject.set(x, "qSourceView", value.asInstanceOf[js.Any])
  }
}
