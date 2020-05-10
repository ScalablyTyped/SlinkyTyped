package typingsSlinky.rollupPluginNodeResolve.mod

import typingsSlinky.resolve.mod.AsyncOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  	 * some package.json files have a "browser" field which specifies
  	 * alternative files to load for people bundling for the browser. If
  	 * that's you, either use this option or add "browser" to the
  	 * "mainfields" option, otherwise pkg.browser will be ignored
  	 * @default false
  	 */
  var browser: js.UndefOr[Boolean] = js.native
  /**
  	 * Any additional options that should be passed through
  	 * to node-resolve
  	 */
  var customResolveOptions: js.UndefOr[AsyncOpts] = js.native
  /**
  	 * Force resolving for these modules to root's node_modules that helps
  	 * to prevent bundling the same package multiple times if package is
  	 * imported from dependencies.
  	 */
  var dedupe: js.UndefOr[js.Array[String] | (js.Function1[/* importee */ String, Boolean])] = js.native
  /**
  	 * not all files you want to resolve are .js files
  	 * @default [ '.mjs', '.js', '.json', '.node' ]
  	 */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * Lock the module search in this path (like a chroot). Module defined
  	 * outside this path will be marked as external
  	 * @default '/'
  	 */
  var jail: js.UndefOr[String] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "jsnext:main" if possible
  	 * legacy field pointing to ES6 module in third-party libraries,
  	 * deprecated in favor of "pkg.module":
  	 * - see: https://github.com/rollup/rollup/wiki/pkg.module
  	 * @default false
  	 */
  var jsnext: js.UndefOr[Boolean] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "main" field or index.js, even if it's not an ES6 module
  	 * (needs to be converted from CommonJS to ES6)
  	 * – see https://github.com/rollup/rollup-plugin-commonjs
  	 * @default true
  	 */
  var main: js.UndefOr[Boolean] = js.native
  /**
  	 * the fields to scan in a package.json to determine the entry point
  	 * if this list contains "browser", overrides specified in "pkg.browser"
  	 * will be used
  	 * @default ['module', 'main']
  	 */
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * @deprecated use "mainFields" instead
  	 * use "module" field for ES6 module if possible
  	 * @default true
  	 */
  var module: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, inspect resolved files to check that they are
  	 * ES2015 modules
  	 * @default false
  	 */
  var modulesOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Set to an array of strings and/or regexps to lock the module search
  	 * to modules that match at least one entry. Modules not matching any
  	 * entry will be marked as external
  	 * @default null
  	 */
  var only: js.UndefOr[(js.Array[String | js.RegExp]) | Null] = js.native
  /**
  	 * whether to prefer built-in modules (e.g. `fs`, `path`) or
  	 * local ones with the same names
  	 * @default true
  	 */
  var preferBuiltins: js.UndefOr[Boolean] = js.native
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
    def withBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomResolveOptions(value: AsyncOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResolveOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomResolveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResolveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDedupeFunction1(value: /* importee */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDedupe(value: js.Array[String] | (js.Function1[/* importee */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedupe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
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
    def withJail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jail")(js.undefined)
        ret
    }
    @scala.inline
    def withJsnext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsnext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsnext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsnext")(js.undefined)
        ret
    }
    @scala.inline
    def withMain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withModulesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withOnly(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(null)
        ret
    }
    @scala.inline
    def withPreferBuiltins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferBuiltins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferBuiltins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferBuiltins")(js.undefined)
        ret
    }
  }
  
}

