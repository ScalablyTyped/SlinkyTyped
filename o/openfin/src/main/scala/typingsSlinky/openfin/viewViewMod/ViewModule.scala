package typingsSlinky.openfin.viewViewMod

import typingsSlinky.openfin.baseMod.Base
import typingsSlinky.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModule extends Base {
  
  /**
    * Creates a new View.
    * @param { View~options } options - View creation options
    * @return {Promise.<View>}
    * @tutorial View.create
    * @experimental
    * @static
    */
  def create(options: ViewCreationOptions): js.Promise[View] = js.native
  
  /**
    * Asynchronously returns a View object that represents the current view
    * @return {Promise.<View>}
    * @tutorial View.getCurrent
    * @experimental
    * @static
    */
  def getCurrent(): js.Promise[View] = js.native
  
  /**
    * Synchronously returns a View object that represents the current view
    * @return {View}
    * @tutorial View.getCurrentSync
    * @experimental
    * @static
    */
  def getCurrentSync(): View = js.native
  
  var onmessage: js.Any = js.native
  
  /**
    * Asynchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {Promise.<View>}
    * @tutorial View.wrap
    * @experimental
    * @static
    */
  def wrap(identity: Identity): js.Promise[View] = js.native
  
  /**
    * Synchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {View}
    * @tutorial View.wrapSync
    * @experimental
    * @static
    */
  def wrapSync(identity: Identity): View = js.native
}
