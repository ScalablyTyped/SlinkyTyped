package typingsSlinky.reactHotLoader.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHotLoader.mod.AppChildren
import typingsSlinky.reactHotLoader.mod.AppContainerProps
import typingsSlinky.reactHotLoader.mod.ErrorReporterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppContainer {
  
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactHotLoader.mod.AppContainer] {
    
    @scala.inline
    def errorBoundary(value: Boolean): this.type = set("errorBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorReporterFunctionComponent(value: ReactComponentClass[ErrorReporterProps]): this.type = set("errorReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorReporterComponentClass(value: ReactComponentClass[ErrorReporterProps]): this.type = set("errorReporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorReporter(value: ReactComponentClass[ErrorReporterProps]): this.type = set("errorReporter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppContainerProps with AppChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AppContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
