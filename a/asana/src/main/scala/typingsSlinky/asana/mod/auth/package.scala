package typingsSlinky.asana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth {
  
  @scala.inline
  def App: typingsSlinky.asana.mod.auth.AppStatic = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("App").asInstanceOf[typingsSlinky.asana.mod.auth.AppStatic]
  @scala.inline
  def App_=(x: typingsSlinky.asana.mod.auth.AppStatic): scala.Unit = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def OauthError: typingsSlinky.asana.mod.auth.OauthErrorStatic = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("OauthError").asInstanceOf[typingsSlinky.asana.mod.auth.OauthErrorStatic]
  type OauthError = js.Error
  @scala.inline
  def OauthError_=(x: typingsSlinky.asana.mod.auth.OauthErrorStatic): scala.Unit = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("OauthError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def RedirectFlow: typingsSlinky.asana.mod.auth.RedirectFlowStatic = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("RedirectFlow").asInstanceOf[typingsSlinky.asana.mod.auth.RedirectFlowStatic]
  type RedirectFlow = typingsSlinky.asana.mod.auth.BaseBrowserFlow
  @scala.inline
  def RedirectFlow_=(x: typingsSlinky.asana.mod.auth.RedirectFlowStatic): scala.Unit = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("RedirectFlow")(x.asInstanceOf[js.Any])
  
  /**
    * Auto-detects the type of Oauth flow to use that's appropriate to the
    * environment.
    *
    * @returns {Function|null} The type of Oauth flow to use, or null if no
    *     appropriate type could be determined.
    * @param env
    * @return
    */
  @scala.inline
  def autoDetect(env: js.Any): js.Function = typingsSlinky.asana.mod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("autoDetect")(env.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
