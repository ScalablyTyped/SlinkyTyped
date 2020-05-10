package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def addColumn(options: js.Object, callback: CbCallback): Unit = js.native
  def columns(callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def create(newItem: Item, callback: CbCallback): Unit = js.native
  def deleteCollection(callback: CbCallback): Unit = js.native
  def dropColumn(name: String, callback: CbCallback): Unit = js.native
  def fetch(query: Query, callback: CbCallback): Unit = js.native
  def remove(query: Query, callback: CbCallback): Unit = js.native
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit = js.native
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Unit,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (Item, CbCallback) => Unit,
    deleteCollection: CbCallback => Unit,
    dropColumn: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    remove: (Query, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Unit,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], addColumn = js.Any.fromFunction2(addColumn), columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), deleteCollection = js.Any.fromFunction1(deleteCollection), dropColumn = js.Any.fromFunction2(dropColumn), fetch = js.Any.fromFunction2(fetch), remove = js.Any.fromFunction2(remove), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction3(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddColumn(value: (js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColumns(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreate(value: (Item, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteCollection(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCollection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDropColumn(value: (String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFetch(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Query, js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

