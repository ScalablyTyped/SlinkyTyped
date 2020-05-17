package typingsSlinky.depcheck.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.depcheck.anon.Dependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  @JSName("package")
  var _package: js.UndefOr[Dependencies] = js.native
  var detectors: js.UndefOr[js.Array[Detector_]] = js.native
  var ignoreBinPackage: js.UndefOr[Boolean] = js.native
  var ignoreDirs: js.UndefOr[js.Array[String]] = js.native
  var ignoreMatches: js.UndefOr[js.Array[String]] = js.native
  var parsers: js.UndefOr[StringDictionary[Parser_]] = js.native
  var skipMissing: js.UndefOr[Boolean] = js.native
  var specials: js.UndefOr[js.Array[Parser_]] = js.native
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
    def with_package(value: Dependencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectors(value: js.Array[Detector_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectors")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreBinPackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBinPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBinPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBinPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withParsers(value: StringDictionary[Parser_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecials(value: js.Array[Parser_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specials")(js.undefined)
        ret
    }
  }
  
}

