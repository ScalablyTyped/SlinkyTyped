package typingsSlinky.node.cryptoMod

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaPrivateKey extends js.Object {
  var key: KeyLike = js.native
  /**
    * @default 'sha1'
    */
  var oaepHash: js.UndefOr[String] = js.native
  var oaepLabel: js.UndefOr[TypedArray] = js.native
  var padding: js.UndefOr[Double] = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object RsaPrivateKey {
  @scala.inline
  def apply(key: KeyLike): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
  @scala.inline
  implicit class RsaPrivateKeyOps[Self <: RsaPrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: KeyLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOaepHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepHash")(js.undefined)
        ret
    }
    @scala.inline
    def withOaepLabelUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabel(value: TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOaepLabelInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOaepLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oaepLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
  }
  
}

