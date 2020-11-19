package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.jpg
import typingsSlinky.devextreme.devextremeStrings.png_
import typingsSlinky.devextreme.devextremeStrings.svg_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagram extends Widget {
  
  /** @name dxDiagram.export() */
  def export(): String = js.native
  
  @JSName("exportTo")
  def exportTo_jpg(format: jpg, callback: js.Function): Unit = js.native
  @JSName("exportTo")
  def exportTo_png(format: png_, callback: js.Function): Unit = js.native
  /** @name dxDiagram.exportTo(format, callback) */
  @JSName("exportTo")
  def exportTo_svg(format: svg_, callback: js.Function): Unit = js.native
  
  /** @name dxDiagram.getEdgeDataSource() */
  def getEdgeDataSource(): DataSource = js.native
  
  /** @name dxDiagram.getNodeDataSource() */
  def getNodeDataSource(): DataSource = js.native
  
  /** @name dxDiagram.import(data, updateExistingItemsOnly) */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
}
