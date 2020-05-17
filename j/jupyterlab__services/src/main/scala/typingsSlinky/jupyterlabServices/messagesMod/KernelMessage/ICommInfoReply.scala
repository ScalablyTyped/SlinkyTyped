package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabServices.anon.Targetname
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_info_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
  *
  * **See also:** [[ICommInfoRequest]], [[IKernel.commInfo]]
  */
@js.native
trait ICommInfoReply extends IReplyOkContent {
  /**
    * Mapping of comm ids to target names.
    */
  var comms: StringDictionary[Targetname] = js.native
}

object ICommInfoReply {
  @scala.inline
  def apply(comms: StringDictionary[Targetname], status: ok): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReply]
  }
  @scala.inline
  implicit class ICommInfoReplyOps[Self <: ICommInfoReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComms(value: StringDictionary[Targetname]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

