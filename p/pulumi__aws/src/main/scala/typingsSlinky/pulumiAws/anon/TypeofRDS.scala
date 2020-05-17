package typingsSlinky.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.awsSdk.mod.RDS.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofRDS extends js.Object {
  val Signer: Instantiable0[typingsSlinky.awsSdk.mod.RDS.Signer] = js.native
  val Types: this.type = js.native
}

object TypeofRDS {
  @scala.inline
  def apply(Signer: Instantiable0[Signer], Types: TypeofRDS): TypeofRDS = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRDS]
  }
  @scala.inline
  implicit class TypeofRDSOps[Self <: TypeofRDS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigner(value: Instantiable0[Signer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: TypeofRDS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

