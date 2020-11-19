package typingsSlinky.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a drag type is internal or external.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.draftJs.draftJsStrings.internal
  - typingsSlinky.draftJs.draftJsStrings.external
*/
trait DraftDragType extends js.Object
object DraftDragType {
  
  @scala.inline
  def external: typingsSlinky.draftJs.draftJsStrings.external = "external".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.external]
  
  @scala.inline
  def internal: typingsSlinky.draftJs.draftJsStrings.internal = "internal".asInstanceOf[typingsSlinky.draftJs.draftJsStrings.internal]
}
