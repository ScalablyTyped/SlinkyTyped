package typingsSlinky.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  var assets: js.Array[String] = js.native
  var hooks: typingsSlinky.reactNativeCommunityCli.mod.Hooks = js.native
  var params: js.Array[_] = js.native
  var platforms: Android = js.native
}

object Hooks {
  @scala.inline
  def apply(
    assets: js.Array[String],
    hooks: typingsSlinky.reactNativeCommunityCli.mod.Hooks,
    params: js.Array[_],
    platforms: Android
  ): Hooks = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooks(value: typingsSlinky.reactNativeCommunityCli.mod.Hooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatforms(value: Android): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

