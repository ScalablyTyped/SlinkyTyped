package typingsSlinky.jupyterlabStatusbar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  @JSImport("@jupyterlab/statusbar", "ProgressBar")
  @js.native
  object component extends js.Object
  
  def withProps(p: IProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(percentage: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[IProps]))
  }
}

