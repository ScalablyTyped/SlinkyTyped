package typingsSlinky.rollupPluginCommonjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupCommonJSOptions extends js.Object {
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /**
  	 * search for files other than .js files (must already
  	 * be transpiled by a previous plugin!)
  	 * @default [ '.js' ]
  	 */
  var extensions: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
  	 * sometimes you have to leave require statements
  	 * unconverted. Pass an array containing the IDs
  	 * or a `id => boolean` function. Only use this
  	 * option if you know what you're doing!
  	 */
  var ignore: js.UndefOr[js.Array[String | (js.Function1[/* id */ String, Boolean])]] = js.native
  /**
  	 * if true then uses of `global` won't be dealt with by this plugin
  	 * @default false
  	 */
  var ignoreGlobal: js.UndefOr[Boolean] = js.native
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /**
  	 * explicitly specify unresolvable named exports
  	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
  	 * @default undefined
  	 */
  var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
  	 * if false then skip sourceMap generation for CommonJS modules
  	 * @default true
  	 */
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object RollupCommonJSOptions {
  @scala.inline
  def apply(): RollupCommonJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupCommonJSOptions]
  }
  @scala.inline
  implicit class RollupCommonJSOptionsOps[Self <: RollupCommonJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String | (js.Function1[/* id */ String, Boolean])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreGlobal")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedExports(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
  }
  
}

