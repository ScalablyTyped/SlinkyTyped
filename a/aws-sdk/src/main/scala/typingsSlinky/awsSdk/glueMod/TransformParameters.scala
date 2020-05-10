package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformParameters extends js.Object {
  /**
    * The parameters for the find matches algorithm.
    */
  var FindMatchesParameters: js.UndefOr[typingsSlinky.awsSdk.glueMod.FindMatchesParameters] = js.native
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see Creating Machine Learning Transforms.
    */
  var TransformType: typingsSlinky.awsSdk.glueMod.TransformType = js.native
}

object TransformParameters {
  @scala.inline
  def apply(TransformType: TransformType): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformParameters]
  }
  @scala.inline
  implicit class TransformParametersOps[Self <: TransformParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformType(value: TransformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindMatchesParameters(value: FindMatchesParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindMatchesParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindMatchesParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindMatchesParameters")(js.undefined)
        ret
    }
  }
  
}

