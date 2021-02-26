package typingsSlinky.divaJs

import typingsSlinky.divaJs.anon.X
import typingsSlinky.divaJs.interfacesMod.Dimensions
import typingsSlinky.divaJs.interfacesMod.Offset
import typingsSlinky.divaJs.interfacesMod.PageGroup
import typingsSlinky.divaJs.interfacesMod.PageInfo
import typingsSlinky.divaJs.interfacesMod.Region
import typingsSlinky.divaJs.interfacesMod.RendererConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentLayoutMod {
  
  @JSImport("diva.js/document-layout", JSImport.Default)
  @js.native
  class default protected () extends DocumentLayout {
    def this(config: RendererConfig, zoomLevel: Double) = this()
  }
  
  @js.native
  trait DocumentLayout extends StObject {
    
    var dimensions: Dimensions = js.native
    
    def getPageDimensions(pageIndex: Double): Dimensions = js.native
    
    def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
    
    def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
    
    def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
    
    def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): X = js.native
    
    var pageGroups: js.Array[PageGroup] = js.native
  }
  object DocumentLayout {
    
    @scala.inline
    def apply(
      dimensions: Dimensions,
      getPageDimensions: Double => Dimensions,
      getPageInfo: Double => PageInfo | Null,
      getPageOffset: (Double, js.Object) => Offset,
      getPageRegion: (Double, js.Object) => Offset,
      getPageToViewportCenterOffset: (Double, Region) => X,
      pageGroups: js.Array[PageGroup]
    ): DocumentLayout = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], getPageDimensions = js.Any.fromFunction1(getPageDimensions), getPageInfo = js.Any.fromFunction1(getPageInfo), getPageOffset = js.Any.fromFunction2(getPageOffset), getPageRegion = js.Any.fromFunction2(getPageRegion), getPageToViewportCenterOffset = js.Any.fromFunction2(getPageToViewportCenterOffset), pageGroups = pageGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentLayout]
    }
    
    @scala.inline
    implicit class DocumentLayoutMutableBuilder[Self <: DocumentLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPageDimensions(value: Double => Dimensions): Self = StObject.set(x, "getPageDimensions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageInfo(value: Double => PageInfo | Null): Self = StObject.set(x, "getPageInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPageOffset(value: (Double, js.Object) => Offset): Self = StObject.set(x, "getPageOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPageRegion(value: (Double, js.Object) => Offset): Self = StObject.set(x, "getPageRegion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPageToViewportCenterOffset(value: (Double, Region) => X): Self = StObject.set(x, "getPageToViewportCenterOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageGroups(value: js.Array[PageGroup]): Self = StObject.set(x, "pageGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageGroupsVarargs(value: PageGroup*): Self = StObject.set(x, "pageGroups", js.Array(value :_*))
    }
  }
}
