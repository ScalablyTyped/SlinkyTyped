package typingsSlinky.gapiClientBigquery

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFriendlyName extends js.Object {
  /** A descriptive name for this project. */
  var friendlyName: js.UndefOr[String] = js.native
  /** An opaque ID of this project. */
  var id: js.UndefOr[String] = js.native
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  /** The numeric ID of this project. */
  var numericId: js.UndefOr[String] = js.native
  /** A unique reference to this project. */
  var projectReference: js.UndefOr[ProjectReference] = js.native
}

object AnonFriendlyName {
  @scala.inline
  def apply(): AnonFriendlyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFriendlyName]
  }
  @scala.inline
  implicit class AnonFriendlyNameOps[Self <: AnonFriendlyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
    def withNumericId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectReference(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectReference")(js.undefined)
        ret
    }
  }
  
}

