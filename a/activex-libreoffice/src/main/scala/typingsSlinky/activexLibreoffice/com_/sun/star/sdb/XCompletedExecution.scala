package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for execution where information for execution may be required from the user. */
@js.native
trait XCompletedExecution extends XInterface {
  
  /**
    * completes necessary information before execution, for example parameter values.
    * @param handler will be asked when more information is needed
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def executeWithCompletion(handler: XInteractionHandler): Unit = js.native
}
object XCompletedExecution {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    executeWithCompletion: XInteractionHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompletedExecution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), executeWithCompletion = js.Any.fromFunction1(executeWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompletedExecution]
  }
  
  @scala.inline
  implicit class XCompletedExecutionMutableBuilder[Self <: XCompletedExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecuteWithCompletion(value: XInteractionHandler => Unit): Self = StObject.set(x, "executeWithCompletion", js.Any.fromFunction1(value))
  }
}
