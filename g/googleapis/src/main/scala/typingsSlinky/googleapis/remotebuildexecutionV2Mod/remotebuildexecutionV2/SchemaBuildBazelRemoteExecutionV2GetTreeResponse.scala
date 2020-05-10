package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.GetTree.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2GetTreeResponse extends js.Object {
  /**
    * The directories descended from the requested root.
    */
  var directories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.native
  /**
    * If present, signifies that there are more results which the client can
    * retrieve by passing this as the page_token in a subsequent request. If
    * empty, signifies that this is the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2GetTreeResponse {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2GetTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2GetTreeResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2GetTreeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

