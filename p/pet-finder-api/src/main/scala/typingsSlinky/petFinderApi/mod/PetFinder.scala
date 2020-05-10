package typingsSlinky.petFinderApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PetFinder extends js.Object {
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
  implicit class PetFinderOps[Self <: PetFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindShelter(
      value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findShelter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetBreedList(value: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBreedList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPet(value: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetPetsInShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPetsInShelter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetRandomPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRandomPet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShelter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetSheltersWithBreeds(
      value: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSheltersWithBreeds")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

