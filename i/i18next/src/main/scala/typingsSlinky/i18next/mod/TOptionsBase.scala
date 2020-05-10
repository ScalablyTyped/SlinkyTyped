package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TOptionsBase extends js.Object {
  /**
    * Used for contexts (eg. male\female)
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * Count value used for plurals
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Default value to return if a translation was not found
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * Override language to lookup key if not found see fallbacks for details
    */
  var fallbackLng: js.UndefOr[FallbackLng] = js.native
  /**
    * Override interpolation options
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.native
  /**
    * Char, eg. '\n' that arrays will be joined by (can be set globally too)
    */
  var joinArrays: js.UndefOr[String] = js.native
  /**
    * Override char to separate keys
    */
  var keySeparator: js.UndefOr[String] = js.native
  /**
    * Override language to use
    */
  var lng: js.UndefOr[String] = js.native
  /**
    * Override languages to use
    */
  var lngs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Override namespaces (string or array)
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Override char to split namespace from key
    */
  var nsSeparator: js.UndefOr[String] = js.native
  /**
    * String or array of postProcessors to apply see interval plurals as a sample
    */
  var postProcess: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Object with vars for interpolation - or put them directly in options
    */
  var replace: js.UndefOr[js.Any] = js.native
  /**
    * Accessing an object not a translation string (can be set globally too)
    */
  var returnObjects: js.UndefOr[Boolean] = js.native
}

object TOptionsBase {
  @scala.inline
  def apply(): TOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TOptionsBase]
  }
  @scala.inline
  implicit class TOptionsBaseOps[Self <: TOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLng(value: FallbackLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLng")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: InterpolationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinArrays(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(js.undefined)
        ret
    }
    @scala.inline
    def withLngs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngs")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
    @scala.inline
    def withNsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObjects")(js.undefined)
        ret
    }
  }
  
}

