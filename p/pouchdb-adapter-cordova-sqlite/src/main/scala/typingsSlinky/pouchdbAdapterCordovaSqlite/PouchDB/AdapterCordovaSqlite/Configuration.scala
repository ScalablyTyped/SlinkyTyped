package typingsSlinky.pouchdbAdapterCordovaSqlite.PouchDB.AdapterCordovaSqlite

import typingsSlinky.pouchdbAdapterCordovaSqlite.pouchdbAdapterCordovaSqliteStrings.`cordova-sqlite`
import typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: `cordova-sqlite` = js.native
  /**
    * Version of android database to use.
    */
  var androidDatabaseImplementation: js.UndefOr[Double] = js.native
  /**
    * Location of database e.g. 'Default'. Only use 'location' or 'iosDatabaseLocation' not both.
    */
  var iosDatabaseLocation: js.UndefOr[String] = js.native
  /**
    * Location of database e.g. 'Default'.
    */
  var location: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(adapter: `cordova-sqlite`): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: `cordova-sqlite`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidDatabaseImplementation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDatabaseImplementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDatabaseImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDatabaseImplementation")(js.undefined)
        ret
    }
    @scala.inline
    def withIosDatabaseLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDatabaseLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDatabaseLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDatabaseLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

