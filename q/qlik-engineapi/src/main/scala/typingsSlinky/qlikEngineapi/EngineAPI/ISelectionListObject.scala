package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelectionListObject...
  */
/**
  * SelectionListObject width extend GenericObject
  */
@js.native
trait ISelectionListObject extends IGenericObjectPrototype[IGenericSelectionListProperties, IGenericSelectionListLayout] {
  
  var qBackCount: Double = js.native
  
  var qForwardCount: Double = js.native
  
  var qSelections: js.Array[INxCurrentSelectionItem] = js.native
}
