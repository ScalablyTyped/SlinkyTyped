package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ @js.native
trait IMixedCollection extends IAbstractMixedCollection {
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
  		* @param newItem Object The new object to find the insertion position of.
  		* @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
  		* @returns Number The insertion point to add the new item into this MixedCollection at using insert
  		*/
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any], Double]
  ] = js.native
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
  		* @returns Ext.util.Sorter The sorter, null if none exist
  		*/
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** [Method] Reorders each of the items based on a mapping from old index to new index
  		* @param mapping Object Mapping from old item index to new item index
  		*/
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.native
  /** [Method] Sorts the collection by a single sorter function
  		* @param sorterFn Function The function to sort by
  		*/
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sorts this collection by keys
  		* @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
  		* @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
  		*/
  var sortByKey: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.native
}

object IMixedCollection {
  @scala.inline
  def apply(): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMixedCollection]
  }
  @scala.inline
  implicit class IMixedCollectionOps[Self <: IMixedCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFindInsertionIndex(value: (/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findInsertionIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findInsertionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateComparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateComparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenerateComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFirstSorter(value: () => ISorter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstSorter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFirstSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSortable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withReorder(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByKey(value: (/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
  }
  
}

