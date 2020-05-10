package typingsSlinky.gulpTslint.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TslintFile extends js.Object {
  var contents: Buffer | js.Any = js.native
  var path: String = js.native
  var relative: String = js.native
  var tslint: js.Any = js.native
  def isNull(): Boolean = js.native
  def isStream(): Boolean = js.native
}

object TslintFile {
  @scala.inline
  def apply(
    contents: Buffer | js.Any,
    isNull: () => Boolean,
    isStream: () => Boolean,
    path: String,
    relative: String,
    tslint: js.Any
  ): TslintFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = js.Any.fromFunction0(isNull), isStream = js.Any.fromFunction0(isStream), path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TslintFile]
  }
  @scala.inline
  implicit class TslintFileOps[Self <: TslintFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: Buffer | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStream(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

