package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The type of platform the restriction applies to.
  */
@js.native
trait SchemaPlatformContext extends js.Object {
  /**
    * The platforms this restriction applies to.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPlatformContext {
  @scala.inline
  def apply(): SchemaPlatformContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformContext]
  }
  @scala.inline
  implicit class SchemaPlatformContextOps[Self <: SchemaPlatformContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
  }
  
}

