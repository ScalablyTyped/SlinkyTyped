package typingsSlinky.puppeteerLottie.mod

import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.baseline
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.fast
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.faster
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.high
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.high10
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.high422
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.high444
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.main
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.medium
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.placebo
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.slow
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.slower
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.superfast
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.ultrafast
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.veryfast
import typingsSlinky.puppeteerLottie.puppeteerLottieStrings.veryslow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional ffmpeg settings
  */
@js.native
trait FFmpegOptions extends js.Object {
  
  var crf: js.UndefOr[Double] = js.native
  
  var preset: js.UndefOr[
    ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
  ] = js.native
  
  var profileVideo: js.UndefOr[baseline | main | high | high10 | high422 | high444] = js.native
}
object FFmpegOptions {
  
  @scala.inline
  def apply(): FFmpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FFmpegOptions]
  }
  
  @scala.inline
  implicit class FFmpegOptionsOps[Self <: FFmpegOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCrf(value: Double): Self = this.set("crf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrf: Self = this.set("crf", js.undefined)
    
    @scala.inline
    def setPreset(
      value: ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
    ): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setProfileVideo(value: baseline | main | high | high10 | high422 | high444): Self = this.set("profileVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileVideo: Self = this.set("profileVideo", js.undefined)
  }
}
