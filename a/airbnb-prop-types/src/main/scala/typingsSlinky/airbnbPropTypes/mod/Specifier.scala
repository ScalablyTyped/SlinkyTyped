package typingsSlinky.airbnbPropTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Specifier[T] extends js.Object {
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  @JSName("validator")
  var validator_Original: Validator[T] = js.native
  def validator(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): js.Error | Null = js.native
}

