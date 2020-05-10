package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeySet extends js.Object {
  /**
    * For convenience `all` can be set to `true` to indicate that this
    * `KeySet` matches all keys in the table or index. Note that any keys
    * specified in `keys` or `ranges` are only yielded once.
    */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * A list of specific keys. Entries in `keys` should have exactly as
    * many elements as there are columns in the primary or index key
    * with which this `KeySet` is used.  Individual key values are
    * encoded as described here.
    */
  var keys: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    * A list of key ranges. See KeyRange for more information about
    * key range specifications.
    */
  var ranges: js.UndefOr[js.Array[KeyRange]] = js.native
}

object KeySet {
  @scala.inline
  def apply(): KeySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeySet]
  }
  @scala.inline
  implicit class KeySetOps[Self <: KeySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[KeyRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

