package typingsSlinky.connectAzuretables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureTableStoreOptions extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var errorLogger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
   // sessionTimeOut in minutes
  var overrideCron: js.UndefOr[String] = js.native
  var sessionTimeOut: js.UndefOr[Double] = js.native
   // cron job description
  var storageAccount: js.UndefOr[String] = js.native
  var table: js.UndefOr[String] = js.native
}

object AzureTableStoreOptions {
  @scala.inline
  def apply(): AzureTableStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureTableStoreOptions]
  }
  @scala.inline
  implicit class AzureTableStoreOptionsOps[Self <: AzureTableStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLogger(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLogger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLogger")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideCron(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideCron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideCron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideCron")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

