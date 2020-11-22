package typingsSlinky.emberData

import typingsSlinky.emberData.mod.DS.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data/store", JSImport.Namespace)
@js.native
object storeMod extends js.Object {
  
  /**
    * The store contains all of the data for records loaded from the server.
    * It is also responsible for creating instances of `DS.Model` that wrap
    * the individual data for a record, so that they can be bound to in your
    * Handlebars templates.
    */
  @js.native
  class default () extends Store
}
