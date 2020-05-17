package typingsSlinky.propTypes.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[/ * props * / js.Any, / * context * / js.UndefOr[js.Any], js.Any]
  - org.scalablytyped.runtime.Instantiable2[/ * props * / js.Any, js.UndefOr[/ * context * / js.Any], js.Any]
*/
trait ReactComponentLike extends js.Object

object ReactComponentLike {
  @scala.inline
  implicit def apply(value: js.Function2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], js.Any]): ReactComponentLike = value.asInstanceOf[ReactComponentLike]
  @scala.inline
  implicit def apply(value: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], js.Any]): ReactComponentLike = value.asInstanceOf[ReactComponentLike]
  @scala.inline
  implicit def apply(value: String): ReactComponentLike = value.asInstanceOf[ReactComponentLike]
}

