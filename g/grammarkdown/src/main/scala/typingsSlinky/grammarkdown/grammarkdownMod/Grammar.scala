package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken
import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Grammar")
@js.native
class Grammar protected () extends js.Object {
  def this(rootNames: js.Iterable[String]) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
  def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: AsyncHost) = this()
  def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: Host) = this()
  def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: SyncHost) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions, host: AsyncHost) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions, host: Host) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions, host: SyncHost) = this()
  
  var beginParsePossiblyAsync: js.Any = js.native
  
  def bind(): js.Promise[Unit] = js.native
  def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
  def bind(cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var bindPossiblyAsync: js.Any = js.native
  
  def bindSync(): Unit = js.native
  def bindSync(cancelable: Cancelable): Unit = js.native
  def bindSync(cancelable: CancellationToken): Unit = js.native
  
  /* protected */ def binder: Binder = js.native
  
  var bindings: js.Any = js.native
  
  def check(): js.Promise[Unit] = js.native
  def check(sourceFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): js.Promise[Unit] = js.native
  def check(sourceFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var checkPossiblyAsync: js.Any = js.native
  
  def checkSync(): Unit = js.native
  def checkSync(sourceFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): Unit = js.native
  def checkSync(sourceFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): Unit = js.native
  def checkSync(sourceFile: SourceFile): Unit = js.native
  def checkSync(sourceFile: SourceFile, cancelable: Cancelable): Unit = js.native
  def checkSync(sourceFile: SourceFile, cancelable: CancellationToken): Unit = js.native
  
  /* protected */ def checker: Checker = js.native
  
  /* protected */ def createBinder(options: CompilerOptions): Binder = js.native
  
  /* protected */ def createChecker(options: CompilerOptions): Checker = js.native
  
  /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
  
  /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
  
  var diagnostics: DiagnosticMessages = js.native
  
  def emit(): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: CancellationToken
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(sourceFile: SourceFile): js.Promise[Unit] = js.native
  def emit(sourceFile: SourceFile, writeFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): js.Promise[Unit] = js.native
  def emit(sourceFile: SourceFile, writeFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): js.Promise[Unit] = js.native
  def emit(
    sourceFile: SourceFile,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: SourceFile,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: SourceFile,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: CancellationToken
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: SourceFile,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: SourceFile,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  
  var emitOnePossiblyAsync: js.Any = js.native
  
  var emitPossiblyAsync: js.Any = js.native
  
  def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
  def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
  def emitString(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[String] = js.native
  
  var emitStringPossiblyAsync: js.Any = js.native
  
  def emitStringSync(sourceFile: SourceFile): String = js.native
  def emitStringSync(sourceFile: SourceFile, cancelable: Cancelable): String = js.native
  def emitStringSync(sourceFile: SourceFile, cancelable: CancellationToken): String = js.native
  
  def emitSync(): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit]
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: CancellationToken
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ]
  ): Unit = js.native
  def emitSync(
    sourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(sourceFile: SourceFile): Unit = js.native
  def emitSync(sourceFile: SourceFile, writeFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): Unit = js.native
  def emitSync(sourceFile: SourceFile, writeFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): Unit = js.native
  def emitSync(sourceFile: SourceFile, writeFile: js.Function2[/* file */ String, /* output */ String, Unit]): Unit = js.native
  def emitSync(
    sourceFile: SourceFile,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(
    sourceFile: SourceFile,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: CancellationToken
  ): Unit = js.native
  def emitSync(
    sourceFile: SourceFile,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ]
  ): Unit = js.native
  def emitSync(
    sourceFile: SourceFile,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ],
    cancelable: Cancelable
  ): Unit = js.native
  
  /* protected */ def emitter: Emitter = js.native
  
  var endBind: js.Any = js.native
  
  var endCheck: js.Any = js.native
  
  var endEmitPossiblyAsync: js.Any = js.native
  
  var endParse: js.Any = js.native
  
  var endProcessFilePossiblyAsync: js.Any = js.native
  
  var endProcessRootFile: js.Any = js.native
  
  def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
  
  var getSourceFileNoResolve: js.Any = js.native
  
  val host: Host | SyncHost | AsyncHost = js.native
  
  var innerBinder: js.Any = js.native
  
  var innerChecker: js.Any = js.native
  
  var innerEmitter: js.Any = js.native
  
  var innerResolver: js.Any = js.native
  
  def isBound: Boolean = js.native
  
  def isParsed: Boolean = js.native
  
  var normalizeFile: js.Any = js.native
  
  var options: CompilerOptions = js.native
  
  def parse(): js.Promise[Unit] = js.native
  def parse(cancelable: Cancelable): js.Promise[Unit] = js.native
  def parse(cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var parsePossiblyAsync: js.Any = js.native
  
  var parsePromise: js.Any = js.native
  
  var parseState: js.Any = js.native
  
  def parseSync(): Unit = js.native
  def parseSync(cancelable: Cancelable): Unit = js.native
  def parseSync(cancelable: CancellationToken): Unit = js.native
  
  var processFilePossiblyAsync: js.Any = js.native
  
  var processImportsPossiblyAsync: js.Any = js.native
  
  var processRootFilePossiblyAsync: js.Any = js.native
  
  /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  /* protected */ def readFile(file: String, cancelToken: CancelToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  
  /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  
  var resolveFile: js.Any = js.native
  
  def resolver: Resolver = js.native
  
  def rootFiles: js.Array[SourceFile] = js.native
  
  var rootNames: js.Any = js.native
  
  var setSourceFileNoResolve: js.Any = js.native
  
  def sourceFiles: js.Array[SourceFile] = js.native
  
  /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
  /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): Unit | js.Promise[Unit] = js.native
  
  var writeFileFallback: js.Any = js.native
  
  /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  
  var writeFileSyncFallback: js.Any = js.native
}
/* static members */
@JSImport("grammarkdown/dist/grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  def convert(content: String): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: AsyncHost): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: AsyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: AsyncHost,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: Host): String = js.native
  def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: Host, cancelable: Cancelable): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: Host,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: SyncHost): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: SyncHost,
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: js.UndefOr[scala.Nothing],
    hostFallback: SyncHost,
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: Cancelable
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: js.UndefOr[scala.Nothing],
    cancelable: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: Cancelable): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: CancellationToken): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: Host): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: Cancelable): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: CancellationToken): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: Cancelable): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: CancellationToken): String = js.native
}
