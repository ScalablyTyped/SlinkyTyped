package typingsSlinky.allKeys

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get all property keys of an object including non-enumerable and inherited ones. Like [Reflect.ownKeys()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Reflect/ownKeys) but traverses up the prototype-chain.
  	@returns All property names from `object`.
  	@example
  	```
  	import allKeys = require('all-keys');
  	Object.getOwnPropertyNames(Symbol.prototype);
  	/ *
  	[
  		'constructor',
  		'toString',
  		'valueOf'
  	]
  	*\/
  	allKeys(Symbol.prototype);
  	/ *
  	Set {
  		'constructor',
  		'toString',
  		'valueOf',
  		'toLocaleString',
  		'hasOwnProperty',
  		'isPrototypeOf',
  		'propertyIsEnumerable',
  		'__defineGetter__',
  		'__lookupGetter__',
  		'__defineSetter__',
  		'__lookupSetter__',
  		'__proto__'
  	}
  	*\/
  	```
  	*/
  @JSImport("all-keys", JSImport.Namespace)
  @js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = js.native
  @JSImport("all-keys", JSImport.Namespace)
  @js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType, options: Options): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = js.native
  
  @JSImport("all-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function allKeys<ObjectType extends {[key: string]: any}>(
  // 	object: ObjectType,
  // 	options?: allKeys.Options
  // ): Set<LiteralUnion<keyof ObjectType, string | number | symbol>>;
  // export = allKeys;
  @JSImport("all-keys", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allKeys */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allKeys */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Include `Object.prototype` properties like `isPrototypeOf`.
    		@default true
    		*/
    val includeObjectPrototype: js.UndefOr[Boolean] = js.native
    
    /**
    		Include [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
    		@default true
    		*/
    val includeSymbols: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeObjectPrototype(value: Boolean): Self = StObject.set(x, "includeObjectPrototype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeObjectPrototypeUndefined: Self = StObject.set(x, "includeObjectPrototype", js.undefined)
      
      @scala.inline
      def setIncludeSymbols(value: Boolean): Self = StObject.set(x, "includeSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSymbolsUndefined: Self = StObject.set(x, "includeSymbols", js.undefined)
    }
  }
}
