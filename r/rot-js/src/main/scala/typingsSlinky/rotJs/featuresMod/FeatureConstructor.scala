package typingsSlinky.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureConstructor extends js.Object {
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature = js.native
}

object FeatureConstructor {
  @scala.inline
  def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => Feature): FeatureConstructor = {
    val __obj = js.Dynamic.literal(createRandomAt = js.Any.fromFunction5(createRandomAt))
    __obj.asInstanceOf[FeatureConstructor]
  }
  @scala.inline
  implicit class FeatureConstructorOps[Self <: FeatureConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateRandomAt(value: (Double, Double, Double, Double, FeatureOptions) => Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRandomAt")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

