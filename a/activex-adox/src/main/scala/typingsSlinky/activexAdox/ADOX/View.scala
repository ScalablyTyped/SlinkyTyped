package typingsSlinky.activexAdox.ADOX

import typingsSlinky.activexAdodb.ADODB.Command
import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  @JSName("ADOX.View_typekey")
  var ADOXDotView_typekey: View = js.native
  var Command: typingsSlinky.activexAdodb.ADODB.Command = js.native
  val DateCreated: VarDate = js.native
  val DateModified: VarDate = js.native
  val Name: String = js.native
}

object View {
  @scala.inline
  def apply(
    ADOXDotView_typekey: View,
    Command: Command,
    DateCreated: VarDate,
    DateModified: VarDate,
    Name: String
  ): View = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.View_typekey")(ADOXDotView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADOXDotView_typekey(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADOX.View_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCreated(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateModified(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

