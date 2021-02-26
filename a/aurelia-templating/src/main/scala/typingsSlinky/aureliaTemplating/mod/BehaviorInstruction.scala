package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "BehaviorInstruction")
@js.native
class BehaviorInstruction () extends StObject {
  
  var anchorIsContainer: Boolean = js.native
  
  var attrName: String = js.native
  
  var attributes: js.Object = js.native
  
  var contentFactory: js.Any = js.native
  
  var enhance: Boolean = js.native
  
  var host: Element = js.native
  
  var inheritBindingContext: Boolean = js.native
  
  var initiatedByBehavior: Boolean = js.native
  
  var originalAttrName: String = js.native
  
  var partReplacements: js.Any = js.native
  
  var skipContentProcessing: Boolean = js.native
  
  var `type`: HtmlBehaviorResource = js.native
  
  var viewFactory: ViewFactory = js.native
  
  var viewModel: js.Object = js.native
}
/* static members */
object BehaviorInstruction {
  
  @JSImport("aurelia-templating", "BehaviorInstruction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a custom attribute instruction.
    * @param attrName The name of the attribute.
    * @param type The HtmlBehaviorResource to create.
    * @return The created instruction.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.attribute")
  @js.native
  def attribute(attrName: String): BehaviorInstruction = js.native
  @JSImport("aurelia-templating", "BehaviorInstruction.attribute")
  @js.native
  def attribute(attrName: String, `type`: HtmlBehaviorResource): BehaviorInstruction = js.native
  
  /**
    * Creates a dynamic component instruction.
    * @param host The element that will parent the dynamic component.
    * @param viewModel The dynamic component's view model instance.
    * @param viewFactory A view factory used in generating the component's view.
    * @return The created instruction.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.dynamic")
  @js.native
  def dynamic(host: Element, viewModel: js.Object, viewFactory: ViewFactory): BehaviorInstruction = js.native
  
  /**
    * Creates a custom element instruction.
    * @param node The node that represents the custom element.
    * @param type The HtmlBehaviorResource to create.
    * @return The created instruction.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.element")
  @js.native
  def element(node: Node, `type`: HtmlBehaviorResource): BehaviorInstruction = js.native
  
  /**
    * Creates an instruction for element enhancement.
    * @return The created instruction.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.enhance")
  @js.native
  def enhance(): BehaviorInstruction = js.native
  
  /**
    * A default behavior used in scenarios where explicit configuration isn't available.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.normal")
  @js.native
  def normal: BehaviorInstruction = js.native
  @scala.inline
  def normal_=(x: BehaviorInstruction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an instruction for unit testing.
    * @param type The HtmlBehaviorResource to create.
    * @param attributes A key/value lookup of attributes for the behaior.
    * @return The created instruction.
    */
  @JSImport("aurelia-templating", "BehaviorInstruction.unitTest")
  @js.native
  def unitTest(`type`: HtmlBehaviorResource, attributes: js.Object): BehaviorInstruction = js.native
}
