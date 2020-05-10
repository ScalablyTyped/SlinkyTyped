package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommenderConfigurationResponse extends js.Object {
  /**
    * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message variable in a message template. This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
    */
  var CreationDate: string = js.native
  /**
    * The custom description of the configuration for the recommender model.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the recommender model configuration.
    */
  var Id: string = js.native
  /**
    * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The custom name of the configuration for the recommender model.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint application. Possible values are: PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value. PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
    */
  var RecommendationProviderIdType: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation data from the recommender model.
    */
  var RecommendationProviderRoleArn: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data from. This value is the ARN of an Amazon Personalize campaign.
    */
  var RecommendationProviderUri: string = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform additional processing of recommendation data that it retrieves from the recommender model.
    */
  var RecommendationTransformerUri: js.UndefOr[string] = js.native
  /**
    * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This name appears in the Attribute finder pane of the template editor on the Amazon Pinpoint console. This value is null if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
    */
  var RecommendationsDisplayName: js.UndefOr[string] = js.native
  /**
    * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the value for the RecommenderUserIdType property. This number determines how many recommended attributes are available for use as message variables in message templates.
    */
  var RecommendationsPerMessage: js.UndefOr[integer] = js.native
}

object RecommenderConfigurationResponse {
  @scala.inline
  def apply(
    CreationDate: string,
    Id: string,
    LastModifiedDate: string,
    RecommendationProviderRoleArn: string,
    RecommendationProviderUri: string
  ): RecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], RecommendationProviderRoleArn = RecommendationProviderRoleArn.asInstanceOf[js.Any], RecommendationProviderUri = RecommendationProviderUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommenderConfigurationResponse]
  }
  @scala.inline
  implicit class RecommenderConfigurationResponseOps[Self <: RecommenderConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecommendationProviderRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationProviderRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecommendationProviderUri(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationProviderUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationProviderIdType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationProviderIdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationProviderIdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationProviderIdType")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationTransformerUri(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationTransformerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationTransformerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationTransformerUri")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationsDisplayName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationsDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationsDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationsDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationsPerMessage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationsPerMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationsPerMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendationsPerMessage")(js.undefined)
        ret
    }
  }
  
}

