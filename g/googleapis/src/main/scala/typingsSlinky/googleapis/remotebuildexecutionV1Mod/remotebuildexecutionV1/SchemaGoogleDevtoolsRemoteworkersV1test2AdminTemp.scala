package typingsSlinky.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AdminTemp is a prelimiary set of administration tasks. It&#39;s called
  * &quot;Temp&quot; because we do not yet know the best way to represent admin
  * tasks; it&#39;s possible that this will be entirely replaced in later
  * versions of this API. If this message proves to be sufficient, it will be
  * renamed in the alpha or beta release of this API.  This message (suitably
  * marshalled into a protobuf.Any) can be used as the inline_assignment field
  * in a lease; the lease assignment field should simply be `&quot;admin&quot;`
  * in these cases.  This message is heavily based on Swarming administration
  * tasks from the LUCI project
  * (http://github.com/luci/luci-py/appengine/swarming).
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp extends js.Object {
  /**
    * The argument to the admin action; see `Command` for semantics.
    */
  var arg: js.UndefOr[String] = js.native
  /**
    * The admin action; see `Command` for legal values.
    */
  var command: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2AdminTempOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arg")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
  }
  
}

