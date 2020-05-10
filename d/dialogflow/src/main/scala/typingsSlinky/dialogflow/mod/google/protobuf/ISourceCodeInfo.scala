package typingsSlinky.dialogflow.mod.google.protobuf

import typingsSlinky.dialogflow.mod.google.protobuf.SourceCodeInfo.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SourceCodeInfo. */
@js.native
trait ISourceCodeInfo extends js.Object {
  /** SourceCodeInfo location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
}

object ISourceCodeInfo {
  @scala.inline
  def apply(): ISourceCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceCodeInfo]
  }
  @scala.inline
  implicit class ISourceCodeInfoOps[Self <: ISourceCodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: js.Array[ILocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(null)
        ret
    }
  }
  
}

