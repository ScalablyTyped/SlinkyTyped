package typingsSlinky.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathFunctionOptions extends js.Object {
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
  /**
    * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
    */
  var validate: js.UndefOr[Boolean] = js.native
}

object PathFunctionOptions {
  @scala.inline
  def apply(): PathFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFunctionOptions]
  }
  @scala.inline
  implicit class PathFunctionOptionsOps[Self <: PathFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: (/* value */ String, /* token */ Key) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

