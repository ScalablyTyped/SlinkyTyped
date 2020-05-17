package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayConnectionMod.ConnectionInternalEvent
import typingsSlinky.relayRuntime.relayConnectionMod.PageInfo
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends ConnectionInternalEvent {
  var args: Variables = js.native
  var connectionID: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID = js.native
  var edgeIDs: js.Array[String] = js.native
  var kind: String = js.native
  var pageInfo: PageInfo = js.native
  var request: RequestDescriptor = js.native
}

object Args {
  @scala.inline
  def apply(
    args: Variables,
    connectionID: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID,
    edgeIDs: js.Array[String],
    kind: String,
    pageInfo: PageInfo,
    request: RequestDescriptor
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connectionID = connectionID.asInstanceOf[js.Any], edgeIDs = edgeIDs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionID(value: typingsSlinky.relayRuntime.relayConnectionMod.ConnectionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeIDs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageInfo(value: PageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: RequestDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

