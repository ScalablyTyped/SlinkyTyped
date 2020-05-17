package typingsSlinky.firebaseFirestore.specTestRunnerMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.firebaseFirestore.anon.AcknowledgedDocs
import typingsSlinky.firebaseFirestore.anon.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateExpectation extends js.Object {
  /**
    * Current expected active targets. Verified in each step until overwritten.
    */
  var activeTargets: js.UndefOr[NumberDictionary[Queries]] = js.native
  /**
    * Whether the instance holds the primary lease. Used in multi-client tests.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  /** Whether the client is shutdown. */
  var isShutdown: js.UndefOr[Boolean] = js.native
  /** Current documents in limbo. Verified in each step until overwritten. */
  var limboDocs: js.UndefOr[js.Array[String]] = js.native
  /** Number of clients currently marked active. Used in multi-client tests. */
  var numActiveClients: js.UndefOr[Double] = js.native
  /** Number of outstanding writes in the datastore queue. */
  var numOutstandingWrites: js.UndefOr[Double] = js.native
  /**
    * Expected set of callbacks for previously written docs.
    */
  var userCallbacks: js.UndefOr[AcknowledgedDocs] = js.native
  /** Number of requests sent to the watch stream. */
  var watchStreamRequestCount: js.UndefOr[Double] = js.native
  /** Number of requests sent to the write stream. */
  var writeStreamRequestCount: js.UndefOr[Double] = js.native
}

object StateExpectation {
  @scala.inline
  def apply(): StateExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateExpectation]
  }
  @scala.inline
  implicit class StateExpectationOps[Self <: StateExpectation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTargets(value: NumberDictionary[Queries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withIsShutdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withLimboDocs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limboDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimboDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limboDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withNumActiveClients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numActiveClients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumActiveClients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numActiveClients")(js.undefined)
        ret
    }
    @scala.inline
    def withNumOutstandingWrites(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOutstandingWrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumOutstandingWrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOutstandingWrites")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCallbacks(value: AcknowledgedDocs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchStreamRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchStreamRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchStreamRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchStreamRequestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteStreamRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStreamRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteStreamRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeStreamRequestCount")(js.undefined)
        ret
    }
  }
  
}

