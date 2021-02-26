package typingsSlinky.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.intercomClient.anon.Name
import typingsSlinky.intercomClient.anon.Next
import typingsSlinky.intercomClient.intercomClientStrings.company
import typingsSlinky.intercomClient.intercomClientStrings.companyDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companyMod {
  
  @js.native
  trait Company extends StObject {
    
    val app_id: js.UndefOr[String] = js.native
    
    var company_id: js.UndefOr[String] = js.native
    
    val created_at: Double = js.native
    
    var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    val id: String = js.native
    
    var industry: js.UndefOr[String] = js.native
    
    var monthly_spend: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var plan: js.UndefOr[String | Name] = js.native
    
    var remote_created_at: js.UndefOr[Double] = js.native
    
    var session_count: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    val `type`: company = js.native
    
    val updated_at: Double = js.native
    
    var user_count: js.UndefOr[Double] = js.native
    
    var website: js.UndefOr[String] = js.native
  }
  object Company {
    
    @scala.inline
    def apply(created_at: Double, id: String, `type`: company, updated_at: Double): Company = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Company]
    }
    
    @scala.inline
    implicit class CompanyMutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      @scala.inline
      def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
      
      @scala.inline
      def setMonthly_spend(value: Double): Self = StObject.set(x, "monthly_spend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthly_spendUndefined: Self = StObject.set(x, "monthly_spend", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlan(value: String | Name): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      @scala.inline
      def setRemote_created_at(value: Double): Self = StObject.set(x, "remote_created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote_created_atUndefined: Self = StObject.set(x, "remote_created_at", js.undefined)
      
      @scala.inline
      def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_countUndefined: Self = StObject.set(x, "session_count", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: company): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intercomClient.anon.Id
    - typingsSlinky.intercomClient.anon.Companyid
  */
  trait CompanyIdentifier extends StObject
  object CompanyIdentifier {
    
    @scala.inline
    def Companyid(company_id: String): typingsSlinky.intercomClient.anon.Companyid = {
      val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.intercomClient.anon.Companyid]
    }
    
    @scala.inline
    def Id(id: String): typingsSlinky.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.intercomClient.anon.Id]
    }
  }
  
  @js.native
  trait List extends StObject {
    
    var companies: js.Array[Company with CompanyIdentifier] = js.native
    
    var pages: Next = js.native
    
    var total_count: Double = js.native
    
    var `type`: companyDotlist = js.native
  }
  object List {
    
    @scala.inline
    def apply(
      companies: js.Array[Company with CompanyIdentifier],
      pages: Next,
      total_count: Double,
      `type`: companyDotlist
    ): List = {
      val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompanies(value: js.Array[Company with CompanyIdentifier]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompaniesVarargs(value: (Company with CompanyIdentifier)*): Self = StObject.set(x, "companies", js.Array(value :_*))
      
      @scala.inline
      def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: companyDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
