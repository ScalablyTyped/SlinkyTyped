package typingsSlinky.electronPublish.mod

import typingsSlinky.builderUtilRuntime.mod.CancellationToken
import typingsSlinky.electronPublish.multiProgressMod.MultiProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishContext extends js.Object {
  val cancellationToken: CancellationToken = js.native
  val progress: MultiProgress | Null = js.native
}

object PublishContext {
  @scala.inline
  def apply(cancellationToken: CancellationToken): PublishContext = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishContext]
  }
  @scala.inline
  implicit class PublishContextOps[Self <: PublishContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellationToken(value: CancellationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: MultiProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(null)
        ret
    }
  }
  
}

