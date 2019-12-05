package typingsSlinky.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.beanstalkd.beanstalkdStrings.ready
  - typings.beanstalkd.beanstalkdStrings.delayed
  - typings.beanstalkd.beanstalkdStrings.reserved
  - typings.beanstalkd.beanstalkdStrings.buried
*/
trait BeanstalkdJobState extends js.Object

object BeanstalkdJobState {
  @scala.inline
  def buried: typingsSlinky.beanstalkd.beanstalkdStrings.buried = this.cast("buried")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delayed: typingsSlinky.beanstalkd.beanstalkdStrings.delayed = this.cast("delayed")
  @scala.inline
  def ready: typingsSlinky.beanstalkd.beanstalkdStrings.ready = this.cast("ready")
  @scala.inline
  def reserved: typingsSlinky.beanstalkd.beanstalkdStrings.reserved = this.cast("reserved")
}

