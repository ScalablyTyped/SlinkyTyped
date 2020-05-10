package typingsSlinky.nodeForge.mod.pem

import typingsSlinky.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPEM extends js.Object {
  var body: Bytes = js.native
  var contentDomain: js.UndefOr[js.Any] = js.native
  var dekInfo: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Array[_]] = js.native
  var procType: js.UndefOr[js.Any] = js.native
  var `type`: String = js.native
}

object ObjectPEM {
  @scala.inline
  def apply(body: Bytes, `type`: String): ObjectPEM = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPEM]
  }
  @scala.inline
  implicit class ObjectPEMOps[Self <: ObjectPEM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Bytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDomain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withDekInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dekInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDekInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dekInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withProcType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procType")(js.undefined)
        ret
    }
  }
  
}

