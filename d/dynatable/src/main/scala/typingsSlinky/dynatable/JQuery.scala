package typingsSlinky.dynatable

import typingsSlinky.dynatable.JQueryDynatable.Dynatable
import typingsSlinky.dynatable.JQueryDynatable.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * @constructor
    */
  @JSName("dynatable")
  var dynatable_Original: Dynatable = js.native
  /**
    * Initialize Dynatable plugin
    *
    * @param options An optional object that allow you to change the default configuration options
    */
  /**
    * @constructor
    */
  def dynatable(): JQuery = js.native
  def dynatable(options: Options): JQuery = js.native
}

