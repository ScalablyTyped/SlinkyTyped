package typingsSlinky.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A router outlet is a placeholder that Angular dynamically fills based on the application's route.
  *
  * ## Use
  *
  * ```
  * <router-outlet></router-outlet>
  * ```
  */
@js.native
trait RouterOutlet extends js.Object {
  var name: String = js.native
  /**
    * Called by the Router to instantiate a new component during the commit phase of a navigation.
    * This method in turn is responsible for calling the `routerOnActivate` hook of its child.
    */
  def activate(nextInstruction: ComponentInstruction): js.Any = js.native
  /**
    * Called by the {@link Router} when an outlet disposes of a component's contents.
    * This method in turn is responsible for calling the `routerOnDeactivate` hook of its child.
    */
  def deactivate(nextInstruction: ComponentInstruction): js.Any = js.native
  /**
    * Called by the {@link Router} during the commit phase of a navigation when an outlet
    * reuses a component between different routes.
    * This method in turn is responsible for calling the `routerOnReuse` hook of its child.
    */
  def reuse(nextInstruction: ComponentInstruction): js.Any = js.native
  /**
    * Called by the {@link Router} during recognition phase of a navigation.
    *
    * If this resolves to `false`, the given navigation is cancelled.
    *
    * This method delegates to the child component's `routerCanDeactivate` hook if it exists,
    * and otherwise resolves to true.
    */
  def routerCanDeactivate(nextInstruction: ComponentInstruction): js.Any = js.native
  /**
    * Called by the {@link Router} during recognition phase of a navigation.
    *
    * If the new child component has a different Type than the existing child component,
    * this will resolve to `false`. You can't reuse an old component when the new component
    * is of a different Type.
    *
    * Otherwise, this method delegates to the child component's `routerCanReuse` hook if it exists,
    * or resolves to true if the hook is not present.
    */
  def routerCanReuse(nextInstruction: ComponentInstruction): js.Any = js.native
}

object RouterOutlet {
  @scala.inline
  def apply(
    activate: ComponentInstruction => js.Any,
    deactivate: ComponentInstruction => js.Any,
    name: String,
    reuse: ComponentInstruction => js.Any,
    routerCanDeactivate: ComponentInstruction => js.Any,
    routerCanReuse: ComponentInstruction => js.Any
  ): RouterOutlet = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), name = name.asInstanceOf[js.Any], reuse = js.Any.fromFunction1(reuse), routerCanDeactivate = js.Any.fromFunction1(routerCanDeactivate), routerCanReuse = js.Any.fromFunction1(routerCanReuse))
    __obj.asInstanceOf[RouterOutlet]
  }
  @scala.inline
  implicit class RouterOutletOps[Self <: RouterOutlet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: ComponentInstruction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivate(value: ComponentInstruction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReuse(value: ComponentInstruction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRouterCanDeactivate(value: ComponentInstruction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerCanDeactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRouterCanReuse(value: ComponentInstruction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routerCanReuse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

