package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.native
}

object CreatePresignedNotebookInstanceUrlInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
  @scala.inline
  implicit class CreatePresignedNotebookInstanceUrlInputOps[Self <: CreatePresignedNotebookInstanceUrlInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionExpirationDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionExpirationDurationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionExpirationDurationInSeconds")(js.undefined)
        ret
    }
  }
  
}

