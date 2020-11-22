package typingsSlinky.grammarkdown

import typingsSlinky.esfxAsyncCanceltoken.mod.CancelToken
import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.grammarkdown.anon.ReadonlyCompilerOptions
import typingsSlinky.grammarkdown.binderMod.Binder
import typingsSlinky.grammarkdown.binderMod.BindingTable
import typingsSlinky.grammarkdown.checkerMod.Checker
import typingsSlinky.grammarkdown.checkerMod.Resolver
import typingsSlinky.grammarkdown.diagnosticsMod.DiagnosticMessages
import typingsSlinky.grammarkdown.emitterMod.Emitter
import typingsSlinky.grammarkdown.hostMod.CoreAsyncHost
import typingsSlinky.grammarkdown.hostMod.CoreSyncHost
import typingsSlinky.grammarkdown.nodeMod.Host
import typingsSlinky.grammarkdown.nodesMod.SourceFile
import typingsSlinky.grammarkdown.optionsMod.CompilerOptions
import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammar", JSImport.Namespace)
@js.native
object grammarMod extends js.Object {
  
  @js.native
  class Grammar protected () extends js.Object {
    /**
      * @param rootNames The names of the root files used by the grammar.
      * @param options The {@link CompilerOptions} used by the grammar.
      * @param host The [Host](xref:hosts) the grammar uses to interact with the file system.
      */
    def this(rootNames: js.Iterable[String]) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
    def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: CoreAsyncHost) = this()
    def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: CoreSyncHost) = this()
    def this(rootNames: js.Iterable[String], options: js.UndefOr[scala.Nothing], host: Host) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: CoreAsyncHost) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: CoreSyncHost) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: Host) = this()
    
    var _beginParsePossiblyAsync: js.Any = js.native
    
    var _bindPossiblyAsync: js.Any = js.native
    
    var _bindings: js.Any = js.native
    
    var _checkPossiblyAsync: js.Any = js.native
    
    var _emitOnePossiblyAsync: js.Any = js.native
    
    var _emitPossiblyAsync: js.Any = js.native
    
    var _emitStringPossiblyAsync: js.Any = js.native
    
    var _endBind: js.Any = js.native
    
    var _endCheck: js.Any = js.native
    
    var _endEmitPossiblyAsync: js.Any = js.native
    
    var _endParse: js.Any = js.native
    
    var _endProcessFilePossiblyAsync: js.Any = js.native
    
    var _endProcessRootFile: js.Any = js.native
    
    var _getSourceFileNoResolve: js.Any = js.native
    
    var _innerBinder: js.Any = js.native
    
    var _innerChecker: js.Any = js.native
    
    var _innerEmitter: js.Any = js.native
    
    var _innerResolver: js.Any = js.native
    
    var _lineOffsetMap: js.Any = js.native
    
    var _normalizeFile: js.Any = js.native
    
    var _parsePossiblyAsync: js.Any = js.native
    
    var _parsePromise: js.Any = js.native
    
    var _parseState: js.Any = js.native
    
    var _processFilePossiblyAsync: js.Any = js.native
    
    var _processImportsPossiblyAsync: js.Any = js.native
    
    var _processRootFilePossiblyAsync: js.Any = js.native
    
    var _resolveFile: js.Any = js.native
    
    var _rootNames: js.Any = js.native
    
    var _setSourceFileNoResolve: js.Any = js.native
    
    var _writeFileFallback: js.Any = js.native
    
    var _writeFileSyncFallback: js.Any = js.native
    
    /**
      * Asynchronously binds each file in the grammar. Will also parse the grammar if it has not yet been parsed.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def bind(): js.Promise[Unit] = js.native
    def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
    def bind(cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously binds each file in the grammar. Will also parse the grammar if it has not yet been parsed.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def bindSync(): Unit = js.native
    def bindSync(cancelable: Cancelable): Unit = js.native
    def bindSync(cancelable: CancellationToken): Unit = js.native
    
    /**
      * Gets the {@link Binder} used to bind the grammar.
      */
    /* protected */ def binder: Binder = js.native
    
    /**
      * Asynchronously checks each file in the grammar. Will also parse and bind the grammar if it has not yet been parsed or bound.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def check(): js.Promise[Unit] = js.native
    def check(sourceFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): js.Promise[Unit] = js.native
    def check(sourceFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously checks each file in the grammar. Will also parse and bind the grammar if it has not yet been parsed or bound.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def checkSync(): Unit = js.native
    def checkSync(sourceFile: js.UndefOr[scala.Nothing], cancelable: Cancelable): Unit = js.native
    def checkSync(sourceFile: js.UndefOr[scala.Nothing], cancelable: CancellationToken): Unit = js.native
    def checkSync(sourceFile: SourceFile): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: Cancelable): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: CancellationToken): Unit = js.native
    
    /**
      * Gets the {@link Checker} used to check the grammar.
      */
    /* protected */ def checker: Checker = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Binder} to be used by this grammar.
      * @param options The options to pass on to the {@link Binder}.
      * @virtual
      */
    /* protected */ def createBinder(options: ReadonlyCompilerOptions): Binder = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Checker} to be used by this grammar.
      * @param options The options to pass on to the {@link Checker}.
      * @virtual
      */
    /* protected */ def createChecker(options: ReadonlyCompilerOptions): Checker = js.native
    
    /**
      * When overridden in a derived class, creates an {@link Emitter} to be used by this grammar.
      * @param options The options to pass on to the {@link Emitter}.
      * @virtual
      */
    /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Resolver} to be used by this grammar.
      * @param bindings A {@link BindingTable} used by the resolver to resolve references to nodes.
      * @virtual
      */
    /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
    
    /**
      * The diagnostic messages produced by the grammar.
      */
    val diagnostics: DiagnosticMessages = js.native
    
    /**
      * Asynchronously emits each file in the grammar. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit. If not provided, this method will generate output for all root files.
      * @param writeFile An optional callback used to write the output. If not provided, this method will emit output via this grammar's {@link Grammar.host|host}.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
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
    
    /**
      * Asynchronously emits the provided file in the grammar as a string. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` for the emit output that is settled when the operation has completed.
      */
    def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[String] = js.native
    
    /**
      * Synchronously emits the provided file in the grammar as a string. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns The emit output.
      */
    def emitStringSync(sourceFile: SourceFile): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: Cancelable): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: CancellationToken): String = js.native
    
    /**
      * Synchronously emits each file in the grammar. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit. If not provided, this method will generate output for all root files.
      * @param writeFile An optional callback used to write the output. If not provided, this method will emit output via this grammar's {@link Grammar.host|host}.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
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
    
    /**
      * Gets the {@link Emitter} used to emit the grammar.
      */
    /* protected */ def emitter: Emitter = js.native
    
    /**
      * Gets the {@link SourceFile} parsed for the provided file path.
      * @param file The path to the source file.
      * @returns The {@link SourceFile} for the provided path, if one was parsed; otherwise, `undefined`.
      */
    def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
    
    /**
      * The [Host](xref:hosts) the grammar uses to interact with the file system.
      */
    val host: Host | CoreSyncHost | CoreAsyncHost = js.native
    
    /**
      * Indicates whether the grammar has been bound.
      */
    def isBound: Boolean = js.native
    
    /**
      * Indicates whether the grammar has been parsed.
      */
    def isParsed: Boolean = js.native
    
    /**
      * The {@link CompilerOptions} used by the grammar.
      */
    val options: ReadonlyCompilerOptions = js.native
    
    /**
      * Asynchronously parses the root files provided to the grammar.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def parse(): js.Promise[Unit] = js.native
    def parse(cancelable: Cancelable): js.Promise[Unit] = js.native
    def parse(cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously parses the root files provided to the grammar.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def parseSync(): Unit = js.native
    def parseSync(cancelable: Cancelable): Unit = js.native
    def parseSync(cancelable: CancellationToken): Unit = js.native
    
    /**
      * When overridden in a derived class, asynchronously reads the contents of the provided file.
      * @param file The file to read.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `Promise` for either a `string` containing the content if the file could be read, or `undefined` if the file could not be read.
      * @virtual
      */
    /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFile(file: String, cancelToken: CancelToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    
    /**
      * When overridden in a derived class, synchronously reads the contents of the provided file.
      * @param file The file to read.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `string` containing the content if the file could be read; otherwise, `undefined`.
      * @virtual
      */
    /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    
    /**
      * Gets the resolver used to resolve references to bound nodes.
      * @throws `Error` - Grammar has not yet been bound.
      */
    def resolver: Resolver = js.native
    
    /**
      * Gets the root files parsed by the grammar.
      * @throws `Error` - Grammar has not yet been parsed.
      */
    def rootFiles: js.Array[SourceFile] = js.native
    
    /**
      * Gets the source files parsed by the grammar.
      * @throws `Error` - Grammar has not yet been parsed.
      */
    def sourceFiles: js.Array[SourceFile] = js.native
    
    /**
      * When overridden in a derived class, asynchronously writes a file to the host.
      * @param file The path to the file.
      * @param text The contents of the file.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `Promise` that is settled when the operation completes.
      * @virtual
      */
    /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): Unit | js.Promise[Unit] = js.native
    
    /**
      * When overridden in a derived class, synchronosly writes a file to the host.
      * @param file The path to the file.
      * @param text The contents of the file.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @virtual
      */
    /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  }
  /* static members */
  @js.native
  object Grammar extends js.Object {
    
    /**
      * Converts a string containing Grammarkdown syntax into output based on the provided options.
      * @param content The Grammarkdown source text to convert.
      * @param options The {@link CompilerOptions} used by the grammar.
      * @param hostFallback An optional host to use as a fallback for file system operations.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    /**
      * {@inheritDoc Grammar.(convert:1)}
      * @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable`
      */
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
    def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: CoreAsyncHost): String = js.native
    def convert(
      content: String,
      options: js.UndefOr[scala.Nothing],
      hostFallback: CoreAsyncHost,
      cancelable: Cancelable
    ): String = js.native
    def convert(
      content: String,
      options: js.UndefOr[scala.Nothing],
      hostFallback: CoreAsyncHost,
      cancelable: CancellationToken
    ): String = js.native
    def convert(content: String, options: js.UndefOr[scala.Nothing], hostFallback: CoreSyncHost): String = js.native
    def convert(
      content: String,
      options: js.UndefOr[scala.Nothing],
      hostFallback: CoreSyncHost,
      cancelable: Cancelable
    ): String = js.native
    def convert(
      content: String,
      options: js.UndefOr[scala.Nothing],
      hostFallback: CoreSyncHost,
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
    def convert(content: String, options: CompilerOptions, hostFallback: CoreAsyncHost): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: CoreAsyncHost, cancelable: Cancelable): String = js.native
    def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: CoreAsyncHost,
      cancelable: CancellationToken
    ): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: CoreSyncHost): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: CoreSyncHost, cancelable: Cancelable): String = js.native
    def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: CoreSyncHost,
      cancelable: CancellationToken
    ): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: Cancelable): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: CancellationToken): String = js.native
  }
}
