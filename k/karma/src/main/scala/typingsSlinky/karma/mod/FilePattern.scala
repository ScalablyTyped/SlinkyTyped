package typingsSlinky.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePattern extends js.Object {
  /**
    * @default true
    * @description Should the files be included in the browser using <script> tag? Use false if you want to
    * load them manually, eg. using Require.js.
    */
  var included: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    * @description Should the files be served from disk on each request by Karma's webserver?
    */
  var nocache: js.UndefOr[Boolean] = js.native
  /**
    * The pattern to use for matching.
    */
  var pattern: String = js.native
  /**
    * @default true
    * @description Should the files be served by Karma's webserver?
    */
  var served: js.UndefOr[Boolean] = js.native
  /**
    * Choose the type to use when including a file
    * @default 'js'
    * @description  The type determines the mechanism for including the file.
    * The css and html types create link elements; the js, dart, and module elements create script elements.
    * The dom type includes the file content in the page, used, for example, to test components combining HTML and JS.
    */
  var `type`: js.UndefOr[FilePatternTypes] = js.native
  /**
    * @default true
    * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
    * for changes.
    */
  var watched: js.UndefOr[Boolean] = js.native
}

object FilePattern {
  @scala.inline
  def apply(pattern: String): FilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePattern]
  }
  @scala.inline
  implicit class FilePatternOps[Self <: FilePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(js.undefined)
        ret
    }
    @scala.inline
    def withNocache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocache")(js.undefined)
        ret
    }
    @scala.inline
    def withServed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("served")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("served")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: FilePatternTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watched")(js.undefined)
        ret
    }
  }
  
}

