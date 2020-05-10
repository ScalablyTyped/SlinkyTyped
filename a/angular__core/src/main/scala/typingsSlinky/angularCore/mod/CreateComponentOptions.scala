package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that control how the component should be bootstrapped. */
@js.native
trait CreateComponentOptions extends js.Object {
  /**
    * Host element on which the component will be bootstrapped. If not specified,
    * the component definition's `tag` is used to query the existing DOM for the
    * element to bootstrap.
    */
  var host: js.UndefOr[RElement | String] = js.native
  /**
    * List of features to be applied to the created component. Features are simply
    * functions that decorate a component with a certain behavior.
    *
    * Typically, the features in this list are features that cannot be added to the
    * other features list in the component definition because they rely on other factors.
    *
    * Example: `LifecycleHooksFeature` is a function that adds lifecycle hook capabilities
    * to root components in a tree-shakable way. It cannot be added to the component
    * features list because there's no way of knowing when the component will be used as
    * a root component.
    */
  var hostFeatures: js.UndefOr[js.Array[HostFeature]] = js.native
  /** Module injector for the component. If unspecified, the injector will be NULL_INJECTOR. */
  var injector: js.UndefOr[Injector] = js.native
  /** A custom animation player handler */
  var playerHandler: js.UndefOr[ɵPlayerHandler] = js.native
  /** Which renderer factory to use. */
  var rendererFactory: js.UndefOr[RendererFactory3] = js.native
  /** A custom sanitizer instance */
  var sanitizer: js.UndefOr[Sanitizer] = js.native
  /**
    * A function which is used to schedule change detection work in the future.
    *
    * When marking components as dirty, it is necessary to schedule the work of
    * change detection in the future. This is done to coalesce multiple
    * {@link markDirty} calls into a single changed detection processing.
    *
    * The default value of the scheduler is the `requestAnimationFrame` function.
    *
    * It is also useful to override this function for testing purposes.
    */
  var scheduler: js.UndefOr[js.Function1[/* work */ js.Function0[Unit], Unit]] = js.native
}

object CreateComponentOptions {
  @scala.inline
  def apply(): CreateComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComponentOptions]
  }
  @scala.inline
  implicit class CreateComponentOptionsOps[Self <: CreateComponentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: RElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostFeatures(value: js.Array[HostFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withInjector(value: Injector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injector")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerHandler(value: ɵPlayerHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererFactory(value: RendererFactory3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRendererFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitizer(value: Sanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduler(value: /* work */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.undefined)
        ret
    }
  }
  
}

