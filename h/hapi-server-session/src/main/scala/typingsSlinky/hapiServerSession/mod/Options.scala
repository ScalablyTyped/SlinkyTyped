package typingsSlinky.hapiServerSession.mod

import typingsSlinky.hapiHapi.mod.CachePolicyOptions
import typingsSlinky.hapiHapi.mod.ServerStateCookieOptions
import typingsSlinky.node.cryptoMod.BinaryLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var cache: js.UndefOr[CachePolicyOptions[_]] = js.native
  var cookie: js.UndefOr[ServerStateCookieOptions] = js.native
  var expiresIn: js.UndefOr[Double] = js.native
  var key: js.UndefOr[BinaryLike] = js.native
  var name: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setCache(value: CachePolicyOptions[_]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCookie(value: ServerStateCookieOptions): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setKey(value: BinaryLike): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUint16Array(value: js.typedarray.Uint16Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUint32Array(value: js.typedarray.Uint32Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyInt16Array(value: js.typedarray.Int16Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyInt8Array(value: js.typedarray.Int8Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyInt32Array(value: js.typedarray.Int32Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyFloat32Array(value: js.typedarray.Float32Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyDataView(value: js.typedarray.DataView): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyFloat64Array(value: js.typedarray.Float64Array): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVhostVarargs(value: String*): Self = this.set("vhost", js.Array(value :_*))
    @scala.inline
    def setVhost(value: String | js.Array[String]): Self = this.set("vhost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
  
}

