package typingsSlinky.pouchdbMapreduce.PouchDB.Query

import typingsSlinky.pouchdbMapreduce.PouchDB.BuiltInReducers
import typingsSlinky.pouchdbMapreduce.PouchDB.Reducer
import typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings.ok
import typingsSlinky.pouchdbMapreduce.pouchdbMapreduceStrings.update_after
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[Content /* <: js.Object */, Reduction] extends js.Object {
  /** Include attachment data. */
  var attachments: js.UndefOr[Boolean] = js.native
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[Boolean] = js.native
  /** Include conflicts in the _conflicts field of a doc. */
  var conflicts: js.UndefOr[Boolean] = js.native
  /** Reverse the order of the output rows. */
  var descending: js.UndefOr[Boolean] = js.native
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var endkey: js.UndefOr[js.Any] = js.native
  /** True if you want the reduce function to group results by keys, rather than returning a single result. */
  var group: js.UndefOr[Boolean] = js.native
  /**
    * Number of elements in a key to group by, assuming the keys are arrays.
    * Defaults to the full length of the array.
    */
  var group_level: js.UndefOr[Double] = js.native
  /** Include the document in each row in the doc field. */
  var include_docs: js.UndefOr[Boolean] = js.native
  /** Include rows having a key equal to the given options.endkey. */
  var inclusive_end: js.UndefOr[Boolean] = js.native
  /** Only return rows matching this key. */
  var key: js.UndefOr[js.Any] = js.native
  /** Array of keys to fetch in a single shot. */
  var keys: js.UndefOr[js.Array[_]] = js.native
  /** Maximum number of rows to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Reduce function, or the string name of a built-in function: '_sum', '_count', or '_stats'. */
  var reduce: js.UndefOr[(Reducer[Content, Reduction]) | BuiltInReducers | Boolean] = js.native
  /** Number of rows to skip before returning (warning: poor performance on IndexedDB/LevelDB!). */
  var skip: js.UndefOr[Double] = js.native
  /**
    * unspecified (default): Returns the latest results, waiting for the view to build if necessary.
    * 'ok': Returns results immediately, even if they’re out-of-date.
    * 'update_after': Returns results immediately, but kicks off a build afterwards.
    */
  var stale: js.UndefOr[ok | update_after] = js.native
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var startkey: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply[Content, Reduction](): Options[Content, Reduction] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Content, Reduction]]
  }
  @scala.inline
  implicit class OptionsOps[Self[content, reduction] <: Options[content, reduction], Content, Reduction] (val x: Self[Content, Reduction]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content, Reduction] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content, Reduction]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Content, Reduction]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Content, Reduction]) with Other]
    @scala.inline
    def withAttachments(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withConflicts(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withDescending(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withEndkey(value: js.Any): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndkey: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endkey")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup_level(value: Double): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup_level: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group_level")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_docs(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_docs: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_docs")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusive_end(value: Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive_end: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive_end")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[_]): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withReduceFunction3(
      value: (/* keys */ js.Any | Null, /* values */ js.Array[Content | Reduction], /* rereduce */ Boolean) => js.Array[Reduction] | Reduction
    ): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReduce(value: (Reducer[Content, Reduction]) | BuiltInReducers | Boolean): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduce: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withStale(value: ok | update_after): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStale: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(js.undefined)
        ret
    }
    @scala.inline
    def withStartkey(value: js.Any): Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartkey: Self[Content, Reduction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startkey")(js.undefined)
        ret
    }
  }
  
}

