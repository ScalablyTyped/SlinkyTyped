package typingsSlinky.reactNativeTableComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTableComponent.mod.ColsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cols {
  
  @JSImport("react-native-table-component", "Cols")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeTableComponent.mod.Cols] {
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexArrVarargs(value: Double*): this.type = set("flexArr", js.Array(value :_*))
    
    @scala.inline
    def flexArr(value: js.Array[Double]): this.type = set("flexArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightArrVarargs(value: Double*): this.type = set("heightArr", js.Array(value :_*))
    
    @scala.inline
    def heightArr(value: js.Array[Double]): this.type = set("heightArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widthArrVarargs(value: Double*): this.type = set("widthArr", js.Array(value :_*))
    
    @scala.inline
    def widthArr(value: js.Array[Double]): this.type = set("widthArr", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Cols.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
