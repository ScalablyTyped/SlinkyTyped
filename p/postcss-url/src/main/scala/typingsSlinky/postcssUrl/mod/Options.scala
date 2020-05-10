package typingsSlinky.postcssUrl.mod

import typingsSlinky.postcssUrl.AnonAbsolutePath
import typingsSlinky.postcssUrl.AnonAppend
import typingsSlinky.postcssUrl.AnonFile
import typingsSlinky.postcssUrl.postcssUrlStrings.`inline`
import typingsSlinky.postcssUrl.postcssUrlStrings.copy
import typingsSlinky.postcssUrl.postcssUrlStrings.rebase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The assets files will be copied in that destination.
    *
    * @default false
    */
  var assetsPath: js.UndefOr[Boolean | String] = js.native
  /**
    * Specify the base path or list of base paths where to search images from.
    */
  var basePath: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The fallback method to use if the maximum size is exceeded or the URL contains a hash.
    */
  var fallback: js.UndefOr[CustomTransformFunction] = js.native
  /**
    * Determine wether a file should be inlined.
    */
  var filter: js.UndefOr[js.RegExp | CustomFilterFunction | String] = js.native
  /**
    * Hash options
    */
  var hashOptions: js.UndefOr[AnonAppend] = js.native
  /**
    * Do not warn when an SVG URL with a fragment is inlined.
    * PostCSS-URL does not support partial inlining.
    * The entire SVG file will be inlined.
    * By default a warning will be issued when this occurs.
    *
    * @default false
    */
  var ignoreFragmentWarning: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the URL's fragment identifer value, if present, will be added to the inlined data URI.
    *
    * @default false
    */
  var includeUriFragment: js.UndefOr[Boolean] = js.native
  /**
    * Specify the maximum file size to inline (in kilobytes).
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * Reduce size of inlined svg (IE9+, Android 3+)
    *
    * @default false
    */
  var optimizeSvgEncode: js.UndefOr[Boolean] = js.native
  /**
    * URL rewriting mechanism.
    *
    * @default 'rebase'
    */
  var url: js.UndefOr[copy | `inline` | rebase | CustomTransformFunction] = js.native
  /**
    * Rename the path of the files by a hash name.
    *
    * @default false
    */
  var useHash: js.UndefOr[Boolean] = js.native
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
    def withAssetsPath(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBasePath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: (/* asset */ AnonAbsolutePath, /* dir */ AnonFile) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* file */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.RegExp | CustomFilterFunction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withHashOptions(value: AnonAppend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFragmentWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFragmentWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFragmentWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFragmentWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUriFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUriFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUriFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUriFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeSvgEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeSvgEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeSvgEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeSvgEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction2(value: (/* asset */ AnonAbsolutePath, /* dir */ AnonFile) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUrl(value: copy | `inline` | rebase | CustomTransformFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHash")(js.undefined)
        ret
    }
  }
  
}

