package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control how long Test Runner is waiting for command to succeed
  */
@js.native
trait Timeoutable extends js.Object {
  /**
    * Time to wait (ms)
    *
    * @default defaultCommandTimeout
    * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
    */
  var timeout: Double = js.native
}

object Timeoutable {
  @scala.inline
  def apply(timeout: Double): Timeoutable = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeoutable]
  }
  @scala.inline
  implicit class TimeoutableOps[Self <: Timeoutable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

