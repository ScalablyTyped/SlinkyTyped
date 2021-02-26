package typingsSlinky.draftJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def DefaultDraftBlockRenderMap: typingsSlinky.immutable.Immutable.Map[js.Any, js.Any] = typingsSlinky.draftJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftBlockRenderMap").asInstanceOf[typingsSlinky.immutable.Immutable.Map[js.Any, js.Any]]
  
  @scala.inline
  def DefaultDraftInlineStyle: typingsSlinky.immutable.Immutable.Map[js.Any, js.Any] = typingsSlinky.draftJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftInlineStyle").asInstanceOf[typingsSlinky.immutable.Immutable.Map[js.Any, js.Any]]
  
  type SyntheticEvent = slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, js.Object]
  
  type SyntheticKeyboardEvent = slinky.web.SyntheticKeyboardEvent[js.Object]
  
  /**
    * Retrieve a bound key command for the given event.
    */
  @scala.inline
  def getDefaultKeyBinding(e: slinky.web.SyntheticKeyboardEvent[js.Object]): typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | scala.Null = typingsSlinky.draftJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyBinding")(e.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | scala.Null]
  
  /**
    * Return the bounding ClientRect for the visible DOM selection, if any.
    * In cases where there are no selected ranges or the bounding rect is
    * temporarily invalid, return null.
    */
  @scala.inline
  def getVisibleSelectionRect(global: js.Any): typingsSlinky.draftJs.mod.Draft.Component.Selection.FakeClientRect = typingsSlinky.draftJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleSelectionRect")(global.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.draftJs.mod.Draft.Component.Selection.FakeClientRect]
}
