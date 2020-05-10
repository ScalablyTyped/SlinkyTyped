package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.awsSdk.mod.Polly.Presigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPolly extends js.Object {
  val Presigner: Instantiable0[typingsSlinky.awsSdk.mod.Polly.Presigner] = js.native
  val Types: this.type = js.native
}

object TypeofPolly {
  @scala.inline
  def apply(Presigner: Instantiable0[Presigner], Types: TypeofPolly): TypeofPolly = {
    val __obj = js.Dynamic.literal(Presigner = Presigner.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPolly]
  }
  @scala.inline
  implicit class TypeofPollyOps[Self <: TypeofPolly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresigner(value: Instantiable0[Presigner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presigner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeofPolly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

