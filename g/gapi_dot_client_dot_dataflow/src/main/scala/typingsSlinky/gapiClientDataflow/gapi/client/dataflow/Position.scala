package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  /** Position is a byte offset. */
  var byteOffset: js.UndefOr[String] = js.native
  /** CloudPosition is a concat position. */
  var concatPosition: js.UndefOr[ConcatPosition] = js.native
  /**
    * Position is past all other positions. Also useful for the end
    * position of an unbounded range.
    */
  var end: js.UndefOr[Boolean] = js.native
  /** Position is a string key, ordered lexicographically. */
  var key: js.UndefOr[String] = js.native
  /** Position is a record index. */
  var recordIndex: js.UndefOr[String] = js.native
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[String] = js.native
}

object Position {
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withConcatPosition(value: ConcatPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcatPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShufflePosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shufflePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShufflePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shufflePosition")(js.undefined)
        ret
    }
  }
  
}

