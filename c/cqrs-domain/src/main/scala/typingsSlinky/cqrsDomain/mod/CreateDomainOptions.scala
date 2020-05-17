package typingsSlinky.cqrsDomain.mod

import typingsSlinky.cqrsDomain.anon.AuthSource
import typingsSlinky.cqrsDomain.anon.Db
import typingsSlinky.cqrsDomain.anon.Host
import typingsSlinky.cqrsDomain.cqrsDomainBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainOptions extends js.Object {
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, couchdb, azuretable, dynamodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var aggregateLock: js.UndefOr[Db] = js.native
  /**
    * optional, default is 'commandRejected'
    * will be used if an error occurs and an event should be generated
    */
  var commandRejectedEventName: js.UndefOr[String] = js.native
  /**
    * optional, default is not set
    * checks if command was already seen in the last time -> ttl
    * currently supports: mongodb, redis, tingodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var deduplication: js.UndefOr[Host] = js.native
  /**
    * the path to the "working directory"
    * can be structured like
    * [set 1](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set1) or
    * [set 2](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set2)
    */
  var domainPath: String = js.native
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, azuretable and inmemory
    * hint: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var eventStore: js.UndefOr[AuthSource] = js.native
  /**
    * optional, default is 800
    * if using in scaled systems and not guaranteeing that each command for an aggregate instance
    * dispatches to the same worker process, this module tries to catch the concurrency issues and
    * retries to handle the command after a timeout between 0 and the defined value
    */
  var retryOnConcurrencyTimeout: js.UndefOr[Double] = js.native
  /**
    * optional, default is 100
    * global snapshot threshold value for all aggregates
    * defines the amount of loaded events, if there are more events to load, it will do a snapshot, so next loading is faster
    * an individual snapshot threshold defining algorithm can be defined per aggregate (scroll down)
    */
  var snapshotThreshold: js.UndefOr[Double] = js.native
  /**
    * optional, default false
    * resolves valid file types from loader extensions instead of default values while parsing definition files
    */
  var useLoaderExtensions: js.UndefOr[`true`] = js.native
}

object CreateDomainOptions {
  @scala.inline
  def apply(domainPath: String): CreateDomainOptions = {
    val __obj = js.Dynamic.literal(domainPath = domainPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainOptions]
  }
  @scala.inline
  implicit class CreateDomainOptionsOps[Self <: CreateDomainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregateLock(value: Db): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateLock")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandRejectedEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandRejectedEventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandRejectedEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandRejectedEventName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeduplication(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeduplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deduplication")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStore(value: AuthSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStore")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOnConcurrencyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnConcurrencyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOnConcurrencyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryOnConcurrencyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLoaderExtensions(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLoaderExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLoaderExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLoaderExtensions")(js.undefined)
        ret
    }
  }
  
}

