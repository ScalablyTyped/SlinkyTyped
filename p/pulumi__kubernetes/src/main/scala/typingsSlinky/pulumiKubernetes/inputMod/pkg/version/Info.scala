package typingsSlinky.pulumiKubernetes.inputMod.pkg.version

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
@js.native
trait Info extends js.Object {
  var buildDate: Input[String] = js.native
  var compiler: Input[String] = js.native
  var gitCommit: Input[String] = js.native
  var gitTreeState: Input[String] = js.native
  var gitVersion: Input[String] = js.native
  var goVersion: Input[String] = js.native
  var major: Input[String] = js.native
  var minor: Input[String] = js.native
  var platform: Input[String] = js.native
}

object Info {
  @scala.inline
  def apply(
    buildDate: Input[String],
    compiler: Input[String],
    gitCommit: Input[String],
    gitTreeState: Input[String],
    gitVersion: Input[String],
    goVersion: Input[String],
    major: Input[String],
    minor: Input[String],
    platform: Input[String]
  ): Info = {
    val __obj = js.Dynamic.literal(buildDate = buildDate.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], gitTreeState = gitTreeState.asInstanceOf[js.Any], gitVersion = gitVersion.asInstanceOf[js.Any], goVersion = goVersion.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildDate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiler(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitCommit(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitTreeState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitTreeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

