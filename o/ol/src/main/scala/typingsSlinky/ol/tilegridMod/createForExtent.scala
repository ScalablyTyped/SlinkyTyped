package typingsSlinky.ol.tilegridMod

import typingsSlinky.ol.cornerMod.Corner
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/tilegrid", "createForExtent")
@js.native
object createForExtent extends js.Object {
  
  def apply(extent: Extent): default = js.native
  def apply(
    extent: Extent,
    opt_maxZoom: js.UndefOr[scala.Nothing],
    opt_tileSize: js.UndefOr[scala.Nothing],
    opt_corner: Corner
  ): default = js.native
  def apply(extent: Extent, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Double): default = js.native
  def apply(extent: Extent, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Double, opt_corner: Corner): default = js.native
  def apply(extent: Extent, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Size): default = js.native
  def apply(extent: Extent, opt_maxZoom: js.UndefOr[scala.Nothing], opt_tileSize: Size, opt_corner: Corner): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: js.UndefOr[scala.Nothing], opt_corner: Corner): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size): default = js.native
  def apply(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = js.native
}
