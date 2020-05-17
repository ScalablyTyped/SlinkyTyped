package typingsSlinky.pizzip.mod

import typingsSlinky.node.Buffer
import typingsSlinky.pizzip.anon.Base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipObject extends js.Object {
  /**
    * the comment for this file
    */
  var comment: String = js.native
  /**
    * the last modification date
    */
  var date: js.Date = js.native
  /**
    * true if this is a directory
    */
  var dir: Boolean = js.native
  /**
    * The DOS permissions of the file, if any.
    */
  var dosPermissions: Double = js.native
  /**
    * the absolute path of the file
    */
  var name: String = js.native
  /**
    * the options of the file.
    */
  var options: Base64 = js.native
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc. On nodejs you can use the mode attribute of nodejs' fs.Stats.
    */
  var unixPermissions: Double | String = js.native
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asArrayBuffer(): js.typedarray.ArrayBuffer = js.native
  /**
    * the content as binary string.
    */
  def asBinary(): String = js.native
  /**
    * need nodejs. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asNodeBuffer(): Buffer = js.native
  /**
    * the content as an unicode string.
    */
  def asText(): String = js.native
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asUint8Array(): js.typedarray.Uint8Array = js.native
}

object ZipObject {
  @scala.inline
  def apply(
    asArrayBuffer: () => js.typedarray.ArrayBuffer,
    asBinary: () => String,
    asNodeBuffer: () => Buffer,
    asText: () => String,
    asUint8Array: () => js.typedarray.Uint8Array,
    comment: String,
    date: js.Date,
    dir: Boolean,
    dosPermissions: Double,
    name: String,
    options: Base64,
    unixPermissions: Double | String
  ): ZipObject = {
    val __obj = js.Dynamic.literal(asArrayBuffer = js.Any.fromFunction0(asArrayBuffer), asBinary = js.Any.fromFunction0(asBinary), asNodeBuffer = js.Any.fromFunction0(asNodeBuffer), asText = js.Any.fromFunction0(asText), asUint8Array = js.Any.fromFunction0(asUint8Array), comment = comment.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dosPermissions = dosPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unixPermissions = unixPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipObject]
  }
  @scala.inline
  implicit class ZipObjectOps[Self <: ZipObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asArrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsBinary(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBinary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsNodeBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNodeBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsUint8Array(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asUint8Array")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDosPermissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dosPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnixPermissions(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unixPermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

