package typingsSlinky.hashtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashtableOptions[TKey] extends js.Object {
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, Boolean]] = js.native
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, _]] = js.native
  var replaceDuplicateKey: js.UndefOr[Boolean] = js.native
}

object IHashtableOptions {
  @scala.inline
  def apply[TKey](): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
  @scala.inline
  implicit class IHashtableOptionsOps[Self[tkey] <: IHashtableOptions[tkey], TKey] (val x: Self[TKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TKey] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TKey] with Other]
    @scala.inline
    def withEquals(value: (/* key1 */ TKey, /* key2 */ TKey) => Boolean): Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withHashCode(value: /* key */ TKey => _): Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHashCode: Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceDuplicateKey(value: Boolean): Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDuplicateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceDuplicateKey: Self[TKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceDuplicateKey")(js.undefined)
        ret
    }
  }
  
}

