package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion REST Object Information
//#region API Properties Interfaces
/**
  * 'Properties' object passed into the WL.api method.
  */
@js.native
trait IAPIProperties extends js.Object {
  /**
    * A JSON object that specifies the REST API request body. The body
    * property is used only for "POST" and "PUT" requests.
    */
  var body: js.UndefOr[js.Any] = js.native
  /**
    * An HTTP method that specifies the action required for the API call.
    * These actions are standard REST API actions: "COPY", "GET", "MOVE",
    * "PUT", "POST", and "DELETE".
    * @default "GET"
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Contains the path to the REST API object. For information on
    * specifying paths for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String = js.native
}

object IAPIProperties {
  @scala.inline
  def apply(path: String): IAPIProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIProperties]
  }
  @scala.inline
  implicit class IAPIPropertiesOps[Self <: IAPIProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
  }
  
}

