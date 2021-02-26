package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
@js.native
trait SchemaUrlCrawlErrorsCountsQueryResponse extends StObject {
  
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[SchemaUrlCrawlErrorCountsPerType]] = js.native
}
object SchemaUrlCrawlErrorsCountsQueryResponse {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsCountsQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorsCountsQueryResponseMutableBuilder[Self <: SchemaUrlCrawlErrorsCountsQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountPerTypes(value: js.Array[SchemaUrlCrawlErrorCountsPerType]): Self = StObject.set(x, "countPerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountPerTypesUndefined: Self = StObject.set(x, "countPerTypes", js.undefined)
    
    @scala.inline
    def setCountPerTypesVarargs(value: SchemaUrlCrawlErrorCountsPerType*): Self = StObject.set(x, "countPerTypes", js.Array(value :_*))
  }
}
