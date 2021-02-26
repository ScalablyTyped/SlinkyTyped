package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.all
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.b
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.closed
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.d
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.g
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.green
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.h
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.k
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.kb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.mb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.micros
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ms
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.open
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.p
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.pb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.red
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.s
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.t
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.tb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatIndices extends Generic {
  
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.native
  
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var h: js.UndefOr[String | js.Array[String]] = js.native
  
  var health: js.UndefOr[green | yellow | red] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var include_unloaded_segments: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var master_timeout: js.UndefOr[String] = js.native
  
  var pri: js.UndefOr[Boolean] = js.native
  
  var s: js.UndefOr[String | js.Array[String]] = js.native
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  
  var v: js.UndefOr[Boolean] = js.native
}
object CatIndices {
  
  @scala.inline
  def apply(): CatIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatIndices]
  }
  
  @scala.inline
  implicit class CatIndicesMutableBuilder[Self <: CatIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: b | k | kb | m | mb | g | gb | t | tb | p | pb): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setH(value: String | js.Array[String]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def setHVarargs(value: String*): Self = StObject.set(x, "h", js.Array(value :_*))
    
    @scala.inline
    def setHealth(value: green | yellow | red): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setInclude_unloaded_segments(value: Boolean): Self = StObject.set(x, "include_unloaded_segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_unloaded_segmentsUndefined: Self = StObject.set(x, "include_unloaded_segments", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setPri(value: Boolean): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriUndefined: Self = StObject.set(x, "pri", js.undefined)
    
    @scala.inline
    def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    @scala.inline
    def setTime(value: d | h | m | s | ms | micros | nanos): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
