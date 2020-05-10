package typingsSlinky.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasteConfig extends js.Object {
  var computeSha1: js.UndefOr[Boolean] = js.native
  var defaultPlatform: js.UndefOr[String | Null] = js.native
  var hasteImplModulePath: js.UndefOr[String] = js.native
  var platforms: js.UndefOr[js.Array[String]] = js.native
  var providesModuleNodeModules: js.Array[String] = js.native
  var throwOnModuleCollision: js.UndefOr[Boolean] = js.native
}

object HasteConfig {
  @scala.inline
  def apply(providesModuleNodeModules: js.Array[String]): HasteConfig = {
    val __obj = js.Dynamic.literal(providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteConfig]
  }
  @scala.inline
  implicit class HasteConfigOps[Self <: HasteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvidesModuleNodeModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesModuleNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeSha1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeSha1")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPlatformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPlatform")(null)
        ret
    }
    @scala.inline
    def withHasteImplModulePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasteImplModulePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteImplModulePath")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnModuleCollision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnModuleCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnModuleCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnModuleCollision")(js.undefined)
        ret
    }
  }
  
}

