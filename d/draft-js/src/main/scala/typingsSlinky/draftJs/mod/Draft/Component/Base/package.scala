package typingsSlinky.draftJs.mod.Draft.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Base {
  
  type DraftBlockRenderMap = typingsSlinky.immutable.Immutable.Map[
    typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftBlockType, 
    typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.DraftBlockRenderConfig
  ]
  
  type DraftStyleMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.react.mod.CSSProperties]
  
  type EditorCommand = typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEditorCommand | java.lang.String
}
