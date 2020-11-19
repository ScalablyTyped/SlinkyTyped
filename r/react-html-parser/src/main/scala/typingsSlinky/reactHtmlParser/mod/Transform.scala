package typingsSlinky.reactHtmlParser.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ js.Any,
    index: Double
  ): ReactElement | Unit | Null = js.native
  def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomElement */ js.Any,
    index: Double,
    transform: Transform
  ): ReactElement | Unit | Null = js.native
}
