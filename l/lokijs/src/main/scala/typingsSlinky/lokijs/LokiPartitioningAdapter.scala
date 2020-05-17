package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An adapter for adapters.  Converts a non reference mode adapter into a reference mode adapter
  * which can perform destructuring and partioning.  Each collection will be stored in its own key/save and
  * only dirty collections will be saved.  If you  turn on paging with default page size of 25megs and save
  * a 75 meg collection it should use up roughly 3 save slots (key/value pairs sent to inner adapter).
  * A dirty collection that spans three pages will save all three pages again
  * Paging mode was added mainly because Chrome has issues saving 'too large' of a string within a
  * single indexeddb row.  If a single document update causes the collection to be flagged as dirty, all
  * of that collection's pages will be written on next save.
  *
  * @param adapter - reference to a 'non-reference' mode loki adapter instance.
  * @param options - configuration options for partitioning and paging
  * @param [options.paging] - (default: false) set to true to enable paging collection data.
  * @param [options.pageSize] - (default : 25MB) you can use this to limit size of strings passed to inner adapter.
  * @param [options.delimiter] - allows you to override the default delimeter
  * @constructor LokiPartitioningAdapter
  */
@js.native
trait LokiPartitioningAdapter extends LokiPersistenceAdapter {
  var adapter: LokiPersistenceAdapter | Null = js.native
  var dbname: String = js.native
  var dbref: Loki | Null = js.native
  var dirtyPartitions: js.UndefOr[js.Array[Double]] = js.native
  @JSName("mode")
  var mode_LokiPartitioningAdapter: String = js.native
  var options: PageSize = js.native
  var pageIterator: PageIterator | js.Object = js.native
  /**
    * Saves a database by partioning into separate key/value saves.
    * (Loki 'reference mode' persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param dbref - reference to database which we will partition and save.
    * @param callback - adapter callback to return load result to caller
    */
  @JSName("exportDatabase")
  def exportDatabase_MLokiPartitioningAdapter(dbname: String, dbref: Loki, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Used to sequentially load the next page of collection partition, one at a time.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Used to sequentially load each collection partition, one at a time.
    *
    * @param partition - ordinal collection position to load next
    * @param callback - adapter callback to return load result to caller
    */
  def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Helper method used internally to generate and save the next page of the current (dirty) partition.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def saveNextPage(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Helper method used internally to save each dirty collection, one at a time.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def saveNextPartition(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
}

object LokiPartitioningAdapter {
  @scala.inline
  def apply(
    dbname: String,
    exportDatabase: (String, Loki, js.Function1[/* err */ js.Error | Null, Unit]) => Unit,
    loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit,
    loadNextPage: js.Function0[Unit] => Unit,
    loadNextPartition: (Double, js.Function0[Unit]) => Unit,
    mode: String,
    options: PageSize,
    pageIterator: PageIterator | js.Object,
    saveNextPage: js.Function1[/* err */ js.Error | Null, Unit] => Unit,
    saveNextPartition: js.Function1[/* err */ js.Error | Null, Unit] => Unit
  ): LokiPartitioningAdapter = {
    val __obj = js.Dynamic.literal(dbname = dbname.asInstanceOf[js.Any], exportDatabase = js.Any.fromFunction3(exportDatabase), loadDatabase = js.Any.fromFunction2(loadDatabase), loadNextPage = js.Any.fromFunction1(loadNextPage), loadNextPartition = js.Any.fromFunction2(loadNextPartition), mode = mode.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pageIterator = pageIterator.asInstanceOf[js.Any], saveNextPage = js.Any.fromFunction1(saveNextPage), saveNextPartition = js.Any.fromFunction1(saveNextPartition))
    __obj.asInstanceOf[LokiPartitioningAdapter]
  }
  @scala.inline
  implicit class LokiPartitioningAdapterOps[Self <: LokiPartitioningAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportDatabase(value: (String, Loki, js.Function1[/* err */ js.Error | Null, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportDatabase")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLoadNextPage(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNextPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadNextPartition(value: (Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNextPartition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageIterator(value: PageIterator | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIterator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveNextPage(value: js.Function1[/* err */ js.Error | Null, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveNextPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaveNextPartition(value: js.Function1[/* err */ js.Error | Null, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveNextPartition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdapter(value: LokiPersistenceAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdapterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(null)
        ret
    }
    @scala.inline
    def withDbref(value: Loki): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbrefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbref")(null)
        ret
    }
    @scala.inline
    def withDirtyPartitions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyPartitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyPartitions")(js.undefined)
        ret
    }
  }
  
}

