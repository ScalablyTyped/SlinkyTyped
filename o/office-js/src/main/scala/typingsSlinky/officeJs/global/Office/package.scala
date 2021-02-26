package typingsSlinky.officeJs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Office {
  
  /** A Promise object. Promises can be chained via ".then", and errors can be caught via ".catch". 
    * When a browser-provided native Promise implementation is available, Office.Promise will switch to use the native Promise instead.
    */
  @scala.inline
  def Promise: typingsSlinky.officeJs.Office.IPromiseConstructor = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].selectDynamic("Promise").asInstanceOf[typingsSlinky.officeJs.Office.IPromiseConstructor]
  @scala.inline
  def Promise_=(x: typingsSlinky.officeJs.Office.IPromiseConstructor): scala.Unit = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * Represents the add-in.
    */
  @scala.inline
  def addin: typingsSlinky.officeJs.Office.Addin = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].selectDynamic("addin").asInstanceOf[typingsSlinky.officeJs.Office.Addin]
  
  /**
    * Gets the Context object that represents the runtime environment of the add-in and provides access to the top-level objects of the API.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this enumeration.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *  </table>
    */
  @scala.inline
  def context: typingsSlinky.officeJs.Office.Context = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].selectDynamic("context").asInstanceOf[typingsSlinky.officeJs.Office.Context]
  @scala.inline
  def context_=(x: typingsSlinky.officeJs.Office.Context): scala.Unit = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
  
  /**
    * Occurs when the runtime environment is loaded and the add-in is ready to start interacting with the application and hosted document. 
    * 
    * The reason parameter of the initialize event listener function returns an `InitializationReason` enumeration value that specifies how 
    * initialization occurred. A task pane or content add-in can be initialized in two ways:
    * 
    *  - The user just inserted it from Recently Used Add-ins section of the Add-in drop-down list on the Insert tab of the ribbon in the Office 
    * host application, or from Insert add-in dialog box.
    * 
    *  - The user opened a document that already contains the add-in.
    * 
    * *Note*: The reason parameter of the initialize event listener function only returns an `InitializationReason` enumeration value for task pane 
    * and content add-ins. It does not return a value for Outlook add-ins.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td> Y             </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td> Y             </td></tr>
    *  </table>
    * 
    * @param reason Indicates how the app was initialized.
    */
  @scala.inline
  def initialize(reason: typingsSlinky.officeJs.Office.InitializationReason): scala.Unit = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(reason.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Ensures that the Office JavaScript APIs are ready to be called by the add-in. If the framework hasn't initialized yet, the callback or promise 
    * will wait until the Office host is ready to accept API calls. Note that though this API is intended to be used inside an Office add-in, it can 
    * also be used outside the add-in. In that case, once Office.js determines that it is running outside of an Office host application, it will call 
    * the callback and resolve the promise with "null" for both the host and platform.
    * 
    * @param callback - An optional callback method, that will receive the host and platform info. 
    *                   Alternatively, rather than use a callback, an add-in may simply wait for the Promise returned by the function to resolve.
    * @returns A Promise that contains the host and platform info, once initialization is completed.
    */
  @scala.inline
  def onReady(): js.Promise[typingsSlinky.officeJs.anon.Host] = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("onReady")().asInstanceOf[js.Promise[typingsSlinky.officeJs.anon.Host]]
  @scala.inline
  def onReady(callback: js.Function1[/* info */ typingsSlinky.officeJs.anon.Host, _]): js.Promise[typingsSlinky.officeJs.anon.Host] = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.officeJs.anon.Host]]
  
  /**
    * Returns a promise of an object described in the expression. Callback is invoked only if method fails.
    * 
    * @param expression The object to be retrieved. Example "bindings#BindingName", retrieves a binding promise for a binding named 'BindingName'
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                         </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th></tr>
    *   <tr><td><strong> Excel  </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td></tr>
    *   <tr><td><strong> Word   </strong></td><td> Y                 </td><td>                       </td><td> Y              </td></tr>
    *  </table>
    */
  @scala.inline
  def select(expression: java.lang.String): typingsSlinky.officeJs.Office.Binding = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("select")(expression.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.officeJs.Office.Binding]
  @scala.inline
  def select(
    expression: java.lang.String,
    callback: js.Function1[/* result */ typingsSlinky.officeJs.Office.AsyncResult[_], scala.Unit]
  ): typingsSlinky.officeJs.Office.Binding = (typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("select")(expression.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.officeJs.Office.Binding]
  
  /**
    * Toggles on and off the `Office` alias for the full `Microsoft.Office.WebExtension` namespace.
    * 
    * @remarks
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office on Windows </th><th> Office in web browser </th><th> Office on iPad </th><th> Outlook on mobile devices </th><th> Office on Mac </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y                 </td><td> Y                     </td><td>                </td><td> Y                         </td><td> Y             </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Project    </strong></td><td> Y                 </td><td>                       </td><td>                </td><td>                           </td><td>               </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                 </td><td> Y                     </td><td> Y              </td><td>                           </td><td>               </td></tr>
    *  </table>
    * 
    * @param useShortNamespace True to use the shortcut alias; otherwise false to disable it. The default is true.
    */
  @scala.inline
  def useShortNamespace(useShortNamespace: scala.Boolean): scala.Unit = typingsSlinky.officeJs.global.Office.^.asInstanceOf[js.Dynamic].applyDynamic("useShortNamespace")(useShortNamespace.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
