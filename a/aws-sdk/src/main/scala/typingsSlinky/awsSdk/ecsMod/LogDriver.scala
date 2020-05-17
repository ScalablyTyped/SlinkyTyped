package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`json-file`
  - typingsSlinky.awsSdk.awsSdkStrings.syslog
  - typingsSlinky.awsSdk.awsSdkStrings.journald
  - typingsSlinky.awsSdk.awsSdkStrings.gelf
  - typingsSlinky.awsSdk.awsSdkStrings.fluentd
  - typingsSlinky.awsSdk.awsSdkStrings.awslogs
  - typingsSlinky.awsSdk.awsSdkStrings.splunk
  - typingsSlinky.awsSdk.awsSdkStrings.awsfirelens
  - java.lang.String
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def `json-file`: typingsSlinky.awsSdk.awsSdkStrings.`json-file` = "json-file".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`json-file`]
  @scala.inline
  def syslog: typingsSlinky.awsSdk.awsSdkStrings.syslog = "syslog".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.syslog]
  @scala.inline
  def journald: typingsSlinky.awsSdk.awsSdkStrings.journald = "journald".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.journald]
  @scala.inline
  def gelf: typingsSlinky.awsSdk.awsSdkStrings.gelf = "gelf".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.gelf]
  @scala.inline
  def fluentd: typingsSlinky.awsSdk.awsSdkStrings.fluentd = "fluentd".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fluentd]
  @scala.inline
  def awslogs: typingsSlinky.awsSdk.awsSdkStrings.awslogs = "awslogs".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.awslogs]
  @scala.inline
  def splunk: typingsSlinky.awsSdk.awsSdkStrings.splunk = "splunk".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.splunk]
  @scala.inline
  def awsfirelens: typingsSlinky.awsSdk.awsSdkStrings.awsfirelens = "awsfirelens".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.awsfirelens]
  @scala.inline
  implicit def apply(value: java.lang.String): LogDriver = value.asInstanceOf[LogDriver]
}

