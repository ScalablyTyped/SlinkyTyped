package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClientStorage.AnonGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeRequest extends js.Object {
  /** Properties of the resulting object. */
  var destination: js.UndefOr[Object] = js.native
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.native
  /** The list of source objects that will be concatenated into a single object. */
  var sourceObjects: js.UndefOr[js.Array[AnonGeneration]] = js.native
}

object ComposeRequest {
  @scala.inline
  def apply(): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeRequest]
  }
  @scala.inline
  implicit class ComposeRequestOps[Self <: ComposeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withSourceObjects(value: js.Array[AnonGeneration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceObjects")(js.undefined)
        ret
    }
  }
  
}

