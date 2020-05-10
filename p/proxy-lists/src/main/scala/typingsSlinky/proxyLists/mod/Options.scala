package typingsSlinky.proxyLists.mod

import typingsSlinky.proxyLists.proxyListsStrings.loose
import typingsSlinky.proxyLists.proxyListsStrings.strict
import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.native
  var countries: js.UndefOr[js.Array[String]] = js.native
  var countriesBlackList: js.UndefOr[js.Array[String]] = js.native
  var defaultRequestOptions: js.UndefOr[CoreOptions] = js.native
  var filterMode: js.UndefOr[strict | loose] = js.native
  var ipTypes: js.UndefOr[js.Array[IPType]] = js.native
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  var series: js.UndefOr[Boolean] = js.native
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.native
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.native
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
    def withAnonymityLevels(value: js.Array[AnonymityLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymityLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymityLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymityLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withCountriesBlackList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesBlackList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountriesBlackList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countriesBlackList")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRequestOptions(value: CoreOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequestOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterMode(value: strict | loose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIpTypes(value: js.Array[IPType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[Protocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcesBlackList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesBlackList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcesBlackList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesBlackList")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcesWhiteList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesWhiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcesWhiteList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesWhiteList")(js.undefined)
        ret
    }
  }
  
}

