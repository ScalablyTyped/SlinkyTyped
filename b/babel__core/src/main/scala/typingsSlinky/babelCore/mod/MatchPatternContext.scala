package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchPatternContext extends js.Object {
  var caller: js.UndefOr[TransformCaller] = js.native
  var dirname: String = js.native
  var envName: String = js.native
}

object MatchPatternContext {
  @scala.inline
  def apply(dirname: String, envName: String): MatchPatternContext = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], envName = envName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPatternContext]
  }
  @scala.inline
  implicit class MatchPatternContextOps[Self <: MatchPatternContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller(value: TransformCaller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(js.undefined)
        ret
    }
  }
  
}

