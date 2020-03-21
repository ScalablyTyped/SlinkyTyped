package typingsSlinky.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Netflix
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Amazon
  - typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MyOwn
*/
trait DataCenterName extends js.Object

object DataCenterName {
  @scala.inline
  def Amazon: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Amazon = this.cast("Amazon")
  @scala.inline
  def MyOwn: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.MyOwn = this.cast("MyOwn")
  @scala.inline
  def Netflix: typingsSlinky.eurekaJsClient.eurekaJsClientStrings.Netflix = this.cast("Netflix")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

