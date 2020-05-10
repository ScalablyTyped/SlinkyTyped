package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRecommenderConfiguration extends js.Object {
  /**
    * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommenderUserIdType property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message variable in a message template. In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute. The display name appears in the Attribute finder pane of the template editor on the Amazon Pinpoint console. The following restrictions apply to these names: An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique. An attribute display name must start with a letter or number and it can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-). This object is required if the configuration invokes an AWS Lambda function (LambdaFunctionArn) to process recommendation data. Otherwise, don't include this object in your request.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * A custom description of the configuration for the recommender model. The description can contain up to 128 characters.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * A custom name of the configuration for the recommender model. The name must start with a letter or number and it can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint application. Valid values are: PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value. PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in Amazon Pinpoint has to specify a both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
    */
  var RecommendationProviderIdType: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation data from the recommender model.
    */
  var RecommendationProviderRoleArn: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must match the ARN of an Amazon Personalize campaign.
    */
  var RecommendationProviderUri: string = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of recommendation data that's retrieved from the recommender model.
    */
  var RecommendationTransformerUri: js.UndefOr[string] = js.native
  /**
    * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores a recommended item for each endpoint or user, depending on the value for the RecommenderUserIdType property. This value is required if the configuration doesn't invoke an AWS Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data. This name appears in the Attribute finder pane of the template editor on the Amazon Pinpoint console. The name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-). These restrictions don't apply to attribute values.
    */
  var RecommendationsDisplayName: js.UndefOr[string] = js.native
  /**
    * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for the RecommenderUserIdType property. This number determines how many recommended attributes are available for use as message variables in message templates. The minimum value is 1. The maximum value is 5. The default value is 5. To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda function (LambdaFunctionArn) to perform additional processing of recommendation data.
    */
  var RecommendationsPerMessage: js.UndefOr[integer] = js.native
}

object CreateRecommenderConfiguration {
  @scala.inline
  def apply(RecommendationProviderRoleArn: string, RecommendationProviderUri: string): CreateRecommenderConfiguration = {
    val __obj = js.Dynamic.literal(RecommendationProviderRoleArn = RecommendationProviderRoleArn.asInstanceOf[js.Any], RecommendationProviderUri = RecommendationProviderUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfiguration]
  }
  @scala.inline
  implicit class CreateRecommenderConfigurationOps[Self <: CreateRecommenderConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

