package typingsSlinky.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * indicates support for executing scripts contained in a, possibly foreign, document.
  *
  * If the component implementing it is a document, which supports embedding scripts into itself, then {@link ScriptContainer} refers to the document
  * itself. Implementing this interface is unnecessary then, instead the document should simply implement {@link XEmbeddedScripts} directly.
  *
  * If the interface is implemented by a document which does not itself support embedding scripts into it, but which is associated unambiguously with a
  * document which does, then this other document is denoted by {@link ScriptContainer} .
  *
  * If the interface is implemented by a controller, then {@link ScriptContainer} refers to the document which supports embedding scripts, and which is
  * unambiguously associated with the controller. This must not necessarily be the model returned by {@link com.sun.star.frame.XController.getModel()} .
  * @since OOo 2.4
  */
@js.native
trait XScriptInvocationContext extends StObject {
  
  /**
    * denotes the document which contains the scripts which are to be invoked from the component implementing the {@link XScriptInvocationContext}
    * interface.
    */
  var ScriptContainer: XEmbeddedScripts = js.native
}
object XScriptInvocationContext {
  
  @scala.inline
  def apply(ScriptContainer: XEmbeddedScripts): XScriptInvocationContext = {
    val __obj = js.Dynamic.literal(ScriptContainer = ScriptContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[XScriptInvocationContext]
  }
  
  @scala.inline
  implicit class XScriptInvocationContextMutableBuilder[Self <: XScriptInvocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptContainer(value: XEmbeddedScripts): Self = StObject.set(x, "ScriptContainer", value.asInstanceOf[js.Any])
  }
}
