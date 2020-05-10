package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentLanguage extends js.Object {
  /**
    * The list of Docker images that are related by the specified programming language.
    */
  var images: js.UndefOr[EnvironmentImages] = js.native
  /**
    * The programming language for the Docker images.
    */
  var language: js.UndefOr[LanguageType] = js.native
}

object EnvironmentLanguage {
  @scala.inline
  def apply(): EnvironmentLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLanguage]
  }
  @scala.inline
  implicit class EnvironmentLanguageOps[Self <: EnvironmentLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: EnvironmentImages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: LanguageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

