package typingsSlinky.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutAMDModule extends js.Object {
  var baseDir: String = js.native
  var disposeMethod: String = js.native
  var initializer: String = js.native
  var templateProperty: String = js.native
}

object KnockoutAMDModule {
  @scala.inline
  def apply(baseDir: String, disposeMethod: String, initializer: String, templateProperty: String): KnockoutAMDModule = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], disposeMethod = disposeMethod.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], templateProperty = templateProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDModule]
  }
  @scala.inline
  implicit class KnockoutAMDModuleOps[Self <: KnockoutAMDModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisposeMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitializer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

