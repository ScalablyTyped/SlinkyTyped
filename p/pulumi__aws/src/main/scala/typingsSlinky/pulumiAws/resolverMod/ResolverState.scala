package typingsSlinky.pulumiAws.resolverMod

import typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverState extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  /**
    * The field name from the schema defined in the GraphQL API.
    */
  val field: js.UndefOr[Input[String]] = js.native
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
  val requestTemplate: js.UndefOr[Input[String]] = js.native
  /**
    * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
    */
  val responseTemplate: js.UndefOr[Input[String]] = js.native
  /**
    * The type name from the schema defined in the GraphQL API.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object ResolverState {
  @scala.inline
  def apply(): ResolverState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverState]
  }
  @scala.inline
  implicit class ResolverStateOps[Self <: ResolverState] (val x: Self) extends AnyVal {
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
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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
    def withField(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
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
    @scala.inline
    def withRequestTemplate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTemplate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

