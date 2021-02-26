package typingsSlinky.cac

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cac.anon.Run
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param name The program name to display in help and version message
    */
  @JSImport("cac", JSImport.Default)
  @js.native
  def default(): CAC_ = js.native
  @JSImport("cac", JSImport.Default)
  @js.native
  def default(name: String): CAC_ = js.native
  
  @JSImport("cac", "CAC")
  @js.native
  /**
    * @param name The program name to display in help and version message
    */
  class CAC_ () extends EventEmitter {
    def this(name: String) = this()
    
    /**
      * Parsed CLI arguments
      */
    var args: js.Array[String] = js.native
    
    /**
      * Add a sub-command
      */
    def command(rawName: String): Command = js.native
    def command(rawName: String, description: js.UndefOr[scala.Nothing], config: CommandConfig): Command = js.native
    def command(rawName: String, description: String): Command = js.native
    def command(rawName: String, description: String, config: CommandConfig): Command = js.native
    
    var commands: js.Array[Command] = js.native
    
    /**
      * Add a global example.
      *
      * This example added here will not be used by sub-commands.
      */
    def example(example: CommandExample): this.type = js.native
    
    var globalCommand: GlobalCommand = js.native
    
    /**
      * Show help message when `-h, --help` flags appear.
      *
      */
    def help(): this.type = js.native
    def help(callback: HelpCallback): this.type = js.native
    
    var matchedCommand: js.UndefOr[Command] = js.native
    
    var matchedCommandName: js.UndefOr[String] = js.native
    
    var mri: js.Any = js.native
    
    /** The program name to display in help and version message */
    var name: String = js.native
    
    /**
      * Add a global CLI option.
      *
      * Which is also applied to sub-commands.
      */
    def option(rawName: String, description: String): this.type = js.native
    def option(rawName: String, description: String, config: OptionConfig): this.type = js.native
    
    /**
      * Parsed CLI options, camelCased
      */
    var options: StringDictionary[js.Any] = js.native
    
    /**
      * Output the corresponding help message
      * When a sub-command is matched, output the help message for the command
      * Otherwise output the global one.
      *
      */
    def outputHelp(): Unit = js.native
    
    /**
      * Output the version number.
      *
      */
    def outputVersion(): Unit = js.native
    
    /**
      * Parse argv
      */
    def parse(): ParsedArgv = js.native
    def parse(argv: js.UndefOr[scala.Nothing], hasRun: Run): ParsedArgv = js.native
    def parse(argv: js.Array[String]): ParsedArgv = js.native
    def parse(argv: js.Array[String], hasRun: Run): ParsedArgv = js.native
    
    /**
      * Raw CLI arguments
      */
    var rawArgs: js.Array[String] = js.native
    
    def runMatchedCommand(): js.Any = js.native
    
    var setParsedInfo: js.Any = js.native
    
    var showHelpOnExit: Boolean = js.native
    
    var showVersionOnExit: Boolean = js.native
    
    def unsetMatchedCommand(): Unit = js.native
    
    /**
      * Add a global usage text.
      *
      * This is not used by sub-commands.
      */
    def usage(text: String): this.type = js.native
    
    /**
      * Show version number when `-v, --version` flags appear.
      *
      */
    def version(version: String): this.type = js.native
    def version(version: String, customFlags: String): this.type = js.native
  }
  
  @JSImport("cac", "Command")
  @js.native
  class Command protected () extends StObject {
    def this(rawName: String, description: String, config: CommandConfig, cli: CAC_) = this()
    
    def action(callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    
    def alias(name: String): this.type = js.native
    
    var aliasNames: js.Array[String] = js.native
    
    def allowUnknownOptions(): this.type = js.native
    
    var args: js.Array[CommandArg] = js.native
    
    /**
      * Check if the required string-type options exist
      */
    def checkOptionValue(): Unit = js.native
    
    def checkRequiredArgs(): Unit = js.native
    
    /**
      * Check if the parsed options contain any unknown options
      *
      * Exit and output error when true
      */
    def checkUnknownOptions(): Unit = js.native
    
    var cli: CAC_ = js.native
    
    var commandAction: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var config: CommandConfig = js.native
    
    var description: String = js.native
    
    def example(example: CommandExample): this.type = js.native
    
    var examples: js.Array[CommandExample] = js.native
    
    var globalCommand: js.UndefOr[GlobalCommand] = js.native
    
    /**
      * Check if an option is registered in this command
      * @param name Option name
      */
    def hasOption(name: String): js.UndefOr[Option] = js.native
    
    var helpCallback: js.UndefOr[HelpCallback] = js.native
    
    def ignoreOptionDefaultValue(): this.type = js.native
    
    def isDefaultCommand: Boolean = js.native
    
    def isGlobalCommand: Boolean = js.native
    
    /**
      * Check if a command name is matched by this command
      * @param name Command name
      */
    def isMatched(name: String): Boolean = js.native
    
    var name: String = js.native
    
    /**
      * Add a option for this command
      * @param rawName Raw option name(s)
      * @param description Option description
      * @param config Option config
      */
    def option(rawName: String, description: String): this.type = js.native
    def option(rawName: String, description: String, config: OptionConfig): this.type = js.native
    
    var options: js.Array[Option] = js.native
    
    def outputHelp(): Unit = js.native
    
    def outputVersion(): Unit = js.native
    
    var rawName: String = js.native
    
    def usage(text: String): this.type = js.native
    
    var usageText: js.UndefOr[String] = js.native
    
    def version(version: String): this.type = js.native
    def version(version: String, customFlags: String): this.type = js.native
    
    var versionNumber: js.UndefOr[String] = js.native
  }
  
  /**
    * @param name The program name to display in help and version message
    */
  @JSImport("cac", "cac")
  @js.native
  def cac(): CAC_ = js.native
  @JSImport("cac", "cac")
  @js.native
  def cac(name: String): CAC_ = js.native
  
  @js.native
  trait CommandArg extends StObject {
    
    var required: Boolean = js.native
    
    var value: String = js.native
    
    var variadic: Boolean = js.native
  }
  object CommandArg {
    
    @scala.inline
    def apply(required: Boolean, value: String, variadic: Boolean): CommandArg = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandArg]
    }
    
    @scala.inline
    implicit class CommandArgMutableBuilder[Self <: CommandArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariadic(value: Boolean): Self = StObject.set(x, "variadic", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandConfig extends StObject {
    
    var allowUnknownOptions: js.UndefOr[Boolean] = js.native
    
    var ignoreOptionDefaultValue: js.UndefOr[Boolean] = js.native
  }
  object CommandConfig {
    
    @scala.inline
    def apply(): CommandConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandConfig]
    }
    
    @scala.inline
    implicit class CommandConfigMutableBuilder[Self <: CommandConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnknownOptions(value: Boolean): Self = StObject.set(x, "allowUnknownOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnknownOptionsUndefined: Self = StObject.set(x, "allowUnknownOptions", js.undefined)
      
      @scala.inline
      def setIgnoreOptionDefaultValue(value: Boolean): Self = StObject.set(x, "ignoreOptionDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreOptionDefaultValueUndefined: Self = StObject.set(x, "ignoreOptionDefaultValue", js.undefined)
    }
  }
  
  type CommandExample = (js.Function1[/* bin */ String, String]) | String
  
  type GlobalCommand = Command
  
  type HelpCallback = js.Function1[/* sections */ js.Array[HelpSection], Unit | js.Array[HelpSection]]
  
  @js.native
  trait HelpSection extends StObject {
    
    var body: String = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object HelpSection {
    
    @scala.inline
    def apply(body: String): HelpSection = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelpSection]
    }
    
    @scala.inline
    implicit class HelpSectionMutableBuilder[Self <: HelpSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    var config: OptionConfig = js.native
    
    var description: String = js.native
    
    var isBoolean: js.UndefOr[Boolean] = js.native
    
    /** Option name */
    var name: String = js.native
    
    /** Option name and aliases */
    var names: js.Array[String] = js.native
    
    var negated: Boolean = js.native
    
    var rawName: String = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(
      config: OptionConfig,
      description: String,
      name: String,
      names: js.Array[String],
      negated: Boolean,
      rawName: String
    ): Option = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: OptionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBoolean(value: Boolean): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait OptionConfig extends StObject {
    
    var default: js.UndefOr[js.Any] = js.native
    
    var `type`: js.UndefOr[js.Array[_]] = js.native
  }
  object OptionConfig {
    
    @scala.inline
    def apply(): OptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionConfig]
    }
    
    @scala.inline
    implicit class OptionConfigMutableBuilder[Self <: OptionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setType(value: js.Array[_]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: js.Any*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ParsedArgv extends StObject {
    
    var args: js.Array[String] = js.native
    
    var options: StringDictionary[js.Any] = js.native
  }
  object ParsedArgv {
    
    @scala.inline
    def apply(args: js.Array[String], options: StringDictionary[js.Any]): ParsedArgv = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedArgv]
    }
    
    @scala.inline
    implicit class ParsedArgvMutableBuilder[Self <: ParsedArgv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
