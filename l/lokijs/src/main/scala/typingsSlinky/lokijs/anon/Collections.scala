package typingsSlinky.lokijs.anon

import typingsSlinky.lokijs.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collections extends js.Object {
  var collections: js.Array[Collection[_]] = js.native
  var databaseVersion: Double = js.native
  var name: js.UndefOr[String] = js.native
  var throttledSaves: Boolean = js.native
}

object Collections {
  @scala.inline
  def apply(collections: js.Array[Collection[_]], databaseVersion: Double, throttledSaves: Boolean): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], databaseVersion = databaseVersion.asInstanceOf[js.Any], throttledSaves = throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Array[Collection[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottledSaves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttledSaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

