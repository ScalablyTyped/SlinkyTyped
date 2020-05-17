package typingsSlinky.qunit

import typingsSlinky.qunit.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var altertitle: Boolean = js.native
  var autostart: Boolean = js.native
  var collapse: Boolean = js.native
  var current: js.Any = js.native
  var filter: String | js.RegExp = js.native
  var fixture: String = js.native
  var hidepassed: Boolean = js.native
  var maxDepth: Double = js.native
  var module: String = js.native
  var moduleId: js.Array[String] = js.native
  var noglobals: Boolean = js.native
  var notrycatch: Boolean = js.native
  var reorder: Boolean = js.native
  var requireExpects: Boolean = js.native
  var scrolltop: Boolean = js.native
  var seed: String = js.native
  var testId: js.Array[String] = js.native
  var testTimeout: Double = js.native
  var urlConfig: js.Array[Id] = js.native
}

object Config {
  @scala.inline
  def apply(
    altertitle: Boolean,
    autostart: Boolean,
    collapse: Boolean,
    current: js.Any,
    filter: String | js.RegExp,
    fixture: String,
    hidepassed: Boolean,
    maxDepth: Double,
    module: String,
    moduleId: js.Array[String],
    noglobals: Boolean,
    notrycatch: Boolean,
    reorder: Boolean,
    requireExpects: Boolean,
    scrolltop: Boolean,
    seed: String,
    testId: js.Array[String],
    testTimeout: Double,
    urlConfig: js.Array[Id]
  ): Config = {
    val __obj = js.Dynamic.literal(altertitle = altertitle.asInstanceOf[js.Any], autostart = autostart.asInstanceOf[js.Any], collapse = collapse.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fixture = fixture.asInstanceOf[js.Any], hidepassed = hidepassed.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], noglobals = noglobals.asInstanceOf[js.Any], notrycatch = notrycatch.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any], requireExpects = requireExpects.asInstanceOf[js.Any], scrolltop = scrolltop.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], urlConfig = urlConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltertitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altertitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutostart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidepassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidepassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoglobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotrycatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notrycatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireExpects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireExpects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolltop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolltop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlConfig(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

