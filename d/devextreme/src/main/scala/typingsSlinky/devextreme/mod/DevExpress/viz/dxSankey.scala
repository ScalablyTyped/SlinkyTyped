package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSankey extends BaseWidget {
  
  /** @name dxSankey.getAllLinks() */
  def getAllLinks(): js.Array[dxSankeyLink] = js.native
  
  /** @name dxSankey.getAllNodes() */
  def getAllNodes(): js.Array[dxSankeyNode] = js.native
  
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  
  /** @name dxSankey.hideTooltip() */
  def hideTooltip(): Unit = js.native
}
