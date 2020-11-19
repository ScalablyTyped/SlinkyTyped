package typingsSlinky.propTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Requireable[T]
  extends Validator[js.UndefOr[T | Null]] {
  
  def isRequired(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
  @JSName("isRequired")
  var isRequired_Original: Validator[NonNullable[T]] = js.native
}
