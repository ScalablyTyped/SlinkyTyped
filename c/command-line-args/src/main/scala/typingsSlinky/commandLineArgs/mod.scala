package typingsSlinky.commandLineArgs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("command-line-args", JSImport.Namespace)
  @js.native
  def apply(optionDefinitions: js.Array[OptionDefinition]): CommandLineOptions = js.native
  @JSImport("command-line-args", JSImport.Namespace)
  @js.native
  def apply(optionDefinitions: js.Array[OptionDefinition], options: ParseOptions): CommandLineOptions = js.native
  
  @js.native
  trait CommandLineOptions
    extends /* propName */ StringDictionary[js.Any] {
    
    /**
      * Command-line arguments not parsed by `commandLineArgs`.
      */
    var _unknown: js.UndefOr[js.Array[String]] = js.native
  }
  object CommandLineOptions {
    
    @scala.inline
    def apply(): CommandLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandLineOptions]
    }
    
    @scala.inline
    implicit class CommandLineOptionsMutableBuilder[Self <: CommandLineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_unknown(value: js.Array[String]): Self = StObject.set(x, "_unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unknownUndefined: Self = StObject.set(x, "_unknown", js.undefined)
      
      @scala.inline
      def set_unknownVarargs(value: String*): Self = StObject.set(x, "_unknown", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionDefinition extends StObject {
    
    /**
      * A getopt-style short option name. Can be any single character except a digit or hyphen.
      */
    var alias: js.UndefOr[String] = js.native
    
    /**
      * Any values unaccounted for by an option definition will be set on the `defaultOption`. This flag is typically set
      * on the most commonly-used option to enable more concise usage.
      */
    var defaultOption: js.UndefOr[Boolean] = js.native
    
    /**
      * An initial value for the option.
      */
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    /**
      * One or more group names the option belongs to.
      */
    var group: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Identical to `multiple` but with greedy parsing disabled.
      */
    var lazyMultiple: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this flag if the option accepts multiple values. In the output, you will receive an array of values each passed through the `type` function.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * The long option name.
      */
    var name: String = js.native
    
    /**
      * A setter function (you receive the output from this) enabling you to be specific about the type and value received. Typical values
      * are `String` (the default), `Number` and `Boolean` but you can use a custom function. If no option value was set you will receive `null`.
      */
    var `type`: js.UndefOr[js.Function1[/* input */ String, _]] = js.native
  }
  object OptionDefinition {
    
    @scala.inline
    def apply(name: String): OptionDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionDefinition]
    }
    
    @scala.inline
    implicit class OptionDefinitionMutableBuilder[Self <: OptionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setDefaultOption(value: Boolean): Self = StObject.set(x, "defaultOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionUndefined: Self = StObject.set(x, "defaultOption", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setLazyMultiple(value: Boolean): Self = StObject.set(x, "lazyMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyMultipleUndefined: Self = StObject.set(x, "lazyMultiple", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* input */ String => _): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * An array of strings which if present will be parsed instead of `process.argv`.
      */
    var argv: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * If `true`, options with hypenated names (e.g. `move-to`) will be returned in camel-case (e.g. `moveTo`).
      */
    var camelCase: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, `commandLineArgs` will not throw on unknown options or values, instead returning them in the `_unknown` property of the output.
      */
    var partial: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, `commandLineArgs` will not throw on unknown options or values. Instead, parsing will stop at the first unknown argument
      * and the remaining arguments returned in the `_unknown` property of the output. If set, `partial: true` is implied.
      */
    var stopAtFirstUnknown: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setCamelCase(value: Boolean): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamelCaseUndefined: Self = StObject.set(x, "camelCase", js.undefined)
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setStopAtFirstUnknown(value: Boolean): Self = StObject.set(x, "stopAtFirstUnknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopAtFirstUnknownUndefined: Self = StObject.set(x, "stopAtFirstUnknown", js.undefined)
    }
  }
}
