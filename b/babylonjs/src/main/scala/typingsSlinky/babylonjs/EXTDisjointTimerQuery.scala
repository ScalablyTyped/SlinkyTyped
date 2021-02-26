package typingsSlinky.babylonjs

import typingsSlinky.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTDisjointTimerQuery extends StObject {
  
  var GPU_DISJOINT_EXT: Double = js.native
  
  var QUERY_COUNTER_BITS_EXT: Double = js.native
  
  var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
  
  var QUERY_RESULT_EXT: Double = js.native
  
  var TIMESTAMP_EXT: Double = js.native
  
  var TIME_ELAPSED_EXT: Double = js.native
  
  def beginQueryEXT(target: Double, query: WebGLQuery): Unit = js.native
  
  def createQueryEXT(): WebGLQuery = js.native
  
  def deleteQueryEXT(query: WebGLQuery): Unit = js.native
  
  def endQueryEXT(target: Double): Unit = js.native
  
  def getQueryObjectEXT(query: WebGLQuery, target: Double): js.Any = js.native
  
  def queryCounterEXT(query: WebGLQuery, target: Double): Unit = js.native
}
object EXTDisjointTimerQuery {
  
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_COUNTER_BITS_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIMESTAMP_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, WebGLQuery) => Unit,
    createQueryEXT: () => WebGLQuery,
    deleteQueryEXT: WebGLQuery => Unit,
    endQueryEXT: Double => Unit,
    getQueryObjectEXT: (WebGLQuery, Double) => js.Any,
    queryCounterEXT: (WebGLQuery, Double) => Unit
  ): EXTDisjointTimerQuery = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIMESTAMP_EXT = TIMESTAMP_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), queryCounterEXT = js.Any.fromFunction2(queryCounterEXT))
    __obj.asInstanceOf[EXTDisjointTimerQuery]
  }
  
  @scala.inline
  implicit class EXTDisjointTimerQueryMutableBuilder[Self <: EXTDisjointTimerQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = StObject.set(x, "beginQueryEXT", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateQueryEXT(value: () => WebGLQuery): Self = StObject.set(x, "createQueryEXT", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = StObject.set(x, "deleteQueryEXT", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndQueryEXT(value: Double => Unit): Self = StObject.set(x, "endQueryEXT", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetQueryObjectEXT(value: (WebGLQuery, Double) => js.Any): Self = StObject.set(x, "getQueryObjectEXT", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQUERY_COUNTER_BITS_EXT(value: Double): Self = StObject.set(x, "QUERY_COUNTER_BITS_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUERY_RESULT_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCounterEXT(value: (WebGLQuery, Double) => Unit): Self = StObject.set(x, "queryCounterEXT", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTIMESTAMP_EXT(value: Double): Self = StObject.set(x, "TIMESTAMP_EXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
  }
}
