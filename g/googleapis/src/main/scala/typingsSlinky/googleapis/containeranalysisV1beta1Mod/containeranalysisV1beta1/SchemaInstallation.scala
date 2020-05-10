package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents how a particular software package may be installed on a
  * system.
  */
@js.native
trait SchemaInstallation extends js.Object {
  /**
    * Required. All of the places within the filesystem versions of this
    * package have been found.
    */
  var location: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * Output only. The name of the installed package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaInstallation {
  @scala.inline
  def apply(): SchemaInstallation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallation]
  }
  @scala.inline
  implicit class SchemaInstallationOps[Self <: SchemaInstallation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: js.Array[SchemaLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

