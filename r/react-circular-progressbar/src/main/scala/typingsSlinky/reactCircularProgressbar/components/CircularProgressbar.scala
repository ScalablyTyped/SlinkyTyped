package typingsSlinky.reactCircularProgressbar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactCircularProgressbar.anon.Background
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarProps
import typingsSlinky.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularProgressbar {
  
  @scala.inline
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: Background,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String,
    value: Double
  ): Default[tag.type, typingsSlinky.reactCircularProgressbar.mod.CircularProgressbar] = {
    val __props = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactCircularProgressbar.mod.CircularProgressbar](js.Array(this.component, __props.asInstanceOf[CircularProgressbarProps]))
  }
  
  @JSImport("react-circular-progressbar", "CircularProgressbar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CircularProgressbarProps): Default[tag.type, typingsSlinky.reactCircularProgressbar.mod.CircularProgressbar] = new Default[tag.type, typingsSlinky.reactCircularProgressbar.mod.CircularProgressbar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
