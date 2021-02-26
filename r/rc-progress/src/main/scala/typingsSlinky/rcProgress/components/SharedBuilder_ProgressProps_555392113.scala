package typingsSlinky.rcProgress.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcProgress.interfaceMod.GapPositionType
import typingsSlinky.rcProgress.interfaceMod.StrokeColorType
import typingsSlinky.rcProgress.interfaceMod.StrokeLinecapType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ProgressProps_555392113 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
  
  @scala.inline
  def gapPosition(value: GapPositionType): this.type = set("gapPosition", value.asInstanceOf[js.Any])
  
  @scala.inline
  def percent(value: Double | js.Array[Double]): this.type = set("percent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def percentVarargs(value: Double*): this.type = set("percent", js.Array(value :_*))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeColor(value: StrokeColorType): this.type = set("strokeColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeColorVarargs(value: String*): this.type = set("strokeColor", js.Array(value :_*))
  
  @scala.inline
  def strokeLinecap(value: StrokeLinecapType): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
  
  @scala.inline
  def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trailWidth(value: Double): this.type = set("trailWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def transition(value: String): this.type = set("transition", value.asInstanceOf[js.Any])
}
