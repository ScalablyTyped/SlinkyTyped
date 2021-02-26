package typingsSlinky.msRestAzure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def interactiveLogin(): js.Promise[typingsSlinky.msRestAzure.mod.DeviceTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.DeviceTokenCredentials]]
  @scala.inline
  def interactiveLogin(
    optionalCallback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.DeviceTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(optionalCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def interactiveLogin(options: typingsSlinky.msRestAzure.mod.InteractiveLoginOptions): js.Promise[typingsSlinky.msRestAzure.mod.DeviceTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.DeviceTokenCredentials]]
  @scala.inline
  def interactiveLogin(
    options: typingsSlinky.msRestAzure.mod.InteractiveLoginOptions,
    optionalCallback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.DeviceTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLogin")(options.asInstanceOf[js.Any], optionalCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def interactiveLoginWithAuthResponse(): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  @scala.inline
  def interactiveLoginWithAuthResponse(options: typingsSlinky.msRestAzure.mod.InteractiveLoginOptions): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interactiveLoginWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  
  @scala.inline
  def loginWithAppServiceMSI(): js.Promise[typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials]]
  @scala.inline
  def loginWithAppServiceMSI(
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithAppServiceMSI(options: typingsSlinky.msRestAzure.mod.MSIAppServiceOptions): js.Promise[typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials]]
  @scala.inline
  def loginWithAppServiceMSI(
    options: typingsSlinky.msRestAzure.mod.MSIAppServiceOptions,
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIAppServiceTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAppServiceMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithAuthFile(): js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials]]
  @scala.inline
  def loginWithAuthFile(
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithAuthFile(options: typingsSlinky.msRestAzure.mod.AuthFileOptions): js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials]]
  @scala.inline
  def loginWithAuthFile(
    options: typingsSlinky.msRestAzure.mod.AuthFileOptions,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFile")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithAuthFileWithAuthResponse(): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  @scala.inline
  def loginWithAuthFileWithAuthResponse(options: typingsSlinky.msRestAzure.mod.AuthFileOptions): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithAuthFileWithAuthResponse")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  
  @scala.inline
  def loginWithMSI(): js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials]]
  @scala.inline
  def loginWithMSI(
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMSI(options: typingsSlinky.msRestAzure.mod.MSIVmOptions): js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials]]
  @scala.inline
  def loginWithMSI(
    options: typingsSlinky.msRestAzure.mod.MSIVmOptions,
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithServicePrincipalSecret(clientId: java.lang.String, secret: java.lang.String, domain: java.lang.String): js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials]]
  @scala.inline
  def loginWithServicePrincipalSecret(
    clientId: java.lang.String,
    secret: java.lang.String,
    domain: java.lang.String,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithServicePrincipalSecret(
    clientId: java.lang.String,
    secret: java.lang.String,
    domain: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.AzureTokenCredentialsOptions
  ): js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials]]
  @scala.inline
  def loginWithServicePrincipalSecret(
    clientId: java.lang.String,
    secret: java.lang.String,
    domain: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.AzureTokenCredentialsOptions,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecret")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithServicePrincipalSecretWithAuthResponse(clientId: java.lang.String, secret: java.lang.String, domain: java.lang.String): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  @scala.inline
  def loginWithServicePrincipalSecretWithAuthResponse(
    clientId: java.lang.String,
    secret: java.lang.String,
    domain: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.AzureTokenCredentialsOptions
  ): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithServicePrincipalSecretWithAuthResponse")(clientId.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  
  @scala.inline
  def loginWithUsernamePassword(username: java.lang.String, password: java.lang.String): js.Promise[typingsSlinky.msRestAzure.mod.UserTokenCredentials] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.UserTokenCredentials]]
  @scala.inline
  def loginWithUsernamePassword(
    username: java.lang.String,
    password: java.lang.String,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.UserTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithUsernamePassword(
    username: java.lang.String,
    password: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.LoginWithUsernamePasswordOptions
  ): js.Promise[typingsSlinky.msRestAzure.mod.UserTokenCredentials] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.UserTokenCredentials]]
  @scala.inline
  def loginWithUsernamePassword(
    username: java.lang.String,
    password: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.LoginWithUsernamePasswordOptions,
    callback: js.Function3[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.UserTokenCredentials, 
      /* subscriptions */ js.Array[typingsSlinky.msRestAzure.mod.LinkedSubscription], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePassword")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithUsernamePasswordWithAuthResponse(username: java.lang.String, password: java.lang.String): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  @scala.inline
  def loginWithUsernamePasswordWithAuthResponse(
    username: java.lang.String,
    password: java.lang.String,
    options: typingsSlinky.msRestAzure.mod.LoginWithUsernamePasswordOptions
  ): js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse] = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithUsernamePasswordWithAuthResponse")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.AuthResponse]]
  
  @scala.inline
  def loginWithVmMSI(): js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")().asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials]]
  @scala.inline
  def loginWithVmMSI(
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithVmMSI(options: typingsSlinky.msRestAzure.mod.MSIVmOptions): js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials] = typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials]]
  @scala.inline
  def loginWithVmMSI(
    options: typingsSlinky.msRestAzure.mod.MSIVmOptions,
    callback: js.Function2[
      /* err */ js.Error, 
      /* credentials */ typingsSlinky.msRestAzure.mod.MSIVmTokenCredentials, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.msRestAzure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithVmMSI")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
