package typingsSlinky.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object service {
  
  @js.native
  trait IDomUtilityService extends StObject {
    
    def AssignGridContainers(
      $scope: IGridScope,
      rootel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
      grid: IGridInstance
    ): Unit = js.native
    
    def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit = js.native
    
    var LetterW: Double = js.native
    
    def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit = js.native
    
    var ScrollH: Double = js.native
    
    var ScrollW: Double = js.native
    
    def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit = js.native
    
    def digest($scope: IGridScope): Unit = js.native
    
    var eventStorage: js.Any = js.native
    
    def getRealWidth(obj: IDimension): Double = js.native
    
    var immediate: Double = js.native
    
    var numberOfGrids: Double = js.native
    
    def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit = js.native
    
    def setStyleText(grid: IGridInstance, css: String): Unit = js.native
  }
  object IDomUtilityService {
    
    @scala.inline
    def apply(
      AssignGridContainers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit,
      BuildStyles: (IGridScope, IGridInstance, Boolean) => Unit,
      LetterW: Double,
      RebuildGrid: (IGridScope, IGridInstance) => Unit,
      ScrollH: Double,
      ScrollW: Double,
      UpdateGridLayout: (IGridScope, IGridInstance) => Unit,
      digest: IGridScope => Unit,
      eventStorage: js.Any,
      getRealWidth: IDimension => Double,
      immediate: Double,
      numberOfGrids: Double,
      setColLeft: (IColumn, Double, IGridInstance) => Unit,
      setStyleText: (IGridInstance, String) => Unit
    ): IDomUtilityService = {
      val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3(AssignGridContainers), BuildStyles = js.Any.fromFunction3(BuildStyles), LetterW = LetterW.asInstanceOf[js.Any], RebuildGrid = js.Any.fromFunction2(RebuildGrid), ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], UpdateGridLayout = js.Any.fromFunction2(UpdateGridLayout), digest = js.Any.fromFunction1(digest), eventStorage = eventStorage.asInstanceOf[js.Any], getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any], setColLeft = js.Any.fromFunction3(setColLeft), setStyleText = js.Any.fromFunction2(setStyleText))
      __obj.asInstanceOf[IDomUtilityService]
    }
    
    @scala.inline
    implicit class IDomUtilityServiceMutableBuilder[Self <: IDomUtilityService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignGridContainers(
        value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit
      ): Self = StObject.set(x, "AssignGridContainers", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBuildStyles(value: (IGridScope, IGridInstance, Boolean) => Unit): Self = StObject.set(x, "BuildStyles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDigest(value: IGridScope => Unit): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventStorage(value: js.Any): Self = StObject.set(x, "eventStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetRealWidth(value: IDimension => Double): Self = StObject.set(x, "getRealWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImmediate(value: Double): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterW(value: Double): Self = StObject.set(x, "LetterW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfGrids(value: Double): Self = StObject.set(x, "numberOfGrids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebuildGrid(value: (IGridScope, IGridInstance) => Unit): Self = StObject.set(x, "RebuildGrid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScrollH(value: Double): Self = StObject.set(x, "ScrollH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollW(value: Double): Self = StObject.set(x, "ScrollW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetColLeft(value: (IColumn, Double, IGridInstance) => Unit): Self = StObject.set(x, "setColLeft", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetStyleText(value: (IGridInstance, String) => Unit): Self = StObject.set(x, "setStyleText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateGridLayout(value: (IGridScope, IGridInstance) => Unit): Self = StObject.set(x, "UpdateGridLayout", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ISortInfo extends StObject {
    
    var fields: js.Array[String] = js.native
  }
  object ISortInfo {
    
    @scala.inline
    def apply(fields: js.Array[String]): ISortInfo = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISortInfo]
    }
    
    @scala.inline
    implicit class ISortInfoMutableBuilder[Self <: ISortInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ISortService extends StObject {
    
    def Sort(sortInfo: ISortInfo, data: js.Any): Unit = js.native
    
    def basicSort(a: js.Any, b: js.Any): Double = js.native
    
    var colSortFnCache: js.Any = js.native
    
    def getSortFn(col: IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    
    def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
    
    var isCustomSort: Boolean = js.native
    
    var isSorting: Boolean = js.native
    
    def sortAlpha(a: String, b: String): Double = js.native
    
    def sortBool(a: Boolean, b: Boolean): Double = js.native
    
    def sortData(sortInfo: ISortInfo, data: js.Any): Unit = js.native
    
    def sortDate(a: js.Date, b: js.Date): Double = js.native
    
    def sortNumber(a: Double, b: Double): Double = js.native
    
    def sortNumberStr(a: String, b: String): Double = js.native
  }
  object ISortService {
    
    @scala.inline
    def apply(
      Sort: (ISortInfo, js.Any) => Unit,
      basicSort: (js.Any, js.Any) => Double,
      colSortFnCache: js.Any,
      getSortFn: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
      guessSortFn: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
      isCustomSort: Boolean,
      isSorting: Boolean,
      sortAlpha: (String, String) => Double,
      sortBool: (Boolean, Boolean) => Double,
      sortData: (ISortInfo, js.Any) => Unit,
      sortDate: (js.Date, js.Date) => Double,
      sortNumber: (Double, Double) => Double,
      sortNumberStr: (String, String) => Double
    ): ISortService = {
      val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2(Sort), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache.asInstanceOf[js.Any], getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort.asInstanceOf[js.Any], isSorting = isSorting.asInstanceOf[js.Any], sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2(sortData), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
      __obj.asInstanceOf[ISortService]
    }
    
    @scala.inline
    implicit class ISortServiceMutableBuilder[Self <: ISortService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasicSort(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "basicSort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setColSortFnCache(value: js.Any): Self = StObject.set(x, "colSortFnCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSortFn(value: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = StObject.set(x, "getSortFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGuessSortFn(value: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = StObject.set(x, "guessSortFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCustomSort(value: Boolean): Self = StObject.set(x, "isCustomSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSorting(value: Boolean): Self = StObject.set(x, "isSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: (ISortInfo, js.Any) => Unit): Self = StObject.set(x, "Sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortAlpha(value: (String, String) => Double): Self = StObject.set(x, "sortAlpha", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortBool(value: (Boolean, Boolean) => Double): Self = StObject.set(x, "sortBool", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortData(value: (ISortInfo, js.Any) => Unit): Self = StObject.set(x, "sortData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortDate(value: (js.Date, js.Date) => Double): Self = StObject.set(x, "sortDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortNumber(value: (Double, Double) => Double): Self = StObject.set(x, "sortNumber", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortNumberStr(value: (String, String) => Double): Self = StObject.set(x, "sortNumberStr", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IUtilityService extends StObject {
    
    def endsWith(str: String, suffix: String): Boolean = js.native
    
    def evalProperty(entity: js.Any, path: String): js.Any = js.native
    
    def forIn(obj: js.Any, action: js.Function2[/* value */ js.Any, /* property */ String, js.Object]): Unit = js.native
    
    def getElementsByClassName(cl: String): js.Array[_] = js.native
    
    def getInstanceType(o: js.Any): String = js.native
    
    def isNullOrUndefined(obj: js.Any): Boolean = js.native
    
    def newId(): String = js.native
    
    def seti18n($scope: IGridScope, language: String): Unit = js.native
    
    def visualLength(node: js.Any): Double = js.native
  }
  object IUtilityService {
    
    @scala.inline
    def apply(
      endsWith: (String, String) => Boolean,
      evalProperty: (js.Any, String) => js.Any,
      forIn: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit,
      getElementsByClassName: String => js.Array[_],
      getInstanceType: js.Any => String,
      isNullOrUndefined: js.Any => Boolean,
      newId: () => String,
      seti18n: (IGridScope, String) => Unit,
      visualLength: js.Any => Double
    ): IUtilityService = {
      val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction2(endsWith), evalProperty = js.Any.fromFunction2(evalProperty), forIn = js.Any.fromFunction2(forIn), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getInstanceType = js.Any.fromFunction1(getInstanceType), isNullOrUndefined = js.Any.fromFunction1(isNullOrUndefined), newId = js.Any.fromFunction0(newId), seti18n = js.Any.fromFunction2(seti18n), visualLength = js.Any.fromFunction1(visualLength))
      __obj.asInstanceOf[IUtilityService]
    }
    
    @scala.inline
    implicit class IUtilityServiceMutableBuilder[Self <: IUtilityService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndsWith(value: (String, String) => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalProperty(value: (js.Any, String) => js.Any): Self = StObject.set(x, "evalProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForIn(value: (js.Any, js.Function2[/* value */ js.Any, /* property */ String, js.Object]) => Unit): Self = StObject.set(x, "forIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetElementsByClassName(value: String => js.Array[_]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetInstanceType(value: js.Any => String): Self = StObject.set(x, "getInstanceType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNullOrUndefined(value: js.Any => Boolean): Self = StObject.set(x, "isNullOrUndefined", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeti18n(value: (IGridScope, String) => Unit): Self = StObject.set(x, "seti18n", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisualLength(value: js.Any => Double): Self = StObject.set(x, "visualLength", js.Any.fromFunction1(value))
    }
  }
}
