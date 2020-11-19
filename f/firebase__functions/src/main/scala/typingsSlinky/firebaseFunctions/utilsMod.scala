package typingsSlinky.firebaseFunctions

import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseFunctions.firebaseFunctionsStrings.`auth-internal`
import typingsSlinky.firebaseFunctions.firebaseFunctionsStrings.messaging
import typingsSlinky.firebaseFunctions.mod.FirebaseApp
import typingsSlinky.firebaseFunctions.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/functions/dist/test/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createTestService(app: FirebaseApp): Service = js.native
  def createTestService(
    app: FirebaseApp,
    region: js.UndefOr[scala.Nothing],
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  def createTestService(app: FirebaseApp, region: String): Service = js.native
  def createTestService(
    app: FirebaseApp,
    region: String,
    authProvider: Provider[`auth-internal`],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_authinternal(app: FirebaseApp, region: js.UndefOr[scala.Nothing], authProvider: Provider[`auth-internal`]): Service = js.native
  @JSName("createTestService")
  def createTestService_authinternal(app: FirebaseApp, region: String, authProvider: Provider[`auth-internal`]): Service = js.native
  @JSName("createTestService")
  def createTestService_messaging(
    app: FirebaseApp,
    region: js.UndefOr[scala.Nothing],
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  @JSName("createTestService")
  def createTestService_messaging(
    app: FirebaseApp,
    region: String,
    authProvider: js.UndefOr[scala.Nothing],
    messagingProvider: Provider[messaging]
  ): Service = js.native
  
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseOptions */ js.Any
  ): FirebaseApp = js.native
}
