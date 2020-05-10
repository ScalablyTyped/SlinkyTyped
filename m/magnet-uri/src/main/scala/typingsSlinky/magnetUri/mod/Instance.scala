package typingsSlinky.magnetUri.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends Object {
  var announce: js.UndefOr[js.Array[String]] = js.native
  var as: js.UndefOr[String | js.Array[String]] = js.native
  var dn: js.UndefOr[String | js.Array[String]] = js.native
  var infoHash: js.UndefOr[String] = js.native
  var infoHashBuffer: js.UndefOr[Buffer] = js.native
  var ix: js.UndefOr[Double | js.Array[Double]] = js.native
  var keywords: js.UndefOr[String | js.Array[String]] = js.native
  var kt: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String | js.Array[String]] = js.native
  var tr: js.UndefOr[String | js.Array[String]] = js.native
  var urlList: js.UndefOr[js.Array[String]] = js.native
  var ws: js.UndefOr[String | js.Array[String]] = js.native
  var xs: js.UndefOr[String | js.Array[String]] = js.native
  var xt: js.UndefOr[String | js.Array[String]] = js.native
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnounce(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withDn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dn")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHash")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoHashBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHashBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoHashBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoHashBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withIx(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ix")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withKt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | js.Array[String]): Self = {
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
    @scala.inline
    def withTr(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlList")(js.undefined)
        ret
    }
    @scala.inline
    def withWs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
    @scala.inline
    def withXt(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xt")(js.undefined)
        ret
    }
  }
  
}

