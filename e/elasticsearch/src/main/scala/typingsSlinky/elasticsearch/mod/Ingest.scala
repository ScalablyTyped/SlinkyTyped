package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Ingest")
@js.native
class Ingest () extends StObject {
  
  def deletePipeline(params: IngestDeletePipelineParams): js.Promise[_] = js.native
  def deletePipeline(
    params: IngestDeletePipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def getPipeline(params: IngestGetPipelineParams): js.Promise[_] = js.native
  def getPipeline(
    params: IngestGetPipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putPipeline(params: IngestPutPipelineParams): js.Promise[_] = js.native
  def putPipeline(
    params: IngestPutPipelineParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def simulate(params: IngestSimulateParams): js.Promise[_] = js.native
  def simulate(
    params: IngestSimulateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
}
