package typingsSlinky.propTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator[T] extends js.Object {
  
  def apply(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
}
