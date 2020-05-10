package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Service resource is a logical component of an application that can share
  * state and communicate in a secure fashion with other services. For example,
  * an application that handles customer requests might include separate
  * services to handle tasks such as backend data analysis or API requests from
  * mobile devices. Each service has a collection of versions that define a
  * specific set of code used to implement the functionality of that service.
  */
@js.native
trait SchemaService extends js.Object {
  /**
    * Relative name of the service within the application. Example:
    * default.@OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Full path to the Service resource in the API. Example:
    * apps/myapp/services/default.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Mapping that defines fractional HTTP traffic diversion to different
    * versions within the service.
    */
  var split: js.UndefOr[SchemaTrafficSplit] = js.native
}

object SchemaService {
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: SchemaTrafficSplit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
  }
  
}

