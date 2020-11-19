package typingsSlinky.rcProgress.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcProgress.rcProgressStrings.bottom
import typingsSlinky.rcProgress.rcProgressStrings.butt
import typingsSlinky.rcProgress.rcProgressStrings.left
import typingsSlinky.rcProgress.rcProgressStrings.right
import typingsSlinky.rcProgress.rcProgressStrings.round
import typingsSlinky.rcProgress.rcProgressStrings.square
import typingsSlinky.rcProgress.rcProgressStrings.top
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RCProgressProps89681719[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
  
  @scala.inline
  def gapPosition(value: top | right | bottom | left): this.type = set("gapPosition", value.asInstanceOf[js.Any])
  
  @scala.inline
  def percentVarargs(value: Double*): this.type = set("percent", js.Array(value :_*))
  
  @scala.inline
  def percent(value: Double | js.Array[Double]): this.type = set("percent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeColorVarargs(value: String*): this.type = set("strokeColor", js.Array(value :_*))
  
  @scala.inline
  def strokeColor(value: String | js.Array[String] | js.Object): this.type = set("strokeColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeLinecap(value: butt | square | round): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trailWidth(value: Double): this.type = set("trailWidth", value.asInstanceOf[js.Any])
}
