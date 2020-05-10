package typingsSlinky.jsMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Md5_ extends js.Object {
  def array(): js.Array[Double] = js.native
  def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
  def base64(): String = js.native
  def buffer(): js.typedarray.ArrayBuffer = js.native
  def digest(): js.Array[Double] = js.native
  def hex(): String = js.native
  def update(message: message): Md5_ = js.native
}

object Md5_ {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => js.typedarray.ArrayBuffer,
    base64: () => String,
    buffer: () => js.typedarray.ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: message => Md5_
  ): Md5_ = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), base64 = js.Any.fromFunction0(base64), buffer = js.Any.fromFunction0(buffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Md5_]
  }
  @scala.inline
  implicit class Md5_Ops[Self <: Md5_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBase64(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBuffer(value: () => js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDigest(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: message => Md5_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

