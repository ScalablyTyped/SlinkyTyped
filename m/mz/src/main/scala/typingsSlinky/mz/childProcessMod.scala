package typingsSlinky.mz

import typingsSlinky.mz.anon.encodingBufferEncodingund
import typingsSlinky.mz.anon.encodingbuffernullundefin
import typingsSlinky.mz.anon.encodingstringnullundefin
import typingsSlinky.mz.mzStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ChildProcessByStdio
import typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childProcessMod.ExecException
import typingsSlinky.node.childProcessMod.ExecFileOptions
import typingsSlinky.node.childProcessMod.ExecFileOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.ExecFileSyncOptions
import typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.ExecFileSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.ExecSyncOptions
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.ForkOptions
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childProcessMod.SpawnSyncOptions
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncReturns
import typingsSlinky.node.childProcessMod.StdioNull
import typingsSlinky.node.childProcessMod.StdioPipe
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childProcessMod {
  
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(command: String): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    options: Null,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(command: String, options: encodingBufferEncodingund): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    options: encodingBufferEncodingund,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(command: String, options: encodingbuffernullundefin): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    options: encodingbuffernullundefin,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(command: String, options: encodingstringnullundefin): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  @JSImport("mz/child_process", "exec")
  @js.native
  def exec(
    command: String,
    options: encodingstringnullundefin,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[js.Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: Null,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.Array[String]): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: Null,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    callback: js.Function3[js.Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: Null,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: Null, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: Null, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: Null, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, args: Null, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, options: ExecFileOptionsWithBufferEncoding): js.Promise[js.Tuple2[Buffer, Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, options: ExecFileOptionsWithOtherEncoding): js.Promise[js.Tuple2[String | Buffer, String | Buffer]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, options: ExecFileOptions): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(file: String, options: ExecFileOptionsWithStringEncoding): js.Promise[js.Tuple2[String, String]] = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  @JSImport("mz/child_process", "execFile")
  @js.native
  def execFile(
    file: String,
    // `options` can't be mixed into `args`
  // tslint:disable-next-line: unified-signatures
  options: ExecFileOptions,
    callback: js.Function3[/* error */ js.Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String): String = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.UndefOr[scala.Nothing], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[String]): String = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, options: ExecFileSyncOptions): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync_Buffer(command: String): Buffer = js.native
  @JSImport("mz/child_process", "execFileSync")
  @js.native
  def execFileSync_Buffer(command: String, args: js.Array[String]): Buffer = js.native
  
  @JSImport("mz/child_process", "execSync")
  @js.native
  def execSync(command: String): String = js.native
  @JSImport("mz/child_process", "execSync")
  @js.native
  def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
  @JSImport("mz/child_process", "execSync")
  @js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  @JSImport("mz/child_process", "execSync")
  @js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSImport("mz/child_process", "execSync")
  @js.native
  def execSync_Buffer(command: String): Buffer = js.native
  
  @JSImport("mz/child_process", "fork")
  @js.native
  def fork(modulePath: String): ChildProcess = js.native
  @JSImport("mz/child_process", "fork")
  @js.native
  def fork(modulePath: String, args: js.UndefOr[scala.Nothing], options: ForkOptions): ChildProcess = js.native
  @JSImport("mz/child_process", "fork")
  @js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  @JSImport("mz/child_process", "fork")
  @js.native
  def fork(modulePath: String, args: js.Array[String], options: ForkOptions): ChildProcess = js.native
  @JSImport("mz/child_process", "fork")
  @js.native
  def fork(modulePath: String, options: ForkOptions): ChildProcess = js.native
  
  // overloads of spawn without 'args'
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String): ChildProcessWithoutNullStreams = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, args: js.UndefOr[scala.Nothing], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  @JSImport("mz/child_process", "spawn")
  @js.native
  def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  @JSImport("mz/child_process", "spawnSync")
  @js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  
  @js.native
  trait ExecFileOptionsWithBufferEncoding extends ExecFileOptions {
    
    var encoding: js.UndefOr[buffer | Null] = js.native
  }
  object ExecFileOptionsWithBufferEncoding {
    
    @scala.inline
    def apply(): ExecFileOptionsWithBufferEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecFileOptionsWithBufferEncoding]
    }
    
    @scala.inline
    implicit class ExecFileOptionsWithBufferEncodingMutableBuilder[Self <: ExecFileOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  @js.native
  trait ExecFileOptionsWithOtherEncoding extends ExecFileOptions {
    
    var encoding: js.UndefOr[String | Null] = js.native
  }
  object ExecFileOptionsWithOtherEncoding {
    
    @scala.inline
    def apply(): ExecFileOptionsWithOtherEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
    }
    
    @scala.inline
    implicit class ExecFileOptionsWithOtherEncodingMutableBuilder[Self <: ExecFileOptionsWithOtherEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
