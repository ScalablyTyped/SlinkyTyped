package typingsSlinky.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOneAndUpdateOptions extends js.Object {
  /**
  		 * Return a new document if one is not found with the given query.
  		 *
  		 * @type {boolean}
  		 */
  var upsert: js.UndefOr[Boolean] = js.native
}

object FindOneAndUpdateOptions {
  @scala.inline
  def apply(): FindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndUpdateOptions]
  }
  @scala.inline
  implicit class FindOneAndUpdateOptionsOps[Self <: FindOneAndUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

