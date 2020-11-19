package typingsSlinky.easyXHeaders

import typingsSlinky.easyXHeaders.anon.Custom
import typingsSlinky.easyXHeaders.anon.CustomFds
import typingsSlinky.easyXHeaders.anon.Cwd
import typingsSlinky.easyXHeaders.anon.Encoding
import typingsSlinky.easyXHeaders.anon.Env
import typingsSlinky.easyXHeaders.eventsMod.EventEmitter
import typingsSlinky.easyXHeaders.streamMod.Readable
import typingsSlinky.easyXHeaders.streamMod.Writable
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("child_process", JSImport.Namespace)
@js.native
object childProcessMod extends js.Object {
  
  def exec(command: String): ChildProcess = js.native
  def exec(
    command: String,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(command: String, options: CustomFds): ChildProcess = js.native
  def exec(
    command: String,
    options: CustomFds,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  
  def execFile(file: String): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: Cwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: Cwd,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String]): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: Cwd): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: Cwd,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    callback: js.Function3[/* error */ js.Error, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  
  def execFileSync(command: String): ChildProcess = js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: Env): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String]): ChildProcess = js.native
  def execFileSync(command: String, args: js.Array[String], options: Env): ChildProcess = js.native
  
  def execSync(command: String): ChildProcess = js.native
  def execSync(command: String, options: Env): ChildProcess = js.native
  
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.UndefOr[scala.Nothing], options: Encoding): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String], options: Encoding): ChildProcess = js.native
  
  def spawn(command: String): ChildProcess = js.native
  def spawn(command: String, args: js.UndefOr[scala.Nothing], options: Custom): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: Custom): ChildProcess = js.native
  
  @js.native
  trait ChildProcess extends EventEmitter {
    
    def disconnect(): Unit = js.native
    
    def kill(): Unit = js.native
    def kill(signal: String): Unit = js.native
    
    var pid: Double = js.native
    
    def send(message: js.Any): Unit = js.native
    def send(message: js.Any, sendHandle: js.Any): Unit = js.native
    
    var stderr: Readable = js.native
    
    var stdin: Writable = js.native
    
    var stdout: Readable = js.native
  }
}
