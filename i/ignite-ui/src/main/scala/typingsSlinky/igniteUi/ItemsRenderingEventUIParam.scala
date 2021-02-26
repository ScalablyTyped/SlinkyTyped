package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsRenderingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the [$.ig.DataSource](ig.datasource) combo is databound to.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ItemsRenderingEventUIParam {
  
  @scala.inline
  def apply(): ItemsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class ItemsRenderingEventUIParamMutableBuilder[Self <: ItemsRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
