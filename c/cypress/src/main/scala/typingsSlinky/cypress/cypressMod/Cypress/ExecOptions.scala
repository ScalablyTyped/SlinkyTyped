package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object to change the default behavior of cy.exec().
  */
@js.native
trait ExecOptions
  extends Loggable
     with Timeoutable {
  /**
    * Object of environment variables to set before the command executes
    * (e.g. {USERNAME: 'johndoe'}). Will be merged with existing
    * system environment variables
    *
    * @default {}
    */
  var env: js.Object = js.native
  /**
    * Whether to fail if the command exits with a non-zero code
    *
    * @default true
    */
  var failOnNonZeroExit: Boolean = js.native
}

object ExecOptions {
  @scala.inline
  def apply(env: js.Object, failOnNonZeroExit: Boolean, log: Boolean, timeout: Double): ExecOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], failOnNonZeroExit = failOnNonZeroExit.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
  @scala.inline
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailOnNonZeroExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnNonZeroExit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

