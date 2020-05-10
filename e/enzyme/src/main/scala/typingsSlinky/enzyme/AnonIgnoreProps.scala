package typingsSlinky.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnoreProps extends js.Object {
  /** Whether props should be omitted in the resulting string. Props are included by default. */
  var ignoreProps: js.UndefOr[Boolean] = js.native
  /** Whether arrays and objects passed as props should be verbosely printed. */
  var verbose: js.UndefOr[Boolean] = js.native
}

object AnonIgnoreProps {
  @scala.inline
  def apply(): AnonIgnoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIgnoreProps]
  }
  @scala.inline
  implicit class AnonIgnorePropsOps[Self <: AnonIgnoreProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreProps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreProps")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

