package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCflags extends js.Object {
  var cflags: js.Array[_] = js.native
  var default_configuration: java.lang.String = js.native
  var defines: js.Array[java.lang.String] = js.native
  var include_dirs: js.Array[java.lang.String] = js.native
  var libraries: js.Array[java.lang.String] = js.native
}

object AnonCflags {
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: java.lang.String,
    defines: js.Array[java.lang.String],
    include_dirs: js.Array[java.lang.String],
    libraries: js.Array[java.lang.String]
  ): AnonCflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCflags]
  }
  @scala.inline
  implicit class AnonCflagsOps[Self <: AnonCflags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCflags(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cflags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_configuration(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefines(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude_dirs(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_dirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraries(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

