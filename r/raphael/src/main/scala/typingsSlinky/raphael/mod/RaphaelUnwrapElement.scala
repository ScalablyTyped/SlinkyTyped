package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TBase
  - typingsSlinky.raphael.mod.RaphaelElement[
TTechnology, 
/ * import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] * / js.Any]
*/
trait RaphaelUnwrapElement[TTechnology /* <: RaphaelTechnology */, TBase /* <: RaphaelBaseElement[TTechnology] */] extends js.Object

object RaphaelUnwrapElement {
  @scala.inline
  implicit def apply[TTechnology, TBase](
    value: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ): RaphaelUnwrapElement[TTechnology, TBase] = value.asInstanceOf[RaphaelUnwrapElement[TTechnology, TBase]]
  @scala.inline
  implicit def apply[TTechnology, TBase](value: TBase): RaphaelUnwrapElement[TTechnology, TBase] = value.asInstanceOf[RaphaelUnwrapElement[TTechnology, TBase]]
}

