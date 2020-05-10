package typingsSlinky.parseGlob.mod

import typingsSlinky.parseGlob.AnonBasename
import typingsSlinky.parseGlob.AnonBraces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /**
    * The non-glob part of the string, if any.
    */
  var base: String = js.native
  /**
    * The glob pattern part of the string, if any.
    */
  var glob: String = js.native
  /**
    * An object with boolean information about the glob.
    */
  var is: AnonBraces = js.native
  /**
    * A copy of the original, unmodified glob pattern.
    */
  var orig: String = js.native
  /**
    * File path segments.
    */
  var path: AnonBasename = js.native
}

object Result {
  @scala.inline
  def apply(base: String, glob: String, is: AnonBraces, orig: String, path: AnonBasename): Result = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], orig = orig.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: AnonBraces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: AnonBasename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

