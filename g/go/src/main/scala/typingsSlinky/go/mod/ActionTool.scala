package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ActionTool is responsible for handling and dispatching mouse events on GraphObjects
  * that have GraphObject.isActionable set to true.
  * This is how one implements "controls", such as buttons or sliders or knobs, as GraphObjects
  * that can be inside Parts without interfering with the standard tool behaviors.
  */
@JSImport("go", "ActionTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.actionTool.
  */
class ActionTool () extends Tool
