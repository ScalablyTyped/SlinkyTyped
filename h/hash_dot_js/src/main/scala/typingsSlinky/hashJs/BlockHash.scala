package typingsSlinky.hashJs

import typingsSlinky.hashJs.hashJsStrings.big
import typingsSlinky.hashJs.hashJsStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockHash[T] extends js.Object {
  var endian: big | little = js.native
  var hmacStrength: Double = js.native
  var padLength: Double = js.native
}

object BlockHash {
  @scala.inline
  def apply[T](endian: big | little, hmacStrength: Double, padLength: Double): BlockHash[T] = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], hmacStrength = hmacStrength.asInstanceOf[js.Any], padLength = padLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockHash[T]]
  }
  @scala.inline
  implicit class BlockHashOps[Self[t] <: BlockHash[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEndian(value: big | little): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHmacStrength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmacStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

