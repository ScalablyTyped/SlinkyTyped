package typingsSlinky.loopback.mod

import typingsSlinky.loopback.loopbackStrings.Array
import typingsSlinky.loopback.loopbackStrings.Buffer
import typingsSlinky.loopback.loopbackStrings.Date
import typingsSlinky.loopback.loopbackStrings.GeoPoint
import typingsSlinky.loopback.loopbackStrings.Number
import typingsSlinky.loopback.loopbackStrings.Object
import typingsSlinky.loopback.loopbackStrings.`null`
import typingsSlinky.loopback.loopbackStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @property {string} arg	Argument name
  * @property {string | string[]} description A text description of the argument.
  * @property {any} http http	Object or Function	For input arguments: a function or an object describing mapping from HTTP request to the argument value.
  * @property {boolean} required	True if argument is required; false otherwise.
  * @property {boolean} root For callback arguments: set this property to true if your function has a single callback argument. Otherwise the root object returned is an object
  * @property {"any" | "Array" | "Boolean" | "Buffer" | "Date" | "GeoPoint" | "null" | "Number" | "Object" | "String"} type
  * @property {string} default Default value that will be used to populate loopback-explorer input fields and swagger documentation
  */
@js.native
trait RemoteMethodArgument extends js.Object {
  /**
    * 	Argument name
    */
  var arg: String = js.native
  /**
    *	Default value that will be used to populate loopback-explorer input fields and swagger documentation.
    *    Note: This value will not be passed into remote methods function if argument is not present.
    */
  var default: js.UndefOr[String] = js.native
  /**
    * A text description of the argument. This is used by API documentation generators like Swagger.
    You can split long descriptions into arrays of strings (lines) to keep line lengths manageable.
    ```
    [
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
    "sed do eiusmod tempor incididunt ut labore et dolore",
    "magna aliqua."
    ]
    ```
    */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * http	Object or Function	For input arguments: a function or an object describing mapping from HTTP request to the argument value. See HTTP mapping of input arguments below.
    * http.target
    * Map the callback argument value to the HTTP response object. The following values are supported.
    * * status sets the res.statusCode to the provided value
    * * header sets the http.header or arg named header to the value
    */
  var http: js.UndefOr[RemoteHttpOptions] = js.native
  /**
    * 	True if argument is required; false otherwise.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * 	For callback arguments: set this property to true if your function has a single callback argument to use as the root object returned to remote caller.
    *    Otherwise the root object returned is a map (argument-name to argument-value).
    */
  var root: js.UndefOr[Boolean] = js.native
  /**
    * 	Argument datatype; must be a Loopback type. Additionally, callback arguments allow a special type "file"; see below.
    */
  var `type`: any | Array | typingsSlinky.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typingsSlinky.loopback.loopbackStrings.String = js.native
}

object RemoteMethodArgument {
  @scala.inline
  def apply(
    arg: String,
    `type`: any | Array | typingsSlinky.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typingsSlinky.loopback.loopbackStrings.String
  ): RemoteMethodArgument = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMethodArgument]
  }
  @scala.inline
  implicit class RemoteMethodArgumentOps[Self <: RemoteMethodArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: any | Array | typingsSlinky.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typingsSlinky.loopback.loopbackStrings.String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String | js.Array[String]): Self = {
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
    def withHttp(value: RemoteHttpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

