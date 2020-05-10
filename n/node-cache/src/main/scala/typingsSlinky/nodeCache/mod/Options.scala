package typingsSlinky.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrayValueSize: js.UndefOr[Double] = js.native
  /**
  		 * time in seconds to check all data and delete expired keys
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var checkperiod: js.UndefOr[Double] = js.native
  var deleteOnExpire: js.UndefOr[Boolean] = js.native
  /**
  		 * enable legacy callbacks.
  		 * legacy callback support will drop in v6.x!
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var enableLegacyCallbacks: js.UndefOr[Boolean] = js.native
  var errorOnMissing: js.UndefOr[Boolean] = js.native
  /**
  		 * If enabled, all values will be stringified during the set operation
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var forceString: js.UndefOr[Boolean] = js.native
  /**
  		 * max amount of keys that are being stored.
  		 * set operations will throw an error when the cache is full
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var maxKeys: js.UndefOr[Double] = js.native
  var objectValueSize: js.UndefOr[Double] = js.native
  var promiseValueSize: js.UndefOr[Double] = js.native
  /**
  		 * standard time to live in seconds. 0 = infinity
  		 *
  		 * @type {number}
  		 * @memberof Options
  		 */
  var stdTTL: js.UndefOr[Double] = js.native
  /**
  		 * en/disable cloning of variables.
  		 * disabling this is strongly encouraged when aiming for performance!
  		 *
  		 * If `true`: set operations store a clone of the value and get operations will create a fresh clone of the cached value
  		 * If `false` you'll just store a reference to your value
  		 *
  		 * @type {boolean}
  		 * @memberof Options
  		 */
  var useClones: js.UndefOr[Boolean] = js.native
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
    def withArrayValueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckperiod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkperiod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckperiod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkperiod")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOnExpire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnExpire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLegacyCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLegacyCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLegacyCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLegacyCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOnMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOnMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withForceString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceString")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectValueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectValueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectValueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectValueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseValueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseValueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseValueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseValueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStdTTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withUseClones(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClones")(js.undefined)
        ret
    }
  }
  
}

