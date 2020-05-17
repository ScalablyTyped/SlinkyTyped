package typingsSlinky.queryString.anon

import typingsSlinky.queryString.queryStringBooleans.`false`
import typingsSlinky.queryString.queryStringBooleans.`true`
import typingsSlinky.queryString.queryStringStrings.bracket
import typingsSlinky.queryString.queryStringStrings.comma
import typingsSlinky.queryString.queryStringStrings.index
import typingsSlinky.queryString.queryStringStrings.none
import typingsSlinky.queryString.queryStringStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  parseBooleans  :true} & query-string.query-string.ParseOptions */
@js.native
trait parseBooleanstrueParseOpt extends js.Object {
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
  var parseBooleans: js.UndefOr[`true` with Boolean] = js.native
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
  def apply(): parseBooleanstrueParseOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[parseBooleanstrueParseOpt]
  }
  @scala.inline
  implicit class parseBooleanstrueParseOptOps[Self <: parseBooleanstrueParseOpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFormat(value: bracket | index | comma | separator | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayFormatSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormatSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFormatSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormatSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDecode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.undefined)
        ret
    }
    @scala.inline
    def withParseBooleans(value: `true` with Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseBooleans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseBooleans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseBooleans")(js.undefined)
        ret
    }
    @scala.inline
    def withParseNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction2(value: (/* itemLeft */ String, /* itemRight */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSort(value: (js.Function2[/* itemLeft */ String, /* itemRight */ String, Double]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

