package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object to change the default behavior of .click().
  */
@js.native
trait ClickOptions
  extends Loggable
     with Timeoutable
     with Forceable {
  /**
    * Serially click multiple elements
    *
    * @default false
    */
  var multiple: Boolean = js.native
}

object ClickOptions {
  @scala.inline
  def apply(force: Boolean, log: Boolean, multiple: Boolean, timeout: Double): ClickOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOptions]
  }
  @scala.inline
  implicit class ClickOptionsOps[Self <: ClickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

