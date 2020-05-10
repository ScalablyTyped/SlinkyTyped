package typingsSlinky.awsKcl.mod

import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-kcl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(recordProcessor: RecordProcessor): KCLManager = js.native
  def apply(recordProcessor: RecordProcessor, inputFile: ReadStream): KCLManager = js.native
  def apply(recordProcessor: RecordProcessor, inputFile: ReadStream, outputFile: WriteStream): KCLManager = js.native
  def apply(
    recordProcessor: RecordProcessor,
    inputFile: ReadStream,
    outputFile: WriteStream,
    errorFile: WriteStream
  ): KCLManager = js.native
}

