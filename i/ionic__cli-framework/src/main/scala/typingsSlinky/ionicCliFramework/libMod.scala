package typingsSlinky.ionicCliFramework

import typingsSlinky.ionicCliFramework.anon.Argv
import typingsSlinky.ionicCliFramework.anon.CaseSensitive
import typingsSlinky.ionicCliFramework.anon.IncludeSeparated
import typingsSlinky.ionicCliFramework.anon.RequiredCommandMetadataCo
import typingsSlinky.ionicCliFramework.colorsMod.ColorFunction
import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.completionMod.CompletionFormatterDeps
import typingsSlinky.ionicCliFramework.configMod.BaseConfigOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.CommandPathItem
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedParseArgsOptions
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.Validator
import typingsSlinky.ionicCliFramework.definitionsMod.Validators
import typingsSlinky.ionicCliFramework.executorMod.BaseExecutorDeps
import typingsSlinky.ionicCliFramework.executorMod.ExecutorOperations
import typingsSlinky.ionicCliFramework.helpMod.CommandHelpFormatterDeps
import typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchema
import typingsSlinky.ionicCliFramework.helpMod.NamespaceHelpFormatterDeps
import typingsSlinky.ionicCliFramework.loggerMod.CreateTaggedFormatterOptions
import typingsSlinky.ionicCliFramework.loggerMod.Logger
import typingsSlinky.ionicCliFramework.loggerMod.LoggerFormatter
import typingsSlinky.ionicCliFramework.loggerMod.LoggerHandler
import typingsSlinky.ionicCliFramework.loggerMod.LoggerLevel
import typingsSlinky.ionicCliFramework.loggerMod.LoggerLevelWeight
import typingsSlinky.ionicCliFramework.loggerMod.LoggerOptions
import typingsSlinky.ionicCliFramework.loggerMod.StreamHandlerOptions
import typingsSlinky.ionicCliFramework.optionsMod.FormatOptionNameOptions
import typingsSlinky.ionicCliFramework.optionsMod.HydratedOptionSpec
import typingsSlinky.ionicCliFramework.optionsMod.OptionPredicate
import typingsSlinky.ionicCliFramework.optionsMod.UnparseArgsOptions
import typingsSlinky.ionicCliFramework.outputMod.LogUpdateOutputStrategyOptions
import typingsSlinky.ionicCliFramework.outputMod.StreamOutputStrategyOptions
import typingsSlinky.ionicCliFramework.tasksMod.TaskChainOptions
import typingsSlinky.ionicCliFramework.tasksMod.TaskOptions
import typingsSlinky.minimist.mod.Opts
import typingsSlinky.minimist.mod.ParsedArgs
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.std.Partial
import typingsSlinky.std.ReadonlyMap
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@ionic/cli-framework/lib", "AbstractExecutor")
  @js.native
  abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsSlinky.ionicCliFramework.executorMod.AbstractExecutor[C, N, M, I, O] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseCommand")
  @js.native
  abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.commandMod.BaseCommand[C, N, M, I, O] {
    def this(namespace: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseCommandMap")
  @js.native
  class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsSlinky.ionicCliFramework.commandMod.BaseCommandMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework/lib", "BaseConfig")
  @js.native
  abstract class BaseConfig[T /* <: js.Object */] protected ()
    extends typingsSlinky.ionicCliFramework.configMod.BaseConfig[T] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseExecutor")
  @js.native
  class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.executorMod.BaseExecutor[C, N, M, I, O] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseNamespace")
  @js.native
  abstract class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsSlinky.ionicCliFramework.commandMod.BaseNamespace[C, N, M, I, O] {
    def this(parent: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseNamespaceMap")
  @js.native
  class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typingsSlinky.ionicCliFramework.commandMod.BaseNamespaceMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework/lib", "Command")
  @js.native
  abstract class Command protected ()
    extends typingsSlinky.ionicCliFramework.commandMod.Command {
    def this(namespace: typingsSlinky.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandHelpFormatter")
  @js.native
  abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandMap")
  @js.native
  class CommandMap ()
    extends typingsSlinky.ionicCliFramework.commandMod.CommandMap
  
  @JSImport("@ionic/cli-framework/lib", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework/lib", "CommandSchemaHelpFormatter")
  @js.native
  class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.CommandSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandStringHelpFormatter")
  @js.native
  class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.CommandStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CompletionFormatter")
  @js.native
  abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.completionMod.CompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "DEFAULT_COLORS")
  @js.native
  val DEFAULT_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[typingsSlinky.ionicCliFramework.loggerMod.StreamHandler] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Executor")
  @js.native
  class Executor protected ()
    extends typingsSlinky.ionicCliFramework.executorMod.Executor {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[
            typingsSlinky.ionicCliFramework.commandMod.Command, 
            typingsSlinky.ionicCliFramework.commandMod.Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "HelpFormatter")
  @js.native
  abstract class HelpFormatter protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.HelpFormatter {
    def this(hasColors: typingsSlinky.ionicCliFramework.anon.Colors) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework/lib", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  /* Inlined {readonly [ L in @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevel ]: @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "LogUpdateOutputStrategy")
  @js.native
  class LogUpdateOutputStrategy ()
    extends typingsSlinky.ionicCliFramework.outputMod.LogUpdateOutputStrategy {
    def this(hasStreamColors: LogUpdateOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "Logger")
  @js.native
  class Logger_ () extends Logger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  /* static members */
  object Logger_ {
    
    @JSImport("@ionic/cli-framework/lib", "Logger.cloneHandlers")
    @js.native
    def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Namespace")
  @js.native
  abstract class Namespace ()
    extends typingsSlinky.ionicCliFramework.commandMod.Namespace {
    def this(parent: typingsSlinky.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceHelpFormatter")
  @js.native
  abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceMap")
  @js.native
  class NamespaceMap ()
    extends typingsSlinky.ionicCliFramework.commandMod.NamespaceMap
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceSchemaHelpFormatter")
  @js.native
  class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.NamespaceSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceStringHelpFormatter")
  @js.native
  class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework/lib", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
    
    @JSImport("@ionic/cli-framework/lib", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework/lib", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib", "Spinner")
  @js.native
  class Spinner ()
    extends typingsSlinky.ionicCliFramework.tasksMod.Spinner {
    def this(frames: js.Array[String]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "StreamHandler")
  @js.native
  class StreamHandler protected ()
    extends typingsSlinky.ionicCliFramework.loggerMod.StreamHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "StreamOutputStrategy")
  @js.native
  class StreamOutputStrategy protected ()
    extends typingsSlinky.ionicCliFramework.outputMod.StreamOutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "Task")
  @js.native
  class Task ()
    extends typingsSlinky.ionicCliFramework.tasksMod.Task {
    def this(hasMsgTickInterval: TaskOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "TaskChain")
  @js.native
  class TaskChain ()
    extends typingsSlinky.ionicCliFramework.tasksMod.TaskChain {
    def this(hasTaskOptions: TaskChainOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "ZshCompletionFormatter")
  @js.native
  class ZshCompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typingsSlinky.ionicCliFramework.completionMod.ZshCompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "combine")
  @js.native
  def combine(validators: Validator*): Validator = js.native
  
  @JSImport("@ionic/cli-framework/lib", "contains")
  @js.native
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = js.native
  
  @JSImport("@ionic/cli-framework/lib", "createCommandMetadataFromSchema")
  @js.native
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = js.native
  
  @JSImport("@ionic/cli-framework/lib", "createPrefixedFormatter")
  @js.native
  def createPrefixedFormatter(prefix: String): LoggerFormatter = js.native
  @JSImport("@ionic/cli-framework/lib", "createPrefixedFormatter")
  @js.native
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = js.native
  
  @JSImport("@ionic/cli-framework/lib", "createTaggedFormatter")
  @js.native
  def createTaggedFormatter(): LoggerFormatter = js.native
  @JSImport("@ionic/cli-framework/lib", "createTaggedFormatter")
  @js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  
  @JSImport("@ionic/cli-framework/lib", "execute")
  @js.native
  def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: (Argv[N, C, M, I, O]) with (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework/lib", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework/lib", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = js.native
  @JSImport("@ionic/cli-framework/lib", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = js.native
  
  @JSImport("@ionic/cli-framework/lib", "generateCommandPath")
  @js.native
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "getCompletionWords")
  @js.native
  def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "getLoggerLevelColor")
  @js.native
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = js.native
  @JSImport("@ionic/cli-framework/lib", "getLoggerLevelColor")
  @js.native
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "getLoggerLevelName")
  @js.native
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = js.native
  @JSImport("@ionic/cli-framework/lib", "getLoggerLevelName")
  @js.native
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "hydrateCommandMetadataOption")
  @js.native
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "hydrateOptionSpec")
  @js.native
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = js.native
  
  @JSImport("@ionic/cli-framework/lib", "isCommandVisible")
  @js.native
  def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "isOptionVisible")
  @js.native
  def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "logger")
  @js.native
  val logger: Logger = js.native
  
  @JSImport("@ionic/cli-framework/lib", "metadataOptionsToParseArgsOptions")
  @js.native
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = js.native
  
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs(): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs(args: js.UndefOr[scala.Nothing], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String]): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.UndefOr[scala.Nothing], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String]): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.UndefOr[scala.Nothing], opts: Opts): T = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = js.native
  @JSImport("@ionic/cli-framework/lib", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = js.native
  
  @JSImport("@ionic/cli-framework/lib", "separateArgv")
  @js.native
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "stripOptions")
  @js.native
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: js.UndefOr[scala.Nothing],
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework/lib", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "validate")
  @js.native
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
  
  @JSImport("@ionic/cli-framework/lib", "validators")
  @js.native
  val validators: Validators = js.native
}
