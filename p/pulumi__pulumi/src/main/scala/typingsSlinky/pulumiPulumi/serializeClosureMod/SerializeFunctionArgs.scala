package typingsSlinky.pulumiPulumi.serializeClosureMod

import typingsSlinky.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeFunctionArgs extends js.Object {
  /**
    * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
    */
  var exportName: js.UndefOr[String] = js.native
  /**
    * If this is a function which, when invoked, will produce the actual entrypoint function.
    * Useful for when serializing a function that has high startup cost that only wants to be
    * run once. The signature of this function should be:  () => (provider_handler_args...) => provider_result
    *
    * This will then be emitted as: `exports.[exportName] = serialized_func_name();`
    *
    * In other words, the function will be invoked (once) and the resulting inner function will
    * be what is exported.
    */
  var isFactoryFunction: js.UndefOr[Boolean] = js.native
  /**
    * The resource to log any errors we encounter against.
    */
  var logResource: js.UndefOr[Resource] = js.native
  /**
    * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
    * prevent potential cycles.
    */
  var serialize: js.UndefOr[js.Function1[/* o */ js.Any, Boolean]] = js.native
}

object SerializeFunctionArgs {
  @scala.inline
  def apply(): SerializeFunctionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeFunctionArgs]
  }
  @scala.inline
  implicit class SerializeFunctionArgsOps[Self <: SerializeFunctionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFactoryFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFactoryFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFactoryFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFactoryFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logResource")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* o */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
  }
  
}

