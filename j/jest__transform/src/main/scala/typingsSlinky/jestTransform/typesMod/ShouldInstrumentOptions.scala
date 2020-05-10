package typingsSlinky.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom'> & {  changedFiles  :std.Set<@jest/types.@jest/types.Config.Path> | undefined} */
@js.native
trait ShouldInstrumentOptions extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object ShouldInstrumentOptions {
  @scala.inline
  def apply(collectCoverage: Boolean, collectCoverageFrom: js.Array[Glob]): ShouldInstrumentOptions = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldInstrumentOptions]
  }
  @scala.inline
  implicit class ShouldInstrumentOptionsOps[Self <: ShouldInstrumentOptions] (val x: Self) extends AnyVal {
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
  }
  
}

