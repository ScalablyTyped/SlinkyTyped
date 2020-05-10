package typingsSlinky.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/PatternFileTypeMap.html
  *
  * A component that provides a map for determining content-type from
  * the pattern of the URL.
  *
  */
@js.native
trait PatternFileTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object = js.native
  /**
    * Adds a handler class for the given content type.
    *
    * @param key
    * @param contentType
    */
  def add(key: String, contentType: String): Unit = js.native
  /**
    * Returns the handler class for the given content type.
    *
    * @param fileName
    */
  def getContentType(fileName: String): Unit = js.native
}

object PatternFileTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Unit, getContentType: String => Unit, map: js.Object): PatternFileTypeMap_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getContentType = js.Any.fromFunction1(getContentType), map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternFileTypeMap_]
  }
  @scala.inline
  implicit class PatternFileTypeMap_Ops[Self <: PatternFileTypeMap_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContentType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

