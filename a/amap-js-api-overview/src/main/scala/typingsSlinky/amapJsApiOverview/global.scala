package typingsSlinky.amapJsApiOverview

import typingsSlinky.amapJsApi.AMap.TileLayer
import typingsSlinky.amapJsApiOverview.AMap.OverView.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    /**
      * 地图鹰眼插件
      */
    @JSGlobal("AMap.OverView")
    @js.native
    class OverView[L /* <: TileLayer */] ()
      extends typingsSlinky.amapJsApiOverview.AMap.OverView[L] {
      def this(options: Options[L]) = this()
    }
  }
}
