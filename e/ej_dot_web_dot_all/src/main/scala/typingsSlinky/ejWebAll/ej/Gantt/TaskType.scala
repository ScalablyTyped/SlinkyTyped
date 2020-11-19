package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskType extends js.Object
@JSGlobal("ej.Gantt.TaskType")
@js.native
object TaskType extends js.Object {
  
  ///Duration value remains constant while editing work and resource unit values.
  @js.native
  sealed trait FixedDuration extends TaskType
  
  ///Resource unit remains constant while editing the work and duration values.
  @js.native
  sealed trait FixedUnit extends TaskType
  
  ///Work value of a task remains constant while editing duration and resource unit values.
  @js.native
  sealed trait FixedWork extends TaskType
}
