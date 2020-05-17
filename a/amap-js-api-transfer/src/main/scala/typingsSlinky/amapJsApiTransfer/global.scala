package typingsSlinky.amapJsApiTransfer

import typingsSlinky.amapJsApiTransfer.AMap.Transfer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object AMap extends js.Object {
    @js.native
    class Transfer protected ()
      extends typingsSlinky.amapJsApiTransfer.AMap.Transfer {
      /**
        * 公交换乘服务
        * @param options 构造函数选项
        */
      def this(options: Options) = this()
    }
    
    @js.native
    object TransferPolicy extends js.Object {
      /* 1 */ val LEAST_FEE: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.LEAST_FEE with Double = js.native
      /* 0 */ val LEAST_TIME: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TIME with Double = js.native
      /* 2 */ val LEAST_TRANSFER: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TRANSFER with Double = js.native
      /* 3 */ val LEAST_WALK: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.LEAST_WALK with Double = js.native
      /* 4 */ val MOST_COMFORT: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.MOST_COMFORT with Double = js.native
      /* 5 */ val NO_SUBWAY: typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy.NO_SUBWAY with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy with Double] = js.native
    }
    
  }
  
}

