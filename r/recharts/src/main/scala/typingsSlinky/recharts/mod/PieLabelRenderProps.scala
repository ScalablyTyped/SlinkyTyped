package typingsSlinky.recharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieLabelRenderProps
  extends PieProps
     with /* key */ StringDictionary[js.Any] {
  
  var index: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  @JSName("stroke")
  var stroke_PieLabelRenderProps: String = js.native
  
  @JSName("textAnchor")
  var textAnchor_PieLabelRenderProps: String = js.native
  
  @JSName("x")
  var x_PieLabelRenderProps: Double = js.native
  
  @JSName("y")
  var y_PieLabelRenderProps: Double = js.native
}
object PieLabelRenderProps {
  
  @scala.inline
  def apply(dataKey: DataKey, name: String, stroke: String, textAnchor: String, x: Double, y: Double): PieLabelRenderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieLabelRenderProps]
  }
  
  @scala.inline
  implicit class PieLabelRenderPropsOps[Self <: PieLabelRenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
  }
}
