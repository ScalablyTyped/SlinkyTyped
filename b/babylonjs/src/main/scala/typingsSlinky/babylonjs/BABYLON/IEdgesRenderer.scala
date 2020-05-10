package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEdgesRenderer extends IDisposable {
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean = js.native
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  def isReady(): Boolean = js.native
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): Unit = js.native
}

object IEdgesRenderer {
  @scala.inline
  def apply(dispose: () => Unit, isEnabled: Boolean, isReady: () => Boolean, render: () => Unit): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IEdgesRenderer]
  }
  @scala.inline
  implicit class IEdgesRendererOps[Self <: IEdgesRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

