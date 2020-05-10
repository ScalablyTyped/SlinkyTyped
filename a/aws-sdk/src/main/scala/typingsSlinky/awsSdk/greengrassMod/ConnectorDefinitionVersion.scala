package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorDefinitionVersion extends js.Object {
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[listOfConnector] = js.native
}

object ConnectorDefinitionVersion {
  @scala.inline
  def apply(): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
  @scala.inline
  implicit class ConnectorDefinitionVersionOps[Self <: ConnectorDefinitionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectors(value: listOfConnector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connectors")(js.undefined)
        ret
    }
  }
  
}

