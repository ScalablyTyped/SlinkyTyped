package typingsSlinky.ionicCliFramework.definitionsMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends StObject {
  
  var key: String = js.native
  
  var message: String = js.native
  
  def validator(): `true` | String = js.native
  def validator(input: js.UndefOr[scala.Nothing], key: String): `true` | String = js.native
  def validator(input: String): `true` | String = js.native
  def validator(input: String, key: String): `true` | String = js.native
  @JSName("validator")
  var validator_Original: Validator = js.native
}
