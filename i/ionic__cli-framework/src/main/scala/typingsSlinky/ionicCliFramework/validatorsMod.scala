package typingsSlinky.ionicCliFramework

import typingsSlinky.ionicCliFramework.anon.CaseSensitive
import typingsSlinky.ionicCliFramework.definitionsMod.Validator
import typingsSlinky.ionicCliFramework.definitionsMod.Validators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  
  def combine(validators: Validator*): Validator = js.native
  
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = js.native
  
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
  
  val validators: Validators = js.native
}
