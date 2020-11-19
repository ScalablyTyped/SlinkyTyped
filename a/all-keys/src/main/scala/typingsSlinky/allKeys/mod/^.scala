package typingsSlinky.allKeys.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("all-keys", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType, options: Options): Set[LiteralUnion[/* keyof ObjectType */ String, String | Double | js.Symbol]] = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function allKeys<ObjectType extends {[key: string]: any}>(
  // 	object: ObjectType,
  // 	options?: allKeys.Options
  // ): Set<LiteralUnion<keyof ObjectType, string | number | symbol>>;
  // export = allKeys;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof allKeys */ js.Any = js.native
}
