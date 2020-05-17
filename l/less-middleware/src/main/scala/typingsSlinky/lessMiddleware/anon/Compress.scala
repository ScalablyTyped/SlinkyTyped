package typingsSlinky.lessMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compress extends js.Object {
  var compress: js.UndefOr[String] = js.native
  var paths: js.UndefOr[js.Array[String]] = js.native
  var yuicompress: js.UndefOr[Boolean] = js.native
}

object Compress {
  @scala.inline
  def apply(): Compress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compress]
  }
  @scala.inline
  implicit class CompressOps[Self <: Compress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withYuicompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yuicompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYuicompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yuicompress")(js.undefined)
        ret
    }
  }
  
}

