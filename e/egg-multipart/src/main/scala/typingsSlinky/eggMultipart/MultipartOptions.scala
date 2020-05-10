package typingsSlinky.eggMultipart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartOptions extends js.Object {
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ String, 
      /* file */ js.Any, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit | js.Error
    ]
  ] = js.native
   // required file submit, default is true
  var defCharset: js.UndefOr[String] = js.native
  var limits: js.UndefOr[AnonFieldNameSize] = js.native
  var requireFile: js.UndefOr[Boolean] = js.native
}

object MultipartOptions {
  @scala.inline
  def apply(): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartOptions]
  }
  @scala.inline
  implicit class MultipartOptionsOps[Self <: MultipartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckFile(
      value: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | js.Error
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFile")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCheckFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDefCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defCharset")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: AnonFieldNameSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireFile")(js.undefined)
        ret
    }
  }
  
}

