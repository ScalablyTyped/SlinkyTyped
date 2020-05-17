package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cflags extends js.Object {
  var cflags: js.Array[_] = js.native
  var default_configuration: String = js.native
  var defines: js.Array[String] = js.native
  var include_dirs: js.Array[String] = js.native
  var libraries: js.Array[String] = js.native
}

object Cflags {
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: String,
    defines: js.Array[String],
    include_dirs: js.Array[String],
    libraries: js.Array[String]
  ): Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags.asInstanceOf[js.Any], default_configuration = default_configuration.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], include_dirs = include_dirs.asInstanceOf[js.Any], libraries = libraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cflags]
  }
  @scala.inline
  implicit class CflagsOps[Self <: Cflags] (val x: Self) extends AnyVal {
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
    def withDefault_configuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude_dirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_dirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

