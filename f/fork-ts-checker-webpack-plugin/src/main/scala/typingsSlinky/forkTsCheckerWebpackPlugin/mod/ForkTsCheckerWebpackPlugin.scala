package typingsSlinky.forkTsCheckerWebpackPlugin.mod

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.PartialOptions
import typingsSlinky.workerRpc.mod.RpcProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ForkTsCheckerWebpackPlugin
  * Runs typescript type checker and linter (tslint) on separate process.
  * This speed-ups build a lot.
  *
  * Options description in README.md
  */
@js.native
trait ForkTsCheckerWebpackPlugin extends js.Object {
  var async: js.Any = js.native
  var cancellationToken: js.Any = js.native
  var checkDone: js.Any = js.native
  var checkSyntacticErrors: js.Any = js.native
  var colors: js.Any = js.native
  var compilationDone: js.Any = js.native
  var compiler: js.Any = js.native
  var compilerOptions: js.Any = js.native
  var computeContextPath: js.Any = js.native
  var createDoneCallback: js.Any = js.native
  var createEmitCallback: js.Any = js.native
  var createNoopEmitCallback: js.Any = js.native
  var diagnostics: js.Any = js.native
  var doneCallback: js.Any = js.native
  var elapsed: js.Any = js.native
  var emitCallback: js.Any = js.native
  var eslint: js.Any = js.native
  var eslintOptions: js.Any = js.native
  var eslintVersion: js.Any = js.native
  var formatter: js.Any = js.native
  var handleServiceExit: js.Any = js.native
  var handleServiceMessage: js.Any = js.native
  var ignoreDiagnostics: js.Any = js.native
  var ignoreLintWarnings: js.Any = js.native
  var ignoreLints: js.Any = js.native
  var isWatching: js.Any = js.native
  var killService: js.Any = js.native
  var lints: js.Any = js.native
  var logger: js.Any = js.native
  var measureTime: js.Any = js.native
  var memoryLimit: js.Any = js.native
  var nodeArgs: js.Array[String] = js.native
  val options: PartialOptions = js.native
  var performance: js.Any = js.native
  var pluginCompile: js.Any = js.native
  var pluginDone: js.Any = js.native
  var pluginEmit: js.Any = js.native
  var pluginStart: js.Any = js.native
  var pluginStop: js.Any = js.native
  var printLoggerMessage: js.Any = js.native
  var reportFiles: js.Any = js.native
  var resolveModuleNameModule: js.Any = js.native
  var resolveTypeReferenceDirectiveModule: js.Any = js.native
  var service: js.UndefOr[js.Any] = js.native
  var serviceRpc: js.UndefOr[RpcProvider] = js.native
  var silent: js.Any = js.native
  var spawnService: js.Any = js.native
  var startAt: js.Any = js.native
  var started: js.Any = js.native
  var tsconfig: js.Any = js.native
  var tsconfigPath: js.Any = js.native
  var tslint: js.Any = js.native
  var tslintAutoFix: js.Any = js.native
  var tslintPath: js.Any = js.native
  var tslintVersion: js.Any = js.native
  var typescript: js.Any = js.native
  var typescriptPath: js.Any = js.native
  var typescriptVersion: js.Any = js.native
  var useColors: js.Any = js.native
  var useTypescriptIncrementalApi: js.Any = js.native
  var validateEslint: js.Any = js.native
  var validateTslint: js.Any = js.native
  var validateTypeScript: js.Any = js.native
  var vue: js.Any = js.native
  var watch: js.Any = js.native
  var watchPaths: js.Any = js.native
  var workersNumber: js.Any = js.native
  @JSName("apply")
  def apply(compiler: js.Any): Unit = js.native
}

