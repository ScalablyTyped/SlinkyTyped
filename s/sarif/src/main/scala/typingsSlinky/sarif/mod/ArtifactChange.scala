package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactChange extends js.Object {
  /**
    * The location of the artifact to change.
    */
  var artifactLocation: ArtifactLocation = js.native
  /**
    * Key/value pairs that provide additional information about the change.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of replacement objects, each of which represents the replacement of a single region in a single
    * artifact specified by 'artifactLocation'.
    */
  var replacements: js.Array[Replacement] = js.native
}

object ArtifactChange {
  @scala.inline
  def apply(artifactLocation: ArtifactLocation, replacements: js.Array[Replacement]): ArtifactChange = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactChange]
  }
  @scala.inline
  implicit class ArtifactChangeOps[Self <: ArtifactChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactLocation(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacements(value: js.Array[Replacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacements")(value.asInstanceOf[js.Any])
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

