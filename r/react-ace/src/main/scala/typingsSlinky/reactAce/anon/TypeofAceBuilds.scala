package typingsSlinky.reactAce.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.aceBuilds.anon.PartialEditorOptions
import typingsSlinky.aceBuilds.mod.Ace.Config
import typingsSlinky.aceBuilds.mod.Ace.Document
import typingsSlinky.aceBuilds.mod.Ace.EditSession
import typingsSlinky.aceBuilds.mod.Ace.Editor
import typingsSlinky.aceBuilds.mod.Ace.SyntaxMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAceBuilds extends js.Object {
  
  val Ace: TypeofAce = js.native
  
  var EditSession: (Instantiable1[/* text */ String, typingsSlinky.aceBuilds.mod.EditSession]) with InstantiableEditSession = js.native
  
  var Range: (Instantiable4[
    /* startRow */ Double, 
    /* startColumn */ Double, 
    /* endRow */ Double, 
    /* endColumn */ Double, 
    typingsSlinky.aceBuilds.mod.Range
  ]) with ComparePoints = js.native
  
  var UndoManager: Instantiable0[typingsSlinky.aceBuilds.mod.UndoManager] with InstantiableUndoManager = js.native
  
  var VirtualRenderer: (Instantiable1[/* container */ HTMLElement, typingsSlinky.aceBuilds.mod.VirtualRenderer]) with InstantiableVirtualRenderer = js.native
  
  val config: Config = js.native
  
  def createEditSession(text: String, mode: SyntaxMode): EditSession = js.native
  def createEditSession(text: Document, mode: SyntaxMode): EditSession = js.native
  
  def edit(el: String): Editor = js.native
  def edit(el: String, options: PartialEditorOptions): Editor = js.native
  def edit(el: Element): Editor = js.native
  def edit(el: Element, options: PartialEditorOptions): Editor = js.native
  
  def require(name: String): js.Any = js.native
  
  val version: String = js.native
}
