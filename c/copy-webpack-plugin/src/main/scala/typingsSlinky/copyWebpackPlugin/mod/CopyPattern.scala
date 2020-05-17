package typingsSlinky.copyWebpackPlugin.mod

import typingsSlinky.copyWebpackPlugin.anon.Key
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.file
import typingsSlinky.copyWebpackPlugin.copyWebpackPluginStrings.template
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPattern extends js.Object {
  /** 
  	 * Enable transform caching.  (default: `false`)
  	 * 
  	 * You can use `{ key: 'my-cache-key' }` to invalidate the cache.  
  	 * */
  var cache: js.UndefOr[Boolean | Key] = js.native
  /** A path that determines how to interpret the `from` path. 
  	 * 
  	 * (default: `options.context | compiler.options.context`) 
  	 * */
  var context: js.UndefOr[String] = js.native
  /**
  	 * Removes all directory references and only copies file names. (default: `false`)
  	 *
  	 * If files have the same name, the result is non-deterministic. 
  	 */
  var flatten: js.UndefOr[Boolean] = js.native
  /** Overwrites files already in `compilation.assets` (usually added by other plugins; default: `false`) */
  var force: js.UndefOr[Boolean] = js.native
  /** File source path or glob */
  var from: String | MiniMatchGlob = js.native
  /** Additional globs to ignore for this pattern. (default: `[]`) */
  var ignore: js.UndefOr[js.Array[String | MiniMatchGlob]] = js.native
  /** 
  	 * Pattern for extracting elements to be used in `to` templates. 
  	 * 
  	 * Defines a `RegExp` to match some parts of the file path. These capture groups can be reused in the name property using [N] 
  	 * placeholder. Note that [0] will be replaced by the entire path of the file, whereas [1] will contain the first capturing 
  	 * parenthesis of your RegExp and so on...
  	 * 
  	 * */
  var test: js.UndefOr[js.RegExp] = js.native
  /**
  	 * Path or webpack file-loader patterns. defaults:
  	 * output root if `from` is file or dir.
  	 * resolved glob path if `from` is glob.
  	 */
  var to: js.UndefOr[String] = js.native
  /**
  	 * How to interpret `to`. default: undefined
  	 * 
  	 * `file` - if 'to' has extension or 'from' is file.
  	 * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
  	 * `template` - if 'to' contains a template pattern.
  	 */
  var toType: js.UndefOr[file | dir | template] = js.native
  /** Function that modifies file contents before writing to webpack. (default: `(content, path) => content`) */
  var transform: js.UndefOr[
    js.Function2[
      /* content */ Buffer, 
      /* path */ String, 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.native
  /** 
  	 * Allows to modify the writing path.
  	 * 
  	 *  Returns the new path or a promise that resolves into the new path
  	 */
  var transformPath: js.UndefOr[
    js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
  ] = js.native
}

object CopyPattern {
  @scala.inline
  def apply(from: String | MiniMatchGlob): CopyPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPattern]
  }
  @scala.inline
  implicit class CopyPatternOps[Self <: CopyPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String | MiniMatchGlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Boolean | Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFlatten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String | MiniMatchGlob]): Self = {
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
    def withTest(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withToType(value: file | dir | template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toType")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* content */ Buffer, /* path */ String) => String | Buffer | (js.Promise[String | Buffer])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPath(value: (/* targetPath */ String, /* absolutePath */ String) => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPath")(js.undefined)
        ret
    }
  }
  
}

