package typingsSlinky.aceDiff.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  var connector: String = js.native
  var deletedCodeConnectorLinkContent: String = js.native
  var diff: String = js.native
  var newCodeConnectorLinkContent: String = js.native
}

object Connector {
  @scala.inline
  def apply(
    connector: String,
    deletedCodeConnectorLinkContent: String,
    diff: String,
    newCodeConnectorLinkContent: String
  ): Connector = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], deletedCodeConnectorLinkContent = deletedCodeConnectorLinkContent.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], newCodeConnectorLinkContent = newCodeConnectorLinkContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedCodeConnectorLinkContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCodeConnectorLinkContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewCodeConnectorLinkContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCodeConnectorLinkContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

