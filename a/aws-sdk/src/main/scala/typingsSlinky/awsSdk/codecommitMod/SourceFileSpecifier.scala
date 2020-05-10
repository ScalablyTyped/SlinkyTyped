package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFileSpecifier extends js.Object {
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path = js.native
  /**
    * Whether to remove the source file from the parent commit.
    */
  var isMove: js.UndefOr[IsMove] = js.native
}

object SourceFileSpecifier {
  @scala.inline
  def apply(filePath: Path): SourceFileSpecifier = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileSpecifier]
  }
  @scala.inline
  implicit class SourceFileSpecifierOps[Self <: SourceFileSpecifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMove(value: IsMove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMove")(js.undefined)
        ret
    }
  }
  
}

