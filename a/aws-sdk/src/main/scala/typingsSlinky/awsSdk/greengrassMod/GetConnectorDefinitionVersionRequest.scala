package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectorDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: string = js.native
  /**
    * The ID of the connector definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListConnectorDefinitionVersions'' requests. If the version is the last one that was associated with a connector definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ConnectorDefinitionVersionId: string = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object GetConnectorDefinitionVersionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: string, ConnectorDefinitionVersionId: string): GetConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any], ConnectorDefinitionVersionId = ConnectorDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorDefinitionVersionRequest]
  }
  @scala.inline
  implicit class GetConnectorDefinitionVersionRequestOps[Self <: GetConnectorDefinitionVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectorDefinitionVersionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectorDefinitionVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

