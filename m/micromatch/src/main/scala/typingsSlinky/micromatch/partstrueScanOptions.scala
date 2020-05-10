package typingsSlinky.micromatch

import typingsSlinky.micromatch.micromatchBooleans.`true`
import typingsSlinky.micromatch.mod.Item
import typingsSlinky.micromatch.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  parts  :true} & micromatch.micromatch.ScanOptions */
@js.native
trait partstrueScanOptions extends js.Object {
  /**
    * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
    *
    * @default false
    *
    * @example
    * ```js
    * mm(['a/b.js', 'a/c.md'], '*.js');
    * //=> []
    *
    * mm(['a/b.js', 'a/c.md'], '*.js', {matchBase: true});
    * //=> ['a/b.js']
    * ```
    */
  var basename: js.UndefOr[Boolean] = js.native
  /**
    * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
    * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
    * Instead, the star is treated the same as an other star.
    *
    * @default true
    *
    * @example
    * ```js
    * var files = ['abc', 'ajz'];
    * console.log(mm(files, '[a-c]*'));
    * //=> ['abc', 'ajz']
    *
    * console.log(mm(files, '[a-c]*', {bash: false}));
    * ```
    */
  var bash: js.UndefOr[Boolean] = js.native
  /**
    * Return regex matches in supporting methods.
    *
    * @default undefined
    */
  var capture: js.UndefOr[Boolean] = js.native
  /**
    * Allows glob to match any part of the given string(s).
    *
    * @default undefined
    */
  var contains: js.UndefOr[Boolean] = js.native
  /**
    * Current working directory. Used by `picomatch.split()`
    *
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Debug regular expressions when an error is thrown.
    *
    * @default undefined
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
    *
    * @default false
    */
  var dot: js.UndefOr[Boolean] = js.native
  /**
    * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
    * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
    * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
    *
    * @default undefined
    */
  var expandRange: js.UndefOr[
    js.Function3[/* left */ String, /* right */ String, /* options */ Options, String]
  ] = js.native
  /**
    * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
    *
    * @default false
    */
  var failglob: js.UndefOr[Boolean] = js.native
  /**
    * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
    *
    * @default true
    */
  var fastpaths: js.UndefOr[Boolean] = js.native
  /**
    * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
    *
    * @default undefined
    */
  var flags: js.UndefOr[Boolean] = js.native
  /**
    * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
    *
    * @default undefined
    */
  var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.native
  /**
    * One or more glob patterns for excluding strings that should not be matched from the result.
    *
    * @default undefined
    */
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
    *
    * @default false
    */
  var keepQuotes: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
    *
    * @default undefined
    */
  var literalBrackets: js.UndefOr[Boolean] = js.native
  /**
    * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
    *
    * @default true
    */
  var lookbehinds: js.UndefOr[Boolean] = js.native
  /**
    * Alias for `basename`.
    *
    * @default false
    */
  var matchBase: js.UndefOr[Boolean] = js.native
  /**
    * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
    *
    * @default 65536
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
    *
    * @default false
    */
  var nobrace: js.UndefOr[Boolean] = js.native
  /**
    * Disable matching with regex brackets.
    *
    * @default undefined
    */
  var nobracket: js.UndefOr[Boolean] = js.native
  /**
    * Perform case-insensitive matching. Equivalent to the regex `i` flag.
    * Note that this option is ignored when the `flags` option is defined.
    *
    * @default false
    */
  var nocase: js.UndefOr[Boolean] = js.native
  /**
    * Alias for `noextglob`
    *
    * @default false
    */
  var noext: js.UndefOr[Boolean] = js.native
  /**
    * Disable support for matching with extglobs (like `+(a|b)`)
    *
    * @default false
    */
  var noextglob: js.UndefOr[Boolean] = js.native
  /**
    * Disable matching with globstars (`**`).
    *
    * @default undefined
    */
  var noglobstar: js.UndefOr[Boolean] = js.native
  /**
    * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
    *
    * @default undefined
    */
  var nonegate: js.UndefOr[Boolean] = js.native
  /**
    * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
    *
    * @default false
    */
  var noquantifiers: js.UndefOr[Boolean] = js.native
  /**
    * Function to be called on ignored items.
    *
    * @default undefined
    */
  var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
  /**
    * Function to be called on matched items.
    *
    * @default undefined
    */
  var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
  /**
    * Function to be called on all items, regardless of whether or not they are matched or ignored.
    *
    * @default undefined
    */
  var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
  /**
    * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
    * This is automatically enabled when `options.tokens` is `true`.
    *
    * @default false
    */
  var parts: js.UndefOr[`true` with Boolean] = js.native
  /**
    * Support POSIX character classes ("posix brackets").
    *
    * @default false
    */
  var posix: js.UndefOr[Boolean] = js.native
  /**
    * String to prepend to the generated regex used for matching.
    *
    * @default undefined
    */
  var prepend: js.UndefOr[Boolean] = js.native
  /**
    * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
    *
    * @default false
    */
  var regex: js.UndefOr[Boolean] = js.native
  /**
    * Throw an error if brackets, braces, or parens are imbalanced.
    *
    * @default undefined
    */
  var strictBrackets: js.UndefOr[Boolean] = js.native
  /**
    * When true, picomatch won't match trailing slashes with single stars.
    *
    * @default undefined
    */
  var strictSlashes: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
    *
    * @default false
    */
  var tokens: js.UndefOr[Boolean] = js.native
  /**
    * Remove backslashes from returned matches.
    *
    * @default undefined
    *
    * @example
    * In this example we want to match a literal `*`:
    *
    * ```js
    * mm.match(['abc', 'a\\*c'], 'a\\*c');
    * //=> ['a\\*c']
    *
    * mm.match(['abc', 'a\\*c'], 'a\\*c', {unescape: true});
    * //=> ['a*c']
    * ```
    */
  var unescape: js.UndefOr[Boolean] = js.native
  /**
    * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
    *
    * @default undefined
    */
  var windows: js.UndefOr[Boolean] = js.native
}

object partstrueScanOptions {
  @scala.inline
  def apply(): partstrueScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[partstrueScanOptions]
  }
  @scala.inline
  implicit class partstrueScanOptionsOps[Self <: partstrueScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.undefined)
        ret
    }
    @scala.inline
    def withBash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bash")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpandRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFailglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failglob")(js.undefined)
        ret
    }
    @scala.inline
    def withFastpaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastpaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastpaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastpaths")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: /* returnedString */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
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
    def withKeepQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteralBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteralBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withLookbehinds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbehinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbehinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbehinds")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNobrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(js.undefined)
        ret
    }
    @scala.inline
    def withNobracket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobracket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobracket")(js.undefined)
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(js.undefined)
        ret
    }
    @scala.inline
    def withNoext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(js.undefined)
        ret
    }
    @scala.inline
    def withNoextglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noextglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoextglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noextglob")(js.undefined)
        ret
    }
    @scala.inline
    def withNoglobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoglobstar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(js.undefined)
        ret
    }
    @scala.inline
    def withNonegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoquantifiers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noquantifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoquantifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noquantifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIgnore(value: /* item */ Item => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMatch(value: /* item */ Item => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResult(value: /* item */ Item => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: `true` with Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withPosix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSlashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSlashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSlashes")(js.undefined)
        ret
    }
    @scala.inline
    def withTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(js.undefined)
        ret
    }
    @scala.inline
    def withWindows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(js.undefined)
        ret
    }
  }
  
}

