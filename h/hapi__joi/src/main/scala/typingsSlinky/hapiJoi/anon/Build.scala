package typingsSlinky.hapiJoi.anon

import typingsSlinky.hapiJoi.mod.ExtensionBoundSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
  }
  
}

