package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the interface used by objects containing a viewport (like a camera)
  */
@js.native
trait IViewportOwnerLike extends js.Object {
  /**
    * Gets or sets the viewport
    */
  var viewport: IViewportLike = js.native
}

object IViewportOwnerLike {
  @scala.inline
  def apply(viewport: IViewportLike): IViewportOwnerLike = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportOwnerLike]
  }
  @scala.inline
  implicit class IViewportOwnerLikeOps[Self <: IViewportOwnerLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewport(value: IViewportLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

