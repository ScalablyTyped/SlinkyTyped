package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateSources {
  
  @JSImport("knockout", "templateSources.anonymousTemplate")
  @js.native
  class anonymousTemplate protected () extends domElement {
    def this(element: Node) = this()
  }
  
  @JSImport("knockout", "templateSources.domElement")
  @js.native
  class domElement protected () extends TemplateSource {
    def this(element: Node) = this()
    
    @JSName("nodes")
    def nodes_MdomElement(): Node = js.native
    @JSName("nodes")
    def nodes_MdomElement(valueToWrite: Node): Unit = js.native
  }
}
