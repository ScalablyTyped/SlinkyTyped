package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeInvokeMod {
  
  @JSImport("@pulumi/pulumi/runtime/invoke", "StreamInvokeResponse")
  @js.native
  class StreamInvokeResponse[T] protected () extends AsyncIterable[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    
    def cancel(): Unit = js.native
    
    var cancelSource: js.Any = js.native
    
    var source: js.Any = js.native
  }
  
  @JSImport("@pulumi/pulumi/runtime/invoke", "invoke")
  @js.native
  def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
  @JSImport("@pulumi/pulumi/runtime/invoke", "invoke")
  @js.native
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/invoke", "streamInvoke")
  @js.native
  def streamInvoke(tok: String, props: Inputs): js.Promise[StreamInvokeResponse[_]] = js.native
  @JSImport("@pulumi/pulumi/runtime/invoke", "streamInvoke")
  @js.native
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[StreamInvokeResponse[_]] = js.native
}
