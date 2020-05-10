package typingsSlinky.prettyError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigObject extends js.Object {
  var aliases: js.UndefOr[Boolean | js.Object] = js.native
  // assuming this is optional
  var filters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var parsedErrorFilters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  var skip: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
  var skipNodeFiles: js.UndefOr[Boolean | js.Any] = js.native
  var skipPackages: js.UndefOr[Boolean | js.Array[String]] = js.native
  var skipPaths: js.UndefOr[Boolean | js.Array[String]] = js.native
}

object ConfigObject {
  @scala.inline
  def apply(): ConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigObject]
  }
  @scala.inline
  implicit class ConfigObjectOps[Self <: ConfigObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Boolean | Callback | js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedErrorFilters(value: Boolean | Callback | js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedErrorFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedErrorFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedErrorFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean | Callback | js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipNodeFiles(value: Boolean | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNodeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipNodeFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNodeFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipPackages(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPackages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPackages")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipPaths(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPaths")(js.undefined)
        ret
    }
  }
  
}

