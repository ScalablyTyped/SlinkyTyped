package typingsSlinky.postcssFlexbugsFixes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @default true
    */
  var bug4: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var bug6: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var bug81a: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBug4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBug4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug4")(js.undefined)
        ret
    }
    @scala.inline
    def withBug6(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBug6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug6")(js.undefined)
        ret
    }
    @scala.inline
    def withBug81a(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug81a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBug81a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bug81a")(js.undefined)
        ret
    }
  }
  
}

