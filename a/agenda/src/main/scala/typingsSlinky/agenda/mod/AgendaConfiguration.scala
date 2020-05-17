package typingsSlinky.agenda.mod

import typingsSlinky.agenda.anon.Address
import typingsSlinky.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Agenda Configuration.
  */
@js.native
trait AgendaConfiguration extends js.Object {
  /**
    * Specifies that Agenda should connect to MongoDB.
    */
  var db: js.UndefOr[Address] = js.native
  /**
    * Takes a number which specifies the default number of a specific job that can be running at any given moment.
    * By default it is 5.
    */
  var defaultConcurrency: js.UndefOr[Double] = js.native
  /**
    * Takes a number which specifies the default lock lifetime in milliseconds. By default it is 10 minutes. This
    * can be overridden by specifying the lockLifetime option to a defined job.
    */
  var defaultLockLifetime: js.UndefOr[Double] = js.native
  /**
    * Takes a number which specifies the default number of a specific job that can be locked at any given moment.
    * By default it is 0 for no max.
    */
  var defaultLockLimit: js.UndefOr[Double] = js.native
  /**
    * Takes a number which specifies the max number jobs that can be locked at any given moment. By default it is
    * 0 for no max.
    */
  var lockLimit: js.UndefOr[Double] = js.native
  /**
    * Takes a number which specifies the max number of jobs that can be running at any given moment. By default it
    * is 20.
    */
  var maxConcurrency: js.UndefOr[Double] = js.native
  /**
    * Specifies that Agenda should be initialized using and existing MongoDB connection.
    */
  var mongo: js.UndefOr[Db] = js.native
  /**
    * Sets the interval with which the queue is checked. A number in milliseconds or a frequency string.
    */
  var processEvery: js.UndefOr[String | Double] = js.native
}

object AgendaConfiguration {
  @scala.inline
  def apply(): AgendaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaConfiguration]
  }
  @scala.inline
  implicit class AgendaConfigurationOps[Self <: AgendaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLockLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLockLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLockLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLockLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLockLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLockLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLockLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLockLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLockLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMongo(value: Db): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMongo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongo")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessEvery(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEvery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessEvery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processEvery")(js.undefined)
        ret
    }
  }
  
}

