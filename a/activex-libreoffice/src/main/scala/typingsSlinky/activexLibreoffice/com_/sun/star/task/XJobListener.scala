package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** listener on finish states of asynchronous job execution */
@js.native
trait XJobListener extends XEventListener {
  
  /**
    * indicates that the job is done
    * @param Job identifies the asynchronous job so that {@link theJobExecutor} can differ between more than ones.
    * @param Result should be the same like for the synchronous mode on {@link XJob.execute()} . It provides information about success or failure of job execu
    */
  def jobFinished(Job: XAsyncJob, Result: js.Any): Unit = js.native
}
object XJobListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    jobFinished: (XAsyncJob, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XJobListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), jobFinished = js.Any.fromFunction2(jobFinished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XJobListener]
  }
  
  @scala.inline
  implicit class XJobListenerMutableBuilder[Self <: XJobListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobFinished(value: (XAsyncJob, js.Any) => Unit): Self = StObject.set(x, "jobFinished", js.Any.fromFunction2(value))
  }
}
