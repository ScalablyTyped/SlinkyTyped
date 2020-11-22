package typingsSlinky.fitbitWeather

import typingsSlinky.fitbitWeather.appMod.Result
import typingsSlinky.fitbitWeather.companionMod.Configuration
import typingsSlinky.fitbitWeather.companionMod.ProvidersCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fitbit-weather", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Providers: ProvidersCodes = js.native
  
  def fetch(age: Double): js.Promise[Result] = js.native
  
  def setup(configuration: Configuration): Unit = js.native
}
