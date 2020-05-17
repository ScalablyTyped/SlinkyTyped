package typingsSlinky.gapiPlus.gapi.client.plus.people

import typingsSlinky.gapiPlus.anon.CoverInfo
import typingsSlinky.gapiPlus.anon.Department
import typingsSlinky.gapiPlus.anon.FamilyName
import typingsSlinky.gapiPlus.anon.Label
import typingsSlinky.gapiPlus.anon.Max
import typingsSlinky.gapiPlus.anon.Primary
import typingsSlinky.gapiPlus.anon.Type
import typingsSlinky.gapiPlus.anon.Url
import typingsSlinky.gapiPlus.gapiPlusStrings.plusNumbersignperson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Person extends js.Object {
  var aboutMe: String = js.native
  var ageRange: Max = js.native
  var birthday: String = js.native
  var braggingRights: String = js.native
  var circledByCount: Double = js.native
  var cover: CoverInfo = js.native
  var displayName: String = js.native
  var domain: String = js.native
  var emails: js.Array[Type] = js.native
  var etag: String = js.native
  var gender: String = js.native
  var id: String = js.native
  var image: Url = js.native
  var isPlusUser: Boolean = js.native
  var kind: plusNumbersignperson = js.native
  var language: String = js.native
  var name: FamilyName = js.native
  var nickname: String = js.native
  var objectType: String = js.native
  var occupation: String = js.native
  var organizations: js.Array[Department] = js.native
  var placesLived: js.Array[Primary] = js.native
  var plusOneCount: Double = js.native
  var relationshipStatus: String = js.native
  var skills: String = js.native
  var tagline: String = js.native
  var url: String = js.native
  var urls: js.Array[Label] = js.native
  var verified: Boolean = js.native
}

object Person {
  @scala.inline
  def apply(
    aboutMe: String,
    ageRange: Max,
    birthday: String,
    braggingRights: String,
    circledByCount: Double,
    cover: CoverInfo,
    displayName: String,
    domain: String,
    emails: js.Array[Type],
    etag: String,
    gender: String,
    id: String,
    image: Url,
    isPlusUser: Boolean,
    kind: plusNumbersignperson,
    language: String,
    name: FamilyName,
    nickname: String,
    objectType: String,
    occupation: String,
    organizations: js.Array[Department],
    placesLived: js.Array[Primary],
    plusOneCount: Double,
    relationshipStatus: String,
    skills: String,
    tagline: String,
    url: String,
    urls: js.Array[Label],
    verified: Boolean
  ): Person = {
    val __obj = js.Dynamic.literal(aboutMe = aboutMe.asInstanceOf[js.Any], ageRange = ageRange.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], braggingRights = braggingRights.asInstanceOf[js.Any], circledByCount = circledByCount.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isPlusUser = isPlusUser.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], occupation = occupation.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], placesLived = placesLived.asInstanceOf[js.Any], plusOneCount = plusOneCount.asInstanceOf[js.Any], relationshipStatus = relationshipStatus.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboutMe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboutMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgeRange(value: Max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBraggingRights(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braggingRights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircledByCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circledByCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover(value: CoverInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmails(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlusUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlusUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: plusNumbersignperson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FamilyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Array[Department]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacesLived(value: js.Array[Primary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placesLived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusOneCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusOneCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationshipStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkills(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

