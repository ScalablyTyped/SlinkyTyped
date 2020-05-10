package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAlgorithmSpecification extends js.Object {
  /**
    * A list of the algorithms that were used to create a model package.
    */
  var SourceAlgorithms: SourceAlgorithmList = js.native
}

object SourceAlgorithmSpecification {
  @scala.inline
  def apply(SourceAlgorithms: SourceAlgorithmList): SourceAlgorithmSpecification = {
    val __obj = js.Dynamic.literal(SourceAlgorithms = SourceAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAlgorithmSpecification]
  }
  @scala.inline
  implicit class SourceAlgorithmSpecificationOps[Self <: SourceAlgorithmSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceAlgorithms(value: SourceAlgorithmList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

