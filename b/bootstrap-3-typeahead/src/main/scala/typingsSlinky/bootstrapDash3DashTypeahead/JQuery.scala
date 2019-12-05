package typingsSlinky.bootstrapDash3DashTypeahead

import typingsSlinky.bootstrapDash3DashTypeahead.Bootstrap3Typeahead.Options
import typingsSlinky.bootstrapDash3DashTypeahead.bootstrapDash3DashTypeaheadStrings.destroy
import typingsSlinky.bootstrapDash3DashTypeahead.bootstrapDash3DashTypeaheadStrings.getActive
import typingsSlinky.bootstrapDash3DashTypeahead.bootstrapDash3DashTypeaheadStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initialize or destroy Typeahead
    */
  def typeahead(): JQuery = js.native
  def typeahead(methodOrOptions: Options): JQuery = js.native
  @JSName("typeahead")
  def typeahead_destroy(methodOrOptions: destroy): JQuery = js.native
  /**
    * To get the currently active item
    */
  @JSName("typeahead")
  def typeahead_getActive(method: getActive): js.UndefOr[String | js.Object] = js.native
  /**
    * To trigger the lookup function externally
    */
  @JSName("typeahead")
  def typeahead_lookup(method: lookup): JQuery = js.native
  @JSName("typeahead")
  def typeahead_lookup(method: lookup, defaultValue: String): JQuery = js.native
}

