package typingsSlinky.cosmiconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBase extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.native
  var packageProp: js.UndefOr[String] = js.native
  var searchPlaces: js.UndefOr[js.Array[String]] = js.native
  var stopDir: js.UndefOr[String] = js.native
}

object OptionsBase {
  @scala.inline
  def apply(): OptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBase]
  }
  @scala.inline
  implicit class OptionsBaseOps[Self <: OptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmptySearchPlaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptySearchPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmptySearchPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmptySearchPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageProp")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withStopDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDir")(js.undefined)
        ret
    }
  }
  
}

