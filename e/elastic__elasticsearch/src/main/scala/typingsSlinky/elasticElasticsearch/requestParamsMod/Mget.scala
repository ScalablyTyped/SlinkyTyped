package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mget[T] extends Generic {
  
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  
  var body: T = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var preference: js.UndefOr[String] = js.native
  
  var realtime: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Mget {
  
  @scala.inline
  def apply[T](body: T): Mget[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mget[T]]
  }
  
  @scala.inline
  implicit class MgetOps[Self <: Mget[_], T] (val x: Self with Mget[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = this.set("_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = this.set("_source_exclude", js.Array(value :_*))
    
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = this.set("_source_exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_exclude: Self = this.set("_source_exclude", js.undefined)
    
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = this.set("_source_excludes", js.Array(value :_*))
    
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = this.set("_source_excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_excludes: Self = this.set("_source_excludes", js.undefined)
    
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = this.set("_source_include", js.Array(value :_*))
    
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = this.set("_source_include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_include: Self = this.set("_source_include", js.undefined)
    
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = this.set("_source_includes", js.Array(value :_*))
    
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = this.set("_source_includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_source_includes: Self = this.set("_source_includes", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setStored_fieldsVarargs(value: String*): Self = this.set("stored_fields", js.Array(value :_*))
    
    @scala.inline
    def setStored_fields(value: String | js.Array[String]): Self = this.set("stored_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStored_fields: Self = this.set("stored_fields", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
