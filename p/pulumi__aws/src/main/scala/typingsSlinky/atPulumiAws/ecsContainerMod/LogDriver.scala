package typingsSlinky.atPulumiAws.ecsContainerMod

import typingsSlinky.atPulumiAws.atPulumiAwsStrings.syslog_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.`json-file`
  - typings.atPulumiAws.atPulumiAwsStrings.syslog_
  - typings.atPulumiAws.atPulumiAwsStrings.journald
  - typings.atPulumiAws.atPulumiAwsStrings.gelf
  - typings.atPulumiAws.atPulumiAwsStrings.fluentd
  - typings.atPulumiAws.atPulumiAwsStrings.awslogs
  - typings.atPulumiAws.atPulumiAwsStrings.splunk
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def awslogs: typingsSlinky.atPulumiAws.atPulumiAwsStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fluentd: typingsSlinky.atPulumiAws.atPulumiAwsStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typingsSlinky.atPulumiAws.atPulumiAwsStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typingsSlinky.atPulumiAws.atPulumiAwsStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typingsSlinky.atPulumiAws.atPulumiAwsStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def splunk: typingsSlinky.atPulumiAws.atPulumiAwsStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: syslog_ = this.cast("syslog")
}

