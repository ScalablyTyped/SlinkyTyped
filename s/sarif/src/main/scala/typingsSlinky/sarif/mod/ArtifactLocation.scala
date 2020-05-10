package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactLocation extends js.Object {
  /**
    * A short description of the artifact location.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[String] = js.native
}

object ArtifactLocation {
  @scala.inline
  def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  @scala.inline
  implicit class ArtifactLocationOps[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
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
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUriBaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriBaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBaseId")(js.undefined)
        ret
    }
  }
  
}

