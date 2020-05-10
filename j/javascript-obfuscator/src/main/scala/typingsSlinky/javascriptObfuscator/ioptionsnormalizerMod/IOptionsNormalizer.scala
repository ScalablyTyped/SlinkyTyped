package typingsSlinky.javascriptObfuscator.ioptionsnormalizerMod

import typingsSlinky.javascriptObfuscator.ioptionsMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionsNormalizer extends js.Object {
  /**
    * @param {IOptions} options
    * @returns {IOptions}
    */
  def normalize(options: IOptions): IOptions = js.native
}

object IOptionsNormalizer {
  @scala.inline
  def apply(normalize: IOptions => IOptions): IOptionsNormalizer = {
    val __obj = js.Dynamic.literal(normalize = js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[IOptionsNormalizer]
  }
  @scala.inline
  implicit class IOptionsNormalizerOps[Self <: IOptionsNormalizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalize(value: IOptions => IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

