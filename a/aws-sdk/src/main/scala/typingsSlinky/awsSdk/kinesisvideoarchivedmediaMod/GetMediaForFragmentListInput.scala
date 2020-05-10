package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaForFragmentListInput extends js.Object {
  /**
    * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
    */
  var Fragments: FragmentNumberList = js.native
  /**
    * The name of the stream from which to retrieve fragment media.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.StreamName = js.native
}

object GetMediaForFragmentListInput {
  @scala.inline
  def apply(Fragments: FragmentNumberList, StreamName: StreamName): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
  @scala.inline
  implicit class GetMediaForFragmentListInputOps[Self <: GetMediaForFragmentListInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragments(value: FragmentNumberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

