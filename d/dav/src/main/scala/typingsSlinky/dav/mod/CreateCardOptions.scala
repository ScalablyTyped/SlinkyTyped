package typingsSlinky.dav.mod

import typingsSlinky.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCardOptions extends js.Object {
  /**
    * VCARD object.
    */
  var data: String = js.native
  /**
    * name for the vcard vcf file.
    */
  var filename: String = js.native
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}

object CreateCardOptions {
  @scala.inline
  def apply(data: String, filename: String): CreateCardOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardOptions]
  }
  @scala.inline
  implicit class CreateCardOptionsOps[Self <: CreateCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandbox(value: Sandbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

