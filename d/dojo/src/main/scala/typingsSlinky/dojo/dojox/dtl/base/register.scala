package typingsSlinky.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.register.html
  *
  * A register for filters and tags.
  *
  */
@js.native
trait register extends js.Object {
  /**
    * Register the specified filter libraries.
    * The locations parameter defines the contents of each library as a hash whose keys are the library names and values
    * an array of the filters exported by the library. For example, the filters exported by the date library would be:
    *
    * { "dates": ["date", "time", "timesince", "timeuntil"] }
    *
    * @param base The base path of the libraries.
    * @param locations An object defining the filters for each library as a hash whose keys are the library names and values an array of the filters exported by the library.
    */
  def filters(base: String, locations: js.Object): Unit = js.native
  /**
    * Register the specified tag libraries.
    * The locations parameter defines the contents of each library as a hash whose keys are the library names and values
    * an array of the tags exported by the library. For example, the tags exported by the logic library would be:
    *
    * { logic: ["if", "for", "ifequal", "ifnotequal"] }
    *
    * @param base The base path of the libraries.
    * @param locations An object defining the tags for each library as a hash whose keys are the library names and values an array of the tags or filters exported by the library.
    */
  def tags(base: String, locations: js.Object): Unit = js.native
}

object register {
  @scala.inline
  def apply(filters: (String, js.Object) => Unit, tags: (String, js.Object) => Unit): register = {
    val __obj = js.Dynamic.literal(filters = js.Any.fromFunction2(filters), tags = js.Any.fromFunction2(tags))
    __obj.asInstanceOf[register]
  }
  @scala.inline
  implicit class registerOps[Self <: register] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTags(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

