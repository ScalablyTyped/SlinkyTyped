package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.b
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.d
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.g
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.h
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.k
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.kb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.mb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.micros
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ms
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.p
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.pb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.s
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.t
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.tb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatNodes extends Generic {
  
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var full_id: js.UndefOr[Boolean] = js.native
  
  var h: js.UndefOr[String | js.Array[String]] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var s: js.UndefOr[String | js.Array[String]] = js.native
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  
  var v: js.UndefOr[Boolean] = js.native
}
object CatNodes {
  
  @scala.inline
  def apply(): CatNodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatNodes]
  }
  
  @scala.inline
  implicit class CatNodesOps[Self <: CatNodes] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: b | k | kb | m | mb | g | gb | t | tb | p | pb): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFull_id(value: Boolean): Self = this.set("full_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_id: Self = this.set("full_id", js.undefined)
    
    @scala.inline
    def setHVarargs(value: String*): Self = this.set("h", js.Array(value :_*))
    
    @scala.inline
    def setH(value: String | js.Array[String]): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    
    @scala.inline
    def setS(value: String | js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setTime(value: d | h | m | s | ms | micros | nanos): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setV(value: Boolean): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
