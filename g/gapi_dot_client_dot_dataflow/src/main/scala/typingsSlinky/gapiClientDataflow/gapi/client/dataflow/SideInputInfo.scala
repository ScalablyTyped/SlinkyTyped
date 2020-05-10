package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideInputInfo extends js.Object {
  /** How to interpret the source element(s) as a side input value. */
  var kind: js.UndefOr[Record[String, _]] = js.native
  /**
    * The source(s) to read element(s) from to get the value of this side input.
    * If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters.
    * At least one source is required.
    */
  var sources: js.UndefOr[js.Array[Source]] = js.native
  /**
    * The id of the tag the user code will access this side input by;
    * this should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object SideInputInfo {
  @scala.inline
  def apply(): SideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideInputInfo]
  }
  @scala.inline
  implicit class SideInputInfoOps[Self <: SideInputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Source]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

