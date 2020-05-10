package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveRequest extends js.Object {
  var apiVersion: js.UndefOr[String] = js.native
  var packageNames: js.UndefOr[js.Array[String]] = js.native
  var singlePackage: js.UndefOr[Boolean] = js.native
  var specificFiles: js.UndefOr[js.Array[String]] = js.native
  var unpackaged: js.UndefOr[Package] = js.native
}

object RetrieveRequest {
  @scala.inline
  def apply(): RetrieveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRequest]
  }
  @scala.inline
  implicit class RetrieveRequestOps[Self <: RetrieveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSinglePackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singlePackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinglePackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singlePackage")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecificFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecificFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpackaged(value: Package): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpackaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpackaged")(js.undefined)
        ret
    }
  }
  
}

