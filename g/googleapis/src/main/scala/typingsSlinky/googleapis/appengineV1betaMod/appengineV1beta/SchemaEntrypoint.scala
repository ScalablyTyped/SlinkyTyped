package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entrypoint for the application.
  */
@js.native
trait SchemaEntrypoint extends js.Object {
  /**
    * The format should be a shell command that can be fed to bash -c.
    */
  var shell: js.UndefOr[String] = js.native
}

object SchemaEntrypoint {
  @scala.inline
  def apply(): SchemaEntrypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntrypoint]
  }
  @scala.inline
  implicit class SchemaEntrypointOps[Self <: SchemaEntrypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(js.undefined)
        ret
    }
  }
  
}

