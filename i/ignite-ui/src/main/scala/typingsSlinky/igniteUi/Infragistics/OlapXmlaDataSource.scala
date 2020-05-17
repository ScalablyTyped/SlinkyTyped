package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapXmlaDataSource extends js.Object {
  /**
  	 * Adds a hierarchy to the columns of the pivot grid.
  	 *
  	 * @param columnItem an object of type $.ig.Hierarchy which is the hierarchy to add in the pivot grid columns.
  	 */
  def addColumnItem(columnItem: js.Object): Unit = js.native
  /**
  	 * Adds a hierarchy to the filter axis of the pivot grid.
  	 *
  	 * @param filterItem an object of type $.ig.Hierarchy which is the hierarchy to add.
  	 */
  def addFilterItem(filterItem: js.Object): Unit = js.native
  /**
  	 * Adds a member to list of filter members that will be present in result.
  	 *             If a member of given hierarchy is added to this filter list then only those members which are present in this filter list will be present for that hierarchy in the result.
  	 *
  	 * @param hierarchyUniqueName the unique name of the hierarchy this member belongs to.
  	 * @param memberUniqueName the unique name of the member to be added.
  	 */
  def addFilterMember(hierarchyUniqueName: String, memberUniqueName: String): Unit = js.native
  /**
  	 * Adds a measure to the measures of the pivot grid.
  	 *
  	 * @param measureItem an object of type $.ig.Measure which is the measure to add.
  	 */
  def addMeasureItem(measureItem: js.Object): Unit = js.native
  /**
  	 * Adds a hierarchy to the rows of the pivot grid.
  	 *
  	 * @param rowItem An object of type $.ig.Hierarchy which is the hierarchy to add in the pivot grid rows.
  	 */
  def addRowItem(rowItem: js.Object): Unit = js.native
  /**
  	 * Retrieves the current catalog in the data source.
  	 */
  def catalog(): js.Object = js.native
  /**
  	 * Retrieves the currently loaded catalogs in the data source.
  	 */
  def catalogs(): js.Array[_] = js.native
  /**
  	 * Clears all pending changes since last time the update() method is called.
  	 */
  def clearPendingChanges(): Unit = js.native
  /**
  	 * Sets a tuple member to be collapsed next time the update() method is called.
  	 *             Calling this method on an already collapsed member does nothing.
  	 *
  	 * @param axisName the name of the axis for the tuple.
  	 * @param tupleIndex the index of the tuple in the axis.
  	 * @param memberIndex the index of the member in the tuple.
  	 */
  def collapseTupleMember(axisName: String, tupleIndex: Double, memberIndex: Double): Unit = js.native
  /**
  	 * Returns the items in the column axis.
  	 */
  def columnAxis(): js.Array[_] = js.native
  /**
  	 * Retrieves the current cube in the data source.
  	 */
  def cube(): js.Object = js.native
  /**
  	 * Retrieves the currently loaded cubes in the data source.
  	 */
  def cubes(): js.Array[_] = js.native
  /**
  	 * Sets a tuple member to be expanded next time the update() method is called.
  	 *             Calling this method on an already expanded member does nothing.
  	 *
  	 * @param axisName the name of the axis for the tuple.
  	 * @param tupleIndex the index of the tuple in the axis.
  	 * @param memberIndex the index of the member in the tuple.
  	 */
  def expandTupleMember(axisName: String, tupleIndex: Double, memberIndex: Double): Unit = js.native
  /**
  	 * Returns the items in the filter axis.
  	 */
  def filters(): js.Array[_] = js.native
  /**
  	 * Gets the first element of the specified elementType which matches the specified predicate or null if there is no such element found.
  	 *
  	 * @param predicate a predicate callback invoked against each core element of the specified type. It has to return true when the element has matched the serach criteria, otherwise - false.
  	 * @param elementType an object specified by $.ig.ICoreOlapElement.prototype.$type property. Valid types which prototype can be examined are: $.ig.Dimension, $.ig.Hierarchy, $.ig.Level, $.ig.Measure and $.ig.MeasureList.
  	 */
  def getCoreElement(predicate: js.Function, elementType: js.Object): js.Object = js.native
  /**
  	 * Gets an array with elements of the specified elementType which match the specified predicate or empty array if there is no such element found.
  	 *
  	 * @param predicate a predicate callback invoked against each core element of the specified type. It has to return true when the element has matched the serach criteria, otherwise - false.
  	 * @param elementType an object specified by $.ig.ICoreOlapElement.prototype.$type property. Valid types which prototype can be examined are: $.ig.Dimension, $.ig.Hierarchy, $.ig.Level, $.ig.Measure and $.ig.MeasureList.
  	 */
  def getCoreElements(predicate: js.Function, elementType: js.Object): js.Object = js.native
  /**
  	 * Returns $.ig.Dimension object for the specified unique name.
  	 *
  	 * @param dimensionUniqueName the unique name of the searched dimension object.
  	 */
  def getDimension(dimensionUniqueName: String): js.Object = js.native
  /**
  	 * Returns an array of strings with the unique names of selected for given hierarchy filter members.
  	 *
  	 * @param hierarchyUniqueName the unique name of the hierarchy whose active filter members are returned.
  	 */
  def getFilterMemberNames(hierarchyUniqueName: String): js.Array[_] = js.native
  /**
  	 * Returns $.ig.Hierarchy object for the specified unique name.
  	 *
  	 * @param hierarchyUniqueName the unique name of the searched hierarchy object.
  	 */
  def getHierarchy(hierarchyUniqueName: String): js.Object = js.native
  /**
  	 * Returns $.ig.Level object for the specified unique name.
  	 *
  	 * @param levelUniqueName the unique name of the searched level object.
  	 */
  def getLevel(levelUniqueName: String): js.Object = js.native
  /**
  	 * Returns $.ig.Measure object for the specified unique name.
  	 *
  	 * @param measureUniqueName the unique name of the searched measure object.
  	 */
  def getMeasure(measureUniqueName: String): js.Object = js.native
  /**
  	 * Returns $.ig.MeasureList object available when operates with more than one $.ig.Measure object.
  	 */
  def getMeasureList(): js.Object = js.native
  /**
  	 * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects of selected for given hierarchy filter member.
  	 *
  	 * @param hierarchyUniqueName the unique name of the member whose active filter members are returned.
  	 */
  def getMembersOfHierarchy(hierarchyUniqueName: String): Unit = js.native
  /**
  	 * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects of selected for given level filter member.
  	 *
  	 * @param levelUniqueName the unique name of the member whose active filter members are returned.
  	 */
  def getMembersOfLevel(levelUniqueName: String): Unit = js.native
  /**
  	 * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects that are children of the current member.
  	 *
  	 * @param memberUniqueName the unique name of the member whose active filter members are returned.
  	 */
  def getMembersOfMember(memberUniqueName: String): Unit = js.native
  /**
  	 * Initializes the data source and returns a promise that will be resolved once the data source is initialized.
  	 *             The promise's result will be the metadata tree for the catalog/cube/measureGroup specified in the settings or null if the settings do not provide a valid cube initialization data.
  	 *             The data source is not functional until it has been initialized and all other methods other than initialize() will throw an error if isInitialized() returns false.
  	 */
  def initialize(): js.Object = js.native
  /**
  	 * Retrieves the initialization state of the data source.
  	 */
  def isInitialized(): Boolean = js.native
  /**
  	 * Indicates whether the data source is modified.
  	 */
  def isModified(): Boolean = js.native
  /**
  	 * Indicates whether the update() method execution is in progress.
  	 */
  def isUpdating(): Boolean = js.native
  /**
  	 * Retrieves the current measureGroup in the data source.
  	 */
  def measureGroup(): js.Object = js.native
  /**
  	 * Retrieves the currently loaded measure groups in the data source.
  	 */
  def measureGroups(): js.Array[_] = js.native
  /**
  	 * Returns the items in the measures axis.
  	 */
  def measures(): js.Array[_] = js.native
  /**
  	 * Returns the fully loaded metadata tree.
  	 */
  def metadataTree(): js.Object = js.native
  /**
  	 * Removes all members from the list of filter members and the filter for the specified hierarchy is cleared.
  	 *
  	 * @param hierarchyUniqueName the unique name of the hierarchy which filter members to be cleared.
  	 */
  def removeAllFilterMembers(hierarchyUniqueName: String): Unit = js.native
  /**
  	 * Removes a hierarchy or the measure list from the columns of the pivot grid.
  	 *
  	 * @param columnItem an object of type $.ig.Hierarchy or $.ig.MeasureList which is the hierarchy to remove or the measure list if there are more than one measures added and the measure list location is set to "columns".
  	 */
  def removeColumnItem(columnItem: js.Object): Unit = js.native
  /**
  	 * Removes a hierarchy from the filter axis of the pivot grid.
  	 *
  	 * @param filterItem an object of type $.ig.Hierarchy which is the hierarchy to remove.
  	 */
  def removeFilterItem(filterItem: js.Object): Unit = js.native
  /**
  	 * Removes a member from the list of filter members that will be present in result.
  	 *
  	 * @param hierarchyUniqueName the unique name of the hierarchy this member belongs to.
  	 * @param memberUniqueName the unique name of the member to be removed.
  	 */
  def removeFilterMember(hierarchyUniqueName: String, memberUniqueName: String): Unit = js.native
  /**
  	 * Removes a measure from the measures of the pivot grid.
  	 *
  	 * @param measureItem An object of type $.ig.Measure which is the measure to remove.
  	 */
  def removeMeasureItem(measureItem: js.Object): Unit = js.native
  /**
  	 * Removes a hierarchy or the measure list from the rows of the pivot grid.
  	 *
  	 * @param rowItem an object of type $.ig.Hierarchy or $.ig.MeasureList which is the hierarchy to remove or the measure list if there are more than one measures added and the measure list location is set to "rows".
  	 */
  def removeRowItem(rowItem: js.Object): Unit = js.native
  /**
  	 * Returns the result from the last update or null if the last update was unsuccessful.
  	 */
  def result(): js.Object = js.native
  /**
  	 * Returns the items in the row axis.
  	 */
  def rowAxis(): js.Array[_] = js.native
  /**
  	 * Sets the current catalog for the data source and updates the cubes() and catalog() properties.
  	 *
  	 * @param catalogName the name of the catalog.
  	 */
  def setCatalog(catalogName: String): js.Object = js.native
  /**
  	 * Sets the current cube for the data source and updates the cube(), measureGroup() and metadataTree() properties.
  	 *
  	 * @param cubeName the name of the cube.
  	 */
  def setCube(cubeName: String): js.Object = js.native
  /**
  	 * Sets the current measure group for the data source and updates the measureGroup() and metadataTree() properties.
  	 *             Even though the catalogs/cubes/measureGroups items are cascading(e.g. in order to load the cubes a catalog has to be set) in order to construct the metadata tree a measure group is not required as it just filters the resulting metadata.
  	 *             Once setCube(cubeName) is called the metadata tree would be loaded and the measureGroup() property would be filled with the default '(All)' measure group which indicates that no measure group is selected.
  	 *
  	 * @param measureGroupName the name of the measure group.
  	 */
  def setMeasureGroup(measureGroupName: String): js.Object = js.native
  /**
  	 * Sets the index at which the measure list will be positioned in the rows/columns it resides.
  	 *
  	 * @param index the index where measure list to appear.
  	 */
  def setMeasureListIndex(index: Double): Unit = js.native
  /**
  	 * Sets the location of the measure list.
  	 *
  	 * @param location accepted values are 'rows' and 'columns'.
  	 */
  def setMeasureListLocation(location: js.Object): Unit = js.native
  /**
  	 * Performs an update with the list of pending changes and updates the data source result.
  	 */
  def update(): js.Object = js.native
}

