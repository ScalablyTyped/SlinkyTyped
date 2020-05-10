package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonExperimentId
import typingsSlinky.gapiClientAnalytics.AnonProfileId
import typingsSlinky.gapiClientAnalytics.AnonStartindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: AnonExperimentId): Request_[Unit] = js.native
  /** Returns an experiment to which the user has access. */
  def get(request: AnonExperimentId): Request_[Experiment] = js.native
  /** Create a new experiment. */
  def insert(request: AnonProfileId): Request_[Experiment] = js.native
  /** Lists experiments to which the user has access. */
  def list(request: AnonStartindex): Request_[Experiments] = js.native
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: AnonExperimentId): Request_[Experiment] = js.native
  /** Update an existing experiment. */
  def update(request: AnonExperimentId): Request_[Experiment] = js.native
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: AnonExperimentId => Request_[Unit],
    get: AnonExperimentId => Request_[Experiment],
    insert: AnonProfileId => Request_[Experiment],
    list: AnonStartindex => Request_[Experiments],
    patch: AnonExperimentId => Request_[Experiment],
    update: AnonExperimentId => Request_[Experiment]
  ): ExperimentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ExperimentsResource]
  }
  @scala.inline
  implicit class ExperimentsResourceOps[Self <: ExperimentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonExperimentId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonExperimentId => Request_[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProfileId => Request_[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonStartindex => Request_[Experiments]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonExperimentId => Request_[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonExperimentId => Request_[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

