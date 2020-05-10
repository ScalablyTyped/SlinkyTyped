package typingsSlinky.hapiInert.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hapiInert.hapiInertBooleans.`false`
import typingsSlinky.hapiInert.hapiInertStrings.`inline`
import typingsSlinky.hapiInert.hapiInertStrings.attachment
import typingsSlinky.hapiInert.hapiInertStrings.hash
import typingsSlinky.hapiInert.hapiInertStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyFileHandlerOptions extends js.Object {
  /**
    * confine - serve file relative to this directory and returns 403 Forbidden if the path resolves outside the confine directory.
    * Defaults to true which uses the relativeTo route option as the confine. Set to false to disable this security feature.
    */
  var confine: js.UndefOr[Boolean] = js.native
  /**
    * end - offset in file to stop reading from. If not set, will read to end of file.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
  /**
    * filename - an optional filename to specify if sending a 'Content-Disposition' header, defaults to the basename of path
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * lookupCompressed - if true, looks for for a pre-compressed version of the file with the same filename with an extension, depending on the accepted encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[Boolean] = js.native
  /**
    * lookupMap - an object which maps content encoding to expected file name extension. Defaults to `{ gzip: '.gz' }.
    */
  var lookupMap: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * mode - specifies whether to include the 'Content-Disposition' header with the response. Available values:
    *  * false - header is not included. This is the default value.
    *  * 'attachment'
    *  *'inline'
    */
  var mode: js.UndefOr[`false` | attachment | `inline`] = js.native
  /**
    * start - offset in file to reading from, defaults to 0.
    */
  var start: js.UndefOr[Double] = js.native
}

object ReplyFileHandlerOptions {
  @scala.inline
  def apply(): ReplyFileHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyFileHandlerOptions]
  }
  @scala.inline
  implicit class ReplyFileHandlerOptionsOps[Self <: ReplyFileHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confine")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEtagMethod(value: hash | simple | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtagMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCompressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupCompressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupCompressed")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupMap")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: `false` | attachment | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

