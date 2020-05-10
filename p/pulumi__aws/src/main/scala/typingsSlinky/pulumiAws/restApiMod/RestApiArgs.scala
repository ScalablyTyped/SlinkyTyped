package typingsSlinky.pulumiAws.restApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.apigateway.RestApiEndpointConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestApiArgs extends js.Object {
  /**
    * The source of the API key for requests. Valid values are HEADER (default) and AUTHORIZER.
    */
  val apiKeySource: js.UndefOr[Input[String]] = js.native
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  val binaryMediaTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * An OpenAPI specification that defines the set of routes and integrations to create as part of the REST API.
    */
  val body: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the REST API
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument defining API endpoint configuration including endpoint type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[Input[RestApiEndpointConfiguration]] = js.native
  /**
    * Minimum response size to compress for the REST API. Integer between -1 and 10485760 (10MB). Setting a value greater than -1 will enable compression, -1 disables compression (default).
    */
  val minimumCompressionSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the REST API
    */
  val name: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RestApiArgs {
  @scala.inline
  def apply(): RestApiArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiArgs]
  }
  @scala.inline
  implicit class RestApiArgsOps[Self <: RestApiArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeySource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKeySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeySource")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryMediaTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryMediaTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryMediaTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryMediaTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointConfiguration(value: Input[RestApiEndpointConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumCompressionSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCompressionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumCompressionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCompressionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

