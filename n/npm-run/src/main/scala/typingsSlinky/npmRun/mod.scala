package typingsSlinky.npmRun

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.encodingBufferEncodingExe
import typingsSlinky.node.anon.encodingbuffernullExecOpt
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ChildProcessByStdio
import typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childProcessMod.ExecException
import typingsSlinky.node.childProcessMod.ExecOptions
import typingsSlinky.node.childProcessMod.ExecSyncOptions
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childProcessMod.SpawnSyncOptions
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncReturns
import typingsSlinky.node.childProcessMod.StdioNull
import typingsSlinky.node.childProcessMod.StdioPipe
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.npmRun.anon.Fn0
import typingsSlinky.npmRun.anon.FnCall
import typingsSlinky.npmRun.anon.FnCallCommandArgsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("npm-run", JSImport.Namespace)
  @js.native
  val ^ : Runner = js.native
  
  @js.native
  trait ExecFunction extends StObject {
    
    // no `options` definitely means stdout/stderr are `string`.
    def apply(command: String): ChildProcess = js.native
    def apply(
      command: String,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): ChildProcess = js.native
    def apply(command: String, options: BaseEncodingOptions with ExecOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: BaseEncodingOptions with ExecOptions,
      callback: js.Function3[
          /* error */ ExecException | Null, 
          /* stdout */ String | Buffer, 
          /* stderr */ String | Buffer, 
          Unit
        ]
    ): ChildProcess = js.native
    def apply(
      command: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function3[
          /* error */ ExecException | Null, 
          /* stdout */ String | Buffer, 
          /* stderr */ String | Buffer, 
          Unit
        ]
    ): ChildProcess = js.native
    def apply(
      command: String,
      options: Null,
      callback: js.Function3[
          /* error */ ExecException | Null, 
          /* stdout */ String | Buffer, 
          /* stderr */ String | Buffer, 
          Unit
        ]
    ): ChildProcess = js.native
    // `options` with well known `encoding` means stdout/stderr are definitely `string`.
    def apply(command: String, options: encodingBufferEncodingExe): ChildProcess = js.native
    def apply(
      command: String,
      options: encodingBufferEncodingExe,
      callback: js.Function3[
          ExecException | Null, 
          Buffer | (/* stdout */ String), 
          Buffer | (/* stderr */ String), 
          Unit
        ]
    ): ChildProcess = js.native
    // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
    def apply(command: String, options: encodingbuffernullExecOpt): ChildProcess = js.native
    def apply(
      command: String,
      options: encodingbuffernullExecOpt,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): ChildProcess = js.native
    // `options` without an `encoding` means stdout/stderr are definitely `string`.
    def apply(command: String, options: ExecOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
    ): ChildProcess = js.native
  }
  
  @js.native
  trait Runner extends ExecFunction {
    
    var exec: ExecFunction = js.native
    
    def execSync(command: String): String = js.native
    def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
    def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
    @JSName("execSync")
    def execSync_Buffer(command: String): Buffer = js.native
    @JSName("execSync")
    var execSync_Original: FnCall = js.native
    
    def spawn(command: String): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: js.UndefOr[scala.Nothing], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
    def spawn(
      command: String,
      args: js.Array[String],
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
    def spawn(
      command: String,
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    
    def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    @JSName("spawnSync")
    var spawnSync_Original: FnCallCommandArgsOptions = js.native
    
    @JSName("spawn")
    var spawn_Original: Fn0 = js.native
    
    def sync(command: String): String = js.native
    def sync(command: String, options: ExecSyncOptions): Buffer = js.native
    def sync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def sync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
    @JSName("sync")
    def sync_Buffer(command: String): Buffer = js.native
    @JSName("sync")
    var sync_Original: FnCall = js.native
  }
  
  type _To = Runner
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Runner = ^
}
