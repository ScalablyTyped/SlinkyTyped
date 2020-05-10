package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseHeaderType extends js.Object {
  var `cache-control`: js.UndefOr[String] = js.native
  var `content-disposition`: js.UndefOr[String] = js.native
  var `content-type`: js.UndefOr[String] = js.native
}

object ResponseHeaderType {
  @scala.inline
  def apply(): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeaderType]
  }
  @scala.inline
  implicit class ResponseHeaderTypeOps[Self <: ResponseHeaderType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCache-control`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCache-control`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache-control")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-disposition`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-disposition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-disposition")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-type`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content-type")(js.undefined)
        ret
    }
  }
  
}

