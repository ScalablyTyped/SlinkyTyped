package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.buildColonafter
import typingsSlinky.ionic.ionicStrings.buildColonbefore
import typingsSlinky.ionic.ionicStrings.serveColonafter
import typingsSlinky.ionic.ionicStrings.serveColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.BuildHookInput
  - typingsSlinky.ionic.definitionsMod.ServeBeforeHookInput
  - typingsSlinky.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends StObject
object HookInput {
  
  @scala.inline
  def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): typingsSlinky.ionic.definitionsMod.BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.BuildHookInput]
  }
  
  @scala.inline
  def ServeAfterHookInput(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): typingsSlinky.ionic.definitionsMod.ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.ServeAfterHookInput]
  }
  
  @scala.inline
  def ServeBeforeHookInput(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): typingsSlinky.ionic.definitionsMod.ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionic.definitionsMod.ServeBeforeHookInput]
  }
}
