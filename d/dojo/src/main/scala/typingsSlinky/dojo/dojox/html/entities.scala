package typingsSlinky.dojo.dojox.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/entities.html
  *
  *
  */
@js.native
trait entities extends js.Object {
  /**
    *
    */
  var html: js.Array[_] = js.native
  /**
    *
    */
  var latin: js.Array[_] = js.native
  /**
    * Function to obtain an entity encoding for a specified character
    *
    * @param str The string to process for possible entity encoding to decode.
    * @param m An optional list of character to entity name mappings (array ofarrays).  If not provided, it uses the HTML and Latin entities as theset to map and decode.
    */
  def decode(str: js.Any, m: js.Any): Unit = js.native
  /**
    * Function to obtain an entity encoding for a specified character
    *
    * @param str The string to process for possible entity encoding.
    * @param m An optional list of character to entity name mappings (array ofarrays).  If not provided, it uses the and Latin entities as theset to map and escape.
    */
  def encode(str: js.Any, m: js.Any): Unit = js.native
}

object entities {
  @scala.inline
  def apply(
    decode: (js.Any, js.Any) => Unit,
    encode: (js.Any, js.Any) => Unit,
    html: js.Array[_],
    latin: js.Array[_]
  ): entities = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), html = html.asInstanceOf[js.Any], latin = latin.asInstanceOf[js.Any])
    __obj.asInstanceOf[entities]
  }
  @scala.inline
  implicit class entitiesOps[Self <: entities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHtml(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatin(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

