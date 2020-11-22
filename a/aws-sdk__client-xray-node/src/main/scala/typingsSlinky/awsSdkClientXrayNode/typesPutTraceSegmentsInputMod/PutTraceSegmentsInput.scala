package typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTraceSegmentsInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
  ] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>A string containing a JSON document defining one or more segments or subsegments.</p>
    */
  var TraceSegmentDocuments: js.Array[String] | js.Iterable[String] = js.native
}
object PutTraceSegmentsInput {
  
  @scala.inline
  def apply(TraceSegmentDocuments: js.Array[String] | js.Iterable[String]): PutTraceSegmentsInput = {
    val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsInput]
  }
  
  @scala.inline
  implicit class PutTraceSegmentsInputOps[Self <: PutTraceSegmentsInput] (val x: Self) extends AnyVal {
    
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
    def setTraceSegmentDocumentsVarargs(value: String*): Self = this.set("TraceSegmentDocuments", js.Array(value :_*))
    
    @scala.inline
    def setTraceSegmentDocumentsIterable(value: js.Iterable[String]): Self = this.set("TraceSegmentDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSegmentDocuments(value: js.Array[String] | js.Iterable[String]): Self = this.set("TraceSegmentDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
    ): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
  }
}
