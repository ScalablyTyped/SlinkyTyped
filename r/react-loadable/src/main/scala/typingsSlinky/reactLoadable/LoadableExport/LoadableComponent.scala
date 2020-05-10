package typingsSlinky.reactLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadableComponent extends js.Object {
  /**
    * The generated component has a static method preload() for calling the loader function ahead of time.
    * This is useful for scenarios where you think the user might do something next and want to load the
    * next component eagerly.
    *
    * Note: preload() intentionally does not return a promise. You should not be depending on the timing of
    * preload(). It's meant as a performance optimization, not for creating UI logic.
    */
  def preload(): Unit = js.native
}

object LoadableComponent {
  @scala.inline
  def apply(preload: () => Unit): LoadableComponent = {
    val __obj = js.Dynamic.literal(preload = js.Any.fromFunction0(preload))
    __obj.asInstanceOf[LoadableComponent]
  }
  @scala.inline
  implicit class LoadableComponentOps[Self <: LoadableComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

