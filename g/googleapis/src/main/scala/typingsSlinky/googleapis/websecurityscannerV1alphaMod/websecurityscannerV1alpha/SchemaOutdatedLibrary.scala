package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information reported for an outdated library.
  */
@js.native
trait SchemaOutdatedLibrary extends js.Object {
  /**
    * URLs to learn more information about the vulnerabilities in the library.
    */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the outdated library.
    */
  var libraryName: js.UndefOr[String] = js.native
  /**
    * The version number.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaOutdatedLibrary {
  @scala.inline
  def apply(): SchemaOutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutdatedLibrary]
  }
  @scala.inline
  implicit class SchemaOutdatedLibraryOps[Self <: SchemaOutdatedLibrary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLearnMoreUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnMoreUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLearnMoreUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnMoreUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

