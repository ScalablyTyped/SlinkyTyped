package typingsSlinky.reactHighcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.highcharts.mod.Options
import typingsSlinky.reactHighcharts.mod.ReactHighchartsProps
import typingsSlinky.reactHighcharts.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighcharts {
  
  @scala.inline
  def apply(config: Options): Builder = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactHighchartsProps]))
  }
  
  @JSImport("react-highcharts", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def callback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Highcharts.ChartObject */ /* chart */ js.Any => Unit
    ): this.type = set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def isPureConfig(value: Boolean): this.type = set("isPureConfig", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactHighchartsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
