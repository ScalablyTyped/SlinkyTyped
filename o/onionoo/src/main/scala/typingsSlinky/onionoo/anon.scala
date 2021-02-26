package typingsSlinky.onionoo

import typingsSlinky.got.mod.GotPromise
import typingsSlinky.onionoo.mod.Onionoo.Bandwidth
import typingsSlinky.onionoo.mod.Onionoo.Clients
import typingsSlinky.onionoo.mod.Onionoo.Details
import typingsSlinky.onionoo.mod.Onionoo.Histogram
import typingsSlinky.onionoo.mod.Onionoo.QueryParameters
import typingsSlinky.onionoo.mod.Onionoo.Summary
import typingsSlinky.onionoo.mod.Onionoo.Uptime
import typingsSlinky.onionoo.mod.Onionoo.Weights
import typingsSlinky.onionoo.onionooStrings.bandwidth
import typingsSlinky.onionoo.onionooStrings.clients
import typingsSlinky.onionoo.onionooStrings.details
import typingsSlinky.onionoo.onionooStrings.summary
import typingsSlinky.onionoo.onionooStrings.uptime
import typingsSlinky.onionoo.onionooStrings.weights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Accept extends StObject {
    
    var accept: js.UndefOr[js.Array[String]] = js.native
    
    var reject: js.UndefOr[js.Array[String]] = js.native
  }
  object Accept {
    
    @scala.inline
    def apply(): Accept = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accept]
    }
    
    @scala.inline
    implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: js.Array[String]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAcceptVarargs(value: String*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setReject(value: js.Array[String]): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      @scala.inline
      def setRejectVarargs(value: String*): Self = StObject.set(x, "reject", js.Array(value :_*))
    }
  }
  
  /* Inlined onionoo.onionoo.Onionoo.Instance & std.Partial<onionoo.onionoo.Onionoo.Endpoints> */
  @js.native
  trait InstancePartialEndpoints extends StObject {
    
    var bandwidth: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Bandwidth]]] = js.native
    
    var clients: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Clients]]] = js.native
    
    var details: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Details]]] = js.native
    
    @JSName("get")
    def get_bandwidth(endpoint: bandwidth): GotPromise[Bandwidth] = js.native
    @JSName("get")
    def get_bandwidth(endpoint: bandwidth, query: QueryParameters): GotPromise[Bandwidth] = js.native
    @JSName("get")
    def get_clients(endpoint: clients): GotPromise[Clients] = js.native
    @JSName("get")
    def get_clients(endpoint: clients, query: QueryParameters): GotPromise[Clients] = js.native
    @JSName("get")
    def get_details(endpoint: details): GotPromise[Details] = js.native
    @JSName("get")
    def get_details(endpoint: details, query: QueryParameters): GotPromise[Details] = js.native
    @JSName("get")
    def get_summary(endpoint: summary): GotPromise[Summary] = js.native
    @JSName("get")
    def get_summary(endpoint: summary, query: QueryParameters): GotPromise[Summary] = js.native
    @JSName("get")
    def get_uptime(endpoint: uptime): GotPromise[Uptime] = js.native
    @JSName("get")
    def get_uptime(endpoint: uptime, query: QueryParameters): GotPromise[Uptime] = js.native
    @JSName("get")
    def get_weights(endpoint: weights): GotPromise[Weights] = js.native
    @JSName("get")
    def get_weights(endpoint: weights, query: QueryParameters): GotPromise[Weights] = js.native
    
    var summary: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Summary]]] = js.native
    
    var uptime: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Uptime]]] = js.native
    
    var weights: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Weights]]] = js.native
  }
  
  /* Inlined std.Partial<std.Record<'1_week' | '1_month' | '6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
  @js.native
  trait PartialRecord1week1month6 extends StObject {
    
    var `1_month`: js.UndefOr[Histogram] = js.native
    
    var `1_week`: js.UndefOr[Histogram] = js.native
    
    var `1_year`: js.UndefOr[Histogram] = js.native
    
    var `5_years`: js.UndefOr[Histogram] = js.native
    
    var `6_months`: js.UndefOr[Histogram] = js.native
  }
  object PartialRecord1week1month6 {
    
    @scala.inline
    def apply(): PartialRecord1week1month6 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecord1week1month6]
    }
    
    @scala.inline
    implicit class PartialRecord1week1month6MutableBuilder[Self <: PartialRecord1week1month6] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1_month(value: Histogram): Self = StObject.set(x, "1_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_monthUndefined: Self = StObject.set(x, "1_month", js.undefined)
      
      @scala.inline
      def set1_week(value: Histogram): Self = StObject.set(x, "1_week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_weekUndefined: Self = StObject.set(x, "1_week", js.undefined)
      
      @scala.inline
      def set1_year(value: Histogram): Self = StObject.set(x, "1_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_yearUndefined: Self = StObject.set(x, "1_year", js.undefined)
      
      @scala.inline
      def set5_years(value: Histogram): Self = StObject.set(x, "5_years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5_yearsUndefined: Self = StObject.set(x, "5_years", js.undefined)
      
      @scala.inline
      def set6_months(value: Histogram): Self = StObject.set(x, "6_months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6_monthsUndefined: Self = StObject.set(x, "6_months", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<'3_days' | '1_week' | '1_month' | '6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
  @js.native
  trait PartialRecord3days1week1m extends StObject {
    
    var `1_month`: js.UndefOr[Histogram] = js.native
    
    var `1_week`: js.UndefOr[Histogram] = js.native
    
    var `1_year`: js.UndefOr[Histogram] = js.native
    
    var `3_days`: js.UndefOr[Histogram] = js.native
    
    var `5_years`: js.UndefOr[Histogram] = js.native
    
    var `6_months`: js.UndefOr[Histogram] = js.native
  }
  object PartialRecord3days1week1m {
    
    @scala.inline
    def apply(): PartialRecord3days1week1m = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecord3days1week1m]
    }
    
    @scala.inline
    implicit class PartialRecord3days1week1mMutableBuilder[Self <: PartialRecord3days1week1m] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1_month(value: Histogram): Self = StObject.set(x, "1_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_monthUndefined: Self = StObject.set(x, "1_month", js.undefined)
      
      @scala.inline
      def set1_week(value: Histogram): Self = StObject.set(x, "1_week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_weekUndefined: Self = StObject.set(x, "1_week", js.undefined)
      
      @scala.inline
      def set1_year(value: Histogram): Self = StObject.set(x, "1_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_yearUndefined: Self = StObject.set(x, "1_year", js.undefined)
      
      @scala.inline
      def set3_days(value: Histogram): Self = StObject.set(x, "3_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3_daysUndefined: Self = StObject.set(x, "3_days", js.undefined)
      
      @scala.inline
      def set5_years(value: Histogram): Self = StObject.set(x, "5_years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5_yearsUndefined: Self = StObject.set(x, "5_years", js.undefined)
      
      @scala.inline
      def set6_months(value: Histogram): Self = StObject.set(x, "6_months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6_monthsUndefined: Self = StObject.set(x, "6_months", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<'6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
  @js.native
  trait PartialRecord6months1year extends StObject {
    
    var `1_year`: js.UndefOr[Histogram] = js.native
    
    var `5_years`: js.UndefOr[Histogram] = js.native
    
    var `6_months`: js.UndefOr[Histogram] = js.native
  }
  object PartialRecord6months1year {
    
    @scala.inline
    def apply(): PartialRecord6months1year = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecord6months1year]
    }
    
    @scala.inline
    implicit class PartialRecord6months1yearMutableBuilder[Self <: PartialRecord6months1year] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1_year(value: Histogram): Self = StObject.set(x, "1_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1_yearUndefined: Self = StObject.set(x, "1_year", js.undefined)
      
      @scala.inline
      def set5_years(value: Histogram): Self = StObject.set(x, "5_years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5_yearsUndefined: Self = StObject.set(x, "5_years", js.undefined)
      
      @scala.inline
      def set6_months(value: Histogram): Self = StObject.set(x, "6_months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6_monthsUndefined: Self = StObject.set(x, "6_months", js.undefined)
    }
  }
}
