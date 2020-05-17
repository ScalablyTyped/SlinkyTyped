package typingsSlinky.rdfjsFetchLite.mod

import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.DatasetCoreFactory
import typingsSlinky.rdfjsFetchLite.anon.PickparsersSinkMapEventEm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends FormatsInit {
  var factory: DatasetCoreFactory[OutQuad, InQuad, D] = js.native
}

object FactoryInit {
  @scala.inline
  def apply[D, OutQuad, InQuad](factory: DatasetCoreFactory[OutQuad, InQuad, D], formats: PickparsersSinkMapEventEm): FactoryInit[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
  }
  @scala.inline
  implicit class FactoryInitOps[Self[d, outquad, inquad] <: FactoryInit[d, outquad, inquad], D, OutQuad, InQuad] (val x: Self[D, OutQuad, InQuad]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, OutQuad, InQuad] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, OutQuad, InQuad]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, OutQuad, InQuad]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, OutQuad, InQuad]) with Other]
    @scala.inline
    def withFactory(value: DatasetCoreFactory[OutQuad, InQuad, D]): Self[D, OutQuad, InQuad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

