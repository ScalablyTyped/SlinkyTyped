package typingsSlinky.pulumiAws.containerMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.syslog_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.`json-file`
  - typingsSlinky.pulumiAws.pulumiAwsStrings.syslog_
  - typingsSlinky.pulumiAws.pulumiAwsStrings.journald
  - typingsSlinky.pulumiAws.pulumiAwsStrings.gelf
  - typingsSlinky.pulumiAws.pulumiAwsStrings.fluentd
  - typingsSlinky.pulumiAws.pulumiAwsStrings.awslogs
  - typingsSlinky.pulumiAws.pulumiAwsStrings.splunk
  - typingsSlinky.pulumiAws.pulumiAwsStrings.awsfirelens
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def awsfirelens: typingsSlinky.pulumiAws.pulumiAwsStrings.awsfirelens = this.cast("awsfirelens")
  @scala.inline
  def awslogs: typingsSlinky.pulumiAws.pulumiAwsStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fluentd: typingsSlinky.pulumiAws.pulumiAwsStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typingsSlinky.pulumiAws.pulumiAwsStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typingsSlinky.pulumiAws.pulumiAwsStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typingsSlinky.pulumiAws.pulumiAwsStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def splunk: typingsSlinky.pulumiAws.pulumiAwsStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: syslog_ = this.cast("syslog")
}

