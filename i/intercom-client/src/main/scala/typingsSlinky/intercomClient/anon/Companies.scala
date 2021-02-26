package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.companyMod.Company
import typingsSlinky.intercomClient.intercomClientStrings.companyDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Companies extends StObject {
  
  var companies: js.Array[Company] = js.native
  
  var `type`: companyDotlist = js.native
}
object Companies {
  
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companies]
  }
  
  @scala.inline
  implicit class CompaniesMutableBuilder[Self <: Companies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanies(value: js.Array[Company]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompaniesVarargs(value: Company*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    @scala.inline
    def setType(value: companyDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
