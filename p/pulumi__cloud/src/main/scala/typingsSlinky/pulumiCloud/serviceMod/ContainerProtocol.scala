package typingsSlinky.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.tcp
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.udp
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.http
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.https
*/
trait ContainerProtocol extends js.Object

object ContainerProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsSlinky.pulumiCloud.pulumiCloudStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.pulumiCloud.pulumiCloudStrings.https = this.cast("https")
  @scala.inline
  def tcp: typingsSlinky.pulumiCloud.pulumiCloudStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsSlinky.pulumiCloud.pulumiCloudStrings.udp = this.cast("udp")
}

