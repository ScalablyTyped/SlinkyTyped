package typingsSlinky.javascriptObfuscator.itransformersrunnerMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransformersRunner extends js.Object {
  /**
    * @param {T} astTree
    * @param {NodeTransformer[]} nodeTransformers
    * @param {TransformationStage} transformationStage
    * @returns {T}
    */
  def transform[T /* <: Node */](
    astTree: T,
    nodeTransformers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
    ],
    transformationStage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any
  ): T = js.native
}

object ITransformersRunner {
  @scala.inline
  def apply(
    transform: (js.Any, js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
    ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any) => js.Any
  ): ITransformersRunner = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
    __obj.asInstanceOf[ITransformersRunner]
  }
  @scala.inline
  implicit class ITransformersRunnerOps[Self <: ITransformersRunner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(
      value: (js.Any, js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
        ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

