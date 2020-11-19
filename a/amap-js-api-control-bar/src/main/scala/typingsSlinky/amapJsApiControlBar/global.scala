package typingsSlinky.amapJsApiControlBar

import typingsSlinky.amapJsApiControlBar.AMap.ControlBar.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    @js.native
    /**
      * 组合了旋转、倾斜、复位、缩放在内的地图控件
      * @param options 选项
      */
    class ControlBar ()
      extends typingsSlinky.amapJsApiControlBar.AMap.ControlBar {
      def this(options: Options) = this()
    }
  }
}
