package typingsSlinky.appBuilderLib.linuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonLinuxOptions extends js.Object {
  /**
    * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
    */
  val category: js.UndefOr[String | Null] = js.native
  /**
    * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
    */
  val description: js.UndefOr[String | Null] = js.native
  /**
    * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
    */
  val desktop: js.UndefOr[js.Any | Null] = js.native
  /**
    * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
    */
  val mimeTypes: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
    */
  val synopsis: js.UndefOr[String | Null] = js.native
}

object CommonLinuxOptions {
  @scala.inline
  def apply(): CommonLinuxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonLinuxOptions]
  }
  @scala.inline
  implicit class CommonLinuxOptionsOps[Self <: CommonLinuxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withDesktop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(null)
        ret
    }
    @scala.inline
    def withMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(null)
        ret
    }
    @scala.inline
    def withSynopsis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synopsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynopsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synopsis")(js.undefined)
        ret
    }
    @scala.inline
    def withSynopsisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synopsis")(null)
        ret
    }
  }
  
}

