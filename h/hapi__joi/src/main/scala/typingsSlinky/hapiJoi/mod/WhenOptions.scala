package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhenOptions extends js.Object {
  /**
    * whether to stop applying further conditions if the condition is true.
    */
  var break: js.UndefOr[Boolean] = js.native
  /**
    * the required condition joi type.
    */
  var is: js.UndefOr[SchemaLike] = js.native
  /**
    * the negative version of `is` (`then` and `otherwise` have reverse
    * roles).
    */
  var not: js.UndefOr[SchemaLike] = js.native
  /**
    * the alternative schema type if the condition is false. Required if then or switch are missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  /**
    * the list of cases. Required if then is missing.  Required if then or otherwise are missing.
    */
  var switch: js.UndefOr[js.Array[SwitchCases | SwitchDefault]] = js.native
  /**
    * the alternative schema type if the condition is true. Required if otherwise or switch are missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.native
}

object WhenOptions {
  @scala.inline
  def apply(): WhenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhenOptions]
  }
  @scala.inline
  implicit class WhenOptionsOps[Self <: WhenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("break")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(null)
        ret
    }
    @scala.inline
    def withNot(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withNotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(null)
        ret
    }
    @scala.inline
    def withOtherwise(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherwiseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(null)
        ret
    }
    @scala.inline
    def withSwitch(value: js.Array[SwitchCases | SwitchDefault]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(js.undefined)
        ret
    }
    @scala.inline
    def withThen(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.undefined)
        ret
    }
    @scala.inline
    def withThenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(null)
        ret
    }
  }
  
}

