package typingsSlinky.jsSha3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher extends js.Object {
  /**
    * Return hash in integer array.
    */
  def array(): js.Array[Double] = js.native
  /**
    * Return hash in ArrayBuffer.
    */
  def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
  /**
    * Return hash in integer array.
    */
  def digest(): js.Array[Double] = js.native
  /**
    * Return hash in hex string.
    */
  def hex(): String = js.native
  /**
    * Update hash
    *
    * @param message The message you want to hash.
    */
  def update(message: Message): Hasher = js.native
}

object Hasher {
  @scala.inline
  def apply(
    array: () => js.Array[Double],
    arrayBuffer: () => js.typedarray.ArrayBuffer,
    digest: () => js.Array[Double],
    hex: () => String,
    update: Message => Hasher
  ): Hasher = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Hasher]
  }
  @scala.inline
  implicit class HasherOps[Self <: Hasher] (val x: Self) extends AnyVal {
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
    def withUpdate(value: Message => Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

