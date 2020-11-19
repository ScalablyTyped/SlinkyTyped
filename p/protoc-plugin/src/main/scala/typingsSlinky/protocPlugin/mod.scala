package typingsSlinky.protocPlugin

import typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  
  def CodeGeneratorRequest(): js.Promise[typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorRequest] = js.native
  
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  
  def CodeGeneratorResponseError(): js.Function1[/* err */ js.Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ js.Error, Unit] = js.native
  
  def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = js.native
  
  type OutputFiles = js.Array[typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File.AsObject]
  
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FileDescriptorProto.AsObject], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}
