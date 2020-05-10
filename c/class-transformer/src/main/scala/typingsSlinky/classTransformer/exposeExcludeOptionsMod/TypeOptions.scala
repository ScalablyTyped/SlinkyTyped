package typingsSlinky.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOptions extends js.Object {
  var discriminator: js.UndefOr[Discriminator] = js.native
  /**
    * Is false by default.
    */
  var keepDiscriminatorProperty: js.UndefOr[Boolean] = js.native
}

object TypeOptions {
  @scala.inline
  def apply(): TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeOptions]
  }
  @scala.inline
  implicit class TypeOptionsOps[Self <: TypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscriminator(value: Discriminator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscriminator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discriminator")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepDiscriminatorProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDiscriminatorProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepDiscriminatorProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDiscriminatorProperty")(js.undefined)
        ret
    }
  }
  
}

