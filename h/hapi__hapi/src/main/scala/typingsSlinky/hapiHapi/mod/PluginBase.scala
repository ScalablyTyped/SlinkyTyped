package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.AnonHapi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginBase[T] extends js.Object {
  /** (optional) a string or an array of strings indicating a plugin dependency. Same as setting dependencies via server.dependency(). */
  var dependencies: js.UndefOr[Dependencies] = js.native
  /** (optional) if true, allows the plugin to be registered multiple times with the same server. Defaults to false. */
  var multiple: js.UndefOr[Boolean] = js.native
  /** once - (optional) if true, will only register the plugin once per server. If set, overrides the once option passed to server.register(). Defaults to no override. */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * Allows defining semver requirements for node and hapi.
    * @default Allows all.
    */
  var requirements: js.UndefOr[AnonHapi] = js.native
  /**
    * (required) the registration function with the signature async function(server, options) where:
    * * server - the server object with a plugin-specific server.realm.
    * * options - any options passed to the plugin during registration via server.register().
    */
  def register(server: Server_, options: T): Unit | js.Promise[Unit] = js.native
}

object PluginBase {
  @scala.inline
  def apply[T](register: (Server_, T) => Unit | js.Promise[Unit]): PluginBase[T] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[PluginBase[T]]
  }
  @scala.inline
  implicit class PluginBaseOps[Self[t] <: PluginBase[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRegister(value: (Server_, T) => Unit | js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDependencies(value: Dependencies): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: AnonHapi): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
  }
  
}

