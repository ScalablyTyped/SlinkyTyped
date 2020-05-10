package typingsSlinky.pulumiKubernetes.outputMod.pkg.version

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
@js.native
trait Info extends js.Object {
  val buildDate: String = js.native
  val compiler: String = js.native
  val gitCommit: String = js.native
  val gitTreeState: String = js.native
  val gitVersion: String = js.native
  val goVersion: String = js.native
  val major: String = js.native
  val minor: String = js.native
  val platform: String = js.native
}

object Info {
  @scala.inline
  def apply(
    buildDate: String,
    compiler: String,
    gitCommit: String,
    gitTreeState: String,
    gitVersion: String,
    goVersion: String,
    major: String,
    minor: String,
    platform: String
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
    def withBuildDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitTreeState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitTreeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

