package typingsSlinky.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.utils
  * @interface DecomposedDataUri
  */
@js.native
trait DecomposedDataUri extends js.Object {
  /**
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} charset
    */
  var charset: String = js.native
  /**
    * The actual data
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} data
    */
  var data: String = js.native
  /**
    * Data encoding, eg. `base64`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} encoding
    */
  var encoding: String = js.native
  /**
    * type, eg. `image`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} mediaType
    */
  var mediaType: String = js.native
  /**
    * Sub type, eg. `png`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} subType
    */
  var subType: String = js.native
}

object DecomposedDataUri {
  @scala.inline
  def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposedDataUri]
  }
  @scala.inline
  implicit class DecomposedDataUriOps[Self <: DecomposedDataUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

