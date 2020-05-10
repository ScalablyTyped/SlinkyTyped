package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedEntitiesForOrganizationResponse extends js.Object {
  /**
    * A JSON set of elements including the awsAccountId and its entityArn, entityValue and its entityArn, lastUpdatedTime, statusCode, and tags.
    */
  var entities: js.UndefOr[EntityList] = js.native
  /**
    * A JSON set of elements of the failed response, including the awsAccountId, errorMessage, errorName, and eventArn.
    */
  var failedSet: js.UndefOr[DescribeAffectedEntitiesForOrganizationFailedSet] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typingsSlinky.awsSdk.healthMod.nextToken] = js.native
}

object DescribeAffectedEntitiesForOrganizationResponse {
  @scala.inline
  def apply(): DescribeAffectedEntitiesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeAffectedEntitiesForOrganizationResponseOps[Self <: DescribeAffectedEntitiesForOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: EntityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedSet(value: DescribeAffectedEntitiesForOrganizationFailedSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedSet")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: nextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

