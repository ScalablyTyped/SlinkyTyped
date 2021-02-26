package typingsSlinky.nteractTransformVdom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nteractTransformVdom.anon.PartialProps
import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsSlinky.nteractTransformVdom.mod.default
import typingsSlinky.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsSlinky.nteractTransformVdom.objectToReactMod.VDOMEl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransformVdom {
  
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def data(value: VDOMEl): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mediaType(value: applicationSlashvdomDotv1Plussignjson): this.type = set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[_]) => Unit): this.type = set("onVDOMEvent", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: TransformVdom.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
