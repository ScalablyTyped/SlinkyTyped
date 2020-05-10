package typingsSlinky.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned by list().
  */
@js.native
trait ListResult extends js.Object {
  /**
    * Objects in this directory.
    * You can call getMetadate() and getDownloadUrl() on them.
    */
  var items: js.Array[Reference] = js.native
  /**
    * If set, there might be more results for this list. Use this token to resume the list.
    */
  var nextPageToken: String | Null = js.native
  /**
    * References to prefixes (sub-folders). You can call list() on them to
    * get its contents.
    *
    * Folders are implicit based on '/' in the object paths.
    * For example, if a bucket has two objects '/a/b/1' and '/a/b/2', list('/a')
    * will return '/a/b' as a prefix.
    */
  var prefixes: js.Array[Reference] = js.native
}

object ListResult {
  @scala.inline
  def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult]
  }
  @scala.inline
  implicit class ListResultOps[Self <: ListResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixes(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
  }
  
}

