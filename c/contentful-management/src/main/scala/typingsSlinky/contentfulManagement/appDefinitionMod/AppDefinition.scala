package typingsSlinky.contentfulManagement.appDefinitionMod

import typingsSlinky.contentfulManagement.commonTypesMod.DefaultElements
import typingsSlinky.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppDefinition
  extends AppDefinitionProps
     with DefaultElements[AppDefinitionProps] {
  
  /**
    * Deletes this object on the server.
    * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getAppDefinition('<ui_extension_id>'))
    * .then((appDefinition) => appDefinition.delete())
    * .then(() => console.log(`App Definition deleted.`))
    * .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Sends an update to the server with any changes made to the object's properties
    * @return Object returned from the server with updated changes.
    * @example ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getAppDefinition('<ui_extension_id>'))
    * .then((appDefinition) => {
    *   appDefinition.extension.name = 'New App Definition name'
    *   return appDefinition.update()
    * })
    * .then((appDefinition) => console.log(`App Definition ${appDefinition.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[AppDefinition] = js.native
}
object AppDefinition {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    locations: js.Array[LocationDefinition],
    name: String,
    src: String,
    sys: MetaSysProps,
    toPlainObject: () => AppDefinitionProps,
    update: () => js.Promise[AppDefinition]
  ): AppDefinition = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[AppDefinition]
  }
  
  @scala.inline
  implicit class AppDefinitionOps[Self <: AppDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[AppDefinition]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
