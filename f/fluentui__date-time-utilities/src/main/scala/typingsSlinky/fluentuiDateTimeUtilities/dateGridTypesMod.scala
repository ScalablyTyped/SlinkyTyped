package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateGridTypesMod {
  
  @js.native
  trait IAvailableDateOptions extends IRestrictedDatesOptions {
    
    /** Direction of search (`1` - search in future / `-1` search in past) */
    var direction: Double = js.native
    
    /** Date from which we start the search */
    var initialDate: js.Date = js.native
    
    /** Ideal available date */
    var targetDate: js.Date = js.native
  }
  object IAvailableDateOptions {
    
    @scala.inline
    def apply(direction: Double, initialDate: js.Date, targetDate: js.Date): IAvailableDateOptions = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], initialDate = initialDate.asInstanceOf[js.Any], targetDate = targetDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAvailableDateOptions]
    }
    
    @scala.inline
    implicit class IAvailableDateOptionsMutableBuilder[Self <: IAvailableDateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDate(value: js.Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDate(value: js.Date): Self = StObject.set(x, "targetDate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDatepickerOptions extends IRestrictedDatesOptions {
    
    /**
      * The date range type indicating how  many days should be selected as the user
      * selects days
      */
    var dateRangeType: DateRangeType = js.native
    
    /**
      * The number of days to select while dateRangeType === DateRangeType.Day. Used in order to have multi-day
      * views.
      */
    var daysToSelectInDayView: js.UndefOr[Double] = js.native
    
    /**
      * The first day of the week for your locale.
      */
    var firstDayOfWeek: DayOfWeek = js.native
    
    /**
      * Defines when the first week of the year should start, FirstWeekOfYear.FirstDay,
      * FirstWeekOfYear.FirstFullWeek or FirstWeekOfYear.FirstFourDayWeek are the possible values
      */
    var firstWeekOfYear: FirstWeekOfYear = js.native
    
    /**
      * Which days in the generated grid should be marked.
      */
    var markedDays: js.UndefOr[js.Array[js.Date]] = js.native
    
    /**
      * Whether the calendar should show the week number (weeks 1 to 53) before each week row
      */
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    /**
      * Value of today. If null, current time in client machine will be used.
      */
    var today: js.UndefOr[js.Date] = js.native
    
    /**
      * The days that are selectable when `dateRangeType` is WorkWeek.
      * If `dateRangeType` is not WorkWeek this property does nothing.
      */
    var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  }
  object IDatepickerOptions {
    
    @scala.inline
    def apply(dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): IDatepickerOptions = {
      val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatepickerOptions]
    }
    
    @scala.inline
    implicit class IDatepickerOptionsMutableBuilder[Self <: IDatepickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateRangeType(value: DateRangeType): Self = StObject.set(x, "dateRangeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysToSelectInDayView(value: Double): Self = StObject.set(x, "daysToSelectInDayView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysToSelectInDayViewUndefined: Self = StObject.set(x, "daysToSelectInDayView", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstWeekOfYear(value: FirstWeekOfYear): Self = StObject.set(x, "firstWeekOfYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkedDays(value: js.Array[js.Date]): Self = StObject.set(x, "markedDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkedDaysUndefined: Self = StObject.set(x, "markedDays", js.undefined)
      
      @scala.inline
      def setMarkedDaysVarargs(value: js.Date*): Self = StObject.set(x, "markedDays", js.Array(value :_*))
      
      @scala.inline
      def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      @scala.inline
      def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      @scala.inline
      def setWorkWeekDays(value: js.Array[DayOfWeek]): Self = StObject.set(x, "workWeekDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkWeekDaysUndefined: Self = StObject.set(x, "workWeekDays", js.undefined)
      
      @scala.inline
      def setWorkWeekDaysVarargs(value: DayOfWeek*): Self = StObject.set(x, "workWeekDays", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IDay extends StObject {
    
    /** `Date.getDate()` value of current date */
    var date: String = js.native
    
    /** Is current date within restriction boundaries */
    var isInBounds: Boolean = js.native
    
    /** Is current date is in the same month as "today" date */
    var isInMonth: Boolean = js.native
    
    /** Is current date marked */
    var isMarked: Boolean = js.native
    
    /** Is current date is selected */
    var isSelected: Boolean = js.native
    
    /** Is current date is "today" date */
    var isToday: Boolean = js.native
    
    /** `Date.toString()` value of current date */
    var key: String = js.native
    
    /** `Date` object of current date */
    var originalDate: js.Date = js.native
  }
  object IDay {
    
    @scala.inline
    def apply(
      date: String,
      isInBounds: Boolean,
      isInMonth: Boolean,
      isMarked: Boolean,
      isSelected: Boolean,
      isToday: Boolean,
      key: String,
      originalDate: js.Date
    ): IDay = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isMarked = isMarked.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalDate = originalDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDay]
    }
    
    @scala.inline
    implicit class IDayMutableBuilder[Self <: IDay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInBounds(value: Boolean): Self = StObject.set(x, "isInBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInMonth(value: Boolean): Self = StObject.set(x, "isInMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMarked(value: Boolean): Self = StObject.set(x, "isMarked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalDate(value: js.Date): Self = StObject.set(x, "originalDate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDayGridOptions extends IDatepickerOptions {
    
    /**
      * The currently navigated date
      */
    var navigatedDate: js.Date = js.native
    
    /**
      * The currently selected date
      */
    var selectedDate: js.Date = js.native
    
    /**
      * How many weeks to show by default. If not provided, will show enough weeks to display the current
      * month, between 4 and 6 depending
      */
    var weeksToShow: js.UndefOr[Double] = js.native
  }
  object IDayGridOptions {
    
    @scala.inline
    def apply(
      dateRangeType: DateRangeType,
      firstDayOfWeek: DayOfWeek,
      firstWeekOfYear: FirstWeekOfYear,
      navigatedDate: js.Date,
      selectedDate: js.Date
    ): IDayGridOptions = {
      val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDayGridOptions]
    }
    
    @scala.inline
    implicit class IDayGridOptionsMutableBuilder[Self <: IDayGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavigatedDate(value: js.Date): Self = StObject.set(x, "navigatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksToShow(value: Double): Self = StObject.set(x, "weeksToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksToShowUndefined: Self = StObject.set(x, "weeksToShow", js.undefined)
    }
  }
  
  @js.native
  trait IRestrictedDatesOptions extends StObject {
    
    /**
      * If set the Calendar will not allow navigation to or selection of a date later than this value.
      */
    var maxDate: js.UndefOr[js.Date] = js.native
    
    /**
      * If set the Calendar will not allow navigation to or selection of a date earlier than this value.
      */
    var minDate: js.UndefOr[js.Date] = js.native
    
    /**
      * If set the Calendar will not allow selection of dates in this array.
      */
    var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.native
  }
  object IRestrictedDatesOptions {
    
    @scala.inline
    def apply(): IRestrictedDatesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRestrictedDatesOptions]
    }
    
    @scala.inline
    implicit class IRestrictedDatesOptionsMutableBuilder[Self <: IRestrictedDatesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setRestrictedDates(value: js.Array[js.Date]): Self = StObject.set(x, "restrictedDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictedDatesUndefined: Self = StObject.set(x, "restrictedDates", js.undefined)
      
      @scala.inline
      def setRestrictedDatesVarargs(value: js.Date*): Self = StObject.set(x, "restrictedDates", js.Array(value :_*))
    }
  }
}
