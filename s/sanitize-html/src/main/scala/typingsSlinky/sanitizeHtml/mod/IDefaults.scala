package typingsSlinky.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaults extends js.Object {
  var allowedAttributes: StringDictionary[js.Array[AllowedAttribute]] = js.native
  var allowedSchemes: js.Array[String] = js.native
  var allowedSchemesByTag: StringDictionary[js.Array[String]] = js.native
  var allowedTags: js.Array[String] = js.native
  var selfClosing: js.Array[String] = js.native
}

object IDefaults {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[js.Array[AllowedAttribute]],
    allowedSchemes: js.Array[String],
    allowedSchemesByTag: StringDictionary[js.Array[String]],
    allowedTags: js.Array[String],
    selfClosing: js.Array[String]
  ): IDefaults = {
    val __obj = js.Dynamic.literal(allowedAttributes = allowedAttributes.asInstanceOf[js.Any], allowedSchemes = allowedSchemes.asInstanceOf[js.Any], allowedSchemesByTag = allowedSchemesByTag.asInstanceOf[js.Any], allowedTags = allowedTags.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaults]
  }
  @scala.inline
  implicit class IDefaultsOps[Self <: IDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedSchemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedSchemesByTag(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSchemesByTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfClosing(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

