package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesContainer extends js.Object {
  /** Defines the orientation of the container. Applicable, if the group is a container.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  /** Sets the type of the container. Applicable if the group is a container.
    * @Default {ej.datavisualization.Diagram.ContainerType.Canvas}
    */
  var `type`: js.UndefOr[ContainerType | String] = js.native
}

object NodesContainer {
  @scala.inline
  def apply(): NodesContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesContainer]
  }
  @scala.inline
  implicit class NodesContainerOps[Self <: NodesContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ContainerType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

