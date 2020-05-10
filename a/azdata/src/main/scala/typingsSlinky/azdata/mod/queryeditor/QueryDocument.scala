package typingsSlinky.azdata.mod.queryeditor

import typingsSlinky.azdata.mod.connection.ConnectionProfile
import typingsSlinky.azdata.mod.window.DialogTab
import typingsSlinky.std.Map
import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDocument extends js.Object {
  var providerId: String = js.native
  var uri: String = js.native
  // connect the query document using the given connection profile
  def connect(connectionProfile: ConnectionProfile): Thenable[Unit] = js.native
  // tab content is build using the modelview UI builder APIs
  // probably should rename DialogTab class since it is useful outside dialogs
  def createQueryTab(tab: DialogTab): Unit = js.native
  // set the document's execution options
  def setExecutionOptions(options: Map[String, _]): Thenable[Unit] = js.native
}

object QueryDocument {
  @scala.inline
  def apply(
    connect: ConnectionProfile => Thenable[Unit],
    createQueryTab: DialogTab => Unit,
    providerId: String,
    setExecutionOptions: Map[String, _] => Thenable[Unit],
    uri: String
  ): QueryDocument = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), createQueryTab = js.Any.fromFunction1(createQueryTab), providerId = providerId.asInstanceOf[js.Any], setExecutionOptions = js.Any.fromFunction1(setExecutionOptions), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocument]
  }
  @scala.inline
  implicit class QueryDocumentOps[Self <: QueryDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: ConnectionProfile => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateQueryTab(value: DialogTab => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQueryTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExecutionOptions(value: Map[String, _] => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExecutionOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

