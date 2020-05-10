package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStartPageToken extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#startPageToken&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The starting page token for listing changes.
    */
  var startPageToken: js.UndefOr[String] = js.native
}

object SchemaStartPageToken {
  @scala.inline
  def apply(): SchemaStartPageToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartPageToken]
  }
  @scala.inline
  implicit class SchemaStartPageTokenOps[Self <: SchemaStartPageToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPageToken")(js.undefined)
        ret
    }
  }
  
}

