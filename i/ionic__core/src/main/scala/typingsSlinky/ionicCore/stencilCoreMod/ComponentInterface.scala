package typingsSlinky.ionicCore.stencilCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentInterface
  extends /* state */ StringDictionary[js.Any] {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  var componentDidLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidRender: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var render: js.UndefOr[js.Function0[_]] = js.native
}

object ComponentInterface {
  @scala.inline
  def apply(): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentInterface]
  }
  @scala.inline
  implicit class ComponentInterfaceOps[Self <: ComponentInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDidLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentDidLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentDidRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidRender")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentWillLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillRender(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentWillRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillRender")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillUpdate(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentWillUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConnectedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnectedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisconnectedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

