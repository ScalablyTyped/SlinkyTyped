package typingsSlinky.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/ContentTypeMap.html
  *
  * A component that provides a map for determining the content handler
  * class from a content-type.
  *
  */
@js.native
trait ContentTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object = js.native
  /**
    * Adds a handler class for the given content type.
    *
    * @param contentType
    * @param handlerClass
    */
  def add(contentType: String, handlerClass: String): Unit = js.native
  /**
    * Returns the handler class for the given content type.
    *
    * @param contentType
    */
  def getHandlerClass(contentType: String): js.Any = js.native
}

object ContentTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Unit, getHandlerClass: String => js.Any, map: js.Object): ContentTypeMap_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getHandlerClass = js.Any.fromFunction1(getHandlerClass), map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeMap_]
  }
  @scala.inline
  implicit class ContentTypeMap_Ops[Self <: ContentTypeMap_] (val x: Self) extends AnyVal {
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
    def withGetHandlerClass(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandlerClass")(js.Any.fromFunction1(value))
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

