package typingsSlinky.globrex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  /**
    * JavaScript RegExp instance build for testing against paths.
    * The regex have different path separators depending on host OS.
    */
  var regex: js.RegExp = js.native
  /**
    * Array of RegExp instances separated by /.
    * This can be usable when working with file paths or urls.
    * ```js
    * [ /^foo$/, /^bar$/, /^([^\/]*)$/, '^baz\\.(md|js|txt)$' ]
    * ```
    */
  var segments: js.Array[js.RegExp] = js.native
  /**
    * String representation of the RegExp
    */
  var string: String = js.native
}

object Path {
  @scala.inline
  def apply(regex: js.RegExp, segments: js.Array[js.RegExp], string: String): Path = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

