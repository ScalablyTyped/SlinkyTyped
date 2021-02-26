package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptOperation extends StObject
@JSImport("azdata", "ScriptOperation")
@js.native
object ScriptOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptOperation with Double] = js.native
  
  @js.native
  sealed trait Alter extends ScriptOperation
  /* 6 */ val Alter: typingsSlinky.azdata.mod.ScriptOperation.Alter with Double = js.native
  
  @js.native
  sealed trait Create extends ScriptOperation
  /* 1 */ val Create: typingsSlinky.azdata.mod.ScriptOperation.Create with Double = js.native
  
  @js.native
  sealed trait Delete extends ScriptOperation
  /* 4 */ val Delete: typingsSlinky.azdata.mod.ScriptOperation.Delete with Double = js.native
  
  @js.native
  sealed trait Execute extends ScriptOperation
  /* 5 */ val Execute: typingsSlinky.azdata.mod.ScriptOperation.Execute with Double = js.native
  
  @js.native
  sealed trait Insert extends ScriptOperation
  /* 2 */ val Insert: typingsSlinky.azdata.mod.ScriptOperation.Insert with Double = js.native
  
  @js.native
  sealed trait Select extends ScriptOperation
  /* 0 */ val Select: typingsSlinky.azdata.mod.ScriptOperation.Select with Double = js.native
  
  @js.native
  sealed trait Update extends ScriptOperation
  /* 3 */ val Update: typingsSlinky.azdata.mod.ScriptOperation.Update with Double = js.native
}
