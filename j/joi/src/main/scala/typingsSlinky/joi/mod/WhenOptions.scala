package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhenOptions extends js.Object {
  /**
    * the required condition joi type.
    */
  var is: SchemaLike = js.native
  /**
    * the alternative schema type if the condition is false. Required if then is missing
    */
  var otherwise: js.UndefOr[SchemaLike] = js.native
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
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
    def withIs(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(null)
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

