package typingsSlinky.loopback.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @property {RemoteMethodArgument[]} accepts Defines arguments that the remote method accepts
  * @property {string|string[]} description Text description of the method
  * @property {RemoteHttpOptions} http The HTTP options for the remote method
  * @property {boolean} isStatic Whether the method is static (eg. `MyModel.myMethod`)
  * @property {string | string[]} notes Additional notes, used by API documentation generators like Swagger.
  * @property {RemoteMethodArgument} returns Describes the remote method's callback arguments
  */
@js.native
trait RemoteMethodOptions extends js.Object {
  /**
    * Defines arguments that the remote method accepts. These arguments map to the static method you define. For the example above, you can see the function signature:
    Person.greet(name, age, callback)...
    `name` is the first argument, `age` is the second argument and callback is automatically provided by LoopBack (do not specify it in your `accepts` array).
    For more info, see Argument descriptions.
    Default if not provided is the empty array, [].
    {  ...
    accepts: [
    {arg: 'name', type: 'string'},
    {arg: 'age', type: 'number'},...],
    ... }
    */
  var accepts: js.UndefOr[js.Array[RemoteMethodArgument]] = js.native
  /**
    * Text description of the method, used by API documentation generators such as Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  /**
    *
    */
  var http: js.UndefOr[RemoteHttpOptions] = js.native
  /**
    *
    * boolean. Whether the method is static (eg. `MyModel.myMethod`). Use `false` to define the method on the prototype (for example, `MyModel.prototype.myMethod`). Default is true.
    * default: true
    */
  var isStatic: js.UndefOr[Boolean] = js.native
  /**
    *
    Additional notes, used by API documentation generators like Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Describes the remote method's callback arguments; See Argument descriptions. The err argument is assumed; do not specify.
    * Default if not provided is the empty array,  [].
    * ```
    * returns: {arg: 'greeting', type: 'string'}`
    * ```
    */
  var returns: js.UndefOr[RemoteMethodArgument] = js.native
}

object RemoteMethodOptions {
  @scala.inline
  def apply(): RemoteMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteMethodOptions]
  }
  @scala.inline
  implicit class RemoteMethodOptionsOps[Self <: RemoteMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts(value: js.Array[RemoteMethodArgument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.undefined)
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
    def withIsStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withReturns(value: RemoteMethodArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returns")(js.undefined)
        ret
    }
  }
  
}

