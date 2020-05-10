package typingsSlinky.dav.mod.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncCollectionOptions extends js.Object {
  /**
    * option value for Depth header.
    */
  var depth: js.UndefOr[String] = js.native
  /**
    * list of props to request.
    */
  var props: js.Array[js.Object] = js.native
  /**
    * indicates scope of the sync report request.
    */
  var syncLevel: Double = js.native
  /**
    * synchronization token provided by the server.
    */
  var syncToken: String = js.native
}

object SyncCollectionOptions {
  @scala.inline
  def apply(props: js.Array[js.Object], syncLevel: Double, syncToken: String): SyncCollectionOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], syncLevel = syncLevel.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncCollectionOptions]
  }
  @scala.inline
  implicit class SyncCollectionOptionsOps[Self <: SyncCollectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProps(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
  }
  
}

