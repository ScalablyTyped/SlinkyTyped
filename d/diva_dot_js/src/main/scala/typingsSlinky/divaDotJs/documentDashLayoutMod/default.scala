package typingsSlinky.divaDotJs.documentDashLayoutMod

import typingsSlinky.divaDotJs.Anon_X
import typingsSlinky.divaDotJs.interfacesMod.Dimensions
import typingsSlinky.divaDotJs.interfacesMod.Offset
import typingsSlinky.divaDotJs.interfacesMod.PageGroup
import typingsSlinky.divaDotJs.interfacesMod.PageInfo
import typingsSlinky.divaDotJs.interfacesMod.Region
import typingsSlinky.divaDotJs.interfacesMod.RendererConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js/document-layout", JSImport.Default)
@js.native
class default protected () extends DocumentLayout {
  def this(config: RendererConfig, zoomLevel: Double) = this()
  /* CompleteClass */
  override var dimensions: Dimensions = js.native
  /* CompleteClass */
  override var pageGroups: js.Array[PageGroup] = js.native
  /* CompleteClass */
  override def getPageDimensions(pageIndex: Double): Dimensions = js.native
  /* CompleteClass */
  override def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
  /* CompleteClass */
  override def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
  /* CompleteClass */
  override def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
  /* CompleteClass */
  override def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): Anon_X = js.native
}

