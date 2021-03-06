package typingsSlinky.mangopay2NodejsSdk.mod.user

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserNaturalData extends UserData {
  
  /**
    * The user address
    */
  var Address: String | AddressData = js.native
  
  /**
    * The date of birth of the user - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var Birthday: Timestamp = js.native
  
  /**
    * The capacity of this user - for use with UBO declarations
    */
  var Capacity: NORMAL | DECLARATIVE = js.native
  
  /**
    * The user’s country of residence. ISO 3166-1 alpha-2 format is expected
    */
  var CountryOfResidence: CountryISO = js.native
  
  /**
    * The name of the user
    */
  var FirstName: String = js.native
  
  var IncomeRange: typingsSlinky.mangopay2NodejsSdk.mod.user.IncomeRange = js.native
  
  /**
    * The last name of the user
    */
  var LastName: String = js.native
  
  /**
    * The user’s nationality. ISO 3166-1 alpha-2 format is expected
    */
  var Nationality: CountryISO = js.native
  
  /**
    * User’s occupation, ie. Work
    */
  var Occupation: String = js.native
  
  @JSName("PersonType")
  var PersonType_UserNaturalData: NATURAL = js.native
  
  /**
    * Maximum length is 255 characters
    */
  var ProofOfAddress: String | Null = js.native
  
  /**
    * Maximum length is 255 characters
    */
  var ProofOfIdentity: String | Null = js.native
}
object UserNaturalData {
  
  @scala.inline
  def apply(
    Address: String | AddressData,
    Birthday: Timestamp,
    Capacity: NORMAL | DECLARATIVE,
    CountryOfResidence: CountryISO,
    CreationDate: Double,
    Email: String,
    FirstName: String,
    Id: String,
    IncomeRange: IncomeRange,
    KYCLevel: KYCLevel,
    LastName: String,
    Nationality: CountryISO,
    Occupation: String,
    PersonType: NATURAL,
    Tag: String
  ): UserNaturalData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncomeRange = IncomeRange.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Occupation = Occupation.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNaturalData]
  }
  
  @scala.inline
  implicit class UserNaturalDataMutableBuilder[Self <: UserNaturalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: NORMAL | DECLARATIVE): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupation(value: String): Self = StObject.set(x, "Occupation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonType(value: NATURAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfAddress(value: String): Self = StObject.set(x, "ProofOfAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfAddressNull: Self = StObject.set(x, "ProofOfAddress", null)
    
    @scala.inline
    def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
  }
}
