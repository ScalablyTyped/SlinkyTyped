package typingsSlinky.reactNativeCommunityCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlatforms extends js.Object {
  var platforms: js.Array[String] = js.native
  var providesModuleNodeModules: js.Array[String] = js.native
}

object AnonPlatforms {
  @scala.inline
  def apply(platforms: js.Array[String], providesModuleNodeModules: js.Array[String]): AnonPlatforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlatforms]
  }
  @scala.inline
  implicit class AnonPlatformsOps[Self <: AnonPlatforms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvidesModuleNodeModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providesModuleNodeModules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

