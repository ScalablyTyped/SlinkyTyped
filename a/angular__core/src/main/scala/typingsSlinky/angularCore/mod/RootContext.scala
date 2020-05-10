package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RootContext contains information which is shared for all components which
  * were bootstrapped with {@link renderComponent}.
  */
@js.native
trait RootContext extends js.Object {
  /**
    * A promise which is resolved when all components are considered clean (not dirty).
    *
    * This promise is overwritten every time a first call to {@link markDirty} is invoked.
    */
  var clean: js.Promise[Null] = js.native
  /**
    * RootComponents - The components that were instantiated by the call to
    * {@link renderComponent}.
    */
  var components: js.Array[js.Object] = js.native
  /**
    * What render-related operations to run once a scheduler has been set
    */
  var flags: RootContextFlags = js.native
  /**
    * The player flushing handler to kick off all animations
    */
  var playerHandler: ɵPlayerHandler | Null = js.native
  /**
    * A function used for scheduling change detection in the future. Usually
    * this is `requestAnimationFrame`.
    */
  def scheduler(workFn: js.Function0[Unit]): Unit = js.native
}

object RootContext {
  @scala.inline
  def apply(
    clean: js.Promise[Null],
    components: js.Array[js.Object],
    flags: RootContextFlags,
    scheduler: js.Function0[Unit] => Unit
  ): RootContext = {
    val __obj = js.Dynamic.literal(clean = clean.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scheduler = js.Any.fromFunction1(scheduler))
    __obj.asInstanceOf[RootContext]
  }
  @scala.inline
  implicit class RootContextOps[Self <: RootContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClean(value: js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: RootContextFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduler(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlayerHandler(value: ɵPlayerHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerHandlerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerHandler")(null)
        ret
    }
  }
  
}

