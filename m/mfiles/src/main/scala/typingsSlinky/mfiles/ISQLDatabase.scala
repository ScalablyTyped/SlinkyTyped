package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDBEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISQLDatabase extends js.Object {
  var AdminUser: IImpersonation = js.native
  var BasicUser: IImpersonation = js.native
  var Engine: MFDBEngine = js.native
  var Name: String = js.native
  var Server: String = js.native
  def Clone(): ISQLDatabase = js.native
}

object ISQLDatabase {
  @scala.inline
  def apply(
    AdminUser: IImpersonation,
    BasicUser: IImpersonation,
    Clone: () => ISQLDatabase,
    Engine: MFDBEngine,
    Name: String,
    Server: String
  ): ISQLDatabase = {
    val __obj = js.Dynamic.literal(AdminUser = AdminUser.asInstanceOf[js.Any], BasicUser = BasicUser.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Engine = Engine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISQLDatabase]
  }
  @scala.inline
  implicit class ISQLDatabaseOps[Self <: ISQLDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminUser(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasicUser(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BasicUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISQLDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEngine(value: MFDBEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

