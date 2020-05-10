package typingsSlinky.mz.childProcessMod

import typingsSlinky.mz.encodingBufferEncodingExe
import typingsSlinky.mz.encodingbuffernullundefin
import typingsSlinky.mz.encodingstringnullExecOpt
import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Null,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(command: String, options: encodingBufferEncodingExe): js.Promise[js.Tuple2[String, String]] = js.native
  def apply(
    command: String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(command: String, options: encodingbuffernullundefin): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  def apply(
    command: String,
    options: encodingbuffernullundefin,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def apply(command: String, options: encodingstringnullExecOpt): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  def apply(
    command: String,
    options: encodingstringnullExecOpt,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
}

