package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTeardownTag extends js.Object {
  /**
    * If true, fire the teardown tag if and only if the main tag fires
    * successfully. If false, fire the teardown tag regardless of main tag
    * firing status.
    */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * The name of the teardown tag.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaTeardownTag {
  @scala.inline
  def apply(): SchemaTeardownTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeardownTag]
  }
  @scala.inline
  implicit class SchemaTeardownTagOps[Self <: SchemaTeardownTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStopTeardownOnFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTeardownOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTeardownOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTeardownOnFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
  }
  
}

