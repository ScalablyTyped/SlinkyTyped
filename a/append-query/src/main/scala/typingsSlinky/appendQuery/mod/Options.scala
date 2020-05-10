package typingsSlinky.appendQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * whether or not to encode appended passed params using `encodeURIComponent`.
    * Default: `true`.
    */
  var encodeComponents: js.UndefOr[Boolean] = js.native
  /**
    * whether or not to remove params for `null` properties in the query object.
    * Default: `false` (properties will be preserved with no value).
    */
  var removeNull: js.UndefOr[Boolean] = js.native
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
    def withEncodeComponents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodeComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNull")(js.undefined)
        ret
    }
  }
  
}

