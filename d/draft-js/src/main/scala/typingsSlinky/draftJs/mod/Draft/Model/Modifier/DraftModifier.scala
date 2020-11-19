package typingsSlinky.draftJs.mod.Draft.Model.Modifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `DraftModifier` provides a set of convenience methods that apply
  * modifications to a `ContentState` object based on a target `SelectionState`.
  *
  * Any change to a `ContentState` should be decomposable into a series of
  * transaction functions that apply the required changes and return output
  * `ContentState` objects.
  *
  * These functions encapsulate some of the most common transaction sequences.
  */
@js.native
trait DraftModifier extends js.Object
