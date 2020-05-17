package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manage cancelable jobs. */
@js.native
trait XJobManager extends XInterface {
  /** cancel all registered jobs. */
  def cancelAllJobs(): Unit = js.native
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): Unit = js.native
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): Unit = js.native
}

object XJobManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelAllJobs: () => Unit,
    queryInterface: `type` => js.Any,
    registerJob: XCancellable => Unit,
    release: () => Unit,
    releaseJob: XCancellable => Unit
  ): XJobManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelAllJobs = js.Any.fromFunction0(cancelAllJobs), queryInterface = js.Any.fromFunction1(queryInterface), registerJob = js.Any.fromFunction1(registerJob), release = js.Any.fromFunction0(release), releaseJob = js.Any.fromFunction1(releaseJob))
    __obj.asInstanceOf[XJobManager]
  }
  @scala.inline
  implicit class XJobManagerOps[Self <: XJobManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelAllJobs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAllJobs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterJob(value: XCancellable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerJob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseJob(value: XCancellable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseJob")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