object OlapXmlaDataSource {
  @scala.inline
  def apply(
    addColumnItem: js.Object => Unit,
    addFilterItem: js.Object => Unit,
    addFilterMember: (String, String) => Unit,
    addMeasureItem: js.Object => Unit,
    addRowItem: js.Object => Unit,
    catalog: () => js.Object,
    catalogs: () => js.Array[_],
    clearPendingChanges: () => Unit,
    collapseTupleMember: (String, Double, Double) => Unit,
    columnAxis: () => js.Array[_],
    cube: () => js.Object,
    cubes: () => js.Array[_],
    expandTupleMember: (String, Double, Double) => Unit,
    filters: () => js.Array[_],
    getCoreElement: (js.Function, js.Object) => js.Object,
    getCoreElements: (js.Function, js.Object) => js.Object,
    getDimension: String => js.Object,
    getFilterMemberNames: String => js.Array[_],
    getHierarchy: String => js.Object,
    getLevel: String => js.Object,
    getMeasure: String => js.Object,
    getMeasureList: () => js.Object,
    getMembersOfHierarchy: String => Unit,
    getMembersOfLevel: String => Unit,
    getMembersOfMember: String => Unit,
    initialize: () => js.Object,
    isInitialized: () => Boolean,
    isModified: () => Boolean,
    isUpdating: () => Boolean,
    measureGroup: () => js.Object,
    measureGroups: () => js.Array[_],
    measures: () => js.Array[_],
    metadataTree: () => js.Object,
    removeAllFilterMembers: String => Unit,
    removeColumnItem: js.Object => Unit,
    removeFilterItem: js.Object => Unit,
    removeFilterMember: (String, String) => Unit,
    removeMeasureItem: js.Object => Unit,
    removeRowItem: js.Object => Unit,
    result: () => js.Object,
    rowAxis: () => js.Array[_],
    setCatalog: String => js.Object,
    setCube: String => js.Object,
    setMeasureGroup: String => js.Object,
    setMeasureListIndex: Double => Unit,
    setMeasureListLocation: js.Object => Unit,
    update: () => js.Object
  ): OlapXmlaDataSource = {
    val __obj = js.Dynamic.literal(addColumnItem = js.Any.fromFunction1(addColumnItem), addFilterItem = js.Any.fromFunction1(addFilterItem), addFilterMember = js.Any.fromFunction2(addFilterMember), addMeasureItem = js.Any.fromFunction1(addMeasureItem), addRowItem = js.Any.fromFunction1(addRowItem), catalog = js.Any.fromFunction0(catalog), catalogs = js.Any.fromFunction0(catalogs), clearPendingChanges = js.Any.fromFunction0(clearPendingChanges), collapseTupleMember = js.Any.fromFunction3(collapseTupleMember), columnAxis = js.Any.fromFunction0(columnAxis), cube = js.Any.fromFunction0(cube), cubes = js.Any.fromFunction0(cubes), expandTupleMember = js.Any.fromFunction3(expandTupleMember), filters = js.Any.fromFunction0(filters), getCoreElement = js.Any.fromFunction2(getCoreElement), getCoreElements = js.Any.fromFunction2(getCoreElements), getDimension = js.Any.fromFunction1(getDimension), getFilterMemberNames = js.Any.fromFunction1(getFilterMemberNames), getHierarchy = js.Any.fromFunction1(getHierarchy), getLevel = js.Any.fromFunction1(getLevel), getMeasure = js.Any.fromFunction1(getMeasure), getMeasureList = js.Any.fromFunction0(getMeasureList), getMembersOfHierarchy = js.Any.fromFunction1(getMembersOfHierarchy), getMembersOfLevel = js.Any.fromFunction1(getMembersOfLevel), getMembersOfMember = js.Any.fromFunction1(getMembersOfMember), initialize = js.Any.fromFunction0(initialize), isInitialized = js.Any.fromFunction0(isInitialized), isModified = js.Any.fromFunction0(isModified), isUpdating = js.Any.fromFunction0(isUpdating), measureGroup = js.Any.fromFunction0(measureGroup), measureGroups = js.Any.fromFunction0(measureGroups), measures = js.Any.fromFunction0(measures), metadataTree = js.Any.fromFunction0(metadataTree), removeAllFilterMembers = js.Any.fromFunction1(removeAllFilterMembers), removeColumnItem = js.Any.fromFunction1(removeColumnItem), removeFilterItem = js.Any.fromFunction1(removeFilterItem), removeFilterMember = js.Any.fromFunction2(removeFilterMember), removeMeasureItem = js.Any.fromFunction1(removeMeasureItem), removeRowItem = js.Any.fromFunction1(removeRowItem), result = js.Any.fromFunction0(result), rowAxis = js.Any.fromFunction0(rowAxis), setCatalog = js.Any.fromFunction1(setCatalog), setCube = js.Any.fromFunction1(setCube), setMeasureGroup = js.Any.fromFunction1(setMeasureGroup), setMeasureListIndex = js.Any.fromFunction1(setMeasureListIndex), setMeasureListLocation = js.Any.fromFunction1(setMeasureListLocation), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[OlapXmlaDataSource]
  }
  @scala.inline
  implicit class OlapXmlaDataSourceOps[Self <: OlapXmlaDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddColumnItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColumnItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFilterItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFilterMember(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterMember")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddMeasureItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMeasureItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRowItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCatalog(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCatalogs(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearPendingChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPendingChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapseTupleMember(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTupleMember")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withColumnAxis(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCube(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCubes(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandTupleMember(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTupleMember")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFilters(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCoreElement(value: (js.Function, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoreElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCoreElements(value: (js.Function, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoreElements")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDimension(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFilterMemberNames(value: String => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterMemberNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHierarchy(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHierarchy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLevel(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMeasure(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeasure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMeasureList(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeasureList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMembersOfHierarchy(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembersOfHierarchy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMembersOfLevel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembersOfLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMembersOfMember(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembersOfMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInitialized(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsModified(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUpdating(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdating")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMeasureGroup(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMeasureGroups(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMeasures(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetadataTree(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAllFilterMembers(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllFilterMembers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveColumnItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeColumnItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveFilterItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilterItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveFilterMember(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilterMember")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveMeasureItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMeasureItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRowItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResult(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowAxis(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCatalog(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCatalog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCube(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCube")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMeasureGroup(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMeasureGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMeasureListIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMeasureListIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMeasureListLocation(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMeasureListLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

