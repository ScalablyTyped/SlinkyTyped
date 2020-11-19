package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.create
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.index
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.internal
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[T] extends Generic {
  
  var body: T = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var if_primary_term: js.UndefOr[Double] = js.native
  
  var if_seq_no: js.UndefOr[Double] = js.native
  
  var index: String = js.native
  
  var op_type: js.UndefOr[index | create] = js.native
  
  var pipeline: js.UndefOr[String] = js.native
  
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  
  var routing: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var version_type: js.UndefOr[internal | external | external_gte] = js.native
  
  var wait_for_active_shards: js.UndefOr[String] = js.native
}
object Index {
  
  @scala.inline
  def apply[T](body: T, index: String): Index[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
    
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIf_primary_term(value: Double): Self = this.set("if_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_primary_term: Self = this.set("if_primary_term", js.undefined)
    
    @scala.inline
    def setIf_seq_no(value: Double): Self = this.set("if_seq_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_seq_no: Self = this.set("if_seq_no", js.undefined)
    
    @scala.inline
    def setOp_type(value: index | create): Self = this.set("op_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOp_type: Self = this.set("op_type", js.undefined)
    
    @scala.inline
    def setPipeline(value: String): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    
    @scala.inline
    def setRefresh(value: `true` | `false` | wait_for): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersion_type(value: internal | external | external_gte): Self = this.set("version_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion_type: Self = this.set("version_type", js.undefined)
    
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
  }
}
