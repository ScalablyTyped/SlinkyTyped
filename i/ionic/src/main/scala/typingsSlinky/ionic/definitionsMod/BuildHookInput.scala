package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.buildColonafter
import typingsSlinky.ionic.ionicStrings.buildColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildHookInput extends HookInput {
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions = js.native
  val name: buildColonbefore | buildColonafter = js.native
}

object BuildHookInput {
  @scala.inline
  def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHookInput]
  }
  @scala.inline
  implicit class BuildHookInputOps[Self <: BuildHookInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: buildColonbefore | buildColonafter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

