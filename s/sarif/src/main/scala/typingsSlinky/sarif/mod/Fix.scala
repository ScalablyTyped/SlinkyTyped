package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fix extends js.Object {
  /**
    * One or more artifact changes that comprise a fix for a result.
    */
  var artifactChanges: js.Array[ArtifactChange] = js.native
  /**
    * A message that describes the proposed fix, enabling viewers to present the proposed change to an end user.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the fix.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object Fix {
  @scala.inline
  def apply(artifactChanges: js.Array[ArtifactChange]): Fix = {
    val __obj = js.Dynamic.literal(artifactChanges = artifactChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fix]
  }
  @scala.inline
  implicit class FixOps[Self <: Fix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactChanges(value: js.Array[ArtifactChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

