package typingsSlinky.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/transform.@jest/transform/build/types.ShouldInstrumentOptions & std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'extraGlobals'> & {  isCoreModule ? :boolean,   isInternalModule ? :boolean} */
@js.native
trait Options extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
  var extraGlobals: js.Array[String] = js.native
  var isCoreModule: js.UndefOr[Boolean] = js.native
  var isInternalModule: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(collectCoverage: Boolean, collectCoverageFrom: js.Array[Glob], extraGlobals: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectCoverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectCoverageFrom(value: js.Array[Glob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedFiles(value: Set[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectCoverageOnlyFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectCoverageOnlyFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCoreModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoreModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCoreModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoreModule")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInternalModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternalModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInternalModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternalModule")(js.undefined)
        ret
    }
  }
  
}

