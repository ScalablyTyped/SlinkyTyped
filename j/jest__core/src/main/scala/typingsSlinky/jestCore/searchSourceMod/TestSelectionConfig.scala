package typingsSlinky.jestCore.searchSourceMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSelectionConfig extends js.Object {
  var findRelatedTests: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[String] = js.native
  var onlyChanged: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[js.Array[Path]] = js.native
  var shouldTreatInputAsPattern: js.UndefOr[Boolean] = js.native
  var testPathPattern: js.UndefOr[String] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object TestSelectionConfig {
  @scala.inline
  def apply(): TestSelectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSelectionConfig]
  }
  @scala.inline
  implicit class TestSelectionConfigOps[Self <: TestSelectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindRelatedTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRelatedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindRelatedTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRelatedTests")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[Path]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldTreatInputAsPattern(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldTreatInputAsPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldTreatInputAsPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldTreatInputAsPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTestPathPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestPathPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPathPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

