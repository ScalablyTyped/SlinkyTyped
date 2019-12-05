package typingsSlinky.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dockerode.dockerodeStrings.`json-file`
  - typings.dockerode.dockerodeStrings.syslog
  - typings.dockerode.dockerodeStrings.journald
  - typings.dockerode.dockerodeStrings.gelf
  - typings.dockerode.dockerodeStrings.fluentd
  - typings.dockerode.dockerodeStrings.awslogs
  - typings.dockerode.dockerodeStrings.splunk
  - typings.dockerode.dockerodeStrings.etwlogs
  - typings.dockerode.dockerodeStrings.none
*/
trait LoggingDriverType extends js.Object

object LoggingDriverType {
  @scala.inline
  def awslogs: typingsSlinky.dockerode.dockerodeStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def etwlogs: typingsSlinky.dockerode.dockerodeStrings.etwlogs = this.cast("etwlogs")
  @scala.inline
  def fluentd: typingsSlinky.dockerode.dockerodeStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typingsSlinky.dockerode.dockerodeStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typingsSlinky.dockerode.dockerodeStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typingsSlinky.dockerode.dockerodeStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def none: typingsSlinky.dockerode.dockerodeStrings.none = this.cast("none")
  @scala.inline
  def splunk: typingsSlinky.dockerode.dockerodeStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: typingsSlinky.dockerode.dockerodeStrings.syslog = this.cast("syslog")
}

