package typingsSlinky.pdfjsDist

import typingsSlinky.pdfjsDist.mod.CMapCompressionType
import typingsSlinky.pdfjsDist.mod.PDFInfo
import typingsSlinky.pdfjsDist.mod.PDFMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BaseUrl extends StObject {
    
    var baseUrl: String = js.native
    
    var isCompressed: Boolean = js.native
  }
  object BaseUrl {
    
    @scala.inline
    def apply(baseUrl: String, isCompressed: Boolean): BaseUrl = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CMapData extends StObject {
    
    var cMapData: js.Any = js.native
    
    var compressionType: CMapCompressionType = js.native
  }
  object CMapData {
    
    @scala.inline
    def apply(cMapData: js.Any, compressionType: CMapCompressionType): CMapData = {
      val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMapData]
    }
    
    @scala.inline
    implicit class CMapDataMutableBuilder[Self <: CMapData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCMapData(value: js.Any): Self = StObject.set(x, "cMapData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionType(value: CMapCompressionType): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Info extends StObject {
    
    var info: PDFInfo = js.native
    
    var metadata: PDFMetadata = js.native
  }
  object Info {
    
    @scala.inline
    def apply(info: PDFInfo, metadata: PDFMetadata): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: PDFInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: PDFMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
