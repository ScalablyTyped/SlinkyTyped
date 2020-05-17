package typingsSlinky.frecency.anon

import typingsSlinky.frecency.mod.idAttrFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExactQueryMatchWeight extends js.Object {
  var exactQueryMatchWeight: js.UndefOr[Double] = js.native
  var idAttribute: js.UndefOr[String | idAttrFn] = js.native
  var key: String = js.native
  var recentSelectionsLimit: js.UndefOr[Double] = js.native
  var recentSelectionsMatchWeight: js.UndefOr[Double] = js.native
  var storageProvider: js.UndefOr[js.Object] = js.native
  var subQueryMatchWeight: js.UndefOr[Double] = js.native
  var timeStampsLimit: js.UndefOr[Double] = js.native
}

object ExactQueryMatchWeight {
  @scala.inline
  def apply(key: String): ExactQueryMatchWeight = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExactQueryMatchWeight]
  }
  @scala.inline
  implicit class ExactQueryMatchWeightOps[Self <: ExactQueryMatchWeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExactQueryMatchWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactQueryMatchWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactQueryMatchWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactQueryMatchWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIdAttributeFunction1(value: /* result */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIdAttribute(value: String | idAttrFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentSelectionsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentSelectionsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentSelectionsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentSelectionsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentSelectionsMatchWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentSelectionsMatchWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentSelectionsMatchWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentSelectionsMatchWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageProvider(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withSubQueryMatchWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subQueryMatchWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubQueryMatchWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subQueryMatchWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStampsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStampsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStampsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStampsLimit")(js.undefined)
        ret
    }
  }
  
}

