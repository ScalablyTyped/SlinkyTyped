package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverRequest extends js.Object {
  /**
    * The ID for the GraphQL API for which the resolver is being created.
    */
  var apiId: String = js.native
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.native
  /**
    * The name of the data source for which the resolver is being created.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the field to attach the resolver to.
    */
  var fieldName: ResourceName = js.native
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.native
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.native
  /**
    * The mapping template to be used for requests. A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
    */
  var requestMappingTemplate: MappingTemplate = js.native
  /**
    * The mapping template to be used for responses from the data source.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  /**
    * The SyncConfig for a resolver attached to a versioned datasource.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.native
  /**
    * The name of the Type.
    */
  var typeName: ResourceName = js.native
}

object CreateResolverRequest {
  @scala.inline
  def apply(
    apiId: String,
    fieldName: ResourceName,
    requestMappingTemplate: MappingTemplate,
    typeName: ResourceName
  ): CreateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRequest]
  }
  @scala.inline
  implicit class CreateResolverRequestOps[Self <: CreateResolverRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestMappingTemplate(value: MappingTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMappingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachingConfig(value: CachingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: ResolverKind): Self = {
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
    def withPipelineConfig(value: PipelineConfig): Self = {
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
    def withResponseMappingTemplate(value: MappingTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMappingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseMappingTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMappingTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncConfig(value: SyncConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncConfig")(js.undefined)
        ret
    }
  }
  
}

