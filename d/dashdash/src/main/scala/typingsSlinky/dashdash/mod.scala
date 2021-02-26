package typingsSlinky.dashdash

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dashdash", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(config: ParserConfiguration) = this()
    
    /** Don't allow unknown flags. @default true */
    var allowUnknown: Boolean = js.native
    
    /**  Return a string suitable for a Bash completion file for this tool. */
    def bashCompletion(args: BashCompletionConfiguration): String = js.native
    
    /**
      * Return help output for the current options.
      *
      * E.g.: if the current options are:
      *      [{names: ['help', 'h'], type: 'bool', help: 'Show help and exit.'}]
      * then this would return:
      *      '  -h, --help     Show help and exit.\n'
      */
    def help(): String = js.native
    def help(config: HelpConfiguration): String = js.native
    
    /**  Allow interspersed arguments. @default true */
    var interpersed: Boolean = js.native
    
    /** Parse options from the given argv. */
    def parse(): Results = js.native
    def parse(inputs: js.Array[String]): Results = js.native
    def parse(inputs: ParsingConfiguration): Results = js.native
  }
  
  @JSImport("dashdash", "addOptionType")
  @js.native
  def addOptionType(optionType: OptionType): Unit = js.native
  
  @JSImport("dashdash", "bashCompletionFromOptions")
  @js.native
  def bashCompletionFromOptions(args: BashCompletionConfiguration): String = js.native
  
  @JSImport("dashdash", "bashCompletionSpecFromOptions")
  @js.native
  def bashCompletionSpecFromOptions(args: BashCompletionSpecConfiguration): String = js.native
  
  @JSImport("dashdash", "createParser")
  @js.native
  def createParser(config: ParserConfiguration): Parser = js.native
  
  @JSImport("dashdash", "getOptionType")
  @js.native
  def getOptionType(name: String): OptionType = js.native
  
  @JSImport("dashdash", "parse")
  @js.native
  def parse(config: ParsingConfiguration): Results = js.native
  
  @JSImport("dashdash", "synopsisFromOpt")
  @js.native
  def synopsisFromOpt(o: Option): String = js.native
  
  @js.native
  trait Arg extends StObject {
    
    var from: String = js.native
    
    var name: String = js.native
    
    var value: js.Any = js.native
  }
  object Arg {
    
    @scala.inline
    def apply(from: String, name: String, value: js.Any): Arg = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arg]
    }
    
    @scala.inline
    implicit class ArgMutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BashCompletionConfiguration extends StObject {
    
    /**
      * Array of completion types for positional args (i.e. non-options).
      * If not given, positional args will use Bash's 'default' completion.
      */
    var argtypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The tool name.
      */
    var name: String = js.native
    
    /**
      * The array of dashdash option specs.
      */
    var options: js.UndefOr[js.Array[Option | Group]] = js.native
    
    /**
      * Extra Bash code content to add
      * to the end of the "spec". Typically this is used to append Bash
      * "complete_TYPE" functions for custom option types.
      */
    var specExtra: js.UndefOr[String] = js.native
  }
  object BashCompletionConfiguration {
    
    @scala.inline
    def apply(name: String): BashCompletionConfiguration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BashCompletionConfiguration]
    }
    
    @scala.inline
    implicit class BashCompletionConfigurationMutableBuilder[Self <: BashCompletionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgtypes(value: js.Array[String]): Self = StObject.set(x, "argtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgtypesUndefined: Self = StObject.set(x, "argtypes", js.undefined)
      
      @scala.inline
      def setArgtypesVarargs(value: String*): Self = StObject.set(x, "argtypes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[Option | Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSpecExtra(value: String): Self = StObject.set(x, "specExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecExtraUndefined: Self = StObject.set(x, "specExtra", js.undefined)
    }
  }
  
  @js.native
  trait BashCompletionSpecConfiguration extends StObject {
    
    /**
      * Array of completion types for positional args (i.e. non-options).
      * If not given, positional args will use Bash's 'default' completion.
      */
    var argtypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A context string for the "local cmd*"
      * vars in the spec. By default it is the empty string. When used to
      * scope for completion on a *sub-command*.
      */
    var context: js.UndefOr[String] = js.native
    
    /**
      * By default
      * hidden options and subcmds are "excluded". Here excluded means they
      * won't be offered as a completion, but if used, their argument type
      * will be completed. "Hidden" options and subcmds are ones with the
      * `hidden: true` attribute to exclude them from default help output.
      */
    var includeHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * The array of dashdash option specs.
      */
    var options: js.Array[Option | Group] = js.native
  }
  object BashCompletionSpecConfiguration {
    
    @scala.inline
    def apply(options: js.Array[Option | Group]): BashCompletionSpecConfiguration = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BashCompletionSpecConfiguration]
    }
    
    @scala.inline
    implicit class BashCompletionSpecConfigurationMutableBuilder[Self <: BashCompletionSpecConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgtypes(value: js.Array[String]): Self = StObject.set(x, "argtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgtypesUndefined: Self = StObject.set(x, "argtypes", js.undefined)
      
      @scala.inline
      def setArgtypesVarargs(value: String*): Self = StObject.set(x, "argtypes", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setIncludeHidden(value: Boolean): Self = StObject.set(x, "includeHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeHiddenUndefined: Self = StObject.set(x, "includeHidden", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option | Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Group extends StObject {
    
    var group: String = js.native
  }
  object Group {
    
    @scala.inline
    def apply(group: String): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HelpConfiguration extends StObject {
    
    /**
      * Set to a number (for that many spaces) or a string for the literal indent.
      * This indent applies to group heading lines, between normal option lines.
      * Default: half length of `indent`
      */
    var headingIndent: js.UndefOr[Double | String] = js.native
    
    /**
      * If not set a reasonable value will be determined between minHelpCol and maxHelpCol.
      */
    var helpCol: js.UndefOr[Double] = js.native
    
    /**
      * Set to `false` to have option `help` strings not be textwrapped to the helpCol..maxCol range.
      * Default: true
      */
    var helpWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * If the option has a default value (via the default option spec attribute, or a default on the option's type), then a "Default: VALUE" string will be appended to the help string.
      * Default: false
      */
    var includeDefault: js.UndefOr[Boolean] = js.native
    
    /**
      * If the option has associated environment variables (via the env option spec attribute), then append mentioned of those envvars to the help string.
      * Default: false
      */
    var includeEnv: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to a number (for that many spaces) or a string for the literal indent.
      * Default: 4
      */
    var indent: js.UndefOr[Double | String] = js.native
    
    /**
      * Note that reflow is just done on whitespace so a long token in the option help can overflow maxCol.
      * Default: 80
      */
    var maxCol: js.UndefOr[Double] = js.native
    
    /**
      * Default: 40
      */
    var maxHelpCol: js.UndefOr[Double] = js.native
    
    /**
      * Default: 20
      */
    var minHelpCol: js.UndefOr[Double] = js.native
    
    /**
      * By default the names are sorted to put the short opts first (i.e. '-h, --help' preferred to '--help, -h').
      * Set to 'none' to not do this sorting.
      * Default: 'length'
      */
    var nameSort: js.UndefOr[String] = js.native
  }
  object HelpConfiguration {
    
    @scala.inline
    def apply(): HelpConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpConfiguration]
    }
    
    @scala.inline
    implicit class HelpConfigurationMutableBuilder[Self <: HelpConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadingIndent(value: Double | String): Self = StObject.set(x, "headingIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingIndentUndefined: Self = StObject.set(x, "headingIndent", js.undefined)
      
      @scala.inline
      def setHelpCol(value: Double): Self = StObject.set(x, "helpCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpColUndefined: Self = StObject.set(x, "helpCol", js.undefined)
      
      @scala.inline
      def setHelpWrap(value: Boolean): Self = StObject.set(x, "helpWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpWrapUndefined: Self = StObject.set(x, "helpWrap", js.undefined)
      
      @scala.inline
      def setIncludeDefault(value: Boolean): Self = StObject.set(x, "includeDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDefaultUndefined: Self = StObject.set(x, "includeDefault", js.undefined)
      
      @scala.inline
      def setIncludeEnv(value: Boolean): Self = StObject.set(x, "includeEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEnvUndefined: Self = StObject.set(x, "includeEnv", js.undefined)
      
      @scala.inline
      def setIndent(value: Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMaxCol(value: Double): Self = StObject.set(x, "maxCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxColUndefined: Self = StObject.set(x, "maxCol", js.undefined)
      
      @scala.inline
      def setMaxHelpCol(value: Double): Self = StObject.set(x, "maxHelpCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHelpColUndefined: Self = StObject.set(x, "maxHelpCol", js.undefined)
      
      @scala.inline
      def setMinHelpCol(value: Double): Self = StObject.set(x, "minHelpCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHelpColUndefined: Self = StObject.set(x, "minHelpCol", js.undefined)
      
      @scala.inline
      def setNameSort(value: String): Self = StObject.set(x, "nameSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameSortUndefined: Self = StObject.set(x, "nameSort", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dashdash.mod.OptionWithoutAliases
    - typingsSlinky.dashdash.mod.OptionWithAliases
  */
  trait Option extends StObject
  object Option {
    
    @scala.inline
    def OptionWithAliases(names: js.Array[String], `type`: String): typingsSlinky.dashdash.mod.OptionWithAliases = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.dashdash.mod.OptionWithAliases]
    }
    
    @scala.inline
    def OptionWithoutAliases(name: String, `type`: String): typingsSlinky.dashdash.mod.OptionWithoutAliases = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.dashdash.mod.OptionWithoutAliases]
    }
  }
  
  @js.native
  trait OptionBase extends StObject {
    
    /**
      * A default value used for this option, if the option isn't specified in argv.
      */
    var default: js.UndefOr[String] = js.native
    
    /**
      * This is used for Bash completion for an option argument.
      * If not specified, then the value of type is used. Any string may be specified, but only the following values have meaning:
      *  - none: Provide no completions.
      *  - file: Bash's default completion (i.e. complete -o default), which includes filenames.
      *  - Any string FOO for which a function complete_FOO Bash function is defined.
      * This is for custom completions for a given tool.
      * Typically these custom functions are provided in the specExtra argument to dashdash.bashCompletionFromOptions().
      */
    var completionType: js.UndefOr[String] = js.native
    
    /**
      * An environment variable name (or names) that can be used as a fallback for this option.
      * An environment variable is only used as a fallback, i.e. it is ignored if the associated option is given in `argv`.
      */
    var env: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Used for parser.help() output.
      */
    var help: js.UndefOr[String] = js.native
    
    /**
      * Used in help output as the placeholder for the option argument.
      */
    var helpArg: js.UndefOr[String] = js.native
    
    /**
      * Set this to false to have that option's help not be text wrapped in <parser>.help() output.
      */
    var helpWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, help output will not include this option.
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * One of: bool, string, number, integer, positiveInteger, arrayOfBool, arrayOfString,
      * arrayOfNumber, arrayOfInteger, arrayOfPositiveInteger, arrayOfDate,
      * date (epoch seconds, e.g. 1396031701, or ISO 8601 format YYYY-MM-DD[THH:MM:SS[.sss][Z]], e.g. "2014-03-28T18:35:01.489Z").
      * You can add your own custom option types with `dashdash.addOptionType`
      * These names attempt to match with asserts on `assert-plus`.
      */
    var `type`: String = js.native
  }
  object OptionBase {
    
    @scala.inline
    def apply(`type`: String): OptionBase = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionBase]
    }
    
    @scala.inline
    implicit class OptionBaseMutableBuilder[Self <: OptionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompletionType(value: String): Self = StObject.set(x, "completionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionTypeUndefined: Self = StObject.set(x, "completionType", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setEnv(value: String | js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpArg(value: String): Self = StObject.set(x, "helpArg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpArgUndefined: Self = StObject.set(x, "helpArg", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHelpWrap(value: Boolean): Self = StObject.set(x, "helpWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpWrapUndefined: Self = StObject.set(x, "helpWrap", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionType extends StObject {
    
    /**
      * Default value for options of this type, if no default is specified in the option type usage.
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * Set to true if this is an 'arrayOf' type
      * that collects multiple usages of the option in process.argv and puts results in an array.
      */
    var array: js.UndefOr[Boolean] = js.native
    
    var arrayFlatten: js.UndefOr[Boolean] = js.native
    
    var completionType: js.UndefOr[js.Any] = js.native
    
    /**
      * Required iff `takesArg === true`. The string to show in generated help for options of this type.
      */
    var helpArg: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    /**
      * parser that takes a string argument and returns an instance of the
      * appropriate type, or throws an error if the arg is invalid.
      */
    def parseArg(option: Option, optstr: String, arg: String): js.Any = js.native
    
    /**
      * Whether this type of option takes an
      * argument on process.argv. Typically this is true for all but the
      * "bool" type.
      */
    var takesArg: Boolean = js.native
  }
  object OptionType {
    
    @scala.inline
    def apply(name: String, parseArg: (Option, String, String) => js.Any, takesArg: Boolean): OptionType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parseArg = js.Any.fromFunction3(parseArg), takesArg = takesArg.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionType]
    }
    
    @scala.inline
    implicit class OptionTypeMutableBuilder[Self <: OptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFlatten(value: Boolean): Self = StObject.set(x, "arrayFlatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFlattenUndefined: Self = StObject.set(x, "arrayFlatten", js.undefined)
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setCompletionType(value: js.Any): Self = StObject.set(x, "completionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionTypeUndefined: Self = StObject.set(x, "completionType", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setHelpArg(value: String): Self = StObject.set(x, "helpArg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpArgUndefined: Self = StObject.set(x, "helpArg", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseArg(value: (Option, String, String) => js.Any): Self = StObject.set(x, "parseArg", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTakesArg(value: Boolean): Self = StObject.set(x, "takesArg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionWithAliases
    extends OptionBase
       with Option {
    
    /**
      * The option name and aliases. The first name (if more than one given) is the key for the parsed `opts` object.
      */
    var names: js.Array[String] = js.native
  }
  object OptionWithAliases {
    
    @scala.inline
    def apply(names: js.Array[String], `type`: String): OptionWithAliases = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionWithAliases]
    }
    
    @scala.inline
    implicit class OptionWithAliasesMutableBuilder[Self <: OptionWithAliases] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionWithoutAliases
    extends OptionBase
       with Option {
    
    /**
      * The option name
      */
    var name: String = js.native
  }
  object OptionWithoutAliases {
    
    @scala.inline
    def apply(name: String, `type`: String): OptionWithoutAliases = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionWithoutAliases]
    }
    
    @scala.inline
    implicit class OptionWithoutAliasesMutableBuilder[Self <: OptionWithoutAliases] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParserConfiguration extends StObject {
    
    /**
      * Whether to throw on unknown options.
      * If false, then unknown args are included in the _args array.
      * Default: false
      */
    var allowUnknown: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to allow interspersed arguments (non-options) and options.
      *
      * E.g.:
      *   node tool.js arg1 arg2 -v
      *
      * '-v' is after some args here. If `interspersed: false` then '-v'
      *  would not be parsed out. Note that regardless of `interspersed`
      * the presence of '--' will stop option parsing, as all good
      * option parsers should.
      *
      * Default: true
      */
    var interspersed: js.UndefOr[Boolean] = js.native
    
    /**
      * Array of option specs.
      */
    var options: js.Array[Option | Group] = js.native
  }
  object ParserConfiguration {
    
    @scala.inline
    def apply(options: js.Array[Option | Group]): ParserConfiguration = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserConfiguration]
    }
    
    @scala.inline
    implicit class ParserConfigurationMutableBuilder[Self <: ParserConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnknownUndefined: Self = StObject.set(x, "allowUnknown", js.undefined)
      
      @scala.inline
      def setInterspersed(value: Boolean): Self = StObject.set(x, "interspersed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterspersedUndefined: Self = StObject.set(x, "interspersed", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option | Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ParsingConfiguration extends StObject {
    
    /**
      * The argv to parse. Defaults to `process.argv`.
      */
    var argv: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The env to use for 'env' entries in the option specs. Defaults to `process.env`.
      */
    var env: js.UndefOr[js.Any] = js.native
    
    // NodeJS.ProcessEnv;
    var options: js.UndefOr[js.Array[Option | Group]] = js.native
    
    /**
      * The index into argv at which options/args begin.  Default is 2, as appropriate for `process.argv`.
      */
    var slice: js.UndefOr[Double] = js.native
  }
  object ParsingConfiguration {
    
    @scala.inline
    def apply(): ParsingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsingConfiguration]
    }
    
    @scala.inline
    implicit class ParsingConfigurationMutableBuilder[Self <: ParsingConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option | Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSlice(value: Double): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    }
  }
  
  @js.native
  trait Results
    extends /* key */ StringDictionary[js.Any] {
    
    var _args: js.Array[String] = js.native
    
    var _order: js.Array[Arg] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(_args: js.Array[String], _order: js.Array[Arg]): Results = {
      val __obj = js.Dynamic.literal(_args = _args.asInstanceOf[js.Any], _order = _order.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_args(value: js.Array[String]): Self = StObject.set(x, "_args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_argsVarargs(value: String*): Self = StObject.set(x, "_args", js.Array(value :_*))
      
      @scala.inline
      def set_order(value: js.Array[Arg]): Self = StObject.set(x, "_order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_orderVarargs(value: Arg*): Self = StObject.set(x, "_order", js.Array(value :_*))
    }
  }
}
