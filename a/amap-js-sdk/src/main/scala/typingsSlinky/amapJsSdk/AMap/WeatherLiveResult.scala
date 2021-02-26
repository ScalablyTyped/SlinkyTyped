package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 天气插件
@js.native
trait WeatherLiveResult extends StObject {
  
  var adcode: String = js.native
  
  var city: String = js.native
  
  var humidity: String = js.native
  
  var info: String = js.native
  
  var province: String = js.native
  
  var reportTime: String = js.native
  
  var temperature: Double = js.native
  
  var weather: String = js.native
  
  var windDirection: String = js.native
  
  var windPower: Double = js.native
}
object WeatherLiveResult {
  
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    humidity: String,
    info: String,
    province: String,
    reportTime: String,
    temperature: Double,
    weather: String,
    windDirection: String,
    windPower: Double
  ): WeatherLiveResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], humidity = humidity.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any], weather = weather.asInstanceOf[js.Any], windDirection = windDirection.asInstanceOf[js.Any], windPower = windPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherLiveResult]
  }
  
  @scala.inline
  implicit class WeatherLiveResultMutableBuilder[Self <: WeatherLiveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumidity(value: String): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeather(value: String): Self = StObject.set(x, "weather", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindDirection(value: String): Self = StObject.set(x, "windDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindPower(value: Double): Self = StObject.set(x, "windPower", value.asInstanceOf[js.Any])
  }
}
