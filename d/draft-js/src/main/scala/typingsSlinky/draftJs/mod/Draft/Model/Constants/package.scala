package typingsSlinky.draftJs.mod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Constants {
  
  type CustomBlockType = java.lang.String
  
  type DraftBlockType = typingsSlinky.draftJs.mod.Draft.Model.Constants.CoreDraftBlockType | typingsSlinky.draftJs.mod.Draft.Model.Constants.CustomBlockType
  
  /**
    * Possible entity types.
    */
  type DraftEntityType = java.lang.String | typingsSlinky.draftJs.mod.Draft.Model.Constants.ComposedEntityType
}
