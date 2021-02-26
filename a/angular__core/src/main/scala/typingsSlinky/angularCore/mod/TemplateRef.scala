package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "TemplateRef")
@js.native
abstract class TemplateRef[C] () extends StObject {
  
  /**
    * Instantiates an embedded view based on this template,
    * and attaches it to the view container.
    * @param context The data-binding context of the embedded view, as declared
    * in the `<ng-template>` usage.
    * @returns The new embedded view object.
    */
  def createEmbeddedView(context: C): EmbeddedViewRef[C] = js.native
  
  /**
    * The anchor element in the parent view for this embedded view.
    *
    * The data-binding and injection contexts of embedded views created from this `TemplateRef`
    * inherit from the contexts of this location.
    *
    * Typically new embedded views are attached to the view container of this location, but in
    * advanced use-cases, the view can be attached to a different container while keeping the
    * data-binding and injection context from the original location.
    *
    */
  def elementRef: ElementRef[_] = js.native
}
