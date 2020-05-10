package typingsSlinky.msgpackLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodecOptions extends js.Object {
  /**
    * It ties msgpack's bin format with ArrayBuffer object, instead of Buffer object.
    * @default false
    */
  var binarraybuffer: js.UndefOr[Boolean] = js.native
  /**
    * It decodes msgpack's int64/uint64 formats with int64-buffer object.
    * int64-buffer is a cutom integer type with 64 bits of precision instead
    * of the built-in IEEE-754 53 bits. See https://github.com/kawanet/int64-buffer
    * @default false
    */
  var int64: js.UndefOr[Boolean] = js.native
  /**
    * It includes the preset extensions for JavaScript native objects.
    * @see https://github.com/kawanet/msgpack-lite#extension-types
    * @default false
    */
  var preset: js.UndefOr[Boolean] = js.native
  /**
    * It runs a validation of the value before writing it into buffer.
    * This is the default behavior for some old browsers which do not support ArrayBuffer object.
    * @default varies
    */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * It returns Uint8Array object when encoding, instead of Buffer object.
    * @default false
    */
  var uint8array: js.UndefOr[Boolean] = js.native
  /**
    * It uses the global JavaScript Map type, if available, to unpack MessagePack map elements.
    * @default false
    */
  var usemap: js.UndefOr[Boolean] = js.native
  /**
    * It uses raw formats instead of bin and str.
    * Set true for compatibility with msgpack's old spec.
    * @see https://github.com/kawanet/msgpack-lite#compatibility-mode
    * @default false
    */
  var useraw: js.UndefOr[Boolean] = js.native
}

object CodecOptions {
  @scala.inline
  def apply(): CodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodecOptions]
  }
  @scala.inline
  implicit class CodecOptionsOps[Self <: CodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinarraybuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarraybuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinarraybuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarraybuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
    @scala.inline
    def withUint8array(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint8array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUint8array: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint8array")(js.undefined)
        ret
    }
    @scala.inline
    def withUsemap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemap")(js.undefined)
        ret
    }
    @scala.inline
    def withUseraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useraw")(js.undefined)
        ret
    }
  }
  
}

