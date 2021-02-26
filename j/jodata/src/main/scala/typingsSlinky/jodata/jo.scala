package typingsSlinky.jodata

import typingsSlinky.jodata.jo.ExpandSettings
import typingsSlinky.jodata.jo.FilterClause
import typingsSlinky.jodata.jo.FormatOptions
import typingsSlinky.jodata.jo.FormatSettings
import typingsSlinky.jodata.jo.InlineCountOptions
import typingsSlinky.jodata.jo.InlineCountSettings
import typingsSlinky.jodata.jo.OrderBySettings
import typingsSlinky.jodata.jo.PrecedenceGroup
import typingsSlinky.jodata.jo.SelectSettings
import typingsSlinky.jodata.jo.SkipSettings
import typingsSlinky.jodata.jo.TopSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jo extends StObject {
  
  var ExpandSettings: ExpandSettings = js.native
  
  var FilterSettings: InlineCountSettings = js.native
  
  var FormatSettings: FormatSettings = js.native
  
  var InlineCountSettings: InlineCountSettings = js.native
  
  var OrderBySettings: OrderBySettings = js.native
  
  var SelectSettings: SelectSettings = js.native
  
  var SkipSettings: SkipSettings = js.native
  
  var TopSettings: TopSettings = js.native
  
  def andFilter(filterClause: FilterClause): jo = js.native
  def andFilter(filterClause: PrecedenceGroup): jo = js.native
  
  def asc(): jo = js.native
  
  var baseUri: String = js.native
  
  def captureFilter(): Unit = js.native
  
  var currentHashRoute: String = js.native
  
  def defaultAndFilter(filterClause: FilterClause): jo = js.native
  
  def defaultFilter(filterClause: FilterClause): jo = js.native
  
  def defaultOrFilter(filterClause: FilterClause): jo = js.native
  
  def desc(): jo = js.native
  
  def expand(expand: String): jo = js.native
  
  // Filter
  def filter(filterClause: FilterClause): jo = js.native
  def filter(filterClause: PrecedenceGroup): jo = js.native
  
  // Format
  def format(): FormatOptions = js.native
  
  def formatDefault(): FormatOptions = js.native
  
  // Inline count
  def inlineCount(): InlineCountOptions = js.native
  
  def inlineCountDefault(): InlineCountOptions = js.native
  
  def orFilter(filterClause: FilterClause): jo = js.native
  def orFilter(filterClause: PrecedenceGroup): jo = js.native
  
  def orderBy(property: String): jo = js.native
  
  def removeFilter(property: String): jo = js.native
  
  def resetExpand(): jo = js.native
  
  def resetFilter(): jo = js.native
  
  def resetFormat(): Unit = js.native
  
  def resetInlineCount(): Unit = js.native
  
  def resetOrderBy(): jo = js.native
  
  def resetSelect(): jo = js.native
  
  def resetSkip(): jo = js.native
  
  def resetToCapturedFilter(): jo = js.native
  
  def resetTop(): jo = js.native
  
  def saveLocal(): Unit = js.native
  def saveLocal(key: String): Unit = js.native
  
  def select(select: js.Array[String]): jo = js.native
  
  // Expand
  def setExpandDefault(expand: String): jo = js.native
  
  // Order by
  def setOrderByDefault(property: String): jo = js.native
  def setOrderByDefault(property: String, order: String): jo = js.native
  
  // Select
  def setSelectDefault(select: js.Array[String]): jo = js.native
  
  // Skip
  def setSkipDefault(skip: Double): jo = js.native
  
  // Top
  def setTopDefault(top: Double): jo = js.native
  
  def skip(skip: Double): jo = js.native
  
  def toJson(): String = js.native
  
  def toggleOrderBy(property: String): jo = js.native
  def toggleOrderBy(property: String, callback: js.Function): jo = js.native
  
  def top(top: Double): jo = js.native
  
  def updateHashRoute(hashRoute: String): Unit = js.native
}
object jo {
  
  @js.native
  trait Concat extends StObject {
    
    var LeftSide: String | Concat = js.native
    
    var RightSide: String | Concat = js.native
  }
  object Concat {
    
