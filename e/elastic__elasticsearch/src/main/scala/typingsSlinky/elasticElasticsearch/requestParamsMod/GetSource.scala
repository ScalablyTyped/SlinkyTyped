package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.force
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSource extends Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  
  var id: String = js.native
  
  var index: String = js.native
  
  var preference: js.UndefOr[String] = js.native
  
  var realtime: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.native
}
object GetSource {
  
  @scala.inline
  def apply(id: String, index: String): GetSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSource]
  }
  
  @scala.inline
  implicit class GetSourceMutableBuilder[Self <: GetSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersion_type(value: internal | external | external_gte | force): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
    
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
    
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = StObject.set(x, "_source_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludeUndefined: Self = StObject.set(x, "_source_exclude", js.undefined)
    
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = StObject.set(x, "_source_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
    
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = StObject.set(x, "_source_excludes", js.Array(value :_*))
    
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = StObject.set(x, "_source_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includeUndefined: Self = StObject.set(x, "_source_include", js.undefined)
    
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = StObject.set(x, "_source_include", js.Array(value :_*))
    
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
    
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = StObject.set(x, "_source_includes", js.Array(value :_*))
  }
}
