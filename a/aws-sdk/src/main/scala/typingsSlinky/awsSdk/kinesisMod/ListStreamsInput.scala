package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsInput extends js.Object {
  /**
    * The name of the stream to start the list with.
    */
  var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.native
  /**
    * The maximum number of streams to list.
    */
  var Limit: js.UndefOr[ListStreamsInputLimit] = js.native
}

object ListStreamsInput {
  @scala.inline
  def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  @scala.inline
  implicit class ListStreamsInputOps[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusiveStartStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: ListStreamsInputLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
  }
  
}

