package typingsSlinky.petFinderApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pet extends js.Object {
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
  implicit class PetOps[Self <: Pet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreeds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShelterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShelterPetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shelterPetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

