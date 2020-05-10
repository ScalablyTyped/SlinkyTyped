package typingsSlinky.awsSdkClientCodecommitNode.typesLocationMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AFTER
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BEFORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * <p>The name of the file being compared, including its extension and subdirectory, if any.</p>
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * <p>The position of a change within a compared file, in line number format.</p>
    */
  var filePosition: js.UndefOr[Double] = js.native
  /**
    * <p>In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.</p>
    */
  var relativeFileVersion: js.UndefOr[BEFORE | AFTER | String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeFileVersion(value: BEFORE | AFTER | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeFileVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeFileVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeFileVersion")(js.undefined)
        ret
    }
  }
  
}

