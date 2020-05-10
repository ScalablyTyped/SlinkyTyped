package typingsSlinky.electronPackager.mod

import typingsSlinky.electronPackager.electronPackagerStrings.asInvoker
import typingsSlinky.electronPackager.electronPackagerStrings.highestAvailable
import typingsSlinky.electronPackager.electronPackagerStrings.requireAdministrator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object (also known as a "hash") of application metadata to embed into the executable
  */
@js.native
trait Win32Metadata extends js.Object {
  var CompanyName: js.UndefOr[String] = js.native
  var FileDescription: js.UndefOr[String] = js.native
  var InternalName: js.UndefOr[String] = js.native
  var OriginalFilename: js.UndefOr[String] = js.native
  var ProductName: js.UndefOr[String] = js.native
  var `application-manifest`: js.UndefOr[String] = js.native
  var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.native
}

object Win32Metadata {
  @scala.inline
  def apply(): Win32Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32Metadata]
  }
  @scala.inline
  implicit class Win32MetadataOps[Self <: Win32Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalName")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductName")(js.undefined)
        ret
    }
    @scala.inline
    def `withApplication-manifest`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutApplication-manifest`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-manifest")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequested-execution-level`(value: asInvoker | highestAvailable | requireAdministrator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-execution-level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequested-execution-level`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-execution-level")(js.undefined)
        ret
    }
  }
  
}

