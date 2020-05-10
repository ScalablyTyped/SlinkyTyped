package typingsSlinky.phosphorApplication.mod

import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin[T, U] extends js.Object {
  /**
    * Whether the plugin should be activated on application start.
    *
    * #### Notes
    * The default is `false`.
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  /**
    * The human readable id of the plugin.
    *
    * #### Notes
    * This must be unique within an application.
    */
  var id: String = js.native
  /**
    * The types of optional services for the plugin, if any.
    *
    * #### Notes
    * These tokens correspond to the services that can be used by the
    * plugin if available, but are not necessarily required.
    *
    * The optional services will be passed to the `activate()` function
    * following all required services. If an optional service cannot be
    * resolved, `null` will be passed in its place.
    */
  var optional: js.UndefOr[js.Array[Token[_]]] = js.native
  /**
    * The type of service provided by the plugin, if any.
    *
    * #### Notes
    * This token corresponds to the service exported by the plugin.
    *
    * When the plugin is activated, the return value of `activate()`
    * is used as the concrete instance of the type.
    */
  var provides: js.UndefOr[Token[U]] = js.native
  /**
    * The types of required services for the plugin, if any.
    *
    * #### Notes
    * These tokens correspond to the services that are required by
    * the plugin for correct operation.
    *
    * When the plugin is activated, a concrete instance of each type
    * will be passed to the `activate()` function, in the order they
    * are specified in the `requires` array.
    */
  var requires: js.UndefOr[js.Array[Token[_]]] = js.native
  /**
    * A function invoked to activate the plugin.
    *
    * @param app - The application which owns the plugin.
    *
    * @param args - The services specified by the `requires` property.
    *
    * @returns The provided service, or a promise to the service.
    *
    * #### Notes
    * This function will be called whenever the plugin is manually
    * activated, or when another plugin being activated requires
    * the service it provides.
    *
    * This function will not be called unless all of its required
    * services can be fulfilled.
    */
  def activate(app: T, args: js.Any*): U | js.Promise[U] = js.native
}

object IPlugin {
  @scala.inline
  def apply[T, U](activate: (T, /* repeated */ js.Any) => U | js.Promise[U], id: String): IPlugin[T, U] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin[T, U]]
  }
  @scala.inline
  implicit class IPluginOps[Self[t, u] <: IPlugin[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withActivate(value: (T, /* repeated */ js.Any) => U | js.Promise[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: js.Array[Token[_]]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withProvides(value: Token[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvides: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provides")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: js.Array[Token[_]]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
  }
  
}

