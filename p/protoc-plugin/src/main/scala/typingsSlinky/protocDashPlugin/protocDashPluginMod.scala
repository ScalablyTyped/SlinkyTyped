package typingsSlinky.protocDashPlugin

import typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo.Location.AsObject
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.protocDashPlugin.protocDashPluginMod.OutputFiles
import typingsSlinky.protocDashPlugin.protocDashPluginMod.SimplePluginCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoc-plugin", JSImport.Namespace)
@js.native
object protocDashPluginMod extends js.Object {
  def apply(cb: SimplePluginCallback): js.Promise[Unit] = js.native
  def CodeGeneratorRequest(): js.Promise[
    typingsSlinky.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorRequest(stdin: Readable): js.Promise[
    typingsSlinky.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ] = js.native
  def CodeGeneratorResponse(): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponse(stdout: Writable): js.Function1[/* files */ OutputFiles, Unit] = js.native
  def CodeGeneratorResponseError(): js.Function1[/* err */ js.Error, Unit] = js.native
  def CodeGeneratorResponseError(stdout: Writable): js.Function1[/* err */ js.Error, Unit] = js.native
  def findCommentByPath(path: js.Array[Double], locationList: js.Array[AsObject]): String = js.native
  type OutputFiles = js.Array[
    typingsSlinky.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File.AsObject
  ]
  type SimplePluginCallback = js.Function1[
    /* filesToGenerate */ js.Array[
      typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto.AsObject
    ], 
    OutputFiles | js.Promise[OutputFiles]
  ]
}

