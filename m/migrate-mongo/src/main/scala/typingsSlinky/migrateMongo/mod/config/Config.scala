package typingsSlinky.migrateMongo.mod.config

import typingsSlinky.migrateMongo.AnonDatabaseName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * The MongoDB collection where the applied changes are stored.
    */
  var changelogCollectionName: String = js.native
  /**
    * The migrations dir, can be an relative or absolute path.
    */
  var migrationsDir: js.UndefOr[String] = js.native
  var mongodb: AnonDatabaseName = js.native
}

object Config {
  @scala.inline
  def apply(changelogCollectionName: String, mongodb: AnonDatabaseName): Config = {
    val __obj = js.Dynamic.literal(changelogCollectionName = changelogCollectionName.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangelogCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelogCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMongodb(value: AnonDatabaseName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrationsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationsDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrationsDir")(js.undefined)
        ret
    }
  }
  
}

