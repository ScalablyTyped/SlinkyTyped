package typingsSlinky.migrateMongo.anon

import typingsSlinky.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseName extends js.Object {
  var databaseName: String = js.native
  var options: MongoClientOptions = js.native
  var url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any = js.native
}

object DatabaseName {
  @scala.inline
  def apply(
    databaseName: String,
    options: MongoClientOptions,
    url: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
  ): DatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseName]
  }
  @scala.inline
  implicit class DatabaseNameOps[Self <: DatabaseName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: MongoClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<migrate-mongo.anon.FnCallUriOptionsCallback>[0] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

