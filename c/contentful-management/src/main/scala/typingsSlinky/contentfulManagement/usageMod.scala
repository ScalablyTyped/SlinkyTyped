package typingsSlinky.contentfulManagement

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.anon.EndAt
import typingsSlinky.contentfulManagement.anon.MetaSysPropsorganizations
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.commonTypesMod.DefaultElements
import typingsSlinky.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @JSImport("contentful-management/dist/typings/entities/usage", "wrapUsage")
  @js.native
  def wrapUsage(http: AxiosInstance, data: UsageProps): Usage = js.native
  
  @JSImport("contentful-management/dist/typings/entities/usage", "wrapUsageCollection")
  @js.native
  def wrapUsageCollection(http: AxiosInstance, data: CollectionProp[UsageProps]): Collection[Usage, UsageProps] = js.native
  
  @js.native
  trait Usage
    extends UsageProps
       with DefaultElements[UsageProps]
  object Usage {
    
    @scala.inline
    def apply(
      dateRange: EndAt,
      metric: UsageMetricEnum,
      sys: MetaSysPropsorganizations,
      toPlainObject: () => UsageProps,
      unitOfMeasure: String,
      usage: Double,
      usagePerDay: StringDictionary[Double]
    ): Usage = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Usage]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.contentfulManagement.contentfulManagementStrings.cda
    - typingsSlinky.contentfulManagement.contentfulManagementStrings.cma
    - typingsSlinky.contentfulManagement.contentfulManagementStrings.cpa
    - typingsSlinky.contentfulManagement.contentfulManagementStrings.gql
  */
  trait UsageMetricEnum extends StObject
  object UsageMetricEnum {
    
    @scala.inline
    def cda: typingsSlinky.contentfulManagement.contentfulManagementStrings.cda = "cda".asInstanceOf[typingsSlinky.contentfulManagement.contentfulManagementStrings.cda]
    
    @scala.inline
    def cma: typingsSlinky.contentfulManagement.contentfulManagementStrings.cma = "cma".asInstanceOf[typingsSlinky.contentfulManagement.contentfulManagementStrings.cma]
    
    @scala.inline
    def cpa: typingsSlinky.contentfulManagement.contentfulManagementStrings.cpa = "cpa".asInstanceOf[typingsSlinky.contentfulManagement.contentfulManagementStrings.cpa]
    
    @scala.inline
    def gql: typingsSlinky.contentfulManagement.contentfulManagementStrings.gql = "gql".asInstanceOf[typingsSlinky.contentfulManagement.contentfulManagementStrings.gql]
  }
  
  @js.native
  trait UsageProps extends StObject {
    
    /**
      * Range of usage
      */
    var dateRange: EndAt = js.native
    
    /**
      * Type of usage
      */
    var metric: UsageMetricEnum = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysPropsorganizations = js.native
    
    /**
      * Unit of usage metric
      */
    var unitOfMeasure: String = js.native
    
    /**
      * Value of the usage
      */
    var usage: Double = js.native
    
    /**
      * Usage per day
      */
    var usagePerDay: StringDictionary[Double] = js.native
  }
  object UsageProps {
    
    @scala.inline
    def apply(
      dateRange: EndAt,
      metric: UsageMetricEnum,
      sys: MetaSysPropsorganizations,
      unitOfMeasure: String,
      usage: Double,
      usagePerDay: StringDictionary[Double]
    ): UsageProps = {
      val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageProps]
    }
    
    @scala.inline
    implicit class UsagePropsMutableBuilder[Self <: UsageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateRange(value: EndAt): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetric(value: UsageMetricEnum): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropsorganizations): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsagePerDay(value: StringDictionary[Double]): Self = StObject.set(x, "usagePerDay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UsageQuery extends QueryOptions {
    
    @JSName("dateRange.endAt")
    var dateRangeDotendAt: js.UndefOr[String] = js.native
    
    @JSName("dateRange.startAt")
    var dateRangeDotstartAt: js.UndefOr[String] = js.native
    
    var `metric[in]`: js.UndefOr[String] = js.native
  }
  object UsageQuery {
    
    @scala.inline
    def apply(): UsageQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsageQuery]
    }
    
    @scala.inline
    implicit class UsageQueryMutableBuilder[Self <: UsageQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateRangeDotendAt(value: String): Self = StObject.set(x, "dateRange.endAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeDotendAtUndefined: Self = StObject.set(x, "dateRange.endAt", js.undefined)
      
      @scala.inline
      def setDateRangeDotstartAt(value: String): Self = StObject.set(x, "dateRange.startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeDotstartAtUndefined: Self = StObject.set(x, "dateRange.startAt", js.undefined)
      
      @scala.inline
      def `setMetric[in]`(value: String): Self = StObject.set(x, "metric[in]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMetric[in]Undefined`: Self = StObject.set(x, "metric[in]", js.undefined)
    }
  }
}
