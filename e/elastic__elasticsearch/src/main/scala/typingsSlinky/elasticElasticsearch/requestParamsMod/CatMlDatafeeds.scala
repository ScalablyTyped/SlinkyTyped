package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.d
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.h
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.micros
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ms
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatMlDatafeeds extends Generic {
  
  var allow_no_datafeeds: js.UndefOr[Boolean] = js.native
  
  var datafeed_id: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var h: js.UndefOr[String | js.Array[String]] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var s: js.UndefOr[String | js.Array[String]] = js.native
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  
  var v: js.UndefOr[Boolean] = js.native
}
object CatMlDatafeeds {
  
  @scala.inline
  def apply(): CatMlDatafeeds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlDatafeeds]
  }
  
  @scala.inline
  implicit class CatMlDatafeedsOps[Self <: CatMlDatafeeds] (val x: Self) extends AnyVal {
    
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
    def setAllow_no_datafeeds(value: Boolean): Self = this.set("allow_no_datafeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_datafeeds: Self = this.set("allow_no_datafeeds", js.undefined)
    
    @scala.inline
    def setDatafeed_id(value: String): Self = this.set("datafeed_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatafeed_id: Self = this.set("datafeed_id", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
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
