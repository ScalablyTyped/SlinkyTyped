package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.buildColonafter
import typingsSlinky.ionic.ionicStrings.buildColonbefore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildHookInput extends HookInput {
  
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions = js.native
  
  val name: buildColonbefore | buildColonafter = js.native
}
object BuildHookInput {
  
  @scala.inline
  def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHookInput]
  }
  
  @scala.inline
  implicit class BuildHookInputMutableBuilder[Self <: BuildHookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: buildColonbefore | buildColonafter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
