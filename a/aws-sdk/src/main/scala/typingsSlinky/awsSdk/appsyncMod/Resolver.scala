package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolver extends StObject {
  
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.native
  
  /**
    * The resolver data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The resolver field name.
    */
  var fieldName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.native
  
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.native
  
  /**
    * The request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  
  /**
    * The resolver ARN.
    */
  var resolverArn: js.UndefOr[String] = js.native
  
  /**
    * The response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  
  /**
    * The SyncConfig for a resolver attached to a versioned datasource.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.native
  
  /**
    * The resolver type name.
    */
  var typeName: js.UndefOr[ResourceName] = js.native
}
object Resolver {
  
  @scala.inline
  def apply(): Resolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolver]
  }
  
  @scala.inline
  implicit class ResolverMutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachingConfig(value: CachingConfig): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
    
    @scala.inline
    def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    @scala.inline
    def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setKind(value: ResolverKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPipelineConfig(value: PipelineConfig): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
    
    @scala.inline
    def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    @scala.inline
    def setResolverArn(value: String): Self = StObject.set(x, "resolverArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverArnUndefined: Self = StObject.set(x, "resolverArn", js.undefined)
    
    @scala.inline
    def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    
    @scala.inline
    def setSyncConfig(value: SyncConfig): Self = StObject.set(x, "syncConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncConfigUndefined: Self = StObject.set(x, "syncConfig", js.undefined)
    
    @scala.inline
    def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
