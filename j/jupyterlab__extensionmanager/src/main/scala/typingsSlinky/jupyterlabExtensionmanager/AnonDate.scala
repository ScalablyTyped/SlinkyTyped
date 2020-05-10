package typingsSlinky.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabExtensionmanager.queryMod.IPerson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDate extends js.Object {
  /**
    * Timestamp of release(?).
    */
  var date: String = js.native
  /**
    * Description as listed in package.json.
    */
  var description: String = js.native
  /**
    * Package keywords.
    */
  var keywords: js.Array[String] = js.native
  /**
    * Various metadata links for the package.
    */
  var links: StringDictionary[String] = js.native
  /**
    * Maintainer list per package.json.
    */
  var maintainers: js.Array[IPerson] = js.native
  /**
    * The package name.
    */
  var name: String = js.native
  /**
    * Metadata about user who published the release.
    */
  var publisher: IPerson = js.native
  /**
    * The scope of the package (e.g. jupyterlab for @jupyterlab/services).
    */
  var scope: String = js.native
  /**
    * Version number.
    */
  var version: String = js.native
}

object AnonDate {
  @scala.inline
  def apply(
    date: String,
    description: String,
    keywords: js.Array[String],
    links: StringDictionary[String],
    maintainers: js.Array[IPerson],
    name: String,
    publisher: IPerson,
    scope: String,
    version: String
  ): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
  @scala.inline
  implicit class AnonDateOps[Self <: AnonDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainers(value: js.Array[IPerson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: IPerson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

