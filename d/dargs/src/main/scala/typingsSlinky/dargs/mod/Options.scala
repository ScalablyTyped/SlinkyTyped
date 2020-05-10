package typingsSlinky.dargs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Maps keys in `input` to an aliased name. Matching keys are converted to arguments with a single dash (`-`) in front of the aliased key and the value in a separate array item. Keys are still affected by `includes` and `excludes`.
  		*/
  var aliases: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		By default, camel-cased keys will be hyphenated. Enabling this will bypass the conversion process.
  		@default false
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({fooBar: 'baz'}));
  		//=> ['--foo-bar', 'baz']
  		console.log(dargs({fooBar: 'baz'}, {allowCamelCase: true}));
  		//=> ['--fooBar', 'baz']
  		```
  		*/
  var allowCamelCase: js.UndefOr[Boolean] = js.native
  /**
  		Keys or regex of keys to exclude. Takes precedence over `includes`.
  		*/
  var excludes: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
  		Exclude `false` values. Can be useful when dealing with strict argument parsers that throw on unknown arguments like `--no-foo`.
  		@default false
  		*/
  var ignoreFalse: js.UndefOr[Boolean] = js.native
  /**
  		Keys or regex of keys to include.
  		*/
  var includes: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
  		Make a single character option key `{a: true}` become a short flag `-a` instead of `--a`.
  		@default true
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({a: true}));
  		//=> ['-a']
  		console.log(dargs({a: true}, {shortFlag: false}));
  		//=> ['--a']
  		```
  		*/
  var shortFlag: js.UndefOr[Boolean] = js.native
  /**
  		Setting this to `false` makes it return the key and value as separate array items instead of using a `=` separator in one item. This can be useful for tools that doesn't support `--foo=bar` style flags.
  		@default true
  		@example
  		```
  		import dargs = require('dargs');
  		console.log(dargs({foo: 'bar'}, {useEquals: false}));
  		// [
  		// 	'--foo', 'bar'
  		// ]
  		```
  		*/
  var useEquals: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCamelCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCamelCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCamelCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCamelCase")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludes(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFalse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFalse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFalse")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.undefined)
        ret
    }
    @scala.inline
    def withShortFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEquals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEquals")(js.undefined)
        ret
    }
  }
  
}

