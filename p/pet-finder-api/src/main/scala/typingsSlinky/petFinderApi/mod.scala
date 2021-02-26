package typingsSlinky.petFinderApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pet-finder-api", JSImport.Namespace)
  @js.native
  def apply(api_key: String, api_secret: String): PetFinder = js.native
  @JSImport("pet-finder-api", JSImport.Namespace)
  @js.native
  def apply(api_key: String, api_secret: String, options: js.Any): PetFinder = js.native
  
  @js.native
  trait Contact extends StObject {
    
    var address1: String = js.native
    
    var address2: String = js.native
    
    var city: String = js.native
    
    var email: String = js.native
    
    var fax: String = js.native
    
    var phone: String = js.native
    
    var state: String = js.native
    
    var zip: String = js.native
  }
  object Contact {
    
    @scala.inline
    def apply(
      address1: String,
      address2: String,
      city: String,
      email: String,
      fax: String,
      phone: String,
      state: String,
      zip: String
    ): Contact = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pet extends StObject {
    
    var age: String = js.native
    
    var animal: String = js.native
    
    var breeds: js.Array[String] = js.native
    
    var contact: Contact = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
    
    var media: js.Any = js.native
    
    var mix: String = js.native
    
    var name: String = js.native
    
    var options: js.Array[String] = js.native
    
    var sex: String = js.native
    
    var shelterId: String = js.native
    
    var shelterPetId: String = js.native
    
    var size: String = js.native
    
    var status: String = js.native
  }
  object Pet {
    
    @scala.inline
    def apply(
      age: String,
      animal: String,
      breeds: js.Array[String],
      contact: Contact,
      description: String,
      id: Double,
      media: js.Any,
      mix: String,
      name: String,
      options: js.Array[String],
      sex: String,
      shelterId: String,
      shelterPetId: String,
      size: String,
      status: String
    ): Pet = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], animal = animal.asInstanceOf[js.Any], breeds = breeds.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sex = sex.asInstanceOf[js.Any], shelterId = shelterId.asInstanceOf[js.Any], shelterPetId = shelterPetId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pet]
    }
    
    @scala.inline
    implicit class PetMutableBuilder[Self <: Pet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimal(value: String): Self = StObject.set(x, "animal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreeds(value: js.Array[String]): Self = StObject.set(x, "breeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreedsVarargs(value: String*): Self = StObject.set(x, "breeds", js.Array(value :_*))
      
      @scala.inline
      def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: js.Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMix(value: String): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShelterId(value: String): Self = StObject.set(x, "shelterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShelterPetId(value: String): Self = StObject.set(x, "shelterPetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PetFinder extends StObject {
    
    def findPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]): Unit = js.native
    
    def findShelter(
      location: String,
      options: js.Any,
      callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit = js.native
    
    def getBreedList(animal: String, callback: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]): Unit = js.native
    
    def getPet(petId: Double, options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit = js.native
    
    def getPetsInShelter(
      shelterId: String,
      options: js.Any,
      callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]
    ): Unit = js.native
    
    def getRandomPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit = js.native
    
    def getShelter(
      shelterId: String,
      options: js.Any,
      callback: js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]
    ): Unit = js.native
    
    def getSheltersWithBreeds(
      animal: String,
      breed: String,
      options: js.Any,
      callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit = js.native
  }
  object PetFinder {
    
    @scala.inline
    def apply(
      findPet: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit,
      findShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit,
      getBreedList: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Unit,
      getPet: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit,
      getPetsInShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit,
      getRandomPet: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit,
      getShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Unit,
      getSheltersWithBreeds: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): PetFinder = {
      val __obj = js.Dynamic.literal(findPet = js.Any.fromFunction2(findPet), findShelter = js.Any.fromFunction3(findShelter), getBreedList = js.Any.fromFunction2(getBreedList), getPet = js.Any.fromFunction3(getPet), getPetsInShelter = js.Any.fromFunction3(getPetsInShelter), getRandomPet = js.Any.fromFunction2(getRandomPet), getShelter = js.Any.fromFunction3(getShelter), getSheltersWithBreeds = js.Any.fromFunction4(getSheltersWithBreeds))
      __obj.asInstanceOf[PetFinder]
    }
    
    @scala.inline
    implicit class PetFinderMutableBuilder[Self <: PetFinder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = StObject.set(x, "findPet", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindShelter(
        value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
      ): Self = StObject.set(x, "findShelter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetBreedList(value: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "getBreedList", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetPet(value: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = StObject.set(x, "getPet", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetPetsInShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = StObject.set(x, "getPetsInShelter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetRandomPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = StObject.set(x, "getRandomPet", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Unit): Self = StObject.set(x, "getShelter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetSheltersWithBreeds(
        value: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
      ): Self = StObject.set(x, "getSheltersWithBreeds", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait Shelter extends StObject {
    
    var address1: String = js.native
    
    var address2: String = js.native
    
    var city: String = js.native
    
    var country: String = js.native
    
    var email: String = js.native
    
    var fax: String = js.native
    
    var id: String = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var name: String = js.native
    
    var phone: String = js.native
    
    var state: String = js.native
    
    var zip: String = js.native
  }
  object Shelter {
    
    @scala.inline
    def apply(
      address1: String,
      address2: String,
      city: String,
      country: String,
      email: String,
      fax: String,
      id: String,
      latitude: Double,
      longitude: Double,
      name: String,
      phone: String,
      state: String,
      zip: String
    ): Shelter = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shelter]
    }
    
    @scala.inline
    implicit class ShelterMutableBuilder[Self <: Shelter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
