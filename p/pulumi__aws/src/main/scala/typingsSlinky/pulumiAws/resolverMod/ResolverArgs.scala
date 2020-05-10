package typingsSlinky.pulumiAws.resolverMod

import typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverArgs extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: Input[String] = js.native
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: Input[String] = js.native
  /**
    * The resolver type. Valid values are `UNIT` and `PIPELINE`.
    */
  val kind: js.UndefOr[Input[String]] = js.native
  /**
    * The PipelineConfig. A `pipelineConfig` block is documented below.
    */
  val pipelineConfig: js.UndefOr[Input[ResolverPipelineConfig]] = js.native
  /**
    * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
    */
  val requestTemplate: Input[String] = js.native
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: Input[String] = js.native
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: Input[String] = js.native
}

object ResolverArgs {
  @scala.inline
  def apply(
    apiId: Input[String],
    field: Input[String],
    requestTemplate: Input[String],
    responseTemplate: Input[String],
    `type`: Input[String]
  ): ResolverArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverArgs]
  }
  @scala.inline
  implicit class ResolverArgsOps[Self <: ResolverArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTemplate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseTemplate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineConfig(value: Input[ResolverPipelineConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineConfig")(js.undefined)
        ret
    }
  }
  
}

