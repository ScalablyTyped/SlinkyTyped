package typingsSlinky.relateurl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Type: Object
    * Default value: {ftp:21, http:80, https:443}
    *
    * Extend the list with any ports you need. Any URLs containing these default ports will have them removed. Example: http://example.com:80/ will become http://example.com/.
    */
  var defaultPorts: js.UndefOr[js.Object] = js.native
  /**
    * Type: Array
    * Default value: ["index.html"]
    *
    * Extend the list with any resources you need. Works with options.removeDirectoryIndexes.
    */
  var directoryIndexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * This will, for example, consider any domains containing http://www.example.com/ to be related to any that contain http://example.com/.
    */
  var ignore_www: js.UndefOr[Boolean] = js.native
  /**
    * Type: constant or String
    * Choices: RelateUrl.ABSOLUTE,RelateUrl.PATH_RELATIVE,RelateUrl.ROOT_RELATIVE,RelateUrl.SHORTEST
    * Choices: "absolute","pathRelative","rootRelative","shortest"
    * Default value: RelateUrl.SHORTEST
    *
    * RelateUrl.ABSOLUTE will produce an absolute URL. Overrides options.schemeRelative with a value of false.
    * RelateUrl.PATH_RELATIVE will produce something like ../child-of-parent/etc/.
    * RelateUrl.ROOT_RELATIVE will produce something like /child-of-root/etc/.
    * RelateUrl.SHORTEST will choose whichever is shortest between root- and path-relative.
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Type: Array
    * Default value: ["data","javascript","mailto"]
    *
    * Extend the list with any additional schemes. Example: javascript:something will not be modified.
    */
  var rejectedSchemes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove user authentication information from the output URL.
    */
  var removeAuth: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove any resources that match any found in options.directoryIndexes.
    */
  var removeDirectoryIndexes: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: false
    *
    * Remove empty query variables. Example: http://domain.com/?var1&var2=&var3=asdf will become http://domain.com/?var3=adsf. This does not apply to unrelated URLs (with other protocols, auths, hosts and/or ports).
    */
  var removeEmptyQueries: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Remove trailing slashes from root paths. Example: http://domain.com/?var will become http://domain.com?var while http://domain.com/dir/?var will not be modified.
    */
  var removeRootTrailingSlash: js.UndefOr[Boolean] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Output URLs relative to the scheme. Example: http://example.com/ will become //example.com/.
    */
  var schemeRelative: js.UndefOr[Boolean] = js.native
  /**
    * Type: String
    * Default value: undefined
    *
    * An options-based version of the from argument. If both are specified, from takes priority.
    */
  var site: js.UndefOr[String] = js.native
  /**
    * Type: Boolean
    * Default value: true
    *
    * Passed to Node's url.parse.
    */
  var slashesDenoteHost: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPorts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryIndexes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_www(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_www")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_www: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_www")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectedSchemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedSchemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedSchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedSchemes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDirectoryIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDirectoryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDirectoryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDirectoryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmptyQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmptyQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRootTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRootTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveRootTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRootTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemeRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemeRelative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemeRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemeRelative")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withSlashesDenoteHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashesDenoteHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlashesDenoteHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashesDenoteHost")(js.undefined)
        ret
    }
  }
  
}