    @scala.inline
    def apply(LeftSide: String | Concat, RightSide: String | Concat): Concat = {
      val __obj = js.Dynamic.literal(LeftSide = LeftSide.asInstanceOf[js.Any], RightSide = RightSide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Concat]
    }
    
    @scala.inline
    implicit class ConcatMutableBuilder[Self <: Concat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeftSide(value: String | Concat): Self = StObject.set(x, "LeftSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightSide(value: String | Concat): Self = StObject.set(x, "RightSide", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExpandSettings extends ISettings {
    
    var DefaultExpand: String = js.native
    
    var Expand: String = js.native
  }
  object ExpandSettings {
    
    @scala.inline
    def apply(DefaultExpand: String, Expand: String, isSet: () => Boolean, reset: () => Unit): ExpandSettings = {
      val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand.asInstanceOf[js.Any], Expand = Expand.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[ExpandSettings]
    }
    
    @scala.inline
    implicit class ExpandSettingsMutableBuilder[Self <: ExpandSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultExpand(value: String): Self = StObject.set(x, "DefaultExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpand(value: String): Self = StObject.set(x, "Expand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilterClause extends StObject {
    
    var Components: js.Array[String] = js.native
    
    // Concat
    def Concat(concat: typingsSlinky.jodata.jo.Concat): FilterClause = js.native
    
    var FuncReturnType: js.Any = js.native
    
    var IsClauseEmpty: Boolean = js.native
    
    var Property: String = js.native
    
    var PropertyIncluded: Boolean = js.native
    
    var UsingNot: Boolean = js.native
    
    var Value: js.Any = js.native
    
    // Arithmetic methods
    def add(amount: Double): FilterClause = js.native
    
    def ceiling(): FilterClause = js.native
    
    // Date functions
    def day(): FilterClause = js.native
    
    def div(amount: Double): FilterClause = js.native
    
    def endswith(value: String): FilterClause = js.native
    
    // Logical operators
    def eq(value: String): FilterClause = js.native
    def eq(value: Boolean): FilterClause = js.native
    def eq(value: Double): FilterClause = js.native
    
    def floor(): FilterClause = js.native
    
    def ge(value: String): FilterClause = js.native
    def ge(value: Boolean): FilterClause = js.native
    def ge(value: Double): FilterClause = js.native
    
    def gt(value: String): FilterClause = js.native
    def gt(value: Boolean): FilterClause = js.native
    def gt(value: Double): FilterClause = js.native
    
    def hour(): FilterClause = js.native
    
    def indexof(value: String): FilterClause = js.native
    
    def isEmpty(): Boolean = js.native
    
    def le(value: String): FilterClause = js.native
    def le(value: Boolean): FilterClause = js.native
    def le(value: Double): FilterClause = js.native
    
    def length(): FilterClause = js.native
    
    def lt(value: String): FilterClause = js.native
    def lt(value: Boolean): FilterClause = js.native
    def lt(value: Double): FilterClause = js.native
    
    def minute(): FilterClause = js.native
    
    def mod(amount: Double): FilterClause = js.native
    
    def month(): FilterClause = js.native
    
    def mul(amount: Double): FilterClause = js.native
    
    def ne(value: String): FilterClause = js.native
    def ne(value: Boolean): FilterClause = js.native
    def ne(value: Double): FilterClause = js.native
    
    def not(): FilterClause = js.native
    
    def replace(find: String, replace: String): FilterClause = js.native
    
    // Math functions
    def round(): FilterClause = js.native
    
    def second(): FilterClause = js.native
    
    def startswith(value: String): FilterClause = js.native
    
    def sub(amount: Double): FilterClause = js.native
    
    def substring(position: Double): FilterClause = js.native
    def substring(position: Double, length: Double): FilterClause = js.native
    
    // String functions
    def substringof(value: String): FilterClause = js.native
    
    def toLower(): FilterClause = js.native
    
    def toUpper(): FilterClause = js.native
    
    var transformFunc: js.Function = js.native
    
    def trim(): FilterClause = js.native
    
    def year(): FilterClause = js.native
  }
  
  @js.native
  trait FilterSettings extends ISettings {
    
    var CapturedFilter: js.Array[FilterClause] = js.native
    
    var DefaultFilters: js.Array[FilterClause] = js.native
    
    var Filters: js.Array[FilterClause] = js.native
    
    def fullReset(): Unit = js.native
    
    def loadFromJson(filterSettings: js.Any): Unit = js.native
  }
  object FilterSettings {
    
    @scala.inline
    def apply(
      CapturedFilter: js.Array[FilterClause],
      DefaultFilters: js.Array[FilterClause],
      Filters: js.Array[FilterClause],
      fullReset: () => Unit,
      isSet: () => Boolean,
      loadFromJson: js.Any => Unit,
      reset: () => Unit
    ): FilterSettings = {
      val __obj = js.Dynamic.literal(CapturedFilter = CapturedFilter.asInstanceOf[js.Any], DefaultFilters = DefaultFilters.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], fullReset = js.Any.fromFunction0(fullReset), isSet = js.Any.fromFunction0(isSet), loadFromJson = js.Any.fromFunction1(loadFromJson), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[FilterSettings]
    }
    
    @scala.inline
    implicit class FilterSettingsMutableBuilder[Self <: FilterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapturedFilter(value: js.Array[FilterClause]): Self = StObject.set(x, "CapturedFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapturedFilterVarargs(value: FilterClause*): Self = StObject.set(x, "CapturedFilter", js.Array(value :_*))
      
      @scala.inline
      def setDefaultFilters(value: js.Array[FilterClause]): Self = StObject.set(x, "DefaultFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFiltersVarargs(value: FilterClause*): Self = StObject.set(x, "DefaultFilters", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[FilterClause]): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: FilterClause*): Self = StObject.set(x, "Filters", js.Array(value :_*))
      
      @scala.inline
      def setFullReset(value: () => Unit): Self = StObject.set(x, "fullReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadFromJson(value: js.Any => Unit): Self = StObject.set(x, "loadFromJson", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FormatOptions extends StObject {
    
    def atom(): jo = js.native
    
    def custom(value: String): jo = js.native
    
    def json(): jo = js.native
    
    def xml(): jo = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(atom: () => jo, custom: String => jo, json: () => jo, xml: () => jo): FormatOptions = {
      val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtom(value: () => jo): Self = StObject.set(x, "atom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCustom(value: String => jo): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJson(value: () => jo): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      @scala.inline
      def setXml(value: () => jo): Self = StObject.set(x, "xml", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FormatSettings extends ISettings {
    
    var DefaultFormat: String = js.native
    
    var Format: String = js.native
  }
  object FormatSettings {
    
    @scala.inline
    def apply(DefaultFormat: String, Format: String, isSet: () => Boolean, reset: () => Unit): FormatSettings = {
      val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[FormatSettings]
    }
    
    @scala.inline
    implicit class FormatSettingsMutableBuilder[Self <: FormatSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultFormat(value: String): Self = StObject.set(x, "DefaultFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO What is the most appropriate place for these interfaces?
  // They are only required by the `jo` class.
  @js.native
  trait ISettings extends StObject {
    
    def isSet(): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  object ISettings {
    
    @scala.inline
    def apply(isSet: () => Boolean, reset: () => Unit): ISettings = {
      val __obj = js.Dynamic.literal(isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[ISettings]
    }
    
    @scala.inline
    implicit class ISettingsMutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSet(value: () => Boolean): Self = StObject.set(x, "isSet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait InlineCountOptions extends StObject {
    
    def allPages(): jo = js.native
    
    def none(): jo = js.native
  }
  object InlineCountOptions {
    
    @scala.inline
    def apply(allPages: () => jo, none: () => jo): InlineCountOptions = {
      val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
      __obj.asInstanceOf[InlineCountOptions]
    }
    
    @scala.inline
    implicit class InlineCountOptionsMutableBuilder[Self <: InlineCountOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllPages(value: () => jo): Self = StObject.set(x, "allPages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNone(value: () => jo): Self = StObject.set(x, "none", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait InlineCountSettings extends ISettings {
    
    var DefaultInlineCount: String = js.native
    
    var InlineCount: String = js.native
  }
  object InlineCountSettings {
    
    @scala.inline
    def apply(DefaultInlineCount: String, InlineCount: String, isSet: () => Boolean, reset: () => Unit): InlineCountSettings = {
      val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount.asInstanceOf[js.Any], InlineCount = InlineCount.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[InlineCountSettings]
    }
    
    @scala.inline
    implicit class InlineCountSettingsMutableBuilder[Self <: InlineCountSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultInlineCount(value: String): Self = StObject.set(x, "DefaultInlineCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineCount(value: String): Self = StObject.set(x, "InlineCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrderBySettings extends ISettings {
    
    var DefaultOrder: String = js.native
    
    var DefaultProperty: String = js.native
    
    var Order: String = js.native
    
    var Property: String = js.native
  }
  object OrderBySettings {
    
    @scala.inline
    def apply(
      DefaultOrder: String,
      DefaultProperty: String,
      Order: String,
      Property: String,
      isSet: () => Boolean,
      reset: () => Unit
    ): OrderBySettings = {
      val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder.asInstanceOf[js.Any], DefaultProperty = DefaultProperty.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[OrderBySettings]
    }
    
    @scala.inline
    implicit class OrderBySettingsMutableBuilder[Self <: OrderBySettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOrder(value: String): Self = StObject.set(x, "DefaultOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProperty(value: String): Self = StObject.set(x, "DefaultProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrecedenceGroup extends StObject {
    
    def andFilter(filterClause: FilterClause): FilterClause = js.native
    
    def orFilter(filterClause: FilterClause): FilterClause = js.native
  }
  object PrecedenceGroup {
    
    @scala.inline
    def apply(andFilter: FilterClause => FilterClause, orFilter: FilterClause => FilterClause): PrecedenceGroup = {
      val __obj = js.Dynamic.literal(andFilter = js.Any.fromFunction1(andFilter), orFilter = js.Any.fromFunction1(orFilter))
      __obj.asInstanceOf[PrecedenceGroup]
    }
    
    @scala.inline
    implicit class PrecedenceGroupMutableBuilder[Self <: PrecedenceGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndFilter(value: FilterClause => FilterClause): Self = StObject.set(x, "andFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrFilter(value: FilterClause => FilterClause): Self = StObject.set(x, "orFilter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SelectSettings extends ISettings {
    
    var DefaultSelect: js.Array[String] = js.native
    
    var Select: js.Array[String] = js.native
  }
  object SelectSettings {
    
    @scala.inline
    def apply(DefaultSelect: js.Array[String], Select: js.Array[String], isSet: () => Boolean, reset: () => Unit): SelectSettings = {
      val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[SelectSettings]
    }
    
    @scala.inline
    implicit class SelectSettingsMutableBuilder[Self <: SelectSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSelect(value: js.Array[String]): Self = StObject.set(x, "DefaultSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectVarargs(value: String*): Self = StObject.set(x, "DefaultSelect", js.Array(value :_*))
      
      @scala.inline
      def setSelect(value: js.Array[String]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectVarargs(value: String*): Self = StObject.set(x, "Select", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SkipSettings extends ISettings {
    
    var DefaultSkip: Double = js.native
    
    var Skip: Double = js.native
  }
  object SkipSettings {
    
    @scala.inline
    def apply(DefaultSkip: Double, Skip: Double, isSet: () => Boolean, reset: () => Unit): SkipSettings = {
      val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip.asInstanceOf[js.Any], Skip = Skip.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[SkipSettings]
    }
    
    @scala.inline
    implicit class SkipSettingsMutableBuilder[Self <: SkipSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSkip(value: Double): Self = StObject.set(x, "DefaultSkip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "Skip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopSettings extends ISettings {
    
    var DefaultTop: Double = js.native
    
    var Top: Double = js.native
  }
  object TopSettings {
    
    @scala.inline
    def apply(DefaultTop: Double, Top: Double, isSet: () => Boolean, reset: () => Unit): TopSettings = {
      val __obj = js.Dynamic.literal(DefaultTop = DefaultTop.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[TopSettings]
    }
    
    @scala.inline
    implicit class TopSettingsMutableBuilder[Self <: TopSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTop(value: Double): Self = StObject.set(x, "DefaultTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    }
  }
}
