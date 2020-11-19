package typingsSlinky.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// ResourceService
// see http://docs.angularjs.org/api/ngResource.$resource
// Most part of the following definitions were achieved by analyzing the
// actual implementation, since the documentation doesn't seem to cover
// that deeply.
///////////////////////////////////////////////////////////////////////////
@js.native
trait IResourceService extends js.Object {
  
  /**
    * A factory which creates a resource object that lets you interact with RESTful server-side data sources.
    * @param url A parameterized URL template with parameters prefixed by : as in /user/:username
    * @param paramDefaults Default values for url parameters.
    * @param actions example: {update: { method: 'PUT' }, delete: deleteDescriptor } where deleteDescriptor: IActionDescriptor
    * @param options Hash with custom settings that should extend the default $resourceProvider behavior
    */
  def apply(url: String): IResourceClass[IResource[_]] = js.native
  def apply(
    url: String,
    paramDefaults: js.UndefOr[scala.Nothing],
    actions: js.UndefOr[scala.Nothing],
    options: IResourceOptions
  ): IResourceClass[IResource[_]] = js.native
  def apply(url: String, paramDefaults: js.UndefOr[scala.Nothing], actions: IActionHash): IResourceClass[IResource[_]] = js.native
  def apply(
    url: String,
    paramDefaults: js.UndefOr[scala.Nothing],
    actions: IActionHash,
    options: IResourceOptions
  ): IResourceClass[IResource[_]] = js.native
  def apply(url: String, paramDefaults: js.Any): IResourceClass[IResource[_]] = js.native
  def apply(url: String, paramDefaults: js.Any, actions: js.UndefOr[scala.Nothing], options: IResourceOptions): IResourceClass[IResource[_]] = js.native
  def apply(url: String, paramDefaults: js.Any, actions: IActionHash): IResourceClass[IResource[_]] = js.native
  def apply(url: String, paramDefaults: js.Any, actions: IActionHash, options: IResourceOptions): IResourceClass[IResource[_]] = js.native
}
