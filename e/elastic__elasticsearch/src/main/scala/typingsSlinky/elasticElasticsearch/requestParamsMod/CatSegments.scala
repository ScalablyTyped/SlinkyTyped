package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.b
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.g
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.k
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.kb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.mb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.p
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.pb
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.t
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.tb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatSegments extends Generic {
  
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var h: js.UndefOr[String | js.Array[String]] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String | js.Array[String]] = js.native
  
  var s: js.UndefOr[String | js.Array[String]] = js.native
  
  var v: js.UndefOr[Boolean] = js.native
}
object CatSegments {
  
  @scala.inline
  def apply(): CatSegments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatSegments]
  }
  
  @scala.inline
  implicit class CatSegmentsMutableBuilder[Self <: CatSegments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: b | k | kb | m | mb | g | gb | t | tb | p | pb): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
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
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    @scala.inline
    def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
