package typingsSlinky.heremaps.H.service.metaInfo.Service

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property maps {Object<string, Object>} -
  * @property schemes {Object<string, Object>} -
  * @property tiletypes {Object<string, Object>} -
  * @property formats {Object<string, Object>} -
  * @property resolutions {Object<string, Object>} -
  * @property languages {Object<string, Object>} -
  */
@js.native
trait Info extends js.Object {
  var formats: StringDictionary[js.Any] = js.native
  var languages: StringDictionary[js.Any] = js.native
  var maps: StringDictionary[js.Any] = js.native
  var resolutions: StringDictionary[js.Any] = js.native
  var schemes: StringDictionary[js.Any] = js.native
  var tiletypes: StringDictionary[js.Any] = js.native
}

object Info {
  @scala.inline
  def apply(
    formats: StringDictionary[js.Any],
    languages: StringDictionary[js.Any],
    maps: StringDictionary[js.Any],
    resolutions: StringDictionary[js.Any],
    schemes: StringDictionary[js.Any],
    tiletypes: StringDictionary[js.Any]
  ): Info = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any], tiletypes = tiletypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutions(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiletypes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiletypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

