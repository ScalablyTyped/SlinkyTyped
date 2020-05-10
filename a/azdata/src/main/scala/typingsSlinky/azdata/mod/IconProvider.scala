package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconProvider extends DataProvider {
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[String] = js.native
}

object IconProvider {
  @scala.inline
  def apply(getConnectionIconId: (IConnectionProfile, ServerInfo) => Thenable[String], providerId: String): IconProvider = {
    val __obj = js.Dynamic.literal(getConnectionIconId = js.Any.fromFunction2(getConnectionIconId), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
  @scala.inline
  implicit class IconProviderOps[Self <: IconProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnectionIconId(value: (IConnectionProfile, ServerInfo) => Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionIconId")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

