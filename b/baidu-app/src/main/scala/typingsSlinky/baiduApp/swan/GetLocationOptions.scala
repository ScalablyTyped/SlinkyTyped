package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.baiduAppStrings.gcj02
import typingsSlinky.baiduApp.baiduAppStrings.wgs84
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var altitude: js.UndefOr[Boolean] = js.native
  
  // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  var success_GetLocationOptions: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.native
  
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于swan.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
}
object GetLocationOptions {
  
  @scala.inline
  def apply(): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOptions]
  }
  
  @scala.inline
  implicit class GetLocationOptionsMutableBuilder[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Boolean): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ LocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
