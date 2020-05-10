package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dockerode.dockerodeStrings.`json-file`
  - typingsSlinky.dockerode.dockerodeStrings.syslog
  - typingsSlinky.dockerode.dockerodeStrings.journald
  - typingsSlinky.dockerode.dockerodeStrings.gelf
  - typingsSlinky.dockerode.dockerodeStrings.fluentd
  - typingsSlinky.dockerode.dockerodeStrings.awslogs
  - typingsSlinky.dockerode.dockerodeStrings.splunk
  - typingsSlinky.dockerode.dockerodeStrings.etwlogs
  - typingsSlinky.dockerode.dockerodeStrings.none
*/
trait LoggingDriverType extends js.Object

object LoggingDriverType {
  @scala.inline
  def awslogs: typingsSlinky.dockerode.dockerodeStrings.awslogs = "awslogs".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.awslogs]
  @scala.inline
  def etwlogs: typingsSlinky.dockerode.dockerodeStrings.etwlogs = "etwlogs".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.etwlogs]
  @scala.inline
  def fluentd: typingsSlinky.dockerode.dockerodeStrings.fluentd = "fluentd".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.fluentd]
  @scala.inline
  def gelf: typingsSlinky.dockerode.dockerodeStrings.gelf = "gelf".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.gelf]
  @scala.inline
  def journald: typingsSlinky.dockerode.dockerodeStrings.journald = "journald".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.journald]
  @scala.inline
  def `json-file`: typingsSlinky.dockerode.dockerodeStrings.`json-file` = "json-file".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.`json-file`]
  @scala.inline
  def none: typingsSlinky.dockerode.dockerodeStrings.none = "none".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.none]
  @scala.inline
  def splunk: typingsSlinky.dockerode.dockerodeStrings.splunk = "splunk".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.splunk]
  @scala.inline
  def syslog: typingsSlinky.dockerode.dockerodeStrings.syslog = "syslog".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.syslog]
}

