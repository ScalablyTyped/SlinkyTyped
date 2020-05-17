package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECBlocks extends js.Object {
  val ECCodewordsPerBlock: Double = js.native
  val NumBlocks: Double = js.native
  val TotalECCodewords: Double = js.native
  var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
  var ecCodewordsPerBlock: Double = js.native
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
}

object ECBlocks {
  @scala.inline
  def apply(
    ECCodewordsPerBlock: Double,
    NumBlocks: Double,
    TotalECCodewords: Double,
    ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]),
    ecCodewordsPerBlock: Double,
    getECBlocks: () => js.Array[ECB] | (js.Tuple2[ECB, ECB])
  ): ECBlocks = {
    val __obj = js.Dynamic.literal(ECCodewordsPerBlock = ECCodewordsPerBlock.asInstanceOf[js.Any], NumBlocks = NumBlocks.asInstanceOf[js.Any], TotalECCodewords = TotalECCodewords.asInstanceOf[js.Any], ecBlocks = ecBlocks.asInstanceOf[js.Any], ecCodewordsPerBlock = ecCodewordsPerBlock.asInstanceOf[js.Any], getECBlocks = js.Any.fromFunction0(getECBlocks))
    __obj.asInstanceOf[ECBlocks]
  }
  @scala.inline
  implicit class ECBlocksOps[Self <: ECBlocks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withECCodewordsPerBlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ECCodewordsPerBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumBlocks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalECCodewords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalECCodewords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcBlocks(value: js.Array[ECB] | (js.Tuple2[ECB, ECB])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetECBlocks(value: () => js.Array[ECB] | (js.Tuple2[ECB, ECB])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getECBlocks")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

