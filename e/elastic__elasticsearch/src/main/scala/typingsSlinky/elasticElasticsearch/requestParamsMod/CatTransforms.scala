package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.d
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.h
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.micros
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ms
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatTransforms extends Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var h: js.UndefOr[String | js.Array[String]] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var s: js.UndefOr[String | js.Array[String]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  
  var transform_id: js.UndefOr[String] = js.native
  
  var v: js.UndefOr[Boolean] = js.native
}
object CatTransforms {
  
  @scala.inline
  def apply(): CatTransforms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatTransforms]
  }
  
  @scala.inline
  implicit class CatTransformsMutableBuilder[Self <: CatTransforms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
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
    def setS(value: String | js.Array[String]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setSVarargs(value: String*): Self = StObject.set(x, "s", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTime(value: d | h | m | s | ms | micros | nanos): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform_idUndefined: Self = StObject.set(x, "transform_id", js.undefined)
    
    @scala.inline
    def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
