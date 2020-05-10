package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - use CommandResult instead. Can be used as part of
  * CompleteRequest.metadata, or are part of a more sophisticated message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead extends js.Object {
  /**
    * The elapsed time between calling Accept and Complete. The server will
    * also have its own idea of what this should be, but this excludes the
    * overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * The amount of time *not* spent executing the command (ie
    * uploading/downloading files).
    */
  var overhead: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverheadOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withOverhead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(js.undefined)
        ret
    }
  }
  
}

