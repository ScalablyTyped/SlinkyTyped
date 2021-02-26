package typingsSlinky.ink

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.ink.domMod.DOMElement
import typingsSlinky.ink.domMod.TextNode
import typingsSlinky.reactReconciler.mod.Reconciler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reconcilerMod extends Shortcut {
  
  @JSImport("ink/build/reconciler", JSImport.Default)
  @js.native
  val default: Reconciler[DOMElement, DOMElement | TextNode, DOMElement, js.Any] = js.native
  
  type _To = Reconciler[DOMElement, DOMElement | TextNode, DOMElement, js.Any]
  
  /* This means you don't have to write `default`, but can instead just say `reconcilerMod.foo` */
  override def _to: Reconciler[DOMElement, DOMElement | TextNode, DOMElement, js.Any] = default
}
