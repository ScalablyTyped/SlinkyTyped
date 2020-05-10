package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSoftwarePlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMFilesVersion extends js.Object {
  var Build: Double = js.native
  val Display: String = js.native
  var Major: Double = js.native
  var Minor: Double = js.native
  var Patch: Double = js.native
  var SoftwarePlatform: MFSoftwarePlatformType = js.native
  def Clone(): IMFilesVersion = js.native
  def CompareTo(RightSide: IMFilesVersion): Double = js.native
}

object IMFilesVersion {
  @scala.inline
  def apply(
    Build: Double,
    Clone: () => IMFilesVersion,
    CompareTo: IMFilesVersion => Double,
    Display: String,
    Major: Double,
    Minor: Double,
    Patch: Double,
    SoftwarePlatform: MFSoftwarePlatformType
  ): IMFilesVersion = {
    val __obj = js.Dynamic.literal(Build = Build.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CompareTo = js.Any.fromFunction1(CompareTo), Display = Display.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Patch = Patch.asInstanceOf[js.Any], SoftwarePlatform = SoftwarePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMFilesVersion]
  }
  @scala.inline
  implicit class IMFilesVersionOps[Self <: IMFilesVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IMFilesVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompareTo(value: IMFilesVersion => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompareTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftwarePlatform(value: MFSoftwarePlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwarePlatform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

