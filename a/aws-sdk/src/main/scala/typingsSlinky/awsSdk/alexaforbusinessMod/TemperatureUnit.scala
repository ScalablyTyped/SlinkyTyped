package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FAHRENHEIT
  - typingsSlinky.awsSdk.awsSdkStrings.CELSIUS
  - java.lang.String
*/
trait TemperatureUnit extends js.Object

object TemperatureUnit {
  @scala.inline
  def FAHRENHEIT: typingsSlinky.awsSdk.awsSdkStrings.FAHRENHEIT = "FAHRENHEIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAHRENHEIT]
  @scala.inline
  def CELSIUS: typingsSlinky.awsSdk.awsSdkStrings.CELSIUS = "CELSIUS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CELSIUS]
  @scala.inline
  implicit def apply(value: String): TemperatureUnit = value.asInstanceOf[TemperatureUnit]
}

