package typingsSlinky.queryString

import typingsSlinky.queryString.queryStringBooleans.`false`
import typingsSlinky.queryString.queryStringBooleans.`true`
import typingsSlinky.queryString.queryStringStrings.bracket
import typingsSlinky.queryString.queryStringStrings.comma
import typingsSlinky.queryString.queryStringStrings.index
import typingsSlinky.queryString.queryStringStrings.none
import typingsSlinky.queryString.queryStringStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  parseBooleans :true} & query-string.query-string.ParseOptions */
  @js.native
  trait parseBooleanstrueParseOpt extends StObject {
    
    /**
    	@default 'none'
    	- `bracket`: Parse arrays with bracket representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `index`: Parse arrays with index representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `comma`: Parse arrays with elements separated by comma:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `separator`: Parse arrays with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1|2|3', {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.native
    
    /**
    	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
    	@default ,
    	*/
    val arrayFormatSeparator: js.UndefOr[String] = js.native
    
    /**
    	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
    	@default true
    	*/
    val decode: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a boolean type instead of string type if it's a boolean.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=true', {parseBooleans: true});
    	//=> {foo: true}
    	```
    	*/
    var parseBooleans: `true` with js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the fragment identifier from the URL and add it to result object.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parseUrl('https://foo.bar?foo=bar#xyz', {parseFragmentIdentifier: true});
    	//=> {url: 'https://foo.bar', query: {foo: 'bar'}, fragmentIdentifier: 'xyz'}
    	```
    	*/
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a number type instead of string type if it's a number.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=1', {parseNumbers: true});
    	//=> {foo: 1}
    	```
    	*/
    val parseNumbers: js.UndefOr[Boolean] = js.native
    
    /**
    	Supports both `Function` as a custom sorting function or `false` to disable sorting.
    	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
    	@default true
    	@example
    	```
    	import queryString = require('query-string');
    	const order = ['c', 'a', 'b'];
    	queryString.parse('?a=one&b=two&c=three', {
    		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
    	});
    	//=> {c: 'three', a: 'one', b: 'two'}
    	```
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('?a=one&c=three&b=two', {sort: false});
    	//=> {a: 'one', c: 'three', b: 'two'}
    	```
    	*/
    val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.native
  }
  object parseBooleanstrueParseOpt {
    
    @scala.inline
    def apply(parseBooleans: `true` with js.UndefOr[Boolean]): parseBooleanstrueParseOpt = {
      val __obj = js.Dynamic.literal(parseBooleans = parseBooleans.asInstanceOf[js.Any])
      __obj.asInstanceOf[parseBooleanstrueParseOpt]
    }
    
    @scala.inline
    implicit class parseBooleanstrueParseOptMutableBuilder[Self <: parseBooleanstrueParseOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: bracket | index | comma | separator | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setParseBooleans(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      @scala.inline
      def setParseNumbers(value: Boolean): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseNumbersUndefined: Self = StObject.set(x, "parseNumbers", js.undefined)
      
      @scala.inline
      def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined {  parseBooleans :true,   parseNumbers :true} & query-string.query-string.ParseOptions */
  @js.native
  trait parseBooleanstrueparseNum extends StObject {
    
    /**
    	@default 'none'
    	- `bracket`: Parse arrays with bracket representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `index`: Parse arrays with index representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `comma`: Parse arrays with elements separated by comma:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `separator`: Parse arrays with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1|2|3', {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.native
    
    /**
    	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
    	@default ,
    	*/
    val arrayFormatSeparator: js.UndefOr[String] = js.native
    
    /**
    	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
    	@default true
    	*/
    val decode: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a boolean type instead of string type if it's a boolean.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=true', {parseBooleans: true});
    	//=> {foo: true}
    	```
    	*/
    var parseBooleans: `true` with js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the fragment identifier from the URL and add it to result object.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parseUrl('https://foo.bar?foo=bar#xyz', {parseFragmentIdentifier: true});
    	//=> {url: 'https://foo.bar', query: {foo: 'bar'}, fragmentIdentifier: 'xyz'}
    	```
    	*/
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a number type instead of string type if it's a number.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=1', {parseNumbers: true});
    	//=> {foo: 1}
    	```
    	*/
    var parseNumbers: `true` with js.UndefOr[Boolean] = js.native
    
    /**
    	Supports both `Function` as a custom sorting function or `false` to disable sorting.
    	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
    	@default true
    	@example
    	```
    	import queryString = require('query-string');
    	const order = ['c', 'a', 'b'];
    	queryString.parse('?a=one&b=two&c=three', {
    		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
    	});
    	//=> {c: 'three', a: 'one', b: 'two'}
    	```
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('?a=one&c=three&b=two', {sort: false});
    	//=> {a: 'one', c: 'three', b: 'two'}
    	```
    	*/
    val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.native
  }
  object parseBooleanstrueparseNum {
    
    @scala.inline
    def apply(parseBooleans: `true` with js.UndefOr[Boolean], parseNumbers: `true` with js.UndefOr[Boolean]): parseBooleanstrueparseNum = {
      val __obj = js.Dynamic.literal(parseBooleans = parseBooleans.asInstanceOf[js.Any], parseNumbers = parseNumbers.asInstanceOf[js.Any])
      __obj.asInstanceOf[parseBooleanstrueparseNum]
    }
    
    @scala.inline
    implicit class parseBooleanstrueparseNumMutableBuilder[Self <: parseBooleanstrueparseNum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: bracket | index | comma | separator | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setParseBooleans(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      @scala.inline
      def setParseNumbers(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  /* Inlined {  parseNumbers :true} & query-string.query-string.ParseOptions */
  @js.native
  trait parseNumberstrueParseOpti extends StObject {
    
    /**
    	@default 'none'
    	- `bracket`: Parse arrays with bracket representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[]=1&foo[]=2&foo[]=3', {arrayFormat: 'bracket'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `index`: Parse arrays with index representation:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo[0]=1&foo[1]=2&foo[3]=3', {arrayFormat: 'index'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `comma`: Parse arrays with elements separated by comma:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1,2,3', {arrayFormat: 'comma'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `separator`: Parse arrays with elements separated by a custom character:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1|2|3', {arrayFormat: 'separator', arrayFormatSeparator: '|'});
    		//=> {foo: ['1', '2', '3']}
    		```
    	- `none`: Parse arrays with elements using duplicate keys:
    		```
    		import queryString = require('query-string');
    		queryString.parse('foo=1&foo=2&foo=3');
    		//=> {foo: ['1', '2', '3']}
    		```
    	*/
    val arrayFormat: js.UndefOr[bracket | index | comma | separator | none] = js.native
    
    /**
    	The character used to separate array elements when using `{arrayFormat: 'separator'}`.
    	@default ,
    	*/
    val arrayFormatSeparator: js.UndefOr[String] = js.native
    
    /**
    	Decode the keys and values. URI components are decoded with [`decode-uri-component`](https://github.com/SamVerschueren/decode-uri-component).
    	@default true
    	*/
    val decode: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a boolean type instead of string type if it's a boolean.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=true', {parseBooleans: true});
    	//=> {foo: true}
    	```
    	*/
    val parseBooleans: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the fragment identifier from the URL and add it to result object.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parseUrl('https://foo.bar?foo=bar#xyz', {parseFragmentIdentifier: true});
    	//=> {url: 'https://foo.bar', query: {foo: 'bar'}, fragmentIdentifier: 'xyz'}
    	```
    	*/
    val parseFragmentIdentifier: js.UndefOr[Boolean] = js.native
    
    /**
    	Parse the value as a number type instead of string type if it's a number.
    	@default false
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('foo=1', {parseNumbers: true});
    	//=> {foo: 1}
    	```
    	*/
    var parseNumbers: `true` with js.UndefOr[Boolean] = js.native
    
    /**
    	Supports both `Function` as a custom sorting function or `false` to disable sorting.
    	If omitted, keys are sorted using `Array#sort`, which means, converting them to strings and comparing strings in Unicode code point order.
    	@default true
    	@example
    	```
    	import queryString = require('query-string');
    	const order = ['c', 'a', 'b'];
    	queryString.parse('?a=one&b=two&c=three', {
    		sort: (itemLeft, itemRight) => order.indexOf(itemLeft) - order.indexOf(itemRight)
    	});
    	//=> {c: 'three', a: 'one', b: 'two'}
    	```
    	@example
    	```
    	import queryString = require('query-string');
    	queryString.parse('?a=one&c=three&b=two', {sort: false});
    	//=> {a: 'one', c: 'three', b: 'two'}
    	```
    	*/
    val sort: js.UndefOr[(js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`] = js.native
  }
  object parseNumberstrueParseOpti {
    
    @scala.inline
    def apply(parseNumbers: `true` with js.UndefOr[Boolean]): parseNumberstrueParseOpti = {
      val __obj = js.Dynamic.literal(parseNumbers = parseNumbers.asInstanceOf[js.Any])
      __obj.asInstanceOf[parseNumberstrueParseOpti]
    }
    
    @scala.inline
    implicit class parseNumberstrueParseOptiMutableBuilder[Self <: parseNumberstrueParseOpti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayFormat(value: bracket | index | comma | separator | none): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparator(value: String): Self = StObject.set(x, "arrayFormatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayFormatSeparatorUndefined: Self = StObject.set(x, "arrayFormatSeparator", js.undefined)
      
      @scala.inline
      def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      @scala.inline
      def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setParseBooleans(value: Boolean): Self = StObject.set(x, "parseBooleans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseBooleansUndefined: Self = StObject.set(x, "parseBooleans", js.undefined)
      
      @scala.inline
      def setParseFragmentIdentifier(value: Boolean): Self = StObject.set(x, "parseFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseFragmentIdentifierUndefined: Self = StObject.set(x, "parseFragmentIdentifier", js.undefined)
      
      @scala.inline
      def setParseNumbers(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "parseNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
