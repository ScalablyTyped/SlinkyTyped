package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resumable extends js.Object {
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[Multipart] = js.native
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[Multipart] = js.native
}

object Resumable {
  @scala.inline
  def apply(): Resumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resumable]
  }
  @scala.inline
  implicit class ResumableOps[Self <: Resumable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResumable(value: Multipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Multipart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
  }
  
}

