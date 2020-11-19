package typingsSlinky.divaJs

import typingsSlinky.divaJs.anon.Cols
import typingsSlinky.divaJs.interfacesMod.Dimensions
import typingsSlinky.divaJs.interfacesMod.ManifestData
import typingsSlinky.divaJs.interfacesMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diva.js/image-manifest", JSImport.Namespace)
@js.native
object imageManifestMod extends js.Object {
  
  @js.native
  trait ImageManifest extends js.Object {
    
    def etPageImageTiles(pageIndex: Double, zoomLevel: Double, tileDimensions: Dimensions): Cols = js.native
    
    def getMaxPageDimensions(pageIndex: Double): Dimensions = js.native
    
    def getPageDimensionsAtZoomLevel(pageIndex: Double, zoomLevel: Double): Dimensions = js.native
    
    def getPageImageURL(pageIndex: Double): String = js.native
    def getPageImageURL(pageIndex: Double, size: Dimensions): String = js.native
    
    def isPageValid(pageIndex: Double, showNonPagedPages: Boolean): Boolean = js.native
    
    var itemTitle: String = js.native
    
    var maxRatio: Double = js.native
    
    var maxZoom: Double = js.native
    
    var metadata: js.Object = js.native
    
    var paged: Boolean = js.native
    
    var pages: js.Array[Page] = js.native
  }
  
  @js.native
  class default protected () extends ImageManifest {
    def this(data: ManifestData, urlAdapter: IIIFSourceAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def fromIIIF(iiifManifest: js.Object): ImageManifest = js.native
  }
  
  type IIIFSourceAdapter = js.Any
}
