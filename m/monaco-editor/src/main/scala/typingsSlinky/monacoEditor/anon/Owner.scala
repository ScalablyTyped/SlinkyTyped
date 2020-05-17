package typingsSlinky.monacoEditor.anon

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  var owner: js.UndefOr[String] = js.native
  var resource: js.UndefOr[Uri] = js.native
  var take: js.UndefOr[Double] = js.native
}

object Owner {
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  @scala.inline
  implicit class OwnerOps[Self <: Owner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withTake(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(js.undefined)
        ret
    }
  }
  
}