object ForkTsCheckerWebpackPlugin {
  @scala.inline
  def apply(
    apply: js.Any => Unit,
    async: js.Any,
    cancellationToken: js.Any,
    checkDone: js.Any,
    checkSyntacticErrors: js.Any,
    colors: js.Any,
    compilationDone: js.Any,
    compiler: js.Any,
    compilerOptions: js.Any,
    computeContextPath: js.Any,
    createDoneCallback: js.Any,
    createEmitCallback: js.Any,
    createNoopEmitCallback: js.Any,
    diagnostics: js.Any,
    doneCallback: js.Any,
    elapsed: js.Any,
    emitCallback: js.Any,
    eslint: js.Any,
    eslintOptions: js.Any,
    eslintVersion: js.Any,
    formatter: js.Any,
    handleServiceExit: js.Any,
    handleServiceMessage: js.Any,
    ignoreDiagnostics: js.Any,
    ignoreLintWarnings: js.Any,
    ignoreLints: js.Any,
    isWatching: js.Any,
    killService: js.Any,
    lints: js.Any,
    logger: js.Any,
    measureTime: js.Any,
    memoryLimit: js.Any,
    nodeArgs: js.Array[String],
    options: PartialOptions,
    performance: js.Any,
    pluginCompile: js.Any,
    pluginDone: js.Any,
    pluginEmit: js.Any,
    pluginStart: js.Any,
    pluginStop: js.Any,
    printLoggerMessage: js.Any,
    reportFiles: js.Any,
    resolveModuleNameModule: js.Any,
    resolveTypeReferenceDirectiveModule: js.Any,
    silent: js.Any,
    spawnService: js.Any,
    startAt: js.Any,
    started: js.Any,
    tsconfig: js.Any,
    tsconfigPath: js.Any,
    tslint: js.Any,
    tslintAutoFix: js.Any,
    tslintPath: js.Any,
    tslintVersion: js.Any,
    typescript: js.Any,
    typescriptPath: js.Any,
    typescriptVersion: js.Any,
    useColors: js.Any,
    useTypescriptIncrementalApi: js.Any,
    validateEslint: js.Any,
    validateTslint: js.Any,
    validateTypeScript: js.Any,
    vue: js.Any,
    watch: js.Any,
    watchPaths: js.Any,
    workersNumber: js.Any
  ): ForkTsCheckerWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), async = async.asInstanceOf[js.Any], cancellationToken = cancellationToken.asInstanceOf[js.Any], checkDone = checkDone.asInstanceOf[js.Any], checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compilationDone = compilationDone.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], computeContextPath = computeContextPath.asInstanceOf[js.Any], createDoneCallback = createDoneCallback.asInstanceOf[js.Any], createEmitCallback = createEmitCallback.asInstanceOf[js.Any], createNoopEmitCallback = createNoopEmitCallback.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], doneCallback = doneCallback.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], emitCallback = emitCallback.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], eslintOptions = eslintOptions.asInstanceOf[js.Any], eslintVersion = eslintVersion.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], handleServiceExit = handleServiceExit.asInstanceOf[js.Any], handleServiceMessage = handleServiceMessage.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], ignoreLintWarnings = ignoreLintWarnings.asInstanceOf[js.Any], ignoreLints = ignoreLints.asInstanceOf[js.Any], isWatching = isWatching.asInstanceOf[js.Any], killService = killService.asInstanceOf[js.Any], lints = lints.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], measureTime = measureTime.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], nodeArgs = nodeArgs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], pluginCompile = pluginCompile.asInstanceOf[js.Any], pluginDone = pluginDone.asInstanceOf[js.Any], pluginEmit = pluginEmit.asInstanceOf[js.Any], pluginStart = pluginStart.asInstanceOf[js.Any], pluginStop = pluginStop.asInstanceOf[js.Any], printLoggerMessage = printLoggerMessage.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleNameModule = resolveModuleNameModule.asInstanceOf[js.Any], resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], spawnService = spawnService.asInstanceOf[js.Any], startAt = startAt.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], tsconfigPath = tsconfigPath.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any], tslintAutoFix = tslintAutoFix.asInstanceOf[js.Any], tslintPath = tslintPath.asInstanceOf[js.Any], tslintVersion = tslintVersion.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], typescriptPath = typescriptPath.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], useTypescriptIncrementalApi = useTypescriptIncrementalApi.asInstanceOf[js.Any], validateEslint = validateEslint.asInstanceOf[js.Any], validateTslint = validateTslint.asInstanceOf[js.Any], validateTypeScript = validateTypeScript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPaths = watchPaths.asInstanceOf[js.Any], workersNumber = workersNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForkTsCheckerWebpackPlugin]
  }
  @scala.inline
  implicit class ForkTsCheckerWebpackPluginOps[Self <: ForkTsCheckerWebpackPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancellationToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckSyntacticErrors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSyntacticErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilationDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilationDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeContextPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeContextPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDoneCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDoneCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateEmitCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEmitCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateNoopEmitCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNoopEmitCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoneCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElapsed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslintOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslintVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleServiceExit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleServiceExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleServiceMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleServiceMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreDiagnostics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreLintWarnings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLintWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreLints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWatching(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKillService(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryLimit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: PartialOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginCompile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginCompile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginEmit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginStop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintLoggerMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printLoggerMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveModuleNameModule(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNameModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveTypeReferenceDirectiveModule(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectiveModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpawnService(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawnService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsconfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsconfigPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfigPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslintAutoFix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintAutoFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslintPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslintVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescriptPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescriptPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescriptVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescriptVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTypescriptIncrementalApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTypescriptIncrementalApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateEslint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateEslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateTslint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateTslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateTypeScript(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateTypeScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchPaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkersNumber(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workersNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRpc(value: RpcProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRpc")(js.undefined)
        ret
    }
  }
  
}

