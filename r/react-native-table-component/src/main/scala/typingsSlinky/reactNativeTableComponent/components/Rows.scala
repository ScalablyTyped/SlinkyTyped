package typingsSlinky.reactNativeTableComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTableComponent.mod.RowsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rows {
  
  @JSImport("react-native-table-component", "Rows")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTableComponent.mod.Rows] {
    
    @scala.inline
    def data(value: js.Array[js.Array[_]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Array[js.Any]*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def flexArr(value: js.Array[Double]): this.type = set("flexArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexArrVarargs(value: Double*): this.type = set("flexArr", js.Array(value :_*))
    
    @scala.inline
    def heightArr(value: js.Array[Double]): this.type = set("heightArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightArrVarargs(value: Double*): this.type = set("heightArr", js.Array(value :_*))
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthArr(value: js.Array[Double]): this.type = set("widthArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthArrVarargs(value: Double*): this.type = set("widthArr", js.Array(value :_*))
  }
  
  implicit def make(companion: Rows.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RowsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
