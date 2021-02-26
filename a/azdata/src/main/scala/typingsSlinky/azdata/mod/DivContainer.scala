package typingsSlinky.azdata.mod

import typingsSlinky.vscode.mod.Disposable
import typingsSlinky.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.azdata.mod.ComponentProperties because Already inherited
- typingsSlinky.azdata.mod.DivContainerProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined overflowY, yOffsetChange, clickable */ @js.native
trait DivContainer extends Container[DivLayout, DivItemLayout] {
  
  /**
    * Indicates whether the element is clickable
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * An event called when the div is clicked
    */
  def onDidClick(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidClick(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event called when the div is clicked
    */
  @JSName("onDidClick")
  var onDidClick_Original: Event[_] = js.native
  
  /**
    * Matches the overflow-y CSS property and its available values.
    */
  var overflowY: js.UndefOr[String] = js.native
  
  /**
    * Setting the scroll based on the y offset
    * This is used when its child component is webview
    */
  var yOffsetChange: js.UndefOr[Double] = js.native
}
