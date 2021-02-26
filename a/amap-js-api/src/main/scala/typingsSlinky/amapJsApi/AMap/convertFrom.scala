package typingsSlinky.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertFrom {
  
  @js.native
  trait Result extends StObject {
    
    /**
      * 成功状态文字描述
      */
    var info: String = js.native
    
    // 'ok'
    /**
      * 高德坐标集合
      */
    var locations: js.Array[LngLat] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(info: String, locations: js.Array[LngLat]): Result = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[LngLat]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: LngLat*): Self = StObject.set(x, "locations", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.complete
    - typingsSlinky.amapJsApi.amapJsApiStrings.error
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    @scala.inline
    def complete: typingsSlinky.amapJsApi.amapJsApiStrings.complete = "complete".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.complete]
    
    @scala.inline
    def error: typingsSlinky.amapJsApi.amapJsApiStrings.error = "error".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.error]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.gps
    - typingsSlinky.amapJsApi.amapJsApiStrings.baidu
    - typingsSlinky.amapJsApi.amapJsApiStrings.mapbar
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def baidu: typingsSlinky.amapJsApi.amapJsApiStrings.baidu = "baidu".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.baidu]
    
    @scala.inline
    def gps: typingsSlinky.amapJsApi.amapJsApiStrings.gps = "gps".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.gps]
    
    @scala.inline
    def mapbar: typingsSlinky.amapJsApi.amapJsApiStrings.mapbar = "mapbar".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.mapbar]
  }
}
