package typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reply to an inspection request.
  */
@js.native
trait IReply extends js.Object {
  /**
    * The MIME bundle data returned from an inspection request.
    */
  var data: ReadonlyJSONObject = js.native
  /**
    * Any metadata that accompanies the MIME bundle returning from a request.
    */
  var metadata: ReadonlyJSONObject = js.native
}

object IReply {
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: ReadonlyJSONObject): IReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReply]
  }
  @scala.inline
  implicit class IReplyOps[Self <: IReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

