package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.ExperimentId
import typingsSlinky.gapiClientAnalytics.anon.ProfileId
import typingsSlinky.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentsResource extends js.Object {
  /** Delete an experiment. */
  def delete(request: ExperimentId): Request[Unit] = js.native
  /** Returns an experiment to which the user has access. */
  def get(request: ExperimentId): Request[Experiment] = js.native
  /** Create a new experiment. */
  def insert(request: ProfileId): Request[Experiment] = js.native
  /** Lists experiments to which the user has access. */
  def list(request: Startindex): Request[Experiments] = js.native
  /** Update an existing experiment. This method supports patch semantics. */
  def patch(request: ExperimentId): Request[Experiment] = js.native
  /** Update an existing experiment. */
  def update(request: ExperimentId): Request[Experiment] = js.native
}

object ExperimentsResource {
  @scala.inline
  def apply(
    delete: ExperimentId => Request[Unit],
    get: ExperimentId => Request[Experiment],
    insert: ProfileId => Request[Experiment],
    list: Startindex => Request[Experiments],
    patch: ExperimentId => Request[Experiment],
    update: ExperimentId => Request[Experiment]
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
    def withDelete(value: ExperimentId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ExperimentId => Request[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ProfileId => Request[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Startindex => Request[Experiments]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ExperimentId => Request[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ExperimentId => Request[Experiment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

