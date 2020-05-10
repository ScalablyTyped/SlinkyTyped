package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control `cy.type` command
  *
  * @see https://on.cypress.io/type
  */
@js.native
trait TypeOptions
  extends Loggable
     with Timeoutable {
  /**
    * Delay after each keypress (ms)
    *
    * @default 10
    */
  var delay: Double = js.native
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: Boolean = js.native
  /**
    * Parse special characters for strings surrounded by `{}`,
    * such as `{esc}`. Set to `false` to type the literal characters instead
    *
    * @default true
    */
  var parseSpecialCharSequences: Boolean = js.native
  /**
    * Keep a modifier activated between commands
    *
    * @default true
    */
  var release: Boolean = js.native
}

object TypeOptions {
  @scala.inline
  def apply(
    delay: Double,
    force: Boolean,
    log: Boolean,
    parseSpecialCharSequences: Boolean,
    release: Boolean,
    timeout: Double
  ): TypeOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], parseSpecialCharSequences = parseSpecialCharSequences.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
  @scala.inline
  implicit class TypeOptionsOps[Self <: TypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseSpecialCharSequences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseSpecialCharSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

