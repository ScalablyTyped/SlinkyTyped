package typingsSlinky.cavy.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cavy.mod.TestHookStore
import typingsSlinky.cavy.mod.TestReport
import typingsSlinky.cavy.mod.TestScope
import typingsSlinky.cavy.mod.TesterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tester {
  
  @scala.inline
  def apply(specs: js.Array[js.Function1[/* spec */ TestScope, Unit]], store: TestHookStore): Builder = {
    val __props = js.Dynamic.literal(specs = specs.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TesterProps]))
  }
  
  @JSImport("cavy", "Tester")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cavy.mod.Tester] {
    
    @scala.inline
    def clearAsyncStorage(value: Boolean): this.type = set("clearAsyncStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reporter(value: /* report */ TestReport => Unit): this.type = set("reporter", js.Any.fromFunction1(value))
    
    @scala.inline
    def sendReport(value: Boolean): this.type = set("sendReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startDelay(value: Double): this.type = set("startDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitTime(value: Double): this.type = set("waitTime", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TesterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
