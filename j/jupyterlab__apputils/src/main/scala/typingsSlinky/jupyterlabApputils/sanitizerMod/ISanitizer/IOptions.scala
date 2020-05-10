package typingsSlinky.jupyterlabApputils.sanitizerMod.ISanitizer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to sanitize.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The allowed attributes for a given tag.
    */
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The allowed style values for a given tag.
    */
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[js.RegExp]]]] = js.native
  /**
    * The allowed tags.
    */
  var allowedTags: js.UndefOr[js.Array[String]] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedStyles(value: StringDictionary[StringDictionary[js.Array[js.RegExp]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(js.undefined)
        ret
    }
  }
  
}

