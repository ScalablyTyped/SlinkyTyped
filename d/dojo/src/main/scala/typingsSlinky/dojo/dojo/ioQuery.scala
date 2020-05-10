package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/io-query.html
  *
  * This module defines query string processing functions.
  *
  */
@js.native
trait ioQuery extends js.Object {
  /**
    * takes a name/value mapping object and returns a string representing
    * a URL-encoded version of that object.
    *
    * @param map
    */
  def objectToQuery(map: js.Object): js.Any = js.native
  /**
    * Create an object representing a de-serialized query section of a
    * URL. Query keys with multiple values are returned in an array.
    *
    * @param str
    */
  def queryToObject(str: String): js.Object = js.native
}

object ioQuery {
  @scala.inline
  def apply(objectToQuery: js.Object => js.Any, queryToObject: String => js.Object): ioQuery = {
    val __obj = js.Dynamic.literal(objectToQuery = js.Any.fromFunction1(objectToQuery), queryToObject = js.Any.fromFunction1(queryToObject))
    __obj.asInstanceOf[ioQuery]
  }
  @scala.inline
  implicit class ioQueryOps[Self <: ioQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectToQuery(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectToQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryToObject(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryToObject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

