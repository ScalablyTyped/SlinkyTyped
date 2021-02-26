package typingsSlinky.minimistOptions

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.minimist.mod.Opts
import typingsSlinky.minimistOptions.minimistOptionsStrings.`boolean-array`
import typingsSlinky.minimistOptions.minimistOptionsStrings.`number-array`
import typingsSlinky.minimistOptions.minimistOptionsStrings.`string-array`
import typingsSlinky.minimistOptions.minimistOptionsStrings.array
import typingsSlinky.minimistOptions.minimistOptionsStrings.boolean
import typingsSlinky.minimistOptions.minimistOptionsStrings.number
import typingsSlinky.minimistOptions.minimistOptionsStrings.string
import typingsSlinky.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimist-options", JSImport.Default)
  @js.native
  def default(): Opts = js.native
  @JSImport("minimist-options", JSImport.Default)
  @js.native
  def default(options: Options): Opts = js.native
  
  @js.native
  trait BaseOption[TypeOptionType /* <: OptionType */, DefaultOptionType] extends StObject {
    
    /**
    	 * The default value for the option.
    	 */
    val default: js.UndefOr[DefaultOptionType] = js.native
    
    /**
    	 * An alias/list of aliases for the option.
    	 */
    val alias: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
    	 * The data type the option should be parsed to.
    	 */
    val `type`: js.UndefOr[TypeOptionType] = js.native
  }
  object BaseOption {
    
    @scala.inline
    def apply[TypeOptionType /* <: OptionType */, DefaultOptionType](): BaseOption[TypeOptionType, DefaultOptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOption[TypeOptionType, DefaultOptionType]]
    }
    
    @scala.inline
    implicit class BaseOptionMutableBuilder[Self <: BaseOption[_, _], TypeOptionType /* <: OptionType */, DefaultOptionType] (val x: Self with (BaseOption[TypeOptionType, DefaultOptionType])) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: DefaultOptionType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BooleanArrayOption = BaseOption[`boolean-array`, js.Array[Boolean]]
  
  type BooleanOption = BaseOption[boolean, Boolean]
  
  type DefaultArrayOption = BaseOption[array, js.Array[String]]
  
  type MinimistOption = NonNullable[js.UndefOr[Boolean | (js.Function1[/* arg */ String, Boolean])]]
  
  type NumberArrayOption = BaseOption[`number-array`, js.Array[Double]]
  
  type NumberOption = BaseOption[number, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.minimistOptions.minimistOptionsStrings.string
    - typingsSlinky.minimistOptions.minimistOptionsStrings.boolean
    - typingsSlinky.minimistOptions.minimistOptionsStrings.number
    - typingsSlinky.minimistOptions.minimistOptionsStrings.array
    - typingsSlinky.minimistOptions.minimistOptionsStrings.`string-array`
    - typingsSlinky.minimistOptions.minimistOptionsStrings.`boolean-array`
    - typingsSlinky.minimistOptions.minimistOptionsStrings.`number-array`
  */
  trait OptionType extends StObject
  object OptionType {
    
    @scala.inline
    def array: typingsSlinky.minimistOptions.minimistOptionsStrings.array = "array".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.array]
    
    @scala.inline
    def boolean: typingsSlinky.minimistOptions.minimistOptionsStrings.boolean = "boolean".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.boolean]
    
    @scala.inline
    def `boolean-array`: typingsSlinky.minimistOptions.minimistOptionsStrings.`boolean-array` = "boolean-array".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.`boolean-array`]
    
    @scala.inline
    def number: typingsSlinky.minimistOptions.minimistOptionsStrings.number = "number".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.number]
    
    @scala.inline
    def `number-array`: typingsSlinky.minimistOptions.minimistOptionsStrings.`number-array` = "number-array".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.`number-array`]
    
    @scala.inline
    def string: typingsSlinky.minimistOptions.minimistOptionsStrings.string = "string".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.string]
    
    @scala.inline
    def `string-array`: typingsSlinky.minimistOptions.minimistOptionsStrings.`string-array` = "string-array".asInstanceOf[typingsSlinky.minimistOptions.minimistOptionsStrings.`string-array`]
  }
  
  type Options = StringDictionary[
    OptionType | StringOption | BooleanOption | NumberOption | DefaultArrayOption | StringArrayOption | BooleanArrayOption | NumberArrayOption | MinimistOption
  ]
  
  type StringArrayOption = BaseOption[`string-array`, js.Array[String]]
  
  type StringOption = BaseOption[string, String]
}
